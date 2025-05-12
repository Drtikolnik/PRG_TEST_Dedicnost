import java.util.Scanner;

public class Savec extends Zvire{
    static Scanner sc = new Scanner(System.in);

    private String typSrsti;

    public Savec() {
        super();
        System.out.println("Zadej typ srsti:");
        this.typSrsti =  sc.nextLine();
    }

    public void predstavSe() {
        super.predstavSe();
        System.out.println("Zvíře je savec");
        System.out.println("");
    }


    public String getTypSrsti() {
        return typSrsti;
    }
}
