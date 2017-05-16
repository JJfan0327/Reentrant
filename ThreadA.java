/**
 * Created by Administrator on 2017/5/16.
 */

public class ThreadA extends Thread{
    private Myservice service;

    public ThreadA(Myservice service){
        super();
        this.service = service;
    }

    public void run(){
        service.methodA();
    }

}
