package extendsion;

import java.nio.ByteBuffer;

public class ByteBuffTest {

    public static void main(String[] args){
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte)'H').put((byte)'e').put((byte)'l').put((byte)'l').put((byte)'o');
        buffer.flip();
        System.out.println(""+(char)buffer.get()+(char)buffer.get());
        buffer.mark();
        System.out.println(""+(char)buffer.get()+(char)buffer.get());
        buffer.reset();
        buffer.compact();
        System.out.println(""+(char)buffer.get()+(char)buffer.get());

    }
}
