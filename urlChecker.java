package chapter02;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UrlChecker{
	public static void main(String[] args) {
		Pattern MyPattern = Pattern.compile("^((https?|ftp)://|(www|http)\\.)[a-z0-9]+(\\.[a-z0-9-]+[a-z]+)+([/?].*)?$");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the UrL to be checked: ");
		String name = input.nextLine();
		Matcher Mymatcher = MyPattern.matcher(name);
		Boolean Myboolean = Mymatcher.matches();

		if(Myboolean == true){
					System.out.println("Url is correct, you can go ahead with this");
				}else{
					System.out.println("Url is incorrect, Please check your Url");
		}		
	}
}