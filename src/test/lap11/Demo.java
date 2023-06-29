package test.lap11;

public class Demo {
    int anInt=0;
    static int anIntStatic=0;



    public static void main(String[] args) {
        Demo demo1 = new Demo();
        System.out.println(++demo1.anInt);
        System.out.println(++demo1.anIntStatic);



        Demo demo2 = new Demo();
        System.out.println(++demo2.anInt);
        System.out.println(++demo2.anIntStatic);
    }
}
