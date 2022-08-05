package ex05_6_break;
// 레이블 블록
// 형식) 레이블 명 : {문장블록} 또는 반복문이 포함된 블록
// 예)
// aa:{
//    System.out.println("aa");
//   }

// bb: for(int i=0; i<10; i++){
//       break bb;
//   }
public class BreakExample3 {
	public static void main(String args[]) {

		int row;
		int col;
		
		outerLoop:
		for (row = 0; row < 3; row++) {
			for (col = 0; col < 5; col++) {
				System.out.println("(" + row + "," + col + ")");
				if ((row == 1) && (col == 3))
					break outerLoop; // outerLoop 블럭문을 벗어납니다.
			}
		}
		System.out.println("끝");
	
	}

}


