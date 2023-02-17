import java.util.Arrays;

public class ArraysOperations {
    public static void main(String args[]){
        char vowel[] = new char[5];
        vowel[0]='a';
        vowel[1]='e';
        vowel[2]='i';
        vowel[3]='o';
        vowel[4]='u';
        System.out.println(Arrays.toString(vowel));
        char vowels[] = {'i','o','u','a','e'};
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);
        int fIndex = Arrays.binarySearch(vowels,1,4,'i');
        System.out.println(fIndex);
        fIndex = Arrays.binarySearch(vowels,1,4,'b');
        System.out.println(fIndex);
        //Arrays.fill(vowels,'x');
        System.out.println(Arrays.toString(vowels));
        char v[] = vowels;
        Arrays.fill(vowels,'y');
        char y[] = Arrays.copyOfRange(vowels,2,4);
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.equals(v,vowels));

    }
}
//"C:\Program Files\Java\jdk1.8.0_361\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=56395:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_361\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\rt.jar;C:\Users\Coditas\IdeaProjects\FreeCodeCampBeginners\out\production\FreeCodeCampBeginners" ArraysOperations
//[a, e, i, o, u]
//[a, e, i, o, u]
//5
//2
//-2
//[a, e, i, o, u]
//[y, y, y, y, y]
//[y, y]
//true
//
//Process finished with exit code 0