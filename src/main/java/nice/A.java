package nice;

import org.joda.time.JodaTimePermission;

public class A {
    public static void main(String[] args) {
        System.out.println(1120);
        JodaTimePermission jodaTimePermission=new JodaTimePermission("2017");
        jodaTimePermission.getActions();
    }
}
