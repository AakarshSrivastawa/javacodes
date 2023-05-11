import java.io.*;

public class exception.handling {

    // Checked Exception
    public static void readFromFile() throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }

    // Checked Exception
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero error");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
    }

    // Unchecked Exception
    public static void arrayIndexOutOfBound() {
        int[] arr = new int[5];
        try {
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }
    }

    // Unchecked Exception
    public static void nullPointerException() {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Caught: " + e);
        }
    }

    public static void main(String[] args) {

        try {
            readFromFile();
        } catch (IOException e) {
            System.out.println("Exception Caught: " + e);
        }

        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e);
        }

        arrayIndexOutOfBound();

        nullPointerException();

    }
}
