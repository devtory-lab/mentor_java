package interface_ex;

interface Providable{
	void leisureSports();
	void sightseeing();
	void foot();	
}

class KoreaTour implements Providable{

	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");		
	}

	@Override
	public void foot() {
		System.out.println("전주 비빔밥 투어");				
	}
}

class TourGuide{
	private Providable tour = new KoreaTour();

	public void leisureSports() {
		tour.leisureSports();
	}

	public void sightseeing() {
		tour.sightseeing();
	}

	public void foot() {
		tour.foot();
	}
	
	
	
}


public class Interface3 {

	public static void main(String[] args) {
		
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.foot();

	}

}
