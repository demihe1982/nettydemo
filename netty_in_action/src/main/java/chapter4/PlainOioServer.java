package chapter4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class PlainOioServer {
    public void serve(int port) throws IOException{
        final ServerSocket socket = new ServerSocket(port);
        try{
            for(;;){
                final Socket client = socket.accept();
                System.out.println("Accepted connection from "+client);
                new Thread(()->{
                    OutputStream out;
                    try {
                        out = client.getOutputStream();
                        out.write("Hi!\r\n".getBytes(Charset.defaultCharset()));
                        out.flush();
                        client.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        try {
                            client.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }).start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
