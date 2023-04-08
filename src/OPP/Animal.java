package OPP;

public class Animal {
    protected float hightInFeet;
    protected float wight;
    protected String blood;
    protected String type;

    public Animal(){
        System.out.println("test");
    }
    public void ShowInfo(){
        System.out.println("This is hight"+hightInFeet+"\n"+"This is wight"+wight+"\n"+"This is blood group"+blood+"\n"+"This is Animal type"+type);
    }
    public static void main(String[]args){
        Animal an = new Animal();
    }
}
