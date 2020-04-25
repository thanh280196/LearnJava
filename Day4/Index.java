//import java.util.Scanner;
class Index{
			public static void main(String[] args)
			throws java.io.IOException {
			int Character;
			//Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Input a AlphaBeta character ");
			Character = System.in.read();
			if((Character > 'z') || (Character < 'A') )
				System.out.println("this is not a AlphaBeta character");
			else{
				char fixedCharacter = (char) Character;
				System.out.println("Ur input is " + fixedCharacter);
				if((fixedCharacter >= 'A') && (fixedCharacter <= 'Z'))
					fixedCharacter += 32;
				else if((fixedCharacter >='a') && (fixedCharacter <= 'z')) {
					fixedCharacter -= 32; 
					System.out.println(" and it have changed by " + fixedCharacter);
    }
				else
					System.out.println("Your input is not avainable");
   }	
  }
		while( Character != '.') ;				
 }
}