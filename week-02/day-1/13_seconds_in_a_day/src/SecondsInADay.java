public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int totalSec = 86400;
        int remSec = totalSec - (currentHours*3600 + currentMinutes*60 + currentSeconds);

        System.out.println("The remaining seconds from today is " + remSec);


    }
}
