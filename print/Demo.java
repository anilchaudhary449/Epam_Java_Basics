public class Demo {
    public static void main (String []args){
        int x=3;
        int y=2;
        int z=4;
        if (x>y && x>z) //false
            System.out.println(x);
        else if(y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}
