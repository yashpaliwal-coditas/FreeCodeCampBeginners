public class looping {
    public static void main(String args[]){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        int arr[]={55,34,2,31,8,50,12,40,60,78,90};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println("Print table");
        int n=2;
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++) {
                System.out.println(i + " * " + j + " = " + j* i);
            }
        }

    }
}
//"C:\Program Files\Java\jdk1.8.0_361\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\lib\idea_rt.jar=56387:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_361\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_361\jre\lib\rt.jar;C:\Users\Coditas\IdeaProjects\FreeCodeCampBeginners\out\production\FreeCodeCampBeginners" looping
//0
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//55
//34
//2
//31
//8
//50
//12
//40
//60
//78
//90
//Print table
//2 * 1 = 2
//2 * 2 = 4
//2 * 3 = 6
//2 * 4 = 8
//2 * 5 = 10
//2 * 6 = 12
//2 * 7 = 14
//2 * 8 = 16
//2 * 9 = 18
//2 * 10 = 20
//1 * 1 = 1
//1 * 2 = 2
//1 * 3 = 3
//1 * 4 = 4
//1 * 5 = 5
//1 * 6 = 6
//1 * 7 = 7
//1 * 8 = 8
//1 * 9 = 9
//1 * 10 = 10
//2 * 1 = 2
//2 * 2 = 4
//2 * 3 = 6
//2 * 4 = 8
//2 * 5 = 10
//2 * 6 = 12
//2 * 7 = 14
//2 * 8 = 16
//2 * 9 = 18
//2 * 10 = 20
//3 * 1 = 3
//3 * 2 = 6
//3 * 3 = 9
//3 * 4 = 12
//3 * 5 = 15
//3 * 6 = 18
//3 * 7 = 21
//3 * 8 = 24
//3 * 9 = 27
//3 * 10 = 30
//4 * 1 = 4
//4 * 2 = 8
//4 * 3 = 12
//4 * 4 = 16
//4 * 5 = 20
//4 * 6 = 24
//4 * 7 = 28
//4 * 8 = 32
//4 * 9 = 36
//4 * 10 = 40
//5 * 1 = 5
//5 * 2 = 10
//5 * 3 = 15
//5 * 4 = 20
//5 * 5 = 25
//5 * 6 = 30
//5 * 7 = 35
//5 * 8 = 40
//5 * 9 = 45
//5 * 10 = 50
//6 * 1 = 6
//6 * 2 = 12
//6 * 3 = 18
//6 * 4 = 24
//6 * 5 = 30
//6 * 6 = 36
//6 * 7 = 42
//6 * 8 = 48
//6 * 9 = 54
//6 * 10 = 60
//7 * 1 = 7
//7 * 2 = 14
//7 * 3 = 21
//7 * 4 = 28
//7 * 5 = 35
//7 * 6 = 42
//7 * 7 = 49
//7 * 8 = 56
//7 * 9 = 63
//7 * 10 = 70
//8 * 1 = 8
//8 * 2 = 16
//8 * 3 = 24
//8 * 4 = 32
//8 * 5 = 40
//8 * 6 = 48
//8 * 7 = 56
//8 * 8 = 64
//8 * 9 = 72
//8 * 10 = 80
//9 * 1 = 9
//9 * 2 = 18
//9 * 3 = 27
//9 * 4 = 36
//9 * 5 = 45
//9 * 6 = 54
//9 * 7 = 63
//9 * 8 = 72
//9 * 9 = 81
//9 * 10 = 90
//10 * 1 = 10
//10 * 2 = 20
//10 * 3 = 30
//10 * 4 = 40
//10 * 5 = 50
//10 * 6 = 60
//10 * 7 = 70
//10 * 8 = 80
//10 * 9 = 90
//10 * 10 = 100
//
//Process finished with exit code 0