package w3schools.InnerClasses;

public class MainClass {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        OuterClass myOuter = new OuterClass();

        System.out.println(myInner.y);
        System.out.println(myOuter.x);
    }
}
