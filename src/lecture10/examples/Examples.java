package lecture10.examples;

import java.io.*;

public class Examples {
    public static void main(String[] args) {
    }

/*    static void testCheckedException() {
        File file = new File("src/lecture07/exceptions/testFile.txt");
        FileReader fr = new FileReader(file);
    }*/

    static void testUncheckedException() {
        int[] num = {1, 2, 3, 4};
        System.out.println(num[5]);
    }

    /**
     * @param path example:
     *             "src/lecture10/examples/testFile.txt"
     */
    static void testTryCatch(String path) {
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found! Please check the file name and try it again!");
        }
    }

    /**
     * @param number ex: 100, 99, 99, 10
     * @param factor ex: 10, 5, 0, "test"
     */
    static void testTryMultipleCatch(int number, int factor) {
        try {
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic " + ex);
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception " + ex);
        }
    }

    /**
     * @param number ex: 100, 99, 99, 10
     * @param factor ex: 10, 5, 0, "test"
     */
    static void testTryCatchMultipleExceptions(int number, int factor) {
        try {
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException | NumberFormatException ex) {
            System.out.println("Exception encountered " + ex);
        }
    }

    /**
     * @param path example:
     *             "src/lecture10/examples/testFile.txt"
     */
    static void testThrowsException(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader fileReader;
        fileReader = new FileReader(file);
    }

    /**
     * @param number ex: 100, 99, 99, 10
     * @param factor ex: 10, 5, 0, "test"
     */
    static void testThrowException(int number, int factor) {
        try {
            if (number % factor == 0)
                System.out.println(factor + " is a factor of " + number);
        } catch (ArithmeticException | NumberFormatException ex) {
            throw new IllegalArgumentException("Incorrect input! Please enter only numbers bigger than 0!");
        }
    }
    
    static void testTryFinally(String path) throws IOException {
        FileInputStream myFileInputStream = null;
        BufferedReader myBuffReader = null;
        try {
            myFileInputStream = new FileInputStream(path);
            myBuffReader = new BufferedReader(new InputStreamReader(myFileInputStream));
            String temp;

            while ((temp = myBuffReader.readLine()) != null) {
                System.out.println(temp);
            }
        } finally {
            if (myBuffReader != null) {
                myBuffReader.close();
            }
            if (myFileInputStream != null) {
                myFileInputStream.close();
            }
        }
    }
}