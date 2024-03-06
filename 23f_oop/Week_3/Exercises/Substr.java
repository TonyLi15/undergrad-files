package Week_3.Exercises;

public class Substr {
    public static void main(String[] args){
        String orgstr = "Java makes the Web move.";

        // construct a substring
        String substr = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);

        System.out.println("length of original: "+ orgstr.length());
        System.out.println("char At 3: "+ orgstr.charAt(3));
        System.out.println("repeat 10 times: " + orgstr.repeat(10));

        System.out.println( "abcdabcde".lastIndexOf( "cd" ) );

    }
}