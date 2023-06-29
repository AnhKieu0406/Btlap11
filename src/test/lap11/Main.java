package test.lap11;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    void yc1(){
        String chuoi = "Việt nam";
        System.out.println("concac()=" + chuoi.concat(" Cộng hòa xã hội chủ nghĩa "));
    }

    void  yc2(){
        String baoViet = "Tổng cty bảo hiểm (Bảo hiểm bảo việt"
                +"Insurance) là công ty thành viên được tập đoàn tài chính"
                +"Bảo việt đầu tư 100 vốn";

        System.out.println("lenght()= "+ baoViet.length());
        baoViet = baoViet.replaceAll("cty","Công ty");
        System.out.println("replaceAll()= "+ baoViet);
    }
    public static void main(String[] args) {
        Main bt = new Main();
        bt.yc1();
        bt.yc2();
    }
}