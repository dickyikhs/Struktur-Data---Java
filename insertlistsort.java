package strukturdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StrukturData {
    public static void main(String[] args) {
        List daftarAngka = new ArrayList();
        daftarAngka.add("1");
        daftarAngka.add("4");
        daftarAngka.add("3");
        daftarAngka.add("5");
        daftarAngka.add("2");
        
        System.out.println("Sebelum Diurutkan");
        System.out.println(daftarAngka);
        
        Collections.sort(daftarAngka);
        System.out.println("Setelah Diurutkan");
        System.out.println(daftarAngka);
    }
    
}
