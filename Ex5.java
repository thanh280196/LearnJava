/* Lệnh if
	cho 3 số nguyên a,b,c
	- so sánh a và b
	- c = b - a check c âm hay dương
	- c = a - b -------------------- ?
*/
class Ex5{
	public static void main(String args[]){
	int a = 5,
	    b = 6;
	if(a < b) 
		System.out.println("a nho hon b");
	if(a > b)
		System.out.println("a lon hon b");
	System.out.println("c = a - b = "+ (a - b));
	if((a - b) > 0) 
	System.out.println("c la so khong am");
	if((a - b) < 0)
	System.out.println("c la so am");
	System.out.println("c = b - a = " + (b - a));
	if((b - a) > 0) 
	System.out.println("c la so khong am");
	if((b - a) < 0)
	System.out.println("c la so am");
  }
}