package w3schools;

class ForIfElse {

    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 5) {
                result += 10;
                System.out.println("bla Bla : " +result);
            } else {
                result = result + i;
                System.out.println("teko : " +result);
            }
        }
        System.out.println("LAST : "+result);
    }
}