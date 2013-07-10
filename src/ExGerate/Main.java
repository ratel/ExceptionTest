package ExGerate;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 10.07.13
 * Time: 19:58
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String [] args) {
        ExceptionWorker eWorker= new ExceptionWorker();
        System.out.println("Тестирование исключений");

        try {
            eWorker.generateNullPointerException();
        }
        catch (NullPointerException e) {
            //System.err.println("NullPointerException");
            e.printStackTrace();
        }

        try {
            eWorker.generateClassCastException();
        }
        catch (ClassCastException e) {
            //System.err.println("ClassCastException");
            e.printStackTrace();
        }

        try {
            eWorker.generateNumberFormatException();
        }
        catch (NumberFormatException e) {
            //System.err.println("NumberFormatException");
            e.printStackTrace();
        }

        try {
            eWorker.generateStackOverflowError();
        }
        catch (StackOverflowError e) {
            //System.err.println("StackOverflowError");
            e.printStackTrace();
        }

        try {
            eWorker.generateOutOfMemoryError();
        }
        catch (OutOfMemoryError e) {
            //System.err.println("OutOfMemoryError");
            e.printStackTrace();
        }

        try {
            eWorker.generateMyException("Наше исключение");
        }
        catch (MyException e) {
            //System.err.println("MyException");
            e.printStackTrace();
        }

    }
}
