import java.util.Scanner;
public class Test01 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int count = 0;
		
		while(true) {
			int a = (int)(Math.random() * 19) + 2;
			int b = (int)(Math.random() * 9) + 1;
			
			int g = a * b;
			
			if(count == 3) {
				break;
			}else {
				System.out.println(a + " X " + b + " : ");
				int s = sc.nextInt();
				if(s != g) {
					System.out.println("틀렸습니다.");
					count++;
				} else {
					System.out.println("정답입니다 + 10점");
					score += 10;
					if(a >= 11) {
						System.out.println("어려운 문제 5점 추가 획득");
						score += 5;
					}
				}
			}
			
		}
		
		System.out.println("총 획득점수 : " + score);
	}
}
