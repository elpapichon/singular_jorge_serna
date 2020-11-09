package LOGIN_Jorge_Serna;
import java.util.ArrayList;
import java.util.Scanner;

public class managment {
	static Scanner keyboard = new Scanner(System.in);
	static ArrayList accounts = new ArrayList();
	static String user,pass;
	static account current_user;
	public static void main(String[] args) {
		int action = 0;
		while(action==1||action==2||action==0)
		{
			System.out.println("Teclea 1 para registrate\nTeclea 2 para logearte");
			action = keyboard.nextInt();
			if(action==1)
			{
				do {
				System.out.println("Teclea el nombre de usuario a usar");
				user = keyboard.next().toUpperCase();
				System.out.println("Teclea la contraseña a usar");
				pass = keyboard.next();
				}while(verify_user(user)==true);
				
				account  acct = new account(user,pass);
				accounts.add(acct);
			}
			else
			if(action==2)
			{
				do {
				System.out.println("Teclea el nombre de usuario");
				user = keyboard.next().toUpperCase();
				System.out.println("Teclea la contraseña");
				pass = keyboard.next();
				}while(login(user,pass)==false);
				
			}
			System.out.println("Teclea 0 para volver al inicio\noteclea 5 para salir");
			action = keyboard.nextInt();
		}
		System.out.println("Gracias vuelva pronto!");
	}
	
	public static boolean verify_user(String username)
	{
		boolean found = false;
		for(int x=0;x<accounts.size();x++)
		{
			current_user= (account)accounts.get(x);
			if(current_user.username.equals(username))
			{
				System.out.println("Ya existe ese usuario");
				found = true;
			}
		}
		
		return found;
	}
	
	public static boolean login(String username,String password)
	{
		boolean found = false;
		for(int x=0;x<accounts.size();x++)
		{
			current_user= (account)accounts.get(x);
			if(current_user.login(username, password))
			{
				if(!current_user.first_login)
				{
					System.out.println("Bienvenido "+current_user.realname+"\nTu edad es: "+current_user.age);
				}
				else
				{
					System.out.println("Teclea tu nombre");
					String firstname = keyboard.next();
					System.out.println("Teclea tu apellido");
					String lastname = keyboard.next();
					System.out.println("Teclea tu edad");
					int age = keyboard.nextInt();
					current_user.update_info(firstname+" "+lastname,age);
					current_user.first_login=false;
				}
				found = true;
			}
		}
		
		return found;
	}
}
