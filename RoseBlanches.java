import java.util.Scanner;
public class RoseBlanches
{
	public static void main(String[] args) 
	{
		Scanner clavier = new Scanner(System.in);
		System.out.print("Combien avez-vous reçu d'argent (Frs)? ");
		int argent = clavier.nextInt();
		int livreFour = argent * 3 / 4;
		System.out.println("Livre et Fournitures: " + livreFour + " Frs");
		int reste = argent - livreFour;
		int equiTa = reste / 3;
		int cafe = equiTa / 2;
		int flash = equiTa / 4;
		int metro = equiTa / 3;
		int rBlanche = equiTa % 2 + equiTa % 4 + equiTa % 3 + reste % 3;
		System.out.println("Vous pouvez ensuite acheter: ");
		System.out.println(" " + cafe + " cafés");
		System.out.println(" " + flash + " numéros du Flash Informatique");
		System.out.println(" " + metro + " billets de métro");
		System.out.println("et il vous restera " + rBlanche + " Frs pour les roses blanches .");
		
	}

}
