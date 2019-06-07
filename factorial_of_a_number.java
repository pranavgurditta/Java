
class factorial_of_a_number
{
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int fact=1;
		for(int i=n;i>0;i--){
			fact*=i;
		}
		System.out.println("Factorial of "+ n +" is : "+fact);
	}
}
