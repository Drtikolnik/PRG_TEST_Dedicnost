import java.util.Scanner;

public class Zvire {
    static Scanner sc = new Scanner(System.in);

    private String jmeno;
    private int vek;
    private int hmotnost;

    public Zvire() {
        System.out.println("Zadej jméno:");
        this.jmeno = sc.nextLine();
        System.out.println("Zadej věk:");
        this.vek = sc.nextInt();
        sc.nextLine();
        System.out.println("Zadej hmotnost (kg): ");
        this.hmotnost =  sc.nextInt();
        sc.nextLine();
    }


    public void predstavSe(){
        System.out.println("Jméno zvířete je " +jmeno);
    }










    public int getHmotnost() {
        return hmotnost;
    }

    public int getVek() {
        return vek;
    }

    public String getJmeno() {
        return jmeno;
    }
}
