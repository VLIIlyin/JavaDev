import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ByteGenerator {

    public byte[] generateRandomArray(final int length){
        byte[] byteArray = new byte[length];
        Random random = new Random();

        random.nextBytes(byteArray);

        return byteArray;
    }

    public void writeBytes2File(int length){
        try {
            Files.write(Paths.get("./resources/javaIO/task_2/random_byte_array.txt"), this.generateRandomArray(length), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readBytesFromFile(){
        try {
            String fileBytes = new String(Files.readAllBytes(Paths.get("./resources/javaIO/task_2/random_byte_array.txt")));
            return fileBytes;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public void writeByteByByte2File(int length){
        try (FileOutputStream fileOutputStream = new FileOutputStream("./resources/javaIO/task_2/random_byte_array.txt")){
            byte[] bytes = this.generateRandomArray(length);
            fileOutputStream.write(bytes, 0, length);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String readeByteByByteFromFile(){
        try (FileInputStream fileInputStream = new FileInputStream("./resources/javaIO/task_2/random_byte_array.txt")){

            byte[] bytes = new byte[fileInputStream.available()];
            StringBuilder stringBuilder = new StringBuilder();
            while (fileInputStream.read(bytes) != fileInputStream.available()){
                stringBuilder.append(new String(bytes));
                bytes = new byte[fileInputStream.available()];
            }

            return new String(stringBuilder.toString());
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    public void writeArray2File(int length){
        try (FileOutputStream fileOutputStream = new FileOutputStream("./resources/javaIO/task_2/random_byte_array.txt")){
            byte[] bytes = this.generateRandomArray(length);
            fileOutputStream.write(bytes);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String readeArrayFromFile(){
        try (FileInputStream fileInputStream = new FileInputStream("./resources/javaIO/task_2/random_byte_array.txt")){
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);

            return new String(bytes);
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
