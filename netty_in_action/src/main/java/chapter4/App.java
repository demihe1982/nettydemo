package chapter4;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        PlainOioServer oioServer = new PlainOioServer();
        oioServer.serve(8080);

    }

}
