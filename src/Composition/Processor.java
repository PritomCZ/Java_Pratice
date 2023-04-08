package Composition;

public class Processor {
    protected String brand;
    protected String version;
    protected String gen;

    public Processor(){
        this.brand = "Intel";
        this.version = "CORE i5";
        this.gen= "10th gen";
    }

    public Processor(String brand, String version, String gen){
        this.brand=brand;
        this.version=version;
        this.gen=gen;

    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                ", gen='" + gen + '\'' +
                '}';
    }
}
