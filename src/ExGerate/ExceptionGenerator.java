package ExGerate;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 10.07.13
 * Time: 20:06
 * To change this template use File | Settings | File Templates.
 */
public interface ExceptionGenerator {
    void generateNullPointerException();
    void generateClassCastException();
    void generateNumberFormatException();
    void generateStackOverflowError();
    void generateOutOfMemoryError();
    void generateMyException(String message) throws MyException;
}
