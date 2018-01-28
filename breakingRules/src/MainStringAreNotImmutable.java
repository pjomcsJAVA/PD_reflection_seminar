import java.lang.reflect.Field;

public class MainStringAreNotImmutable {

    public static void main(String[] args) {
        //criação de duas strings em que uma aponta para a outra e que serve de controlo
        String string = "String are immutable!";
        String reference = string;
        try {
            Class stringClass = string.getClass();
            Field valueField = stringClass.getDeclaredField("value");
            valueField.setAccessible(true);
            char[] internalValueCharArr = (char[]) valueField.get(string);
            internalValueCharArr[11] = ' ';
            internalValueCharArr[12] = ' ';

            System.out.println(string == reference);
            System.out.println(string);
            System.out.println(reference);

        } catch (Exception e) {
        }
    }
}
