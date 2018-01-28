package isec.pd;

import java.io.*;

public class CustomClassLoader extends ClassLoader{

    private String pathFile;

    public CustomClassLoader(String pathFile) {
        this.pathFile=pathFile;
    }

    @Override
    public Class loadClass(String className, boolean resolve) throws ClassNotFoundException {
        Class result;
        byte classData[] = null;

        //we must check if the class name starts by *java -> delagate to parent CL

         /* Check our local cache of classes */
        result = findLoadedClass(className);

        if (result != null) {
            System.out.println("returning cached result: "+className);
            return result;
        }

        try{
            System.out.println("system loader, class: "+className);
            result = findSystemClass(className);
            return result;

        }catch (ClassNotFoundException e){
            System.out.println("this is not a system class: "+className);
        }
        if (className.startsWith("java."))
            throw new ClassNotFoundException();

        /* Try to load it from local repository */
        try {
            classData = loadClassFileData(pathFile);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ClassNotFoundException();
        }

        // Define it (parse the class file)
        result = defineClass(className, classData, 0, classData.length);
        if(result != null){
            System.out.println("CUSTOM loader, class : "+className);
        }

        if (resolve) {
            resolveClass(result);

        }
        return result;
    }


    private byte[] loadClassFileData(String name) throws IOException {

        System.out.println("loading file from filesystem: "+name);
        File f = new File (name);
        InputStream stream = new FileInputStream(f);

        int size = stream.available();
        byte buff[] = new byte[size];
        DataInputStream in = new DataInputStream(stream);
        in.readFully(buff);
        in.close();
        return buff;
    }
}
