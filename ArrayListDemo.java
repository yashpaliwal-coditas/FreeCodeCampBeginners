import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(19);
        arr.add(12);
        arr.add(29);
        arr.add(20);
        arr.add(34);
        arr.add(65);
        arr.add(19);
        arr.add(12);
        arr.add(29);
        arr.add(20);
        arr.add(34);
        arr.add(65);
        System.out.println(arr);
        System.out.println(arr.get(3));
        arr.remove(2);
        System.out.println(arr);
        arr.remove(Integer.valueOf(12));
        System.out.println(arr);
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);
        arr.sort(Comparator.reverseOrder());
        System.out.println(arr);
        System.out.println(arr.contains(Integer.valueOf(19)));
        arr.forEach(i -> {
            System.out.println(i);
        });
        arr.forEach(i -> {
            System.out.println(i);
        });
    }
}
//[19, 12, 29, 20, 34, 65, 19, 12, 29, 20, 34, 65]
//20
//[19, 12, 20, 34, 65, 19, 12, 29, 20, 34, 65]
//[19, 20, 34, 65, 19, 12, 29, 20, 34, 65]
//[12, 19, 19, 20, 20, 29, 34, 34, 65, 65]
//[65, 65, 34, 34, 29, 20, 20, 19, 19, 12]
//true
//65
//65
//34
//34
//29
//20
//20
//19
//19
//12
//65
//65
//34
//34
//29
//20
//20
//19
//19
//12
//
//Process finished with exit code 0