package demo.day3;



public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a,int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPossible(){
        return (((a+b)>c) && ((a+c)>b) && ((b+c)>a));
    }



}
