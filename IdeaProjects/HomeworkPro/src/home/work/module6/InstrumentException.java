package home.work.module6;

/**
 * Created by Vitalik on 28.12.2015.
 */
public class InstrumentException extends Exception {
    private String myException;

    public InstrumentException(final String myException) {
       this.myException = myException;
    }

    public String getMyException() {
        return myException;
    }
}
