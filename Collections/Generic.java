package Collections;


class Algo<G>{
	public void Swap(G a,G b) 
	{
		G temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	
}
	
	
public class Generic {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algo<Integer>a=new Algo<>();
		a.Swap(10,20);
		Algo<String>b=new Algo<>();
		b.Swap("pooja","kirti");

	}

}
