package Singleton.LoggerWithoutSingleTon;

public class WorkerB implements Runnable{
    Logger logger = null;
    WorkerB(){
        logger =new Logger();
    }
    @Override
    public void run() {

        int y =0;
        while (y<100) {
            logger.printLog(Thread.currentThread().getName()+" Testing single ton "+y, "INFO");
           // System.out.println(Thread.currentThread().getName()+"       "+y);
            y++;
        }
    }
}
