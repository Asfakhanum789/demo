package aa;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Author Name Length: " + name.length());
    }
}
