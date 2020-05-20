import java.util.Scanner;
import static java.lang.StrictMath.round;

public class Main {

    public static void main(String[] args) {

        Dron dron = new MultiratorDrone(new YuksekIrtifa()); // Yeni bir yüksek irtifa Multirator Drone..
        ((MultiratorDrone) dron).setPrice(dron.cost()); // Bu dronun maliyetini hesaplıyorum..

        System.out.println("KENDİ DRONUNUZU YAPTİGİNİZ '**My Dron Projects**' PROGRAMİNA HOS GELDİNİZ");
        System.out.println("--------Dron Programi baslatiliyor--------");

        dron = new FrekansModulu(dron);
        System.out.println("Frekans modulu entegre edindi. ");
        dron = new IcMekanizma(dron);
        System.out.println("Ic mekanizma olusturuldu. ");

        Scanner scan = new Scanner(System.in);
        System.out.println("Dronunuza ozel kaplama istiyor musunuz? " +
                "=> Y or N: ");
        String s = scan.next();
        if (s.equalsIgnoreCase("Y")) {
            System.out.println("Talebiniz alindi..");
            dron = new DisKaplama(dron);
            System.out.println("Dis kaplama olusturuldu.");
        }
        else if (s.equalsIgnoreCase("Y")) {
            System.out.println("Talebiniz dogrultusunda ozel kaplama yapilmayacaktir.");

        }
        else {
            System.out.println("Lutfen 'Y' veya 'N' tuşlarına basiniz! ");
        }

        System.out.println("Ek pervane özelligi ister misiniz? " +
                "=> Y or N: ");
        String c = scan.next();
        if (c.equalsIgnoreCase("Y")) {
            System.out.println("Talebiniz alindi..");
            dron = new Pervaneler(dron);
            System.out.println("Ek pervane fizikselligi saglandı.");
        }
        else if (c.equalsIgnoreCase("N")) {
            System.out.println("Talebiniz dogrultusunda ek pervane ozelligi kaldırılmıstır. ");
        }
        else {
            System.out.println("Lutfen 'Y' veya 'N' tuşlarına basiniz! ");
        }
        System.out.println("Dronunuz olusturuldu! İyi gunlerde kullanin..");
        System.out.println("Aciklama :" + dron.getDescription());
        System.out.println("Odemeniz gereken tutar : " + round(dron.cost()) + ",99 Turk Lirasi.");

    }
}
