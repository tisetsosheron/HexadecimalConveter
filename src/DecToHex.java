import java.util.Scanner;

public class DecToHex {
	public static void toHex(int number) {
		char [] hexaValues = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String value="";
		
		while(number>0) {
			int remainder = number%16;
			value= hexaValues[remainder] +value;
			number=number/ 16;
			}
		System.out.println(value);
	}
	public static void toBinary(int number) {
		String value="";
		while(number>0) {
			int remainder = number%2;
			value= remainder+value;
			number=number/ 2;}
		System.out.println(value);
	}
	
	public static void toDec(int no){
		int power=0;
		int decimalValue =0;
		
		while(no>0){
			int remainder = no%10;
			decimalValue += (remainder*Math.pow(2, power));
			power++;
			no/=10;
		}
		System.out.println(decimalValue);
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a decimal you want convert to Hexadecimal: ");
		int number1 = input.nextInt();
		toHex(number1);
		
		System.out.println("enter a decimal you want convert to binary: ");
		int number2 = input.nextInt();
		toBinary(number2);
		
		System.out.println("enter binary number you want convert to decimal: ");
		int binaryNo = input.nextInt();		
		toDec(binaryNo);

	}	

}
