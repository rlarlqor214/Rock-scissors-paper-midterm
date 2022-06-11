package kkb_20191442_mid2;

import java.util.Scanner;

public class kkb_20191442_mid2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total=0;
		int lose =0;
		int win=0;
		int com=1;
		int draw=0;
		int i;
		
		System.out.println("가위바위보를 몇 번 하시겠습니까?");
		int num = scan.nextInt();
		
		if(num<=0) {
			System.out.println("게임을 종료합니다.");
		}
		
		for(i=0; i<num; i++) {
			System.out.println("숫자로 입력(1.가위 2.바위 3.보))");
			com=(int)(Math.random()*3)+1;
			int player = scan.nextInt();
		if(player<1 || player>3) {
			System.out.println("숫자를 잘못 입력하셨습니다 다시 실행하시오");
			break;
		}
				
		switch(player) {
		case 1:
			if(com==1){
						System.out.println("내가 낸 것은 가위 입니다.");
						System.out.println("컴퓨터가 낸 것은 가위 입니다.");
						System.out.println("결과는 무승부 입니다");
						total++;
						draw++;
						break;
				}
					if(com==2) {
						System.out.println("내가 낸 것은 가위 입니다.");
						System.out.println("컴퓨터가 낸 것은 바위 입니다.");
						System.out.println("결과는 컴퓨터의 승리 입니다.");
						total++;
						lose++;
						break;
					}
					if(com==3) {
						System.out.println("내가 낸 것은 가위 입니다.");
						System.out.println("컴퓨터가 낸 것은 보 입니다.");
						System.out.println("결과는 당신의 승리 입니다. ");
						total++;
						win++;
						break;
					}
			case 2:
				if(com==1){
					System.out.println("내가 낸 것은 바위 입니다.");
					System.out.println("컴퓨터가 낸 것은 가위 입니다.");
					System.out.println("결과는 당신의 승리 입니다.");
					total++;
					win++;
					break;
				}
				if(com==2) {
					System.out.println("내가 낸 것은 바위 입니다.");
					System.out.println("컴퓨터가 낸 것은 바위 입니다.");
					System.out.println("결과는 무승부 입니다.");
					total++;
					draw++;
					break;
				}
				if(com==3) {
					System.out.println("내가 낸 것은 바위 입니다.");
					System.out.println("컴퓨터가 낸 것은 보자기 입니다.");
					System.out.println("결과는 컴퓨터의 승리 입니다.");
					total++;
					lose++;
					break;
				}
			case 3:
				if(com==1) {
					System.out.println("내가 낸 것은 보자기 입니다.");
					System.out.println("컴퓨터가 낸 것은 가위 입니다.");
					System.out.println("결과는 컴퓨터의 승리 입니다.");
					total++;
					lose++;
					break;
				}
				if(com==2) {
					System.out.println("내가 낸 것은 보자기 입니다.");
					System.out.println("컴퓨터가 낸 것은 바위 입니다.");
					System.out.println("결과는 당신의 승리 입니다.");
					total++;
					win++;
					break;
				}
				if(com==3) {
					System.out.println("내가 낸 것은 보자기 입니다.");
					System.out.println("컴퓨터가 낸 것은 보자기 입니다.");
					System.out.println("결과는 무승부 입니다.");
					total++;
					draw++;
					break;
				}}
		System.out.println("총"+total+"번"+"게임중 당신의 전적은"+" "+"승:"+win+"숭"+" "+"패배:"+lose+" "+"무승부:"+draw);

}
	}
}
