public class Demo1 {
    public static void main(String [] args){
        int n=5;
        int result=0;
        /*if (n%2==0)
            result=10;
        else
            result=20; */
        result=n%2==0 ? 10:20; //ternary operator
        System.out.println(result);
    }
}
