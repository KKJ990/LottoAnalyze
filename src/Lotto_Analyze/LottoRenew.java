package Lotto_Analyze;


import java.util.ArrayList;

public class LottoRenew {
	
	
	static ArrayList<Integer> Cross = new ArrayList<>();
	static ArrayList<Integer> First = new ArrayList<>();
	static int[] check = new int[] {11,23,25,30,32,40};
	static int count=0; //몇번째 자리인지 확인하는수 
	
	
	
	
	
public static void cheking(int[] check) {
	
	for(int p=0;p<check.length;p++) {
		
		int [] bebe0 = new int[20];
		switch (check[p]) {
		case 1:
		 bebe0= new int[] {9,17,25,33,41};
					for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환   ==> 변환이유는 sort를 이용한 오름차순정렬 hash를이용한 중복제거에 용의
						First.add(bebe0[i]);
					}
			break;
		case 2:
		 bebe0= new int[]{10,18,26,34,42,8};
		 for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
		 
			
		break;
		case 3:
			bebe0= new int[] {11,19,27,35,9,15};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 4:
			bebe0= new int[] {12,20,28,10,16,22};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 5:
			bebe0= new int[] {13,21,11,17,23,29};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 6:
			
			bebe0= new int[] {14,12,18,24,30,36};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 7:
			bebe0= new int[] {13,19,25,31,37,43};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 8:
			bebe0= new int[] {16,24,32,40,2};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 9:
			bebe0= new int[] {1,17,25,33,41,3,15};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 10:
			bebe0= new int[] {2,18,26,34,42,4,16,22};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 11:
			bebe0= new int[] {3,19,27,35,5,17,23,29};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 12:
			bebe0= new int[] {4,20,28,6,18,24,30,36};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 13:
			bebe0= new int[] {5,21,7,19,25,31,37,43};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 14:
			bebe0= new int[] {6,20,26,32,38,44};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 15:
			bebe0= new int[] {23,31,39,3,9};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
			
		case 16:
			bebe0= new int[] {8,24,32,40,4,10,22};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
			
		case 17:
			bebe0= new int[] {1,9,17,25,33,41,5,11,23,29};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 18:
			bebe0= new int[] {2,10,18,26,34,42,6,12,24,30,36};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 19:
			bebe0= new int[] {3,11,19,27,35,7,13,25,31,37,43};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 20:
			bebe0= new int[] {4,12,20,28,14,26,32,38,44};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
			
		case 21:
			bebe0= new int[] {5,13,27,33,39,45};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 22:
			bebe0= new int[] {4,10,16,30,38};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 23:
			bebe0= new int[] {5,11,17,29,15,31,39};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 24:
			bebe0= new int[] {6,12,18,30,36,8,16,32,40};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 25:
			bebe0= new int[] {7,13,19,31,37,43,1,9,17,33,41};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 26:
			bebe0= new int[] {14,20,32,38,44,2,10,18,34,42};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 27:
			bebe0= new int[] {21,33,39,45,3,11,19,35};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 28:
			bebe0= new int[] {22,34,40,4,12,20};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 29:
			bebe0= new int[] {5,11,17,23,37,45};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 30:
			bebe0= new int[] {6,12,18,24,36,22,38};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 31:
			bebe0= new int[] {7,13,19,25,37,43,15,23,39};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 32:
			bebe0= new int[] {14,20,26,38,44,8,16,24,40};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 33:
			bebe0= new int[] {21,27,39,45,1,9,17,25,41};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 34:
			bebe0= new int[] {28,40,2,10,18,26,42};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 35:
			bebe0= new int[] {41,3,11,19,27};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 36:
			bebe0= new int[] {6,12,18,24,30,44};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 37:
			bebe0= new int[] {7,13,19,25,31,43,29,45};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 38:
			bebe0= new int[] {14,20,26,32,44,22,30};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 39:
			bebe0= new int[] {21,27,33,45,15,23,31};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		case 40:
			bebe0= new int[] {28,34,8,16,24,32};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
		
		case 41:
			bebe0= new int[] {35,1,9,17,25,33};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
		
			break;

		case 42:

			bebe0= new int[] {2,10,18,26,34};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			
			break;
			
		case 43:
			bebe0= new int[] {7,13,19,25,31,37};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
			
		case 44:
			bebe0= new int[] {14,20,26,32,38,36};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
			break;
			
		case 45:
			bebe0= new int[] {21,27,33,39,29,37};
			for(int i =0; i<bebe0.length;i++) {    //ArrayList 로 변환
				First.add(bebe0[i]);
			}
				break;
		}//switch case 문 끝 2
	
	
	} 
	
	
	
	
	
}
	
	

public static void jungbok(ArrayList<Integer> check1) {
	
	
	for(int i=0;i<check1.size();i++) {
		
		
		for(int j=i+1;j<check1.size();j++) {
			
			if(check1.get(i)==check1.get(j)) {
				
				int p= check1.get(i);
				check1.remove(p);
			}			
		}

		
	}
	
	
	
	
}
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
