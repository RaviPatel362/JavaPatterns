//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F 
//A B C D E F G 
//A B C D E F G H 
public class Pattern5 {
	
	public static void main(String args []) {
		
		
		for(int i=1;i<=8;i++) 
		{
				for(int j=1;j<=i;j++) 
					{	
						System.out.print((char)('A' + (j-1)) + " " );
					}
				System.out.println();
		}
		
	}

}
