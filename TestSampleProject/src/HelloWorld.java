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
		
		System.out.println("-------------------------------------------------------------");
        //First commit-Priyanka
       
     System.out.println("Enter your age:");
     int age=value.nextInt();
     if (age>0) {
         if(age>30)
         {
             System.out.println("Your getting OLD!!:(");
         }
         else if( age>20 || age<=30 )
         {
             System.out.println("You are still YOUNG!! :)");          
         }
       
         else if( age>10 || age<=20 )
         {
             System.out.println("You are getting still  a KID!! :)");          
         }
     }
     else
     {
         System.out.println("INVALID AGE");
     }

	}

}
