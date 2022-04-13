package others.mid_q3;

public class Sad extends Moody {

    @Override
    public String getMood(){
        return "sad";
    };

    @Override
    public void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    };

    @Override
    public String toString(){
        return "Subject cries a lot";
    };
}
