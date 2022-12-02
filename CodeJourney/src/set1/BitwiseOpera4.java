package set1;
/*Write a program to define the functionality of a Bitwise operators.*/
//&  1 1=1
//| 1 1, 1 0, 0 1 =1
//^ 1 0, 0 1 =1
public class BitwiseOpera4 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 7, result;		
		
		String bin1 = Integer.toBinaryString(num1);
	    System.out.println("Binary of value of Decimal "+ num1 +" is "+bin1);
	    
		
		String bin2 = Integer.toBinaryString(num2);
	    System.out.println("Binary of value of Decimal "+ num2 +" is "+bin2);
		
		result = num1 | num2;
	    System.out.println("Bitwise OR : "+ result);
	    
	    result = num1 & num2;
	    System.out.println("Bitwise AND : "+ result);
	    
	    result = num1 ^ num2;
	    System.out.println("Bitwise XOR : "+ result);
	    
	    result =~num1;
	    System.out.println("bitwise complement : "+ result);
	    String binComplement = Integer.toBinaryString(result);
	    System.out.println("Binary of value of Decimal "+ result +" is "+binComplement);
	    
	    result = num1 << 2;
	    System.out.println("2 bit Left shift operation " + result);
	    
	    result = num1 >> 2;
	    System.out.println("2 bit Right shift operation " + result);	 

	}

}
