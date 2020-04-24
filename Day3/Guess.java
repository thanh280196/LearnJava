class Guess{
			public static void main(String[] args )
			throws java.io.IOException {
			char Result= 'k';
			System.out.println("I think about a character \n Can u guess \" what \'s it ! \" ");
			char Answer = (char) System.in.read();
			if(Answer == Result) 
				System.out.println("You \'re right !");
			else
				System.out.println("You \'re wrong !");
 }
}