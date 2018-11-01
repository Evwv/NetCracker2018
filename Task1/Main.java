package Task1;

public class Main {

    public static void main(String[] args) {

        /*MyPoint myPoint1 = new MyPoint(100,10);
        MyPoint myPoint2 = new MyPoint(150,155);
        MyPoint myPoint3 = new MyPoint(200,2);
        MyTriangle myTriangle = new MyTriangle(myPoint1,myPoint2,myPoint3);
        System.out.println(myTriangle.toString());
        System.out.println(myTriangle.getPerimetr());
        System.out.println(myTriangle.getType());
        Employee employee = new Employee(10,"a","b",20);
        Employee employee1 = employee;
        System.out.println(employee.equals(employee1));*/
        Author author = new Author("A","B", 'M');
        Author author1 = new Author("b","b", 'M');
        Author author2 = new Author("C","c", 'M');
        Author[] authors = new Author[]{author,author1};
        Author[] authors1 = new Author[]{author,author2};
        Book book = new Book("kniga1",authors,15);
        Book book1 = new Book("kniga1",authors1,15);
        System.out.println(book.equals(book1));
    }

}