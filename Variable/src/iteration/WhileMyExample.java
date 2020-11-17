package iteration;

public class WhileMyExample {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (true) {
			sum += i;
			if(i == 10){
				break;
			}
			i++;
		}
		System.out.println("1 부터 10까지 합 : " + sum);
	}
}
