package test.Exeption.Dz.three;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateException {
    public void checkDate(String currentdate) throws ParseException {

        DateFormat date = new SimpleDateFormat("dd.MM.yyyy");
        date.setLenient(false);
        date.parse(currentdate);
    }
}
