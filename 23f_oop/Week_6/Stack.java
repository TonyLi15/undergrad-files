package Week_6;

public class Stack {
    private char [] s; // array s holds the stack
    private int top; // int top indicate the top of the stack s

    //Construct an empty stack given its size
    Stack(int size){
        s = new char[size];
        top = 0;
    }

    //Construct a stack from a stack
    Stack(Stack ob){
        top = ob.top;
        s = new char[ob.s.length];

        for (int i = 0; i < top; i++){
            s[i] = ob.s[i];
        }
    }

    // Construct a stack with initial values
    Stack(char[] a){
        s = new char[a.length];
        for (int i = 0; i < a.length; i++){
            try {
                push(a[i]);
            } catch (StackFullException e){
                System.out.println(e + " is caught");
            }

        }
    }

    // Push a character to the stack
    void push(char ch) throws StackFullException{
        if (top == s.length)
            throw new StackFullException();


        s[top++] = ch;
    }

    // Pop a character from the stack
    char pop() throws StackEmptyException{
        if (top == 0)
            throw new StackEmptyException();
        return s[--top];
    }

    public static void main(String[] args) throws StackEmptyException, StackFullException{
        // Refer to test of Queue class
        // construct 10-element empty stack s1
        Stack s1 = new Stack(10);

        // construct stack s2 from array name
        char[] name = {'T', 'o', 'n', 'y'};
        Stack s2 = new Stack(name);

        // put some characters into s1
        char ch;
        int i;
        for(i = 0; i < s1.s.length; i++)
            s1.push((char) ('A' + i));

        // construct stack s3 from another stack s1
        Stack s3 = new Stack(s1);

        // show content of all stacks
        System.out.print("Contents of s1: ");

        for(i = 0; i < s1.s.length; i++) {
            ch = s1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Contents of s2: ");

        for(i = 0; i < s2.s.length; i++) {
            ch = s2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Contents of s3: ");

        for(i = 0; i < s3.s.length; i++) {
            ch = s3.pop();
            System.out.print(ch);
        }

    }

}