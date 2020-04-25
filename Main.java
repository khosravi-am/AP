package khosro;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        LocalTime time=LocalTime.now();
        ClockDisplay clock=new ClockDisplay(time.getHour(),time.getMinute(),time.getSecond());
        while (true){
            System.out.println(clock.getTime());
            clock.timeTick();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
