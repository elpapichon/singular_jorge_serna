package PIN_Jorge_Serna;
import java.util.Scanner;
import java.util.regex.*;
import java.util.Random;
import java.util.Formatter;

public class pin {
	static Scanner keyboard = new Scanner(System.in);
	static String nip;
	static String regexp = "\\d*";
	static Random r = new Random();
	
	public static void main(String[] args) {
		System.out.println("Teclea el NIP");
		nip = keyboard.nextLine().trim();
		if(Pattern.matches(regexp, String.valueOf(nip)) && nip.length()==4)
		{
			System.out.println("Tu NIP es: "+nip);
			System.out.println("Intento de adivinar NIP: "+get_nip());
		}
		else
		{
			System.out.println("NIP no valido!");
		}
	}
	
	public static Formatter get_nip()
	{
		Formatter rand_nip = new Formatter();
		rand_nip.format("%04d",r.nextInt(10000));
		return rand_nip;
	}

}