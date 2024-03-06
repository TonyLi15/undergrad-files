package Week_6;

public class StackEmptyException extends Exception{
    public StackEmptyException() {
        super();
    }

    @Override
    public String toString() {
        return "StackEmptyException{}";
    }
}
