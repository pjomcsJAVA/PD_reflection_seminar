package isec.pd;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ClientTest ct = new ClientTest();

        LocalDate date = ct.date;
    }
}
