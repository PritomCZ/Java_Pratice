package Composition;

public class Graphics {
    protected String brand;
    protected String model;
    protected String GB;



    public Graphics(){
        this.brand = "DDR";
        this.model = "Gxttch";
        this.GB = "4gb";
    }

    public Graphics(String brand, String model, String GB){
        this.brand = brand;
        this.GB = GB;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Graphics{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", GB='" + GB + '\'' +
                '}';
    }
}
