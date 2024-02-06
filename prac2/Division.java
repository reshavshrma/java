public class Division {
    public static void main(String[] args) {
        int a=5, b=2;
        System.out.println(div(a,b));
    }

    public static float div(int x, int y) {
        if(y==0) {
            return y;
        }
        else {
            return x/y;
        }
    }
}