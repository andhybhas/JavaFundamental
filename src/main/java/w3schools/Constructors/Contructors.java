package w3schools.Constructors;

public class Contructors {

    public static void main(String[] args) {
        Computer computer = new Computer(1080, "NVDIA");
        System.out.println(computer.modelName + " " + computer.modelSeries);
    }
}
