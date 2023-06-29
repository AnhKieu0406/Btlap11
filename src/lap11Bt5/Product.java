package lap11Bt5;

import lombok.*;

import java.util.Scanner;

@NoArgsConstructor
@Data
@ToString
@Builder
@AllArgsConstructor
public class Product {
    private String proId;
    private String proName;
    private String producer;
    private int yearMaking;
    private float price;


    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập Product");
        proId = sc.nextLine();
        proName = sc.nextLine();
        producer = sc.nextLine();
        yearMaking = sc.nextInt();
        price = Float.parseFloat(sc.nextLine());
    }



    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", producer='" + producer + '\'' +
                ", yearMaking=" + yearMaking +
                ", price=" + price +
                '}';
    }
}
