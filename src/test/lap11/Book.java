package test.lap11;

import lombok.*;

import java.util.Scanner;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Book {
    private String isbn;
    private String bookName;
    private String author;
    private String publisher;
    private float price;

    public  void  nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập book:");
        isbn = sc.nextLine();
        bookName = sc.nextLine();
        author = sc.nextLine();
        publisher = sc.nextLine();
        price =  Float.parseFloat(sc.nextLine());
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}'+"\n";
    }
}
