package com.iplschedule.dateExtend;

         
import java.util.Calendar;

public class DateExtend {

    public Calendar addDays(Calendar date, int days)
    {
        date.add(Calendar.DATE, days); //minus number would decrement the days
        return date;
    }

}
