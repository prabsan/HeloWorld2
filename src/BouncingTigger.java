public class BouncingTigger {
    public int startOfBounce;
    public boolean timeForFood = false;
    public int counter = 0;
    public int northCounter = 0;
    public int southCounter = 0;

    public BouncingTigger(int bounce){
        this.startOfBounce = bounce;
        this.startJumping(this.startOfBounce);
    }

    public void FindFood() {
        this.timeForFood = true;
    }

    public void startJumping(int startingPoint) {
        this.counter = startingPoint;
        this.northCounter = startingPoint;
        this.southCounter = startingPoint;

        while(!this.timeForFood) {
            for(int i=0; i<this.northCounter; i++) {
                System.out.print("N");
            }
            System.out.println();

            for(int i=0; i<this.southCounter; i++) {
                System.out.print("S");
            }

            System.out.println();
            this.northCounter++;
            this.southCounter++;
        }
    }
}
