public class OPP {
//    public void test(){
//        System.out.println("Automation test 1");
//    }
//    public void test2(){
//        System.out.println("Automation test 2");
//    }
//    public void test3(){
//        System.out.println("Automation test 3");
//    }
//    public static void main(String[] args){
//        OPP obj = new OPP();
//        obj.test();
//        obj.test2();
//        obj.test3();
//    }
//    public void test(int x, int y){
//        System.out.println(x+y);
//    }
//    public void test2(int m, int n){
//        System.out.println(m*n);
//    }
//    public void test3(int w, int v){
//        System.out.println(w/v);
//    }
//    public static void main(String[] args){
//        OPP obj = new OPP();
//        int r = 30;
//        int c = 10;
//        obj.test(r,c);
//        obj.test2(r,c);
//        obj.test3(r,c);
//    }
    public int test(int x, int y){
        int sum = x+y;
        return sum;
    }
    public int test2(int m, int n){
        int multi = m*n;
        return multi;
    }
    public int test3(int w, int v){
        int div = w/v;
        return div;
    }
    public String test4(String c, String z){
        String fullname = c+z;
        return fullname;
    }
    public static void main(String[] args){
        OPP obj = new OPP();
        int high = 40;
        int low = 4;
        String a = "Pritom";
        String b = "Cruze";

        int s= obj.test(high,low);
        int mu= obj.test2(high,low);
        int d= obj.test3(high, low);
        String z = obj.test4(a,b);

        System.out.println(s);
        System.out.println(mu);
        System.out.println(d);
        System.out.println(z);
    }
}
