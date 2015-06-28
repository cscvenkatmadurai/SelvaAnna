/**
 * Created by HARISH on 6/28/2015.
 */
public class Calculator {
    protected double no1;
    protected double no2;

    public double getNo1() {
        return no1;
    }

    public void setNo1(double no1) {
        this.no1 = no1;
    }

    public double getNo2() {
        return no2;
    }

    public void setNo2(double no2) {
        this.no2 = no2;
    }



    public Calculator(double no1, double no2) {
        this.no1 = no1;
        this.no2 = no2;
    }
    public  double add(){
        return no1+no2;
    }
    public static  double add(double no1,double no2){
        return no1+no2;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator(5,6);
        System.out.println(c.add());
        System.out.println(c.add(50,50));
    }
}
