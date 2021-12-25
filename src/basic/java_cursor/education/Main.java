package basic.java_cursor.education;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //String monday = DayOfWeek.MONDAY;
        //String sunday = DayOfWeek.SUNDAY;
        //System.out.println(monday);
        //System.out.println(sunday);

        DayOfWeekEnum mondayEnum = DayOfWeekEnum.MONDAY;
        //System.out.println(mondayEnum);
        //System.out.println(mondayEnum.getTitle());
        System.out.println(Arrays.toString(DayOfWeekEnum.values()));


        boolean isHolidayy = isHoliday(DayOfWeekEnum.SATURDAY);
        System.out.println(isHolidayy);
    }

    public static boolean isHoliday(DayOfWeekEnum day) {
        if (day == DayOfWeekEnum.SATURDAY || day == DayOfWeekEnum.SUNDAY) {
            return true;
        } else {
            return false;
        }
    }
}