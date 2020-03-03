import java.util.Scanner;
public class Swap 
{
	public static void main(String[] args) 
	{
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrez x : ");
		int x = clavier.nextInt();
		System.out.print("Entrez y : ");
		int y = clavier.nextInt();
		System.out.println("Avant permutation: ");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("Après permutation: ");
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
	}

}
