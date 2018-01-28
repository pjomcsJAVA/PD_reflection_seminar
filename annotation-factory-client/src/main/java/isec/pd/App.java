package isec.pd;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    private ClubFactory factory = new ClubFactory();

    public Club get(String clubName) {
        return factory.create(clubName);
    }


    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        App app = new App();
        while(!exit){
            System.out.println( "Insert club:" );
            String str = sc.next();

            if(str.equals("t")){
                exit = true;
            }else{
                Club club = app.get(str);

                System.out.println(club.getClass().getSimpleName()+" has "+club.titles() +" title(s)!");
            }

        }


    }
}
