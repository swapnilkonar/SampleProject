import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		String name= null;
		String[] newname;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter you name");
		name=value.nextLine();
		newname=name.split(" ");
		for( int i = newname.length-1 ; i>=0; i--)
		{
			System.out.print(newname[i]+" ");
		}
		
		

	}

}
