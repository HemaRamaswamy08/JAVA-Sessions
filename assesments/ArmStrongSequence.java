package assesments;

public class ArmStrongSequence {

	public static void main(String[] args) {
		int low = 1;
		int high = 1000;
		for (int i=low;i<=high; i++) {
			int temp = i;
			int digit =0;
			while(temp !=0) {
				temp = temp/10;
				digit ++;
			}
			temp =i;
			int result=0;
			while(temp !=0) {
				int remainder = temp %10;
				int product = 1;
				for(int j=1; j<=digit; j++) {
					product *=remainder;
				}
				result += product;
				temp= temp/10;
			}
			temp =i;
			if(temp ==result) {
				System.out.println(temp);
			}
		}

	}

}
