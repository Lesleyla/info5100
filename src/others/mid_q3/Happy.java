package others.mid_q3;

public class Happy extends Moody {

    @Override
    public String getMood(){
        return "happy";
    };

    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    };

    @Override
    public String toString(){
        return "Subject laughs a lot";
    };
}