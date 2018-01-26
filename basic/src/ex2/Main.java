package ex2;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {


        try {

            Class clazz = Class.forName("ex2.TestExample");
            TestExample testExample = (TestExample) clazz.newInstance();
            System.out.println("name: "+testExample.getClass().getName());

            Class<TestExample> obj = TestExample.class;

            if(obj.isAnnotationPresent(TesterInfo.class)){
                TesterInfo testerInfo = obj.getAnnotation(TesterInfo.class);

                for (String tag :testerInfo.tags() ) {
                    System.out.println("Tester info tag: " +tag);
                }
            }

            for (Method m:obj.getDeclaredMethods()) {

                Test test = m.getAnnotation(Test.class);

                if(test.enabled()){
                    m.invoke(obj.newInstance());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
