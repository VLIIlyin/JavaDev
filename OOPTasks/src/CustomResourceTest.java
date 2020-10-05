import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CustomResourceTest {

    public void callResourceTryCatchFinal() {
        InputStream stream = null;
        try{
            stream = Main.class.getClassLoader().getResourceAsStream("Test.txt");

            int counter = -1;
            while ((counter = stream.read()) != -1) {
                System.out.print((char) counter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stream != null){
                    stream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void callResourceTryWithResource() throws IOException{
        try (InputStream stream = Main.class.getClassLoader().getResourceAsStream("Test.txt")) {
            int counter = -1;
            while ((counter = stream.read()) != -1) {
                System.out.print((char) counter);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

