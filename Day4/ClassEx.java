class Traffic_Media{
		int velocity ,
		    price;
		String brand;
		int _validDate(int dayPublic){
		return 100 + dayPublic;
 }
}
class ClassEx{
		public static void main(String[] args){
		Traffic_Media BMW = new Traffic_Media();
		BMW.velocity = 100;
		BMW.price = 50000;
		BMW.brand = "B-M-W";
		//BMW._validDate(10);
		System.out.println("name of this car : " + BMW.brand +
				   "\nprice of this car: " + BMW.price + "$" +
				   "\nvelocity of this car: " + BMW.velocity + "km/h" +
				   "\nvalid day of this car: year : " + BMW._validDate(2020));
 }
}