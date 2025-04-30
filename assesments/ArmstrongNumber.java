package assesments;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int digit = 0;
		
		Arms countMethod = new Arms();
		int low = 1;
		int high = 1000;
		
		for(int i=low; i<=high; i++) {
			
			int result = 0;
			digit = countMethod.count(i);
			if(digit ==1) {
				result = i;
			}else if(digit ==2) {
				result = countMethod.armsFind2(i);	
			}else if(digit == 3) {
				result = countMethod.armsFind3(i);
			}
			if(result ==i) {
				System.out.println(result);
			}
		}
	
//		while (low <= high) {
//			int result=0;
//			digit = countMethod.count(low);
//			switch (digit) {
//			case 1: {
//				System.out.println(low);
//				break;
//			}
//			case 2: {
//				result = countMethod.armsFind2(low);
//				if (result == low) {
//					System.out.println(result);
//					break;
//				}
//			}
//			case 3: {
//				result = countMethod.armsFind3(low);
//				if (result == low) {
//					System.out.println(result);
//					break;
//					}
//				}
//			}
//			low = low+1;
//		}

	}
}

 
