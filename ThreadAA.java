/**
 * Created by Administrator on 2017/5/16.
 */
public class ThreadAA extends Thread{

        private Myservice service;

        public ThreadAA(Myservice service){
            super();
            this.service = service;
        }

        public void run(){
            service.methodA();
        }

    }

