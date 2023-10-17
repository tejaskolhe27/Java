package Arrays;

public class arraycopy {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b=new int[3];
        System.out.println("Array A:");
        for(int val:a){
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("Array B:");
        System.arraycopy(a, 2, b, 0, 3);
        for(int val:b){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
