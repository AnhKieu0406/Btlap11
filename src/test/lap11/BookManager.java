package test.lap11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BookManager {
    private List<Book> books = new ArrayList<>();
    private  int n;
     public  void nhap(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhập n book:");
         n = Integer.parseInt(sc.nextLine());
         for (int i = 0; i < n; i++) {
             Book book= new Book();
             book.nhap();
             books.add(book);
         }
     }
     public  void hienthi(){
         for (int i = 0; i < n; i++) {
             System.out.println(books.get(i).toString());
         }
     }

     public    void sort(){
        List<Book> books1 = books.stream().sorted(Comparator.comparingDouble(Book::getPrice).reversed()).collect(Collectors.toList());
         System.out.println("Sau khi sắp xếp giảm dần theo price");
         System.out.println("\n"+books1);
         List<Book> books2 = books.stream().sorted(Comparator.comparingDouble(Book::getPrice)).collect(Collectors.toList());
         System.out.println("Sau khi sắp xếp tăng dần theo price");
         System.out.println("\n"+books2);
     }

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.nhap();
        bookManager.hienthi();
        bookManager.sort();
    }
}

