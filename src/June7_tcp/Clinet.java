package June7_tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Snoopy on 2017/6/7.
 */
public class Clinet {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 9090);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("服务端你好".getBytes());
        socket.close();
    }
}
