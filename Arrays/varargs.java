package Arrays;

public class varargs {

    public static int add(int ...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4));
        System.out.println(add(4,6,8,9854,45,6));
    }
}
