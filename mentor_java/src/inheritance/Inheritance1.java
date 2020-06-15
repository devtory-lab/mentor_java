package inheritance;

class Person {
	void breath() {
		System.out.println("숨쉬기");
	}
	
	void eat() {
		System.out.println("밥먹기");
	}
	
	void say() {
		System.out.println("말하기");
	}	
}

class Student extends Person {
	void learn() {
		System.out.println("배우기");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.breath();
		s1.learn();
		
		Teacher t1 = new Teacher();
		t1.eat();
		t1.teach();
				
		
	}

}
