public class loops_conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		if(num%2==0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");
		
		int n=5,cnt=1;
		while(cnt<=10) {
			System.out.print(n*cnt+" ");
			cnt++;
		}
		System.out.println();
		
		for(int i=1;i<=10;i++)
			System.out.print(n*i+" ");
	}

}
