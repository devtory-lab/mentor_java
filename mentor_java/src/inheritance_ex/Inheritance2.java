package inheritance;

class Student2 {
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요.");		
	}
}

class Leader extends Student2{
	void lead() {}
	void say() {
		System.out.println("선생님께 인사!");	//오버라이딩
		super.say();    						//오버라이딩한 메서드 사용
	}
	
}

public class Inheritance2 {

	public static void main(String[] args) {
		
		Leader l1 = new Leader();
		//l1.eat();
		l1.say();

	}

}
