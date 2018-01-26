package ex1;

import java.lang.reflect.Method;

public class Main {

    /**
     * @param args args.
     */
    public static void main(String[] args) {

        try {
            ex1.AnnotationRunner aRunner = (AnnotationRunner) Class.forName("ex1.AnnotationRunner").newInstance();
            Method[] methods = aRunner.getClass().getMethods();

            for (Method m:methods) {
                CanRun run = m.getAnnotation(CanRun.class);

                if(run!= null && run.mode().equals("run")){

                    m.invoke(aRunner);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
