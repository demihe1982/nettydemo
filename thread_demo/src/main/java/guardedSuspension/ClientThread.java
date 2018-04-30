package guardedSuspension;

import java.util.Random;

public class ClientThread extends Thread {
    private final Random random;
    private final RequestQueue1 requestQueue;
    public ClientThread(RequestQueue1 queue,String name ,long seed){
        super(name);
        this.random = new Random(seed);
        this.requestQueue = queue;
    }
    public void run(){
        for (int i=0 ; i < 10000 ; i++){
            Request request = new Request("No."+i);
            System.out.println(Thread.currentThread().getName() +" requests "+request);
            requestQueue.putRequest(request);
            try {
                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){

            }
        }
    }
}
