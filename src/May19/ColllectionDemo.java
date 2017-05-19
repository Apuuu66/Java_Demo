package May19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Snoopy on 2017/5/19.
 */
public class ColllectionDemo {
    public static void main(String[] args) {
        List c =new ArrayList();
        c.add(1);
        c.add("jiaoqiqi");
        c.add(1.2);
        c.add("qwe");
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }
}
