import java.util.Scanner;

public class Plaz extends Zvire{
    static Scanner sc = new Scanner(System.in);

    private String supiny;

    public Plaz() {
        super();
        System.out.println("Zadej, jestli má plaz šupiny: ano / ne");
        supiny = sc.nextLine();
        this.supiny = supiny.toLowerCase();
    }

    public void predstavSe() {
        super.predstavSe();
        System.out.println("Zvíře je plaz");
        System.out.println("");
    }


    public String getSupiny() {
        return supiny;
    }
}
