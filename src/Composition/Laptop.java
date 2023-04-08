package Composition;

public class Laptop {
    protected String Screen;
    protected Processor processor;
    protected String Motherboard;
    protected Graphics graphics;

    public Laptop(){
        this.Screen = "led";
        this.processor = new Processor();
        this.Motherboard = "Asus";
        this.graphics = new Graphics();
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Screen='" + Screen + '\'' +
                ", processor=" + processor +
                ", Motherboard='" + Motherboard + '\'' +
                ", graphics=" + graphics +
                '}';
    }
    public Laptop(String Screen, Processor processor, String Motherboard, Graphics graphics) {
        this.Screen = Screen;
        this.processor = processor;
        this.Motherboard = Motherboard;
        this.graphics = graphics;
    }
}
