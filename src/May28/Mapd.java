package May28;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Snoopy on 2017/5/28.
 */
public class Mapd {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","2");
        map.put("3","2");
        map.put("4","2");
        map.put("2","2");
        System.out.println(map);
        map.clear();

    }
}
