
import java.util.*;
class Sum_Of_Integers_Entered_By_User {
	public static void main(String[] args) {
		System.out.print("Enter the number of intergers you want to enter : ");
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int arr[] = new int[n];
		int sum=0;
		System.out.println("Enter the Integers :");
		for(int i=0;i<arr.length;i++){
			arr[i]=input.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of entered Integers is : "+sum);
		input.close();
	}
}
