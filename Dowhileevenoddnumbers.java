package homeworkforloops;

public class Dowhileevenoddnumbers {
    public static void main(String[] args) {

        int a=1;
        do{
            if (a % 2 == 0) {
                System.out.println("Even number: " + a);
            } else {
                System.out.println("Odd number: " + a);
            }
            a++;
        } while (a<=20);
    }
}
