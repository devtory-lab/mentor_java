package polymorphism_ex;

class Animal{
	void breath(){
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal{

	public String toString() {
		return "사자";
	}
	
}

class ZooKeeper{
	void feed(Lion lion) {
		System.out.println(lion + "에게 고기 주기");
	}
}

public class Polymorphism3 {

	public static void main(String[] args) {
		Lion lion1 = new Lion();
		ZooKeeper james = new ZooKeeper();		
		james.feed(lion1);

	}

}
