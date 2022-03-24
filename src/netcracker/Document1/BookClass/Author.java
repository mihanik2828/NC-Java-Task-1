package netcracker.Document1.BookClass;

public class Author {
    private String name;
    private String email= "none";
    private char gender='u';

    public Author(String name) {   // добавил для удобства создания объектов
        this.name = name;
    }

    public Author(String name, String email, char gender) { //это просто так добавил
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + name  +
                ",email=" + email  +
                ",gender=" + gender +
                "]";
    }

    public String getName() {
        return name+',';
    }
}
