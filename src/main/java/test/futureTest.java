package test;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
//import java.util.function.Supplier;

/**
 * @Author: yangshushan
 * @Date: 2020-01-09 14:21
 */
public class futureTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future<String> completableFuture = calculateAsync();
        String result = completableFuture.get();

        Supplier ultimateAnswerSupplier = new Supplier(){
            @Override
            public Integer get(){
                //Long time computation
                return 42;
            }
        };

        Supplier memoize = Suppliers.memoize(ultimateAnswerSupplier);
    }

    public static Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
//            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }


}
