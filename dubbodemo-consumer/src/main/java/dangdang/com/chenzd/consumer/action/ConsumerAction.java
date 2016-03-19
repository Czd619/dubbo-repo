package dangdang.com.chenzd.consumer.action;

/**
 * Created by chenzhendong on 2016/3/10.
 */
import java.util.*;

import dangdang.com.dubbodemo.service.DubboService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerAction {
    public void sayHello(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                                            new String[] {"applicationConsumer.xml"});
        ctx.start();
        DubboService dubboService = (DubboService) ctx.getBean("demoService");
        System.out.println("client: "+ dubboService.hello("chenzd "+new Date())+" haha "+new Date());
    }
}
