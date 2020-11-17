
public class VariableExample {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		String resultStr = "결과값은 ";
		
		int result = num2-num1;
		int result1 = num1-num2;
		
		if(num1>num2) {
		System.out.println(resultStr + result + " 입니다");
		} else  {
	    System.out.println(resultStr+ result1 + " 입니다.");
		}
	}
}
