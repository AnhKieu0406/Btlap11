package Lap11bt;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<String> listSV = new ArrayList<>();

    public void  testList(){
        listSV.add("tuấn");
        listSV.add("Ha");
        listSV.add("Linh");
        System.out.println("ArrayList Student");
        System.out.println("\t"+listSV +"\n");
    }
    public  void updateList(){
        listSV.set(1,"huy");
        System.out.println("Update ArrayList Student");
        System.out.println("\t"+listSV +"\n");
    }




    public  void deteList(){
        listSV.remove(0);
        System.out.println("Delete ArrayList Student");
        System.out.println("\t"+listSV +"\n");
    }
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.testList();
        studentManager.deteList();
        studentManager.updateList();
    }
}
