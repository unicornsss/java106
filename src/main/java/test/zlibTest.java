package test;

import com.jcraft.jzlib.JZlib;
import com.jcraft.jzlib.ZInputStream;
import com.jcraft.jzlib.ZOutputStream;

import java.io.*;
import java.util.Arrays;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 * @Author: yangshushan
 * @Date: 2020-01-07 16:44
 */
public class zlibTest {
    public static void main(String[] args) {
//        String encodeCompressd  = "eJxLTEoGAAJNASc=";
//        byte[] compressd = Base64.getDecoder().decode( encodeCompressd );
//        String origin  = new String( decompress(compressd) );
//        System.out.println("origin: "+origin);
//        byte[] _compressd = compress(origin.getBytes());
//        byte[] _encodeCompress = Base64.getEncoder().encode(_compressd);
//        System.out.println(new String(_encodeCompress));
        String str = "压缩1压缩2压缩3压缩4压缩5压缩6压缩压缩压缩压缩aaaaaaaaaaaaaaaaaaaaaaa";//eJxLTEoGAAJNASc=
        byte[] comoress = compress(str.getBytes());
        System.out.println(new String(Base64.getEncoder().encode(comoress)));
        byte[] uncompress = decompress(comoress);
        System.out.println(new String(uncompress));
    }

    //解压zlib
    public static byte[] decompress(byte[] data)  {
        byte[] output = new byte[0];

        Inflater decompresser = new Inflater();
        //重置，因为会多次解压
        decompresser.reset();
        decompresser.setInput(data);

        ByteArrayOutputStream o = new ByteArrayOutputStream(data.length);
        try {
            byte[] buf = new byte[1024];
            while (!decompresser.finished()) {
                int i = decompresser.inflate(buf);
                o.write(buf, 0, i);
            }
            output = o.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                o.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        decompresser.end();
        return output;
    }

    ///压缩
    public static byte[] compress( byte[] bytes ){
        System.out.println("bytes:"+bytes.length);
        byte[] output = new byte[1024];
        Deflater compresser = new Deflater();
        compresser.setInput(bytes);
        compresser.finish();
        //压缩后的大小：compressedDataLength
        int compressedDataLength = compresser.deflate(output);
        System.out.println("output:"+output);
        System.out.println("compressedDataLength:"+compressedDataLength);
        return Arrays.copyOf(output,compressedDataLength);
    }
}
