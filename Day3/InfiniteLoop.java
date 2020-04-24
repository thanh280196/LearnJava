class InfiniteLoop{
			public static void main(String[] args)
			throws java.io.IOException {
			System.out.println("Press 'r' to run ifinite Loop");
			char x = (char) System.in.read();
			for(int i = 0;x == 'r';i++){
			System.out.println("Never Stop");
  }
			if(x != 'r')
				System.out.println("You have never assign \'r\' character");
 }
}