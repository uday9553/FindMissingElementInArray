
public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,6,5,7,3,8};
		int sum=findsSum(arr.length+1);
		int sumOfArray=findSumOfArray(arr);
		System.out.println("Missing element is"+(sum-sumOfArray));
		
	}
	
	static int findsSum(int n) {
		System.out.println("value of n is"+n);
		return n*(n+1)/2;
	}
	static int findSumOfArray(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum of array is"+sum);
		return sum;
	}

}
