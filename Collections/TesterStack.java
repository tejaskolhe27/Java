package Collections;
class Stack<G>
{
	private int size;
	private G[] arr;
	private int top;
	public Stack()
	{
		size=5;
		arr=(G[]) new Object[size];
		top=-1;
	}
	public Stack(int s)
	{
		size=s;
		arr=(G[])new Object[size];
		top=-1;
	}
	public void push(G val)
	{
		if(!isFull())
			arr[++top]=val;
		else
			System.out.println("Overflow!");
	}
	public G pop()
	{
		if(!isEmpty()) {
			System.out.println(arr[top--]);
			return arr[top]; 
		}
		else 
		{
			System.out.println("underflow!");
		    return null;
		}
		
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
}
public class TesterStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println();
        Stack<String> s2 = new Stack<>();
        s2.push("Tnfy");
        s2.push("wipro");
        s2.push("TCS");
        s2.pop();
        s2.pop();
	}

}
