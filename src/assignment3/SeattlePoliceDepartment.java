package assignment3;
import java.util.List;
import java.util.ArrayList;

public class SeattlePoliceDepartment {

    List<Person> subs = new ArrayList<>();

    //subscribe
    public void Subscribe(Person p) {
        subs.add(p);
    }
    //unsubscribe
    public void Unsubscribe(Person p) {
        int i = subs.indexOf(p);
        if(i>=0){
            subs.remove(p);
        }
    }
    //notify citizens
    public void NotifyCitizens() {
        for(Person p : subs){
            p.getNotification();
        }
    }
    //publish
    public void publish() {
        NotifyCitizens();
    }
}

