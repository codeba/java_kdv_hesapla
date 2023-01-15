package patika;

import java.util.Scanner;

public class Kdv_Hesapla {
    public static void main(String[] args) {

        double tutar,kdv,kdvlitutar,carpan;
        Scanner scan=new Scanner(System.in);
        System.out.println("Tutar miktarını giriniz:");
        tutar=scan.nextDouble();
        carpan=(tutar<1000) ? 0.18:0.08;
        kdv=tutar*carpan;
        kdvlitutar=tutar*(carpan+1);
        System.out.println("kdv = " + kdv);
        System.out.println("kdvlitutar = " + kdvlitutar);
    }
}
