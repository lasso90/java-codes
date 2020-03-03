import java.util.Scanner;
public class Fondue 
{
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		System.out.print("Entrez le nombre de personne(s) conviées à la fondue : ");
		int nbConvives = keyb.nextInt();
		final int BASE = 4;
		double fromage = 800.0;
		double eau = 2.0;
		double ail = 2.0;
		double pain = 400.0;
		double nvleQuantite1 = fromage * nbConvives / BASE;
		double nvleQuantite2 = eau * nbConvives / BASE;
		double nvleQuantite3 = ail * nbConvives / BASE;
		double nvleQuantite4 = pain * nbConvives / BASE;
		System.out.println("Pour faire une fondue fribourgeoise pour " + nbConvives + "personnes, il vous faut : ");
		System.out.println("- " + nvleQuantite1 + " gr de Vacherin fribourgeois. ");
		System.out.println("- " + nvleQuantite2 + " dl d'eau ");
		System.out.println("- " + nvleQuantite3 + " gousse(s) d'ail ");
		System.out.println("- " + nvleQuantite4 + " gr de pain ");
		System.out.print("- du poivre à volonté ");
	}

}
