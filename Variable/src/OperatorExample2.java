
public class OperatorExample2 {
 public static void main(String[] args) {
	
	 int num1 = 15;
	 
	 //int result = 0; // 짝수:0, 홀수:1
	 // 1) if구문
	 // 2) ? : 구문
	 
	 if (num1 % 2 == 0) {
			System.out.println("num1은 짝수입니다.");
			} else {
				System.out.println("num1은 홀수입니다.");
			}
	 
	 boolean result = true;
     String result1 = (num1 % 2)==0 ? "true" : "false";
		 System.out.println(result1);
	 }
}





