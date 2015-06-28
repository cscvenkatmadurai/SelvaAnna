/**
 * Created by HARISH on 6/28/2015.
 */
public class Calculator {
    protected double no1;
    protected double no2;




    public Calculator(double no1, double no2) {
        this.no1 = no1;
        this.no2 = no2;
    }
    public  double add(){
        return no1+no2;
    }
    


    public double sub() {
        return no1 - no2;
    }

    public double mul() {
        return  no1 * no2;
    }

    public double div() {
        return no1/no2;
    }
}
