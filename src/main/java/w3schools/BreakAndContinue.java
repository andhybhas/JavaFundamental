package w3schools;

public class BreakAndContinue {

    public static void main(String[] args) {
        System.out.println("Test Break");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Test Continue");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

}