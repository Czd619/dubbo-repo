package dangdang.com.dubbodemo.service;

/**
 * Created by chenzhendong on 2016/3/9.
 */
public class DubboServiceImpl implements DubboService {

    public String hello(String data){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {

        }
        return "hello : "+ data ;
    }
}
