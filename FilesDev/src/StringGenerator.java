import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class StringGenerator {

    public final String path = "./resources/javaIO/task_3/random_string.txt";

    public String generateRandomString(final int length){
        Random          random          = new Random();
        String          randomString    = new String();
        int             leftLimit       = 97;
        int             rightLimit      = 122;
        StringBuilder   buffer          = new StringBuilder(length);

        for (int num = 0; num < length; num++){
            int randomLimitedInt = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit + 1));

            buffer.append((char)randomLimitedInt);
        }

        randomString = buffer.toString();

        return randomString;
    }

    public void write2File(int length){
        try (FileWriter write = new FileWriter(path, false)){
            write.write(this.generateRandomString(length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readCharArrayFromFile(){
        File file = null;
        FileReader fileReader = null;
        try {
            file = new File(path);
            fileReader = new FileReader(file);
            char[] buffer = new char[(int) file.length()];
            int num;

            while ((num = fileReader.read(buffer)) > 0) {
                if (num < file.length()) {
                    buffer = Arrays.copyOf(buffer, num);
                }
            }

            return new String(buffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
