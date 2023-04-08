package Composition;

public class Hello {

    public static void main(String[] args) {
//        Laptop laptop = new Laptop(); //defolt constrator
//        System.out.println(laptop);
        Processor processor = new Processor();
        Graphics graphics = new Graphics();
        Laptop laptop = new Laptop("LED",processor,"Asus",graphics);
        System.out.println(laptop);
    }
}
