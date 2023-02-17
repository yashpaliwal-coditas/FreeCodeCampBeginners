import java.util.ArrayList;

class User {
    public String name;
    int salary;
    ArrayList<Book> books= new ArrayList<Book>();
    void incrementSal(){
        salary+=2000;
    }
    void borrow(Book book){
        this.books.add(book);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", books=" + books +
                '}';
    }
}
class Book {
    String bName;
    String athorName;

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", athorName='" + athorName + '\'' +
                '}';
    }
}
public class OOPs {
    public static void main(String args[]){
        User user =new User();
        user.name = "yash";
        System.out.println(user.name);
        user.salary=56778;
        System.out.println(user.salary);
        user.incrementSal();
        Book book=new Book();
        book.bName="JAVA";
        book.athorName="Paliwal";
        user.borrow(book);
        System.out.println(user.salary);
        System.out.println(user);
    }
}
//yash
//56778
//58778
//User{name='yash', salary=58778, books=[Book{bName='JAVA', athorName='Paliwal'}]}
//
//Process finished with exit code 0