package others.mid_q3;

public abstract class Moody {
    public abstract String getMood();
    public abstract void ExpressFeelings();
    public void queryMood(){
        System.out.println("I feel " + getMood() + " today!!");
    };
}
