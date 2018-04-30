package guardedSuspension;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class RequestQueue1 {
    private final BlockingQueue<Request> queue = new LinkedBlockingDeque<>();
    public Request getRequest(){
        Request request = null;
        try{
           request =  queue.take();
        }catch (InterruptedException e){

        }
        return request;
    }

    public void putRequest(Request request){
        try {
            queue.put(request);
        }catch (InterruptedException e){

        }
    }
}
