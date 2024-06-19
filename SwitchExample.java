import java.util.Scanner;
public class SwitchExample{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	String monthName = sc.next();
		for(month=1;month<=12;month++){
			switch(month)
			{
				case month:
				monthName="1-january";
				break;
			}
		}System.out.println(monthName);
	
	sc.close();
	}
}