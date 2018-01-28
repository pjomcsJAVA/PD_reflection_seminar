package isec.pd;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Test annotation processor!" );

        ClientTest ct = new ClientTest(2018, 1, 29);

        System.out.println(ct.toString());

    }
}
