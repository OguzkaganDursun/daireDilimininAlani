import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int r, merkezaci;
        double alan, pi = 3.14;

        //Kullanicidan yaricap ve merkez aci olcusu alindi.
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.print("Yaricapi giriniz : ");
        r = scan.nextInt();

        System.out.print("Merkez Acinin Olcusunu Giriniz : ");
        merkezaci = scan.nextInt();

        //Daire diliminin alani bulundu ve kullaniciya iletildi.
        alan = (pi * (r * r) * merkezaci)/360;
        System.out.println("-----------------------------");
        System.out.println("Daire Diliminin Alani : " + alan);
    }
}
