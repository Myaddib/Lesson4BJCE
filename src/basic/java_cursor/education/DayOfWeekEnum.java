package basic.java_cursor.education;

public enum DayOfWeekEnum {
    MONDAY("Понеділок",false),
    TUESDAY("Вівторок",false),
    WEDNESDAY("Середа",false),
    THURSDAY("Четверг",false),
    FRIDAY("П'ятниця",false),
    SATURDAY("Субота", true),
    SUNDAY("Неділя", true);

    private String title;
    private boolean isHoliday;

    DayOfWeekEnum(String title, boolean isHoliday) {
        this.title = title;
        this.isHoliday = isHoliday;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "DayOfWeekEnum{" +
                "title='" + title + '\'' +
                ", isHoliday=" + isHoliday +
                '}';
    }
}
