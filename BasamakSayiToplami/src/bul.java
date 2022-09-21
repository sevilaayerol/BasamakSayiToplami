import java.util.Scanner;

public class bul {

	public static void main(String[] args) {
		int sayi, total=0, numberCounter = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		sayi = input.nextInt();
		

        while (sayi != 0) {
            numberCounter = sayi % 10;
            total += numberCounter;
            sayi /= 10;
            			
        }
		System.out.println("Basamak Toplamý: "+ total);

	}

}
