/**
 * Created by Espanol 2 on 6/28/2017.
 */
public class DoWhileLoopEx {
    public static void main(String[] args) {
       // System.out.println("Hello world");
        int i = 1;
        int month =36;
        double futureValue =0;
        double monthyPmt = 330.63;
        double interestRate= 5.99/100;

        do {
            futureValue = (futureValue + monthyPmt)*(1 + interestRate);
            ++i;
        } while (i <= month);
        System.out.println(futureValue);

    }
}
