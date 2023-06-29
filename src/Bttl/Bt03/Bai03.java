package Bttl.Bt03;

import lombok.*;

import java.util.Scanner;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bai03 {
    private Integer id;
    private String city;

    public void nhapBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap City");
        id = Integer.parseInt(sc.nextLine());
        city= sc.nextLine();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Bai03{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }
}
