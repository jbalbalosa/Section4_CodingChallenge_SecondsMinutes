import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    private  static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        //System.out.println(getDurationString(3945L));
        //System.out.println("Remaining: " + 110 % 60);
    }

/*    public static int getDurationString(int minutes, int seconds){
        if((minutes < 0) || (seconds <0) || (seconds > 59)){
            System.out.println("Invalid Value");
            return -1;
        }
        int totalHours = minutes / 60;
        int totalMinutes =  ((minutes - (totalHours * 60)) + (seconds / 59));
        System.out.println(totalHours + "h " + totalMinutes + "m " + seconds + "s" );
        return  1;
    }*/

    //Tim's Solution
    private  static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0 || (seconds > 59))) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hourString = hours + "h";
        if (hours < 10){
            hourString = "0" + hourString;
        }

        String minuteString = remainingMinutes + "h";
        if (remainingMinutes < 10){
            minuteString = "0" + minuteString;
        }

        String secondString = seconds + "s";
        if (seconds < 10){
            secondString = "0" + secondString;
        }
        return hourString + " " + minuteString + " " + secondString + "";
    }

    private static String getDurationString(long seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;

    }

    /*public static int getDurationString(int seconds){
        if (seconds < 0){
            System.out.println("Invalid value");
            return -1;
        }

        int minutes = (seconds / 60);
        int totalSecond = seconds- (minutes * 60);
        //System.out.println(minutes + "m " + totalSecond + "s");
        return getDurationString(minutes,totalSecond);
    }*/
}