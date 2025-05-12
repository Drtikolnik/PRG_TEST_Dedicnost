import java.util.ArrayList;
import java.util.Scanner;

public class ZooApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Zvire> zvire = new ArrayList<>();


        System.out.println("Kolik zvířat chceš zadat?");
        int kolikrat =  sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < kolikrat; i++) {

            System.out.println("Jaké zvíře chceš zadat?");
            System.out.println("1 - Savec?");
            System.out.println("2 - Plaz");
            int jake = sc.nextInt();
            sc.nextLine();

            switch (jake) {
                case 1:
                    zvire.add(new Savec());
                    break;

                case 2:
                    zvire.add(new Plaz());
                    break;

            }



        }

        for(Zvire zv : zvire) {
            zv.predstavSe();
        }

        //PLAZ BEZ ŠUPIN------------------------------------------------
        System.out.println("Jména všech plazů bez šupin:");
        Plaz bezSupin = null;
        for (Zvire zv : zvire) {
            if (zv instanceof Plaz) {
                if(((Plaz) zv).getSupiny().equals("ne")) {
                    System.out.println(zv.getJmeno());
                }
            }

        }
        System.out.println("");


        //HMOTNOST NEJSTARŠÍHO SAVCE------------------------------------
        System.out.println("Hmotnost nejstaršího savce:");
        Savec nejstarsi = null;
        for (Zvire zv : zvire) {
            if (zv instanceof Savec) {
                if(nejstarsi == null || ((Savec)zv).getVek() > nejstarsi.getVek()) {
                    nejstarsi = (Savec) zv;
                }
            }
        }
        System.out.println(nejstarsi.getHmotnost());















    }
}