public class App {
    public static void main(String[] args) {
        int x = 10;
        int s = 15;
        System.out.println(sum(x,s));
        System.out.println(div(s,x));
    }
    public static int sum (int a,int b) {
        return a+b;
    }
    public static int div (int a,int b) {
        return a-b;
    }
}
