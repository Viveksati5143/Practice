package hard;

public class max_min_elementinarray {
	public static void main(String [] args) {
		int arr [] = { 0,2, 4, 53, 8, 9, 455,-66, 5};
//		int max = Integer.MIN_VALUE;
//		
//		
//		for(int e: arr) {
//			if(e>max) {
//			max = e;			
//		}
//		}
//		System.out.println("The maximum value of array is:" +max);
//	}
//}

int min = Integer.MAX_VALUE;

for(int e: arr) {
	if(e<min) {
	min = e;			
}
}

System.out.println("The minimum value of array is:" +min);
}
}