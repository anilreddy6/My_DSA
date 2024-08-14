import java.util.Scanner;
public class arraysort {
	public static void main(String arg[]) {
		int arr[]= new int[10];
		int j=25;
		//try (Scanner sc = new Scanner(System.in)) {
			for(int i=9;i>0;i--) {
				arr[i]=j;
				j--;
			}
		//}
		int n[]=sort(arr);
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		
	}
	
	static int[] sort(int arr[]) {
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		return arr;
	}

}
