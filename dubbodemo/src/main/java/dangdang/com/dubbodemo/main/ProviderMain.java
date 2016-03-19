package dangdang.com.dubbodemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenzhendong on 2016/3/9.
 */
public class ProviderMain {
    public static void main(String[] args)throws Exception{
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{
                "applicationProvider.xml"
        } );
        ctx.start();
        int n = 0;
//        while(n++<10) {
            System.out.println("press any key to exit...");
//            Thread.sleep(3000);
//        }
        System.in.read();
    }
}
