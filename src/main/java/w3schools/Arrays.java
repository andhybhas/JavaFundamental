package w3schools;

public class Arrays {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        //mau nge show ada berapa isi arrays
        System.out.println("Total Isi Array = " + cars.length);

        //mau nampilin semua isi arrays dengan fungsi for
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Isi dari Array Cars : " + cars[i]);
        }

        //mau nampilan array ke- x
        int x = 0;
        System.out.println("Array ke " + x + " adalah " + cars[x]);
    }

}