// Chuyển 1 gal -100 gal sang lit,cứ 10 dòng cách ra 1 dòng 
class Ex7{
				public static void main(String args[]){
				int gal = 0,
				count = 0;
				double lit;
				for(int i = 0;i<100;i++){
				gal++;
				lit = 3.7854 * gal;
				count++;
				System.out.println( gal + "gal = " + lit + " lit");
				if(count == 10){
				System.out.println();
				count = 0;
			}
		}
	}
}
