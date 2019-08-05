package w3schools.Inheritance;

class Computer extends Inheritance {
    private String modelName = "GTX 1980";

    public static void main(String[] args) {

        Computer myComputer = new Computer();

        myComputer.merk();

        System.out.println(myComputer.brand + " " + myComputer.modelName);
    }
}