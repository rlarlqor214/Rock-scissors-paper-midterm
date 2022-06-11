package kkb_20191442_mid1;

import java.util.Scanner;

public class kkb_20191442_mid1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total=0;
		int win=0;
		int lose=0;
		int draw=0;
		int com=1;
		int i=0;
		
		System.out.println("가위바위보를 몇 번 하시겠습니까?");
		int num = scan.nextInt();
		if(num<=0) {
			System.out.println("게임을 종료합니다.");
		}
		
		for(i=0; i<num; i++) {
			System.out.println("숫자로 입력(1.가위 2.바위 3.보))");
			com=(int)(Math.random()*3)+1;
			int player = scan.nextInt();
			if(player<=0 || player>3) {
				System.out.println("입력값이 잘못 되었습니다 다시 실행하시오");
				break;
			}
			if(player == 1) {
				if(com==1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("사람: 가위");
					System.out.println("무승부");
					total++;
					draw++;
				} else if(com==2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("사람: 가위");
					System.out.println("컴퓨터 승");
					total++;
					lose++;
				} else if(com==3) {
		        	System.out.println("컴퓨터: 보");
					System.out.println("사람: 가위");
					System.out.println("사람 승");
					total++;
					win++;
				}}
			if(player == 2) {
				if(com ==1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("사람: 바위");
					System.out.println("사람 승");
					total++;
					win++;
					
				} else if(com==2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("사람: 바위");
					System.out.println("무승부");
					total++;
					draw++;
				} else if(com==3) {
					System.out.println("컴퓨터: 보");
					System.out.println("사람: 바위");
					System.out.println("컴퓨터 승");
					total++;
					lose++;
				}}
			if(player == 3) {
				if(com==1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("사람: 보");
					System.out.println("컴퓨터 승");
					total++;
					lose++;
				} else if(com==2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("사람: 보");
					System.out.println("사람 승");
					total++;
					win++;
				} else if(com==3) {
					System.out.println("컴퓨터 보");
					System.out.println("사람: 보");
					System.out.println("무승부");
					total++;
					draw++;
				}}
			}
			System.out.println("총"+ total +"번 가위바위보 전적: "+ "승:"+win+"패"+lose+"무승부"+draw);
			

	}

}
