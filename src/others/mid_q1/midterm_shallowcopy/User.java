package others.mid_q1.midterm_shallowcopy;

public class User implements Cloneable{
    String firstname;
    String lastname;
    Address address;

    //standard constructors,getters and setters

    public void setAddress(Address addr) {
        this.address = addr;
    }
    public User(String fn, String ln, Address addr) {
        this.firstname = fn;
        this.lastname = ln;
        this.address = addr;
    }
    //public String getFirstname() {
    //        return firstname;
    //    }
    //    public String getLastname() {
    //        return lastname;
    //    }
    public User(User p){
        this.firstname = p.firstname;
        this.lastname = p.lastname;
        this.address = p.address;
    }
    @Override
    public Object clone() {
        User user1=null;
        try {
            user1 = (User)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  user1;
    }
}
