import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�dman program�na ho�geldiniz..");
		String idmanlar="Ge�erli hareketler:\n"
				+"Burpee\n"
				+"Pushup\n"
				+"Situp\n"
				+"Squat\n";
		System.out.println(idmanlar);
		System.out.println("Bir idman olu�turun:");
		System.out.print("Burpee say�s�:");
		int burpee=scanner.nextInt();
		System.out.print("Pushup say�s�:");
		int pushup=scanner.nextInt();
		System.out.print("Situp say�s�:");
		int situp=scanner.nextInt();
		System.out.print("Squat say�s�:");
		int squat=scanner.nextInt();
		scanner.nextLine();
		Idman idman=new Idman(burpee,pushup,situp,squat);
		System.out.println("�dman�n�z ba�l�yor..");
		while(idman.idman()==false) {
			System.out.print("Hareket t�r�n� girin(Burpee,Pushup,Situp,Squat):");
			String tur=scanner.nextLine();
			System.out.print("Hareket say�s�n� girin:");
			int sayi=scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);
		}
	}

}
