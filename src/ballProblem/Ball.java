package ballProblem;

/**
 * Created by HARISH on 6/29/2015.
 */
abstract  class Ball {
    protected String name;
    protected String colour;

    public Ball(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
    abstract public int ballOperation();


}
