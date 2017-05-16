import java.util.concurrent.locks.ReentrantLock;

public class Myservice {
    private ReentrantLock lock = new ReentrantLock();
    public void methodA(){
        try{
            lock.lock();
            System.out.println("ThreadName:"+Thread.currentThread().getName()
                                +"time:"+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("ThreadName:"+Thread.currentThread().getName()
                    +"time:"+System.currentTimeMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
    }

    public void methodB(){
        try{
            lock.lock();
            System.out.println(" ThreadName:"+Thread.currentThread().getName()
                    +"time:"+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("ThreadName:"+Thread.currentThread().getName()
                    +"time:"+System.currentTimeMillis());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        finally{
            lock.unlock();
        }
        }

    }

