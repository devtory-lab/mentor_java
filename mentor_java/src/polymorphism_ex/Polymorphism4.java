package polymorphism_ex;

class Animal2{
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion2 extends Animal2{	
	public String toString() {
		return "사자";
	}
}

class Rabbit extends Animal2{
	public String toString() {
		return "토끼";
	}
}

class Monkey extends Animal2{
	public String toString() {
		return "원숭이";
	}
}

class ZooKeeper2{
	void feed(Animal2 animal) {
		System.out.println(animal + "에게 먹이주기");
	}
}

public class Polymorphism4 {

	public static void main(String[] args) {
		
		Animal2 lion1 = new Lion2();
		ZooKeeper2 james = new ZooKeeper2();
		james.feed(lion1);
		
		Animal2 rabbit = new Rabbit();
		james.feed(rabbit);
		
		Animal2 monkey = new Monkey();
		james.feed(monkey);
		

	}

}
