package LOGIN_Jorge_Serna;

public class account {

	public String username;
	private String password;
	public String realname;
	public int age;
	public boolean first_login=true;
	
	public account(String username,String password)
	{
		this.username = username;
		this.password = password;
	}
	
	public String get_username()
	{
		return this.username;
	}
	
	public boolean login(String username,String password)
	{
		if(this.username.equals(username)&&this.password.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void update_info(String realname,int age)
	{
		this.realname = realname;
		this.age = age;
	}
}
