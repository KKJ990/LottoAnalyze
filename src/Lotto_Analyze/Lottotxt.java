package Lotto_Analyze;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lottotxt {
	
	int countOnly=0;
	static int[] CountTotal = new int[46];   //각 숫자가 나온 갯수 계산
	static int[] CountNumber = new int [46];
	static ArrayList<Integer> Counting = new ArrayList<>();   
	static ArrayList<Integer> FinalCounting = new ArrayList<>();
	static int CountPlus=0;    //총나온갯수 ==>
	static int avg=0;   //평균값
	static int a=1;
	static LottoRenew lt = new LottoRenew();
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		int count = 0;
		
		ArrayList<Integer> array = new ArrayList<>();
		
		Scanner scanner = new Scanner(new File("C:\\Users\\KYUNG JUNE\\Desktop\\githurb\\Lotto_Analyze\\src\\Lotto.txt"));
		
		while(scanner.hasNext()) {		
			
			count(scanner.next());
			
		}
		
		for(int i =1; i<CountTotal.length;i++) {
			
			CountPlus=CountPlus+CountTotal[i];
			
				if(i==45) {
					
					avg = CountPlus/45;    //평균값
				}
				
		}
		
		for(int i =1; i<CountTotal.length;i++) {    //갯수를 나타내는배열==>갯수배열 에서 평균값보다 작은 애들의 값 ==>i 만 뽑아 숫자 배열에 저장
													// CountTotal[1]= 1의 총 개수   ,   CountNumber[1]= 평균갯수보다 낮은 숫자
			
			
			
			if(CountTotal[i]<avg) {
				
				Counting.add(i);
				
				
				
			}
			
		}
	
		lt.jungbok(Counting);
		lt.cheking(lt.check);    //대각선 계산 
		lt.First.sort(null);
		lt.jungbok(lt.First);
		FinalNumber(Counting, lt.First);
		System.out.println("적게나온수 :" + Counting.toString());
		System.out.println("분석결과 예측수 : " + lt.First.toString());
		System.out.println("최종 결과값  : " + FinalCounting.toString());
		
		
	}
	
	
 	public static void count(String p) {  ///String 을 쓴이유는 txt에서 받은 값이 String 타입이기 때문 그래서 parseInt를 통해 값을 비교 String ++ 하면 원하는값 안나옴
			int count =0;
			switch (p) {
			case "1": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "2": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "3": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "4": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "5": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "6": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "7": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "8": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "9": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "10": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "11": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "12": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "13": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "14": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "15": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "16": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "17": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "18": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "19": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "20": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "21": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "22": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
				
			}
			case "23": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "24": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "25": {
				count ++;
				CountTotal[Integer.parseInt(p)]++;
				break;
			}
			case "26": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "27": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "28": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "29": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "30": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "31": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "32": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "33": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "34": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "35": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "36": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "37": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "38": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "39": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "40": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "41": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "42": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "43": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "44": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			case "45": {count ++;
			CountTotal[Integer.parseInt(p)]++;
			break;
			}
			
			}
			
			
			
	
		
	}

 	
 	public static void FinalNumber(ArrayList<Integer> Counting,ArrayList<Integer>First) {                    //대각선수와 , 나온갯수가 적은 수의 공통 된값 ==> 최종적으로 로또 당첨 분석
 		
 		
 		for(int i=1;i<Counting.size();i++) {
 			
 			
 			for(int j =0;j<lt.First.size();j++) {
 				
 				
 				if(Counting.get(i)==lt.First.get(j)) {
 					
 					
 					FinalCounting.add(Counting.get(i));
 					
 					
 				}
 				
 				
 			}

 		}
 		
 		
 		
 	}
 
 	
 	
}


