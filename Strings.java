
public class Strings {
    public static void main(String args[]){
        String name = "Yash";
        String name1 = "Yash";
        String objString1 = new String("xyz");
        String objString2 = new String("xyz");
        System.out.println(name1==name);
        System.out.println(objString1==objString2);
        String country = "india";
        int age=23;
        String company = "Coditas";
        double gpa = 8.95;
        char percentage = '%';
        boolean truth = true;
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old.My GPA is %f,I has attended 100%c of my classes,These claims are %b .I work for %s.",
                name,country,age,gpa,percentage,truth,company);
        System.out.println(formattedString);

        System.out.println(formattedString.length());
        System.out.println(formattedString.isEmpty());
        name="";
        System.out.println(name.isEmpty());
        name="Yash Paliwal";
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.toLowerCase());

        String string="the sky is blue";
        System.out.println(string.replace("blue","red"));
        System.out.println(string.contains("sky"));

    }
}
