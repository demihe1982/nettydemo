package guardedSuspension;

public class Main {
    public static void main(String[] args){
        RequestQueue1 requestQueue = new RequestQueue1();
        new ClientThread(requestQueue,"Alice",3141592l).start();
        new ServerThread(requestQueue,"Bobby",6535897l).start();
    }
}
