package Singleton.LoggerWithSingleTon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String args[]){

        ExecutorService executor = Executors.newFixedThreadPool(2);
        WorkerB workerB =null;
        WorkerA workerA =null;

             workerA = new WorkerA();
             workerB = new WorkerB();
            executor.execute(workerA);
            executor.execute(workerB);
            executor.shutdown();
        System.out.println("Hi");




    }
}
