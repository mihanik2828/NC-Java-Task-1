package netcracker.Document1.BookClass;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return gender == author.gender && Objects.equals(name, author.name) && Objects.equals(email, author.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, gender);
    }

    public String getName() {
        return name+',';
    }
}
