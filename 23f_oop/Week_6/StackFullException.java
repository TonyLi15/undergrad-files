package Week_6;

public class StackFullException extends Exception{
    public StackFullException() {
        super();
    }

    @Override
    public String toString() {
        return "StackFullException{}";
    }
}
