package w3schools.Polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        Computer asrock = new AsRock();
        Computer gigabyte = new Gigabyte();

        myComputer.computerMobo();
        asrock.computerMobo();
        gigabyte.computerMobo();
    }
}
