package June7;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Snoopy on 2017/6/7.
 */
public class Sever {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(9090);
        Socket socket= serverSocket.accept();
        InputStream inputStream=socket.getInputStream();
        byte []buf = new byte[1024];
        int length=inputStream.read(buf);
        System.out.println("服务端接收:"+ new String(buf,0,length));
        serverSocket.close();
    }
}