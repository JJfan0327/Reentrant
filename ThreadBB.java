/**
 * Created by Administrator on 2017/5/16.
 */

public class ThreadBB extends Thread{
    private Myservice service;

    public ThreadBB(Myservice service){
        super();
        this.service = service;
    }

    public void run(){
        service.methodB();
    }

}
