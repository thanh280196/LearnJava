class Guess2{
		public static void main(String[] args)
		throws java.io.IOException {
		char Result = 'k';
		System.out.println("I think about a random character. \n Can you guess * what is it ? * ");
		char Answer = (char) System.in.read();
		//
		if(Answer == Result)
				System.out.println("You \'re right !");
		else {
			System.out.print("Wrong!");
			if(Answer < Result)
					System.out.println("Too small !!!");
			else
					System.out.println("Too big !!!");
		}
 }
}