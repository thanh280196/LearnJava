class FindPrimeNumber{
		public static void main(String args[]){
		int a;
		for(a = 2;a <= 100;a++){
			if(_isPrime(a))
				System.out.print(a + " ");
		}
	}
		public static boolean _isPrime(int a){
		if(a < 2)
			return false;
		for(int i = 2;i <= Math.sqrt(a);i++){
		if(a % i == 0)
			return false;
		}
		return true;
	}
}