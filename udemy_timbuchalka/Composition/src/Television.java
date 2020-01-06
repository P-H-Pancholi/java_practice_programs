public class Television {
    private boolean isTVon;
    public Television(boolean isTVon){
        this.isTVon = isTVon;
    }
    public void TurnOnTV(){
        System.out.println("The television has been turned on");
        isTVon = true;
    }
    public void turnOffTV(){
        System.out.println("The television has been turned off");
        isTVon = false;

    }
}
