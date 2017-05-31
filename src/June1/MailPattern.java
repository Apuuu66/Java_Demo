package June1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Snoopy on 2017/6/1.
 */
public class MailPattern {
    public static void main(String[] args) {
        String content ="466007639@qq.com";
        String reg="[a-zA-Z0-9]\\w{5,17}@[a-zA-Z0-9]{2,}\\.(com|cn|net){1,2}";
        Pattern pattern=Pattern.compile(reg);
        Matcher matcher=pattern.matcher(content);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}
