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
		
		System.out.println("������������ �� �� �Ͻðڽ��ϱ�?");
		int num = scan.nextInt();
		if(num<=0) {
			System.out.println("������ �����մϴ�.");
		}
		
		for(i=0; i<num; i++) {
			System.out.println("���ڷ� �Է�(1.���� 2.���� 3.��))");
			com=(int)(Math.random()*3)+1;
			int player = scan.nextInt();
			if(player<=0 || player>3) {
				System.out.println("�Է°��� �߸� �Ǿ����ϴ� �ٽ� �����Ͻÿ�");
				break;
			}
			if(player == 1) {
				if(com==1) {
					System.out.println("��ǻ��: ����");
					System.out.println("���: ����");
					System.out.println("���º�");
					total++;
					draw++;
				} else if(com==2) {
					System.out.println("��ǻ��: ����");
					System.out.println("���: ����");
					System.out.println("��ǻ�� ��");
					total++;
					lose++;
				} else if(com==3) {
		        	System.out.println("��ǻ��: ��");
					System.out.println("���: ����");
					System.out.println("��� ��");
					total++;
					win++;
				}}
			if(player == 2) {
				if(com ==1) {
					System.out.println("��ǻ��: ����");
					System.out.println("���: ����");
					System.out.println("��� ��");
					total++;
					win++;
					
				} else if(com==2) {
					System.out.println("��ǻ��: ����");
					System.out.println("���: ����");
					System.out.println("���º�");
					total++;
					draw++;
				} else if(com==3) {
					System.out.println("��ǻ��: ��");
					System.out.println("���: ����");
					System.out.println("��ǻ�� ��");
					total++;
					lose++;
				}}
			if(player == 3) {
				if(com==1) {
					System.out.println("��ǻ��: ����");
					System.out.println("���: ��");
					System.out.println("��ǻ�� ��");
					total++;
					lose++;
				} else if(com==2) {
					System.out.println("��ǻ��: ����");
					System.out.println("���: ��");
					System.out.println("��� ��");
					total++;
					win++;
				} else if(com==3) {
					System.out.println("��ǻ�� ��");
					System.out.println("���: ��");
					System.out.println("���º�");
					total++;
					draw++;
				}}
			}
			System.out.println("��"+ total +"�� ���������� ����: "+ "��:"+win+"��"+lose+"���º�"+draw);
			

	}

}
