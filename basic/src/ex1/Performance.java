package ex1;

import java.lang.reflect.Method;

/**
 * Only for testing performance of new keyword vs reflection..
 */
public class Performance {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        for (int i= 0 ; i <100000; i++){

            try {
                //AnnotationRunner aRunner = (AnnotationRunner) Class.forName("ex1.AnnotationRunner").newInstance();
                AnnotationRunner aRunner = new AnnotationRunner();
                //aRunner.method1();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long stopTime = System.currentTimeMillis();

        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }

}
