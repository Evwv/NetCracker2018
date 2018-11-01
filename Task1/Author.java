package Task1;

import java.util.Arrays;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 19 * result + name.hashCode();
        result = 19 * result + email.hashCode();
        result = 19 * result + gender;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj  ==  null || obj.getClass() != this.getClass()) {
            return false;
        }

        Author author = (Author) obj;
        return author.name.equals(name) && author.email.equals(email) && author.gender == gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}