package Singleton.LoggerWithSingleTon;

public class WorkerA implements Runnable{
    Logger logger = null;
    WorkerA(){
        logger = Logger.getInstance();
    }
    @Override
    public void run() {
        int x =0;
        while (x<100) {
            logger.printLog(Thread.currentThread().getName()+" Testing single ton "+x, "DEBUG");
           // System.out.println(Thread.currentThread().getName()+"       "+x);
            x++;
        }

    }
}
