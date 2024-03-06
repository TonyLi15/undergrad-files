package Week_3.Assignments;/*
 * Chapter 5 Self-Test 7
 * Expanding on the Encode cipher class, modify it so that it uses an eight-character string as the key.
 */

public class EncodeCipher {
    public static void main(String[] args){
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdcbab"; // Use 8-character string as the key
        int index;

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        index = 0;
        for(int i = 0; i < msg.length(); i++){
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(index % 8));
            index++;
        }


        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the message
        index = 0;
        for(int i = 0; i < msg.length(); i++){
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(index % 8));
            index++;
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}