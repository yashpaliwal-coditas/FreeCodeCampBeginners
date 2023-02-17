import java.util.HashMap;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap<String , Integer> examScore = new HashMap<String , Integer>();
        examScore.put("Math",89);
        examScore.put("java",98);
        examScore.put("DSA",91);
        examScore.put("Accounts",65);
        System.out.println(examScore.toString());
        System.out.println(examScore.get("java"));
        examScore.putIfAbsent("Math",90);
        System.out.println(examScore.toString());
        //System.out.println(examScore.get("Soft"));
        //examScore.clear();
        examScore.remove("DSA");
        System.out.println(examScore.containsKey("java"));
        System.out.println(examScore.containsValue(98));
        System.out.println(examScore.isEmpty());
        examScore.forEach((subjects ,score)->{
            System.out.println(subjects +"-"+score);
        });

    }
}
//{java=98, DSA=91, Math=89, Accounts=65}
//98
//{java=98, DSA=91, Math=89, Accounts=65}
//true
//true
//false
//java-98
//Math-89
//Accounts-65
//
//Process finished with exit code 0