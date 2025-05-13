package assesments;

public class Arms {
	public int count(int num) {
		int count =0;
		while(num !=0) {
			num = num/10;
			count++;
		}
		return count;
	}

	public int armsFind2(int num) {
		int result=0;
		int remainder=0;
		while(num !=0) {
			remainder = num %10;
			remainder = remainder*remainder;
			result +=remainder;
			num = num/10;
			//remainder=0;
		}
		return result;
	}
	
	public int armsFind3(int num) {
		int result=0;
		int remainder=0;
		while(num !=0) {
			remainder = num %10;
			remainder = remainder*remainder*remainder;
			result +=remainder;
			num = num/10;
		}
		return result;
	}
	
}
