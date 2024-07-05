import java.io.*;

public class SerializationTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee e = new Employee();
        e.id=1; e.name="ruturaj"; e.dept="QA";

        String filePath = "/C:/Users/madiw/Documents/Rutu/study/Learning 2 latest/Learning 2 latest/Java and Testing Concept/seri.text";

     /*   FileOutputStream fo = new FileOutputStream(filePath);

        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(e);*/

        FileInputStream fi = new FileInputStream(filePath);

        ObjectInputStream oi = new ObjectInputStream(fi);
       Employee ee = (Employee) oi.readObject();
        System.out.println(ee.id);


    }
}
