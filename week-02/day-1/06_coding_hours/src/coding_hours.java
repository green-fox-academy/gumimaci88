public class coding_hours {
    public static void main(String[] args) {
        int daily_hours = 6;
        int semester = 17;
        int weekdays = 5;
        int sum_hours = semester*weekdays*daily_hours;

        System.out.println("An average Green Fox attendee spends " + sum_hours + " hours with coding in a semester.");

        float week_work_hours = 52;
        float average = (weekdays*daily_hours)/week_work_hours *100;
        System.out.println("An average Green Fox attendee spends " + average + " percent of the work hours with coding.");
    }
}