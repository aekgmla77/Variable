package iteration;

public class MorningCode {
	public static void main(String[] args) {
//		int sum7 = 0;
//		int sum8 = 0;
//		for (int i = 1; i < 10; i++) {
//			if (sum7 % 7 == 0) {
//				sum7 += 7;
//				System.out.println(sum7);
//				{
//					if (sum8 % 8 == 0) {
//						sum8 += 8;
//						System.out.println(sum8);
//					}
//				}
//			}
//		}	
//	}
		int i = 0;
		int sum7 =0; 
		int sum8 =0;
		while(true) {
			sum7 += i;
			if(sum7 % 7 ==0) {
				break;
			}
			i++;
		}
		System.out.println("7의 배수는: " + );
	}
}
