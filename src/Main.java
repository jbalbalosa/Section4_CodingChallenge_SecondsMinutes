import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        getDurationString(61, 0);
        getDurationString(150);
    }

    public static int getDurationString(int minutes, int seconds){
        if((minutes < 0) || ((seconds <0) || (seconds > 59))){
            System.out.println("Invalid Value");
            return -1;
        }
        int totalHours = minutes / 60;
        int totalMinutes =  ((minutes - (totalHours * 60)) + (seconds / 59));
        System.out.println(totalHours + "h " + totalMinutes + "m " + seconds + "s" );
        return  1;
    }

    public static int getDurationString(int seconds){
        if (seconds < 0){
            System.out.println("Invalid value");
            return -1;
        }

        int minutes = (seconds / 60);
        int totalSecond = seconds- (minutes * 60);
        //System.out.println(minutes + "m " + totalSecond + "s");
        return getDurationString(minutes,totalSecond);
    }
}