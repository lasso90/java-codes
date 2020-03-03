import java.util.Scanner;
public class Age 
{
	public static void main(String[] args)
	{
		Scanner keyb = new Scanner(System.in);
		System.out.println("Donner votre age :");
		int age = keyb.nextInt();
		int annee = 2020-age;
		System.out.print("Votre annee de naissance est : " + annee);
	}

}
