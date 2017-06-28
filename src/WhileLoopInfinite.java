/**
 * Created by Espanol 2 on 6/28/2017.
 */
public class WhileLoopInfinite {
    public static void main(String[] args) {
        while (true) {
            //will run endlessly

            //to break out of this loop you will want to include a condtional statement
            //you can use the keyword "break"
            int randomNum = (int) (Math.random() * 10); //generate a random # 0 -10
            System.out.println(randomNum);
            if (randomNum == 7) {
                System.out.println("value is found -- exit loop!");
                break;
            }
        }
        System.out.println();
        System.out.println("Continue statement example below:");
        for (int i = 0; i < 6; i++) {
            int randomNum2 = (int) (Math.random() * 10); //generate a random # 0 -10
            if (randomNum2 > 7){
                System.out.println("invalid number -- contine loop");
                continue;
            }
            System.out.println(randomNum2);//only execute if randomNum2 is <=7


        }
    }
}
