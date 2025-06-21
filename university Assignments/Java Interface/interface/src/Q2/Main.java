package Q2;

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}

 interface Printable {
    void print();
}

 class Magazine implements Printable {
    private String title;
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    public void print() {
        System.out.println("Magazine: " + title + ", Issue #" + issueNumber);
    }
}


public class Main {
    public static void main(String[] args) {
        Printable p1 = new Book("Java Programming", "James Gosling");
        Printable p2 = new Magazine("Tech Monthly", 45);

        p1.print();
        p2.print();
    }
}

