package home.work.module6;

/**
 * Created by Vitalik on 28.12.2015.
 */
public class ExceptionModuleSix extends Exception {
    private String myException;

    public ExceptionModuleSix(final String smth) {
        this.myException = smth;
    }

    public String getMyException() {
        return myException;
    }
}
