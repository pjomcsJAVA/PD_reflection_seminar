package isec.pd;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClientTest {

  @DateFormat("yyyy MM dd")
  public LocalDate date;

  public ClientTest(int year, int month, int day) {
    date = LocalDate.of(year,month,day);
  }

    public String toString(){
      DateFormat annotation = null;
      try {
        Field f = this.getClass().getField("date");
        annotation = f.getAnnotation(DateFormat.class);

      } catch (NoSuchFieldException e) {
        e.printStackTrace();
      }

      DateTimeFormatter formatter = DateTimeFormatter.ofPattern(annotation.value());
      return date.format(formatter);
  }

}
