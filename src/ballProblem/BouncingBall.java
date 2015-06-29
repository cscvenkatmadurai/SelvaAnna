package ballProblem;

/**
 * Created by HARISH on 6/29/2015.
 */
public class BouncingBall extends Ball {
    protected int height;
    protected int maxHeight;
    protected boolean cycle;
    public BouncingBall(String name, String colour, int maxHeight) {
        super(name, colour);
        this.maxHeight = maxHeight;
        this.height = 0;
        cycle = true;
    }
    private void increaseHeight(){
        height += 1;
    }
    private void decreaseHeight(){
        height -= 1;
    }




    private void invertCycle() {
        if(height == maxHeight || height == 0){
            cycle = !cycle;
        }
    }


    @Override
    public int ballOperation() {
        if(cycle){
            increaseHeight();

        }else{
            decreaseHeight();
        }
        invertCycle();
        return height;
    }
}
