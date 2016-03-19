package dangdang.com.chenzd.consumer.main;

/**
 * Created by chenzhendong on 2016/3/10.
 */
import dangdang.com.chenzd.consumer.action.ConsumerAction;

public class Main {
    public static void main(String[] args) throws Exception{
        int n = 0;
        while(n++<20){
            ConsumerAction consumerAction = new ConsumerAction();
            consumerAction.sayHello();
            Thread.sleep(3000);
        }
    }
}
