package Bttl.Bt03;

import lombok.NonNull;

import java.util.*;


@NonNull

public class Bai03Manager {
    private Map<Integer,String> map = new HashMap<>();


    private int n;


    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n :");
        n= Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
           Bai03 bai03 =new Bai03();
           bai03.nhapBook();
           map.put(bai03.getId(), bai03.getCity());
        }
        System.out.print("List vừa nhập:");
        System.out.println(map);
    }

    public void  sortCity(){
        SortedSet<String> keySet = new TreeSet<>(map.values());
        System.out.println("Sắp xếp theo city :");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
    public  void sortKey(){
        SortedSet<Integer> keySet = new TreeSet<>(map.keySet());
        System.out.println("Sắp xếp theo ID :");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey())
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Bai03Manager bai03Manager = new Bai03Manager();
        bai03Manager.nhap();
        bai03Manager.sortCity();
        bai03Manager.sortKey();

    }
}
