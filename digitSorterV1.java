package digitShort;
import java.util.Scanner;

public class digitSorterV1 {

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);
		
		System.out.print("Enter random digits(1-9): ");
		int randomDigits = userIn.nextInt();
		
		int result = 0;
		int i;
		
		for(i = 0; i <= 9; i++) {  //0'dan başlayarak bütün rakamları kontrol ediypruz
			
			int memoryNum = randomDigits; 
			
			while(memoryNum > 0) {
				
				int digit = memoryNum % 10; // birler basamağını alıyoruz 
				
				if(digit == i) {
					
					result *= 10; // basamak arttırıyoruz 
					result += digit; // basamaktan sonra sayıyı ekliyoruz
					
				}
				
				memoryNum /= 10; // aldığımız basamağı memoryNum'dan siliyoruz ki bidaha almayalım
				
			}
			
		}
		
		System.out.println(result);
		
	}

}
