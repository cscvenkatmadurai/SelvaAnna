package ballProblem;

/**
 * Created by HARISH on 6/29/2015.
 */
public class BallManager {
    public static void ballAction(Ball[] balls ,int time){
        for (int i = 0; i < time; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < balls.length; j++) {
                System.out.print(balls[j].ballOperation()+" ");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        Ball[] balls= new Ball[2];
        balls[0] = new BouncingBall("bBall","red",3);
        balls[1] = new ElasticBall("eBall","pink",5);
        ballAction(balls,10);
    }
}
