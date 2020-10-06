public class Main {
    public static void main(String[] args) {
        ByteGenerator byteGenerator = new ByteGenerator();

        byteGenerator.writeBytes2File(3);
        System.out.println(byteGenerator.readBytesFromFile());

        byteGenerator.writeByteByByte2File(3);
        System.out.println(byteGenerator.readeByteByByteFromFile());

        byteGenerator.writeArray2File(3);
        System.out.println(byteGenerator.readeArrayFromFile());
    }
}