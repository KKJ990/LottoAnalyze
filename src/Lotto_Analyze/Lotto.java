package Lotto_Analyze;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Lotto {
	
	static ArrayList<Integer> finalList=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();  //랜덤함수
		int []j= new int[6];	//최종 배열(로또)
		int[]l=new int[] {4,7,12,14,22,33};
		int count =0;
		int[]bebe0=new int[50]; //로또 첫번째자리
		int[]bebe1=new int[50];	//로또 두번째자리
		int[]bebe2=new int[50]; //로또 셋번째자리
		int[]bebe3=new int[50]; //로또 넷번째자리
		int[]bebe4=new int[50]; //로또 다섯번째자리
		int[]bebe5=new int[50]; // 로또 여섯번째자리
		
		int[]bebe01=new int[50];
		int[]bebe23=new int[50];
		int[]bebe45=new int[50];
		int[]bebe0123= new int[100];
		int[]bebe012345= new int[100];
		
		
		int[]sumbebe=new int[50];
		int su;
		
		
		
		
		
		//첫번째수~여섯번째수 로또번호 분석  배열

//		for(int i=0;i<=5;i++) {
//
//			j[i]=rd.nextInt(45+1);
//
//
//			for(int s=0;s<i;s++) {							//중복확인 (배열안에)
//
//				if(j[s]==j[i]) {
//					j[i]=rd.nextInt(45+1);		
//				}
//
//			}
//			System.out.print("["+ j[i] +"]");
//			
//		}
		for(int p=0;p<=5;p++) {
			
			su=l[p];
			switch (su) {
			case 1:

				switch (count) {
				case 0: 
				
					bebe0= new int[] {9,17,25,33,41};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {9,17,25,33,41};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {9,17,25,33,41};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {9,17,25,33,41};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {9,17,25,33,41};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {9,17,25,33,41};
					count ++;
					break;
				
				}
				break;
				
			
				
			case 2:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {10,18,26,34,42,8};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {10,18,26,34,42,8};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {10,18,26,34,42,8};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {10,18,26,34,42,8};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {10,18,26,34,42,8};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {10,18,26,34,42,8};
					count ++;
					break;
				case 6:
					break;
					
				}
				break;
				
				
			case 3:

				switch (count) {
				case 0: 
				
					bebe0= new int[] {11,19,27,35,9,15};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {11,19,27,35,9,15};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {11,19,27,35,9,15};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {11,19,27,35,9,15};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {11,19,27,35,9,15};
					count ++;					
					break;
				case 5:
					
					bebe5= new int[] {11,19,27,35,9,15};
					count ++;
					break;
					
				case 6:
					break;
				}
				break;
				
				
			case 4:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {12,20,28,10,16,22};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {12,20,28,10,16,22};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {12,20,28,10,16,22};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {12,20,28,10,16,22};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {12,20,28,10,16,22};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {12,20,28,10,16,22};
					count ++;
					break;
					
				case 6:
					break;
		
						
				}
				break;
				
			case 5:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {13,21,11,17,23,29};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {13,21,11,17,23,29};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {13,21,11,17,23,29};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {13,21,11,17,23,29};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {13,21,11,17,23,29};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {13,21,11,17,23,29};
					count ++;
					break;
					
				case 6:
					break;
						
					
				}
				break;
				
			case 6:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {14,12,18,24,30,36};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {14,12,18,24,30,36};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {14,12,18,24,30,36};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {14,12,18,24,30,36};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {14,12,18,24,30,36};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {14,12,18,24,30,36};
					count ++;
					break;
					
				case 6:
					break;
						
				}
				break;
				
			case 7:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {13,19,25,31,37,43};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {13,19,25,31,37,43};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {13,19,25,31,37,43};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {13,19,25,31,37,43};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {13,19,25,31,37,43};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {13,19,25,31,37,43};
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 8:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {16,24,32,40,2};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {16,24,32,40,2};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {16,24,32,40,2};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {16,24,32,40,2};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {16,24,32,40,2};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {16,24,32,40,2};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 9:
				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {1,17,25,33,41,3,15};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {1,17,25,33,41,3,15};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {1,17,25,33,41,3,15};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {1,17,25,33,41,3,15};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {1,17,25,33,41,3,15};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {1,17,25,33,41,3,15};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
				
			case 10:

			
				switch (count) {
				case 0: 
				
					bebe0= new int[] {2,18,26,34,42,4,16,22};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {2,18,26,34,42,4,16,22};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {2,18,26,34,42,4,16,22};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {2,18,26,34,42,4,16,22};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {2,18,26,34,42,4,16,22};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {2,18,26,34,42,4,16,22};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 11:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {3,19,27,35,5,17,23,29};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {3,19,27,35,5,17,23,29};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {3,19,27,35,5,17,23,29};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {3,19,27,35,5,17,23,29};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {3,19,27,35,5,17,23,29};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {3,19,27,35,5,17,23,29};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 12:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {4,20,28,6,18,24,30,36};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {4,20,28,6,18,24,30,36};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {4,20,28,6,18,24,30,36};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {4,20,28,6,18,24,30,36};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {4,20,28,6,18,24,30,36};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {4,20,28,6,18,24,30,36};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 13:

				switch (count) {
				case 0: 
				
					bebe0= new int[] {5,21,7,19,25,31,37,43};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {5,21,7,19,25,31,37,43};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {5,21,7,19,25,31,37,43};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {5,21,7,19,25,31,37,43};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {5,21,7,19,25,31,37,43};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {5,21,7,19,25,31,37,43};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 14:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {6,20,26,32,38,44};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {6,20,26,32,38,44};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {6,20,26,32,38,44};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {6,20,26,32,38,44};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {6,20,26,32,38,44};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {6,20,26,32,38,44};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 15:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {23,31,39,3,9};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {23,31,39,3,9};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {23,31,39,3,9};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {23,31,39,3,9};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {9,17,25,33,41};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {9,17,25,33,41};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 16:

			
				switch (count) {
				case 0: 
				
					bebe0= new int[] {8,24,32,40,4,10,22};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {8,24,32,40,4,10,22};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {8,24,32,40,4,10,22};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {8,24,32,40,4,10,22};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {8,24,32,40,4,10,22};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {8,24,32,40,4,10,22};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 17:

			
				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {1,9,17,25,33,41,5,11,23,29};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {1,9,17,25,33,41,5,11,23,29};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {1,9,17,25,33,41,5,11,23,29};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {1,9,17,25,33,41,5,11,23,29};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {1,9,17,25,33,41,5,11,23,29};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {1,9,17,25,33,41,5,11,23,29};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 18:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {2,10,18,26,34,42,6,12,24,30,36};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {2,10,18,26,34,42,6,12,24,30,36};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {2,10,18,26,34,42,6,12,24,30,36};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {2,10,18,26,34,42,6,12,24,30,36};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {2,10,18,26,34,42,6,12,24,30,36};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {2,10,18,26,34,42,6,12,24,30,36};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 19:

			
				switch (count) {
				case 0: 
				
					bebe0= new int[] {3,11,19,27,35,7,13,25,31,37,43};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {3,11,19,27,35,7,13,25,31,37,43};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {3,11,19,27,35,7,13,25,31,37,43};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {3,11,19,27,35,7,13,25,31,37,43};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {3,11,19,27,35,7,13,25,31,37,43};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {3,11,19,27,35,7,13,25,31,37,43};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 20:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {4,12,20,28,14,26,32,38,44};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {4,12,20,28,14,26,32,38,44};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {4,12,20,28,14,26,32,38,44};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {4,12,20,28,14,26,32,38,44};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {4,12,20,28,14,26,32,38,44};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {4,12,20,28,14,26,32,38,44};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 21:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {5,13,27,33,39,45};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {5,13,27,33,39,45};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {5,13,27,33,39,45};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {5,13,27,33,39,45};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {5,13,27,33,39,45};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {5,13,27,33,39,45};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 22:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {4,10,16,30,38};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {4,10,16,30,38};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {4,10,16,30,38};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {4,10,16,30,38};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {4,10,16,30,38};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {4,10,16,30,38};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 23:

				switch (count) {
				case 0: 
				
					bebe0= new int[] {5,11,17,29,15,31,39};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {5,11,17,29,15,31,39};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {5,11,17,29,15,31,39};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {5,11,17,29,15,31,39};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {5,11,17,29,15,31,39};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {5,11,17,29,15,31,39};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 24:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {6,12,18,30,36,8,16,32,40};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {6,12,18,30,36,8,16,32,40};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {6,12,18,30,36,8,16,32,40};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {6,12,18,30,36,8,16,32,40};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {6,12,18,30,36,8,16,32,40};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {6,12,18,30,36,8,16,32,40};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 25:

				switch (count) {
				case 0: 
				
					bebe0= new int[] {7,13,19,31,37,43,1,9,17,33,41};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {7,13,19,31,37,43,1,9,17,33,41};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {7,13,19,31,37,43,1,9,17,33,41};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {7,13,19,31,37,43,1,9,17,33,41};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {7,13,19,31,37,43,1,9,17,33,41};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {7,13,19,31,37,43,1,9,17,33,41};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 26:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {14,20,32,38,44,2,10,18,34,42};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {14,20,32,38,44,2,10,18,34,42};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {14,20,32,38,44,2,10,18,34,42};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {14,20,32,38,44,2,10,18,34,42};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {14,20,32,38,44,2,10,18,34,42};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {14,20,32,38,44,2,10,18,34,42};
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 27:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {21,33,39,45,3,11,19,35};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {21,33,39,45,3,11,19,35};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {21,33,39,45,3,11,19,35};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {21,33,39,45,3,11,19,35};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {21,33,39,45,3,11,19,35};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {21,33,39,45,3,11,19,35};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 28:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {22,34,40,4,12,20};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {22,34,40,4,12,20};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {22,34,40,4,12,20};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {22,34,40,4,12,20};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {22,34,40,4,12,20};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {22,34,40,4,12,20};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 29:
				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {5,11,17,23,37,45};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {5,11,17,23,37,45};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {5,11,17,23,37,45};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {5,11,17,23,37,45};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {5,11,17,23,37,45};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {5,11,17,23,37,45};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 30:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {6,12,18,24,36,22,38};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {6,12,18,24,36,22,38};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {6,12,18,24,36,22,38};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {6,12,18,24,36,22,38};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {6,12,18,24,36,22,38};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {6,12,18,24,36,22,38};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 31:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {7,13,19,25,37,43,15,23,39};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {7,13,19,25,37,43,15,23,39};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {7,13,19,25,37,43,15,23,39};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {7,13,19,25,37,43,15,23,39};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {7,13,19,25,37,43,15,23,39};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {7,13,19,25,37,43,15,23,39};
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 32:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {14,20,26,38,44,8,16,24,40};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {14,20,26,38,44,8,16,24,40};
					
					break;
				case 2:
					
					bebe2= new int[] {14,20,26,38,44,8,16,24,40};
				
					break;
				case 3:
					
					bebe3= new int[] {14,20,26,38,44,8,16,24,40};
					
					break;
				case 4:
					
					bebe4= new int[] {14,20,26,38,44,8,16,24,40};
					
					break;
				case 5:
					
					bebe5= new int[] {14,20,26,38,44,8,16,24,40};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 33:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {21,27,39,45,1,9,17,25,41};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {21,27,39,45,1,9,17,25,41};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {21,27,39,45,1,9,17,25,41};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {21,27,39,45,1,9,17,25,41};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {21,27,39,45,1,9,17,25,41};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {21,27,39,45,1,9,17,25,41};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				
				break;
			case 34:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {28,40,2,10,18,26,42};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {28,40,2,10,18,26,42};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {28,40,2,10,18,26,42};
				
					break;
				case 3:
					
					bebe3= new int[] {28,40,2,10,18,26,42};
					
					break;
				case 4:
					
					bebe4= new int[] {28,40,2,10,18,26,42};
					
					break;
				case 5:
					
					bebe5= new int[] {28,40,2,10,18,26,42};
					break;
				
				case 6:
					break;
					
				}
				break;
				

			case 35:

			
				switch (count) {
				case 0: 
				
					bebe0= new int[] {41,3,11,19,27};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {41,3,11,19,27};
					
					break;
				case 2:
					
					bebe2= new int[] {41,3,11,19,27};
				
					break;
				case 3:
					
					bebe3= new int[] {41,3,11,19,27};
					
					break;
				case 4:
					
					bebe4= new int[] {41,3,11,19,27};
					
					break;
				case 5:
					
					bebe5= new int[] {41,3,11,19,27};
					break;
				
				case 6:
					break;
					
				}
				break;
				

			case 36:

				switch (count) {
				case 0: 
				
					bebe0= new int[] {6,12,18,24,30,44};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {6,12,18,24,30,44};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {6,12,18,24,30,44};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {6,12,18,24,30,44};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {6,12,18,24,30,44};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {6,12,18,24,30,44};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				

			case 37:

				switch (count) {
				case 0: 
				
					bebe0= new int[] {7,13,19,25,31,43,29,45};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {7,13,19,25,31,43,29,45};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {7,13,19,25,31,43,29,45};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {7,13,19,25,31,43,29,45};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {7,13,19,25,31,43,29,45};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {7,13,19,25,31,43,29,45};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;

			case 38:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {14,20,26,32,44,22,30};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {14,20,26,32,44,22,30};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {14,20,26,32,44,22,30};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {14,20,26,32,44,22,30};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {14,20,26,32,44,22,30};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {14,20,26,32,44,22,30};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 39:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {21,27,33,45,15,23,31};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {21,27,33,45,15,23,31};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {21,27,33,45,15,23,31};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {21,27,33,45,15,23,31};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {21,27,33,45,15,23,31};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {21,27,33,45,15,23,31};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;

			case 40:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {28,34,8,16,24,32};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {28,34,8,16,24,32};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {28,34,8,16,24,32};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {28,34,8,16,24,32};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {28,34,8,16,24,32};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {28,34,8,16,24,32};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;

			case 41:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {35,1,9,17,25,33};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {35,1,9,17,25,33};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {35,1,9,17,25,33};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {35,1,9,17,25,33};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {35,1,9,17,25,33};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {35,1,9,17,25,33};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;

			case 42:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {2,10,18,26,34};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {2,10,18,26,34};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {2,10,18,26,34};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {2,10,18,26,34};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {2,10,18,26,34};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {2,10,18,26,34};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 43:
				
				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {7,13,19,25,31,37};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {7,13,19,25,31,37};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {7,13,19,25,31,37};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {7,13,19,25,31,37};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {7,13,19,25,31,37};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {7,13,19,25,31,37};
					count ++;
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 44:

				
				switch (count) {
				case 0: 
				
					bebe0= new int[] {14,20,26,32,38,36};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {14,20,26,32,38,36};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {14,20,26,32,38,36};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {14,20,26,32,38,36};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {14,20,26,32,38,36};
					count++;
					break;
				case 5:
					
					bebe5= new int[] {14,20,26,32,38,36};
					break;
				
				case 6:
					break;
					
				}
				break;
				
			case 45:

		
				switch (count) {
				case 0: 
				
					bebe0= new int[] {21,27,33,39,29,37};
					count ++;
					break;
					
				case 1:
					
					bebe1= new int[] {21,27,33,39,29,37};
					count ++;
					break;
				case 2:
					
					bebe2= new int[] {21,27,33,39,29,37};
					count ++;
					break;
				case 3:
					
					bebe3= new int[] {21,27,33,39,29,37};
					count ++;
					break;
				case 4:
					
					bebe4= new int[] {21,27,33,39,29,37};
					count ++;
					break;
				case 5:
					
					bebe5= new int[] {21,27,33,39,29,37};
					count ++;
					break;
				
				case 6:
					break;
						
				}
					break;
			}//switch case 문 끝 2
		
			if(count==6)
				break;
		} 
		
		
		
		bebe01=sum(bebe0,bebe1);  //합친배열을 값넣어주기 
		bebe23=sum(bebe2,bebe3);
		bebe45=sum(bebe3,bebe4);
		bebe0123=sum(bebe01,bebe23);  //합친배열을 값넣어주기 
		
		
		bebe012345=sum(bebe0123,bebe45);
		
		
		for(int i=0;i<bebe012345.length;i++) {
			
			finalList.add(bebe012345[i]);
		}
		
		
		
		for(int i=0;i<finalList.size();i++) {               //중복제거 
			
			for(int p =i+1; p<finalList.size();p++) {
				
				 if(finalList.get(i) == finalList.get(p)) {
					 
					 
					 finalList.remove(p);
					 
				 }
				
			}
			
		}
		finalList.sort(null);  //오름차순
		
	
		System.out.println(finalList);
	
		
		
	
		
	}
	
	public static void toString1() {
		
		
		System.out.println(finalList);
		
		
	}
	
	
	public static void chulyuk(int []bebe) {         //배열출력
		
		System.out.println(Arrays.toString(bebe));
		
	}
	
	public static int[] sum(int []bebe0,int []bebe1) {                          //배열합치기
		
		int be0 = bebe0.length;
		int be1 = bebe1.length;
		int[]sumbebe=new int[be0+be1];
		System.arraycopy(bebe0, 0, sumbebe, 0,be0);
		System.arraycopy(bebe1, 0, sumbebe, be0, be1);
		
		
		return sumbebe;
		
	}
	
	
	
	
	
}	
		
	
	





	