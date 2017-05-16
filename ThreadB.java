/**
 * Created by Administrator on 2017/5/16.
 */

public class ThreadB extends Thread{
   private Myservice service;

    public ThreadB(Myservice service){
        super();
        this.service = service;
    }

    public void run(){
        service.methodB();
    }

}