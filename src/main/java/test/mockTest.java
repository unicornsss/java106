package test;

/**
 * @Author: yangshushan
 * @Date: 2020-01-09 18:33
 */
//public class mockTest {
//
//}
import javax.sql.DataSource;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;

public class mockTest extends TestCase {

    private static String[] springFiles = { "beans/my-beans-config.xml" };

    private ClassPathXmlApplicationContext context;

    public void testJndi( ) throws Exception {

        context = new ClassPathXmlApplicationContext(springFiles);

        SimpleNamingContextBuilder builder =

                SimpleNamingContextBuilder.emptyActivatedContextBuilder();

        DataSource ds = (DataSource) context.getBean("dataSource");

        builder.bind("jndi:jdbc/DataSource", ds);

// 现在你的数据源就是 "jndi:jdbc/DataSource"了
    }
}
