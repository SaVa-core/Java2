package Lesson2_1;

public enum Days
{
    MONDAY(40), TUESDAY(32), WEDNESDAY(24), THURSDAY(16), FRIDAY(8);

    private int time;

    public int getTime()
    {
        return time;
    }

    Days(int time)
    {
        this.time = time;
    }
}

enum Weekend
{
    SATURDAY("Выходной!"), SUNDAY("Выходной!");

    private String workingDay;

    Weekend (String workingDay)
    {
        this.workingDay = workingDay;
    }

    public String getWorkingDay()
    {
        return workingDay;
    }

}