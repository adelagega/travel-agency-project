package utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ConnectionPool connectionPool = ConnectionPool.getInstance(5);
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        for(int i=0; i<7; i++){
            executorService.submit(()->{
                try{
                    System.out.println(Thread.currentThread().getName() + ": trying to get a connection...");
                    ConnectionPool.Connection connection=connectionPool.getConnection();
                    System.out.println(Thread.currentThread().getName() + ": got a connection");
                    Thread.sleep(10000);
                    connectionPool.releaseConnection(connection);
                    System.out.println(Thread.currentThread().getName()+ ": Released the connection");
                } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            });
        }
        executorService.shutdown();
    }














}
