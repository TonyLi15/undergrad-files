package Week_3.Assignments;/*
 * Chapter 5 Self-Test 4
 * Change the sort in Try This 5-1 so that it sorts an array of strings.
 * Demonstrate that it works.
 */

public class StringSorter {
    public static void main(String[] args){
        String[] words={"a", "asdfgh", "asdfghij", "asgh", "aioiodfff", "fhuhoii"
                , "gh", "yuerwkjfkewfw", "erfhefreifhufhowe", "wuhgf", "Xyz", "Abc", "Aoo" };

        int a, b;
        int size;
        String t;

        size = words.length;

        //display original array
        System.out.print("Original array is:");

        for(int i = 0; i < size; i++)
            System.out.print(" " + words[i]);
        System.out.println();


         //Bubble Sort for string content (initial capital)
        for(a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (words[b - 1].compareTo(words[b]) > 0) { // if out of order
                    // exchange elements
                    t = words[b - 1];
                    words[b - 1] = words[b];
                    words[b] = t;
                }
            }
        }

        // display sorted array
        System.out.print("Sorted array is:");
        for(int i = 0; i < size; i++)
            System.out.print(" " + words[i]);
        System.out.println();

    }
}