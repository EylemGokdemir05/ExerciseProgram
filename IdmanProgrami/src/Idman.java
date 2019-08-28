
public class Idman {
	private int burpee_sayisi;
	private int pushup_sayisi;
	private int situp_sayisi;
	private int squat_sayisi;
	public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
		this.burpee_sayisi = burpee_sayisi;
		this.pushup_sayisi = pushup_sayisi;
		this.situp_sayisi = situp_sayisi;
		this.squat_sayisi = squat_sayisi;
	}
	public int getBurpee_sayisi() {
		return burpee_sayisi;
	}
	public void setBurpee_sayisi(int burpee_sayisi) {
		this.burpee_sayisi = burpee_sayisi;
	}
	public int getPushup_sayisi() {
		return pushup_sayisi;
	}
	public void setPushup_sayisi(int pushup_sayisi) {
		this.pushup_sayisi = pushup_sayisi;
	}
	public int getSitup_sayisi() {
		return situp_sayisi;
	}
	public void setSitup_sayisi(int situp_sayisi) {
		this.situp_sayisi = situp_sayisi;
	}
	public int getSquat_sayisi() {
		return squat_sayisi;
	}
	public void setSquat_sayisi(int squat_sayisi) {
		this.squat_sayisi = squat_sayisi;
	}
	public void hareketYap(String hareket_turu,int sayi) {
		if(hareket_turu.equals("burpee")) {
			burpeeYap(sayi);
		}
		else if(hareket_turu.equals("pushup")) {
			pushupYap(sayi);
		}
		else if(hareket_turu.equals("situp")) {
			situpYap(sayi);
		}
		else if(hareket_turu.equals("squat")) {
			squatYap(sayi);
		}
		else {
			System.out.println("Geçersiz hareket!");
		}
	}
	public void burpeeYap(int sayi) {
		if(burpee_sayisi==0) {
			System.out.println("Yapacak burpee kalmadý.");
		}
		if(burpee_sayisi-sayi<0) {
			System.out.println("Hedeflediðiniz burpee sayýsýný geçtiniz. Tebrikler!");
			burpee_sayisi=0;
			System.out.println("Kalan burpee sayýsý:"+burpee_sayisi);
		}
		else {
			burpee_sayisi-=sayi;
			System.out.println("Kalan burpee sayýsý:"+burpee_sayisi);
		}
	}
	public void pushupYap(int sayi) {
		if(pushup_sayisi==0) {
			System.out.println("Yapacak pushup kalmadý.");
		}
		if(pushup_sayisi-sayi<0) {
			System.out.println("Hedeflediðiniz pushup sayýsýný geçtiniz. Tebrikler!");
			pushup_sayisi=0;
			System.out.println("Kalan burpee sayýsý:"+pushup_sayisi);
		}
		else {
			pushup_sayisi-=sayi;
			System.out.println("Kalan pushup sayýsý:"+pushup_sayisi);
		}
	}
	public void situpYap(int sayi) {
		if(situp_sayisi==0) {
			System.out.println("Yapacak situp kalmadý.");
		}
		if(situp_sayisi-sayi<0) {
			System.out.println("Hedeflediðiniz situp sayýsýný geçtiniz. Tebrikler!");
			situp_sayisi=0;
			System.out.println("Kalan situp sayýsý:"+situp_sayisi);
		}
		else {
			situp_sayisi-=sayi;
			System.out.println("Kalan situp sayýsý:"+situp_sayisi);
		}
	}
	public void squatYap(int sayi) {
		if(squat_sayisi==0) {
			System.out.println("Yapacak squat kalmadý.");
		}
		if(squat_sayisi-sayi<0) {
			System.out.println("Hedeflediðiniz squat sayýsýný geçtiniz. Tebrikler!");
			squat_sayisi=0;
			System.out.println("Kalan squat sayýsý:"+squat_sayisi);
		}
		else {
			squat_sayisi-=sayi;
			System.out.println("Kalan squat sayýsý:"+squat_sayisi);
		}
	}
	public boolean idman() {
		return (burpee_sayisi==0) && (pushup_sayisi==0) && (situp_sayisi==0) && (squat_sayisi==0);
	}

}
