import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class StringManipulator extends StringGenerator{

    public final String path = "./resources/javaIO/task_4/task_4.txt";
    public final int length = 100;

    public void write2File() {
        try (FileWriter write = new FileWriter(path, false)){
            write.write(this.generateRandomString(length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readSubstring(int fromPosition, int toPosition){
        try (FileReader fileReader = new FileReader(path);){

            char[] buffer = new char[toPosition - fromPosition + 1];
            int num = fromPosition;

            while ((num = fileReader.read(buffer)) > toPosition) {
                if (num <= toPosition) {
                    buffer = Arrays.copyOf(buffer, num);
                }
            }

            return new String(buffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String readLastChars(int length){
        byte[] bytes;
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r")){
            File file = new File(path);
            randomAccessFile.seek(file.length() - length);

            return randomAccessFile.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void replaceLastChars(int length, String replaceStr) {
        byte[] bytes;
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(path, "rw")) {
            File file = new File(path);
            randomAccessFile.seek(file.length() - length);

            randomAccessFile.writeBytes(replaceStr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
