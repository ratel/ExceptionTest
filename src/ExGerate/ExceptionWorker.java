package ExGerate;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 10.07.13
 * Time: 20:13
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionWorker implements ExceptionGenerator{
    @Override
    public void generateNullPointerException() {
        throw new NullPointerException();
        /*ArrayList<Integer> d= null;
        d.add(5);*/
    }

    @Override
    public void generateClassCastException() {
        throw new ClassCastException();
    }

    @Override
    public void generateNumberFormatException() {
        throw new NumberFormatException();
    }

    @Override
    public void generateStackOverflowError() {
        throw new StackOverflowError();
    }

    @Override
    public void generateOutOfMemoryError() {
        throw new OutOfMemoryError();
    }

    @Override
    public void generateMyException(String message) throws MyException {
        throw new MyException(message);
    }
}
