package utils;
import java.util.concurrent.*;

public class ConnectionPool {
    private static volatile ConnectionPool instance;
    private final BlockingQueue<Connection> blockingQueue;
    private final ExecutorService executorService;

    public static class Connection{

    }
    private ConnectionPool(int size) {
        this.blockingQueue=new LinkedBlockingQueue<>(size);
        this.executorService= Executors.newFixedThreadPool(size);
        for(int i=0;i<size;i++){
            executorService.submit(()->{
                try {
                    Connection connection = createNewConnection();
                    blockingQueue.put(connection);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });

        }
    }

   public static ConnectionPool getInstance(int size){
        if(instance==null){
            synchronized (ConnectionPool.class){
                if(instance==null){
                    instance=new ConnectionPool(size);
                }
            }
        }
        return instance;
   }

    public Connection getConnection() throws InterruptedException {
        return blockingQueue.take();
    }

    public void releaseConnection(Connection connection) throws InterruptedException {
        if(connection!=null){
            blockingQueue.put(connection);
        }
    }

    private Connection createNewConnection(){
        return new Connection();
    }
}
