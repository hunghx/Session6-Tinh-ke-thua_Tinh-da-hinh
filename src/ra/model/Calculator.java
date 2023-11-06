package ra.model;

public class Calculator {
    final double PI = 3.14;
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b,int c){
        return a+b+c;
    }
    public int sum(int a, int b,int c, int d){
        return a+b+c+d;
    }
    public void changeValue(final int a){
        System.out.println(a);
        final int b;
        b=10;
    }
}
