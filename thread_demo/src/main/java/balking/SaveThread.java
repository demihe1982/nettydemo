package balking;

import java.io.IOException;

public class SaveThread extends Thread {
    private final Data data;
    public SaveThread(String name,Data data){
        super(name);
        this.data = data;
    }

    public void run(){
        try{
            while (true){
                data.save();
                Thread.sleep(1000);
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
