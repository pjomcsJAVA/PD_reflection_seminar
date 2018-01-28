import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainAccessingPrivateStuFF {

    public static void main(String[] args) {

        Foo foo = new Foo(10);


        try {
            // Declaração de métods e variáveis por reflexão
            Method declaredMethod = null;
            Field declaredPrivateField = null;
            // Impressão do valor da variável privada da classe Foo.class
            declaredPrivateField = Foo.class.getDeclaredField("myPrivateInt");
            declaredPrivateField.setAccessible(true);
            System.out.println(declaredPrivateField.get(foo));
            // Utilização do método privado da classe Foo.Class
            declaredMethod = Foo.class.getDeclaredMethod("myPrivateMethod", null);
            declaredMethod.setAccessible(true);
            System.out.println((String) declaredMethod.invoke(foo, null));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
