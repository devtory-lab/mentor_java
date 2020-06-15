package exception_ex;

public class Exception1 {

	public static void main(String[] args) {
		
		
		try {
			int[] a = {2, 0};
			int b = 4;
			int c = b / a[2];
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			System.out.println("산술오류발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류 발생");
		}
			System.out.println("예외처리공부중");

	}

}
