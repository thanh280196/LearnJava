// Tính khối lượng thực của bạn trên mặt trăng,,,17% so với trái đất
class Ex8{
		public static void main(String args[]){
		double weight_In_Earth,
		       weight_In_Moon;
		weight_In_Earth = 60;
		weight_In_Moon =  17.0 / 100 * weight_In_Earth; // 17.0 là ép kiểu sang double
		System.out.println("Khoi luong cua nguoi " + weight_In_Earth + " kg tren mat trang la " + weight_In_Moon + "Kg");
	}
}