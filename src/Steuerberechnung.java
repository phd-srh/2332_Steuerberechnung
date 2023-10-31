import java.util.Scanner;

public class Steuerberechnung {
    public static void main(String[] args) {
        // E(ingabe)
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte Bruttobetrag eingeben: ");
        double brutto = eingabe.nextDouble();
        System.out.print("Bitte Steuersatz eingeben: ");
        double steuersatz = eingabe.nextDouble();

        // V(erarbeitung)
        double steuerbetrag = brutto * steuersatz / 100;
        double netto = brutto - steuerbetrag;

        // A(usgabe)
        System.out.println("Der Nettobetrag ist " + netto);
    }
}
