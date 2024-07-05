import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            int a=10/0;
            FileInputStream ff = new FileInputStream("");
        }

        catch (IndexOutOfBoundsException i) {

        }
        catch (FileNotFoundException f) {

        }


    }
}
