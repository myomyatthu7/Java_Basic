package tryAndCatch;

public class HaveNoInternet extends Exception {
    public HaveNoInternet(String msg) {
        super(msg);
    }
}