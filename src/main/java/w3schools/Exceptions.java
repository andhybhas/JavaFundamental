package w3schools;

public class Exceptions {

    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {0, 1, 2, 3, 4, 5, 6};
            System.out.println(myNumbers[12]);
        } catch (Exception e) {
            System.out.println("Can't find the Number.");
        }
    }
}
