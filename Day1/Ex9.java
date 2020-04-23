//Doi inch sang met ,cach 12 dong cach 1 dong,su dung for,if
class Ex9{
				public static void main(String args[]){
				int inchUnit,count;
				double meterUnit;
				count = 0;
				inchUnit = 0;
				for(int i = 0;i < 120;i++){
				inchUnit ++;
				meterUnit = inchUnit / 39.37;
				System.out.println( inchUnit + " inch = " + meterUnit + " met");
				count++;
				if(count == 12){
				count = 0;
				System.out.println();
			}

		}
	}
}