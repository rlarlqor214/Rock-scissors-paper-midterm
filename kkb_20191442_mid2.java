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
		
		System.out.println("������������ �� �� �Ͻðڽ��ϱ�?");
		int num = scan.nextInt();
		
		if(num<=0) {
			System.out.println("������ �����մϴ�.");
		}
		
		for(i=0; i<num; i++) {
			System.out.println("���ڷ� �Է�(1.���� 2.���� 3.��))");
			com=(int)(Math.random()*3)+1;
			int player = scan.nextInt();
		if(player<1 || player>3) {
			System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ� �ٽ� �����Ͻÿ�");
			break;
		}
				
		switch(player) {
		case 1:
			if(com==1){
						System.out.println("���� �� ���� ���� �Դϴ�.");
						System.out.println("��ǻ�Ͱ� �� ���� ���� �Դϴ�.");
						System.out.println("����� ���º� �Դϴ�");
						total++;
						draw++;
						break;
				}
					if(com==2) {
						System.out.println("���� �� ���� ���� �Դϴ�.");
						System.out.println("��ǻ�Ͱ� �� ���� ���� �Դϴ�.");
						System.out.println("����� ��ǻ���� �¸� �Դϴ�.");
						total++;
						lose++;
						break;
					}
					if(com==3) {
						System.out.println("���� �� ���� ���� �Դϴ�.");
						System.out.println("��ǻ�Ͱ� �� ���� �� �Դϴ�.");
						System.out.println("����� ����� �¸� �Դϴ�. ");
						total++;
						win++;
						break;
					}
			case 2:
				if(com==1){
					System.out.println("���� �� ���� ���� �Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� ���� �Դϴ�.");
					System.out.println("����� ����� �¸� �Դϴ�.");
					total++;
					win++;
					break;
				}
				if(com==2) {
					System.out.println("���� �� ���� ���� �Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� ���� �Դϴ�.");
					System.out.println("����� ���º� �Դϴ�.");
					total++;
					draw++;
					break;
				}
				if(com==3) {
					System.out.println("���� �� ���� ���� �Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� ���ڱ� �Դϴ�.");
					System.out.println("����� ��ǻ���� �¸� �Դϴ�.");
					total++;
					lose++;
					break;
				}
			case 3:
				if(com==1) {
					System.out.println("���� �� ���� ���ڱ� �Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� ���� �Դϴ�.");
					System.out.println("����� ��ǻ���� �¸� �Դϴ�.");
					total++;
					lose++;
					break;
				}
				if(com==2) {
					System.out.println("���� �� ���� ���ڱ� �Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� ���� �Դϴ�.");
					System.out.println("����� ����� �¸� �Դϴ�.");
					total++;
					win++;
					break;
				}
				if(com==3) {
					System.out.println("���� �� ���� ���ڱ� �Դϴ�.");
					System.out.println("��ǻ�Ͱ� �� ���� ���ڱ� �Դϴ�.");
					System.out.println("����� ���º� �Դϴ�.");
					total++;
					draw++;
					break;
				}}
		System.out.println("��"+total+"��"+"������ ����� ������"+" "+"��:"+win+"��"+" "+"�й�:"+lose+" "+"���º�:"+draw);

}
	}
}
