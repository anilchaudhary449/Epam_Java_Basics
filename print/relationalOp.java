public class relationalOp {
    public static void main(String [] args){
        int x=5;
        int y=6;
        int a=4;
        int b=7;
        //boolean result1 =x<y;
        //boolean result2 =x=y;
        boolean result3 = x>y;

        System.out.println(result3);
       //  System.out.println(result2);
       // System.out.println(result1);
        boolean result= x>y || a<b;
        System.out.println(result);
    }
}
