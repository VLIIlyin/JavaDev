public class Main {
    public static void main(String[] args) {
        ByteGenerator   byteGenerator   = new ByteGenerator();
        StringGenerator stringGenerator = new StringGenerator();
        StringManipulator stringManipulator = new StringManipulator();

       /* byteGenerator.writeBytes2File(3);
        System.out.println(byteGenerator.readBytesFromFile());

        byteGenerator.writeByteByByte2File(3);
        System.out.println(byteGenerator.readeByteByByteFromFile());

        byteGenerator.writeArray2File(3);
        System.out.println(byteGenerator.readeArrayFromFile());*/

        //stringGenerator.write2File(280);
        //System.out.println(stringGenerator.readCharArrayFromFile());

        stringManipulator.write2File();
        System.out.println(stringManipulator.readSubstring(1, 20));
        System.out.println(stringManipulator.readSubstring(21, 78));
        System.out.println(stringManipulator.readLastChars(10));
        System.out.println(stringManipulator.readLastChars(3));
        stringManipulator.replaceLastChars(3, "end");
        System.out.println(stringManipulator.readLastChars(3));
    }
}