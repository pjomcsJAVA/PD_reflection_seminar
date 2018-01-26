package ex2;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TesterInfo {

    public enum Priority{
        LOW, MEDIUM, HIGH;

    }

    public Priority priority() default Priority.LOW;


    String[] tags() default {"default"};

}
