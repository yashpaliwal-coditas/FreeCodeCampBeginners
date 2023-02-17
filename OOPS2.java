import java.util.ArrayList;

class User1 {
    String name;
    int salary;
    ArrayList<Book1> books= new ArrayList<Book1>();
    User1(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    void incrementSal(){
        salary+=2000;
    }
    void borrow(Book1 book){
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
class Book1 {
    String bName;
    String athorName;
    Book1(String bName,String athorName){
        this.bName = bName;
        this.athorName = athorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", athorName='" + athorName + '\'' +
                '}';
    }
}
public class OOPS2 {
    public static void main(String args[]) {
        Book1 book1 = new Book1("java", "Paliwal");
        User1 user1 = new User1("yash", 6889);
        user1.borrow(book1);
        System.out.println(user1);

    }
}
//User{name='yash', salary=6889, books=[Book{bName='java', athorName='Paliwal'}]}
//
//Process finished with exit code 0