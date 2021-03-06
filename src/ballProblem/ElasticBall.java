package ballProblem;

/**
 * Created by HARISH on 6/29/2015.
 */
public class ElasticBall extends Ball {
    private int maxSize;
    private int size;
    private boolean cycle;

    public ElasticBall(String name, String colour, int maxSize ) {
        super(name, colour);
        this.maxSize = maxSize;
        this.cycle = true;
        size = 0;
    }
    private void increaseSize(){
        size += 1;
    }
    private  void decreaseSize(){
        size -=1;
    }



    private void invertCycle() {
        if(size == maxSize || size == 0){
            cycle = !cycle;
        }
    }

    @Override
    public int ballOperation() {
        if(cycle){
            increaseSize();
        }else{
            decreaseSize();
        }
        invertCycle();
        return size;
    }
}
