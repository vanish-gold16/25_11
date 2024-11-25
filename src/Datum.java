import java.util.Scanner;
public class Datum {
    private int den;
    private int mesic;
    private int rok;

    Scanner scanner = new Scanner(System.in);

    public Datum(){
        while(den < 1 || den > 30 || mesic < 1 || mesic > 12){
            System.out.print("Zadejte den: ");
            this.den = scanner.nextInt();
            System.out.print("Zadejte mesic: ");
            this.mesic = scanner.nextInt();
            System.out.print("Zadejte rok: ");
            this.rok = scanner.nextInt();
            if(den < 1 || den > 30 || mesic < 1 || mesic > 12){
                System.out.println("Chyba!");
            }
        }
    }

    @Override
    public String toString() {
        return getDen() + ". " + getMesic() + ". " + getRok();
    }

    public Datum(int den, int mesic, int rok) {
        this.den = den;
        this.mesic = mesic;
        this.rok = rok;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public int getMesic() {
        return mesic;
    }

    public void setMesic(int mesic) {
        this.mesic = mesic;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }
}
