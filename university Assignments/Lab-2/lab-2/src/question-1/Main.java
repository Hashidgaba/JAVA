import java.util.Scanner;

class Books {

    private String title = "Ray";
    private String author = "Eleceed";
    private boolean issued = false;

    void issuebook(String book, String name) {
        if (title == book && author == name) {
            if (!issued) {
                System.out.println("The " + book + " is not available");
            }
        } else if (title != book && author != name) {
            System.out.println("The " + book + " is available");
        }

    }
}

public class Main {

    public static void main(String[] args) {
        Books b1 = new Books();

        String book;
        String name;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Book title");
        book = input.nextLine();
        System.out.println("Enter TRhe Book Author");
        name = input.nextLine();
        b1.issuebook(book, name);
    }
}