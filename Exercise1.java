package exerciseone;

public class Exercise1 {

    private int a;
    private char b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(char b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Exercise1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
