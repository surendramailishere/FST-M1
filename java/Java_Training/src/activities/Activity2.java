package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 77, 10, 54, -11, 10};
		int sum=0;
		boolean result;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==10) {
				sum = sum + arr[i];
			}
		}
		if(sum==30) {
			result = true;
			System.out.println("Its " + result + " --> The sum is " + sum);
		}
	}

}
