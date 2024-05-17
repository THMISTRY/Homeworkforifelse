package homeworkforloops;

public class Whileevenoddnumbers {
    public static void main(String[] args) {

        int a = 1;
        while (a <= 20) {
            if (a % 2 == 0) {
                System.out.println("Even number: " + a);
                a++;
            } else if (a%2!=0){
                System.out.println("Odd number: " + a);
                a++;

            }
                   }
    }
}



