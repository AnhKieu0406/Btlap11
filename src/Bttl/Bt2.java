package Bttl;

import java.util.*;
import java.util.stream.Collectors;

public class Bt2 {
    private Set<String> lstCity= new HashSet<String>();
    String cityItem;
    int n;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        n =sc.nextInt();
        for (int i = 0; i <= n; i++) {
            cityItem =sc.nextLine();
            lstCity.add(cityItem);

        }
        System.out.println("Danh sách thành phố:");
        System.out.println(lstCity);
    }
    public void sort() {
       List<String> list = new ArrayList<>(lstCity);
       Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        Bt2 bt2 = new Bt2();
        bt2.nhap();
        bt2.sort();
    }
}
