import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ýdman programýna hoþgeldiniz..");
		String idmanlar="Geçerli hareketler:\n"
				+"Burpee\n"
				+"Pushup\n"
				+"Situp\n"
				+"Squat\n";
		System.out.println(idmanlar);
		System.out.println("Bir idman oluþturun:");
		System.out.print("Burpee sayýsý:");
		int burpee=scanner.nextInt();
		System.out.print("Pushup sayýsý:");
		int pushup=scanner.nextInt();
		System.out.print("Situp sayýsý:");
		int situp=scanner.nextInt();
		System.out.print("Squat sayýsý:");
		int squat=scanner.nextInt();
		scanner.nextLine();
		Idman idman=new Idman(burpee,pushup,situp,squat);
		System.out.println("Ýdmanýnýz baþlýyor..");
		while(idman.idman()==false) {
			System.out.print("Hareket türünü girin(Burpee,Pushup,Situp,Squat):");
			String tur=scanner.nextLine();
			System.out.print("Hareket sayýsýný girin:");
			int sayi=scanner.nextInt();
			scanner.nextLine();
			idman.hareketYap(tur, sayi);
		}
	}

}
