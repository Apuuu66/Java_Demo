package June2;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Properties;

/**
 * Created by Snoopy on 2017/6/2.
 */
public class Propertiesd {
    public static void main(String[] args) {
        System.out.println();
        Properties properties=new Properties();
        properties.setProperty("userName","wang");
        properties.setProperty("passWord","123456");
        try {
            properties.store(new FileWriter("D:\\pro1.properties"),"Database焦齐齐");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
