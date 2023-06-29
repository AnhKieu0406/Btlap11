package Bttl;

import java.util.*;

public class Bt1 {

    private List<Integer> lstSoNguyen =  new ArrayList<>();
    private int n;
    int number;
    public  void  nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n :");
        n=Integer.parseInt((sc.nextLine()));
        System.out.println("Ds các phần tử");
        for (int i = 0; i < n; i++) {
            number = sc.nextInt();
            lstSoNguyen.add(number);

        }
        System.out.print("List vừa nhập:");
        System.out.println(lstSoNguyen);

        Collections.sort(lstSoNguyen);
        System.out.println("list tăng dần"+lstSoNguyen);

        Collections.reverse(lstSoNguyen);
        System.out.println("List giảm dần"+lstSoNguyen);


    }
    public void sortList(){

    }

    public static void main(String[] args) {
        Bt1 bt1 = new Bt1();
        bt1.nhap();
    }
}
