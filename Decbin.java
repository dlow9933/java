class Decbin{
	public static void main (String a[]){
	
	int n;
	String bin; String hex;
	
	System.out.println(" DEC BIN HEX ");
	
	
	for (n = 0; n <= 255; n ++){
			bin = Integer.toBinaryString(n);
			hex = Integer.toBinaryString(n);
			System.out.print(n);
			System.out.print(bin);
			System.out.print(" ");
			System.out.print(hex);
			System.out.println( );
		}

	}
}
		
