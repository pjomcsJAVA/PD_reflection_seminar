package isec.pd;


/**
 * Class loader example!
 *
 */
public class App{

    static String className = "com.pt.LocalClass";

    static String filePath = "/home/vsazevedo/ISEC/PD/seminario/exemplos/PD_reflection_seminar/class-loader-resource/target/classes/com/pt/LocalClass.class";


    public static void main( String[] args ) {
        System.out.println( "Class Loader example!" );
        String qualifiedName = className;
        String classFilePath = filePath;

        if(args.length >= 1){
            qualifiedName = args[0];
            classFilePath = args[1];
            System.out.println("sing VM args!");
        }

        CustomClassLoader ccl = new CustomClassLoader(classFilePath);
        String className = qualifiedName;
        Object o;

        try {
            Class clazz = ccl.loadClass(className);
            o = clazz.newInstance();

            System.out.println("class loader of: "+o.getClass().getName() +" | "+o.getClass().getClassLoader().toString());

            ((Local) o).start(8);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
