import java.util.Scanner;

public class Steuerberechnung {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        while ( true ) {
            // E(ingabe)
            System.out.print("Bitte Bruttobetrag eingeben: ");
            double brutto = eingabe.nextDouble();
            if (brutto == 0.0) break;
            System.out.print("Bitte Steuersatz eingeben: ");
            double steuersatz = eingabe.nextDouble();

            // V(erarbeitung)
            double steuerbetrag = brutto * steuersatz / 100;
            double netto = brutto - steuerbetrag;

            // A(usgabe)
            System.out.println("Der Nettobetrag ist " + netto);
        }
        System.out.println("Vielen Dank und auf Wiedersehen");
    }
}
