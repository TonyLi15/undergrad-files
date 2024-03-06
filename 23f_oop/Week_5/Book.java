package Week_5;

public class Book {
    private String title;
    private String author;
    private int pubYear;

    public Book (String t, String a, int d){
        title = t;
        author = a;
        pubYear = d;
    }

    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubYear);
        System.out.println();
    }
}
