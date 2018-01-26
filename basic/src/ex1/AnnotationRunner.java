package ex1;

public class AnnotationRunner {

    public void method1() {
        System.out.println("method1");
    }

    @CanRun(mode = "run")
    public void method2() {
        System.out.println("method2");
    }

    @CanRun
    public void method3() {
        System.out.println("method3");
    }

    @CanRun(mode = "notrun")
    public void method5() {
        System.out.println("method4");
    }
}
