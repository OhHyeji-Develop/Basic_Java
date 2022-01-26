package c_statement;

import java.util.Scanner;

public class ConditionStatement {
		
	public static void main(String[] args) {
		
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 *
		 * if문
		 * - if(조건식(조건식은 비교하는 문장이 온다.)){} : 조건식의 결과가 true이면 {}(블럭)안의 문장을 수행한다. 조건식이 false이면 그냥 넘어감.
		 * 		if문은 여러개의 조건중에 맨 첫번째 true 하나만 실행된다
		 * - else if(조건식){} : 다수의 조건이 필요할때 if 위에 추가한다.
		 * - else{} : 조건식 이외의 경우를 위해 추가한다., 조건식이 없음
		 * 
		 * 졍렬 : ctrl + shift + f 
		 */
		
		int a = 2;
		
		if(a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 1) {
			 System.out.println("a == 1");
		}else if(a == 2) {
			System.out.println("a == 2");
		}else if(a == 3) {
			System.out.println("a == 3");
		}else {
			System.out.println("else");
			
		}
		
		
		//정수가 60점 이상이면 합격 그렇지 않으면 불합격
		int avg = 88;
		
		if(avg >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//점수에 등급을 부여
		avg = 90;
		String grade = null; // null = 값이 없다, 참조형 타입의 기본값
		// 기본값 : 자동으로 저장되는 값
		//boolean 기본값 : false
		
		if(90 <= avg && avg <= 100) {
			grade = "A";
		}else if(80 <= avg) { //90점이상은 첫번째 if문에서 걸리기때문에 조건식을 추가 안함
			grade = "B";
		}else if(70 <= avg) {
			grade = "C";
		}else if(60 <= avg) {
			grade = "D";
		}else { 
			grade = "F";
		
		}
		System.out.println(avg + "점 : " + grade);
		
		avg = 20;
		grade = null;
		
		if(90 <= avg && avg <= 100) {
			grade = "A";
			if(97 <= avg) {
				grade += "+";
			}else if(avg <= 93) {
				grade += "-";
			}
		}else if(80 <= avg) {
			grade = "B";
			if(87 <= avg) {
				grade += "+";
			}else if(avg <= 83) {
				grade += "-";
			}
		}else if(70 <= avg) {
			grade = "C";
			if(77 <= avg) {
				grade += "+";
			}else if(avg <= 73) {
				grade += "-";
			}
		}else if(60 <= avg) {
			grade = "D";
			if(67 <= avg) {
				grade += "+";
			}else if(avg <= 63) {
				grade += "-";
			}
		
		}else {
			grade = "F";
		}
		System.out.println(avg + "점 : " + grade);
		
		/*
		 * switch문 (if문과 switch문으로 동일한 조건을 만들었을때 switch가 더 빠르지만 보통 if문을 더 많이 사용)
		 * - switch(int/String){ case 1(= 비교할 값): break;}
		 * - 조건식의 결과는 정수와 문자열만 (JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.		
		*/		
		
		a = 30;
		
		switch(a) {
		case 10:
			System.out.println("a == 10");
			break;
		case 20:
			System.out.println("a == 20");
			break;
			default : //위에있는 case문이 전부 일치하지않는경우 default실행
				System.out.println("default");
		}
		
		//월에 해당하는 계절을 출력
		int month = 9;
		String season = null;
		
		switch(month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월 : " + season);
		
		avg = 60;
		grade = null;
		
		switch(avg / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println(avg + "점 : " + grade);
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자>");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num % 2 == 0) {
				System.out.println("짝수");
			
			}else {
				System.out.println("홀수");
			}
			
			switch(num % 2) {
			case 0:
				System.out.println("짝수");
				break;
			case 1:
				System.out.println("홀수");
				break;
			}
			
			// 1~100 사이의 랜덤한 값을 3개 발행시키고 합계, 평균, 등급을 출력해주세요.
			
			
			
			int num1 = (int)(Math.random() * 100) + 1;
			int num2 = (int)(Math.random() * 100) + 1;
			int num3 = (int)(Math.random() * 100) + 1;
			
			int sum = num1 + num2 + num3;
			double avg1 = Math.round(sum / 3.0 * 10) / 10.0;
			
			if(90 <= avg1 && avg1 <= 100) {
				grade = "A";
				if(97 <= avg1) {
					grade += "+";
				}else if(avg1 <= 93) {
					grade += "-";
				}
			}else if(80 <= avg1) {
				grade = "B";
				if(87 <= avg1) {
					grade += "+";
				}else if(avg1 <= 83) {
					grade += "-";
				}
			}else if(70 <= avg1) {
				grade = "C";
				if(77 <= avg1) {
					grade += "+";
				}else if(avg1 <= 73) {
					grade += "-";
				}
			}else if(60 <= avg1) {
				grade = "D";
				if(67 <= avg1) {
					grade += "+";
				}else if(avg1 <= 63) {
					grade += "-";
				}
			}else {
				grade = "F";
			}
			System.out.println(avg1 + "점 : " + grade);
			
			//1~100 사이의 랜덤한 수를 3개 발행시키고 오름차순으로 출력해주세요.
			
			int n1 = (int) (Math.random() * 100) + 1;
			int n2 = (int) (Math.random() * 100) + 1;
			int n3 = (int) (Math.random() * 100) + 1;

			if (n1 < n2) {
				if (n2 < n3) {
					System.out.println("출력 : " + n1 + "-" + n2 + "-" + n3);
				}else System.out.println("출력 : " + n1 + "-" + n3 + "-" + n2); 
			}else if(n2 < n1) {
				if (n1 < n3) {
					System.out.println("출력 : " + n2 + "-" + n1 + "-" + n3);
				}else System.out.println("출력 : " + n2 + "-" + n3 + "-" + n1);
			}else if(n3 < n1) {
				if(n1 < n2) {
					System.out.println("출력 : " + n3 + "-" + n2 + "-" + n1);
				}else System.out.println("출력 : " + n3 + "-" + n1 + "-" + n2);
			}
			
			//x, y, z순서대로 출력 (가장 작은 값을 x에 넣고 그 다음 작은 값을 y에 넣고)
			
			int x = (int)(Math.random() * 100) + 1;
			int y = (int)(Math.random() * 100) + 1;
			int z = (int)(Math.random() * 100) + 1;
			
			if(x > y) {
				int temp = x;
				x = y;
				y = temp;
			}
			
			if(x > z) {
				int temp = x;
				x = z;
				z = temp;
			}
			if (y > z) {
				int temp = y;
				y = z;
				z = temp;
			}
			System.out.println(x + " < " + y + " < " + z);
			

			


		}
	}
