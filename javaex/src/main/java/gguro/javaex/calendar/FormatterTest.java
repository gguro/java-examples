package gguro.javaex.calendar;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;


public class FormatterTest {

    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer();
        Formatter f = new Formatter(sb);
        Calendar c = Calendar.getInstance();
        
        f.format("오늘은 %tY 년 %tm월(%tB) %te일 입니다. %n", c,c,c,c);
        f.format("오늘은 %1$tY 년 %1$tm월(%tB) %1$te일 입니다. %n", c);
        
        f.format("현재 시간은 %tk 시 %tM분 %tS초 입니다. %n", c,c,c);
        f.format("타임존 : %tZ %n", c);
        
        f.format(Locale.US, "이번달은 영어로 %tB 입니다.", c);
        System.out.println(f);

    }

}
