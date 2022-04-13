package others.mid_q1.midterm_deepcopy;

public class User1 implements Cloneable{
    String firstname;
    String lastname;
    Address1 address;

    public void setAddress(Address1 addr) {
        this.address = addr;
    }
    public User1(String fn, String ln, Address1 addr) {
        this.firstname = fn;
        this.lastname = ln;
        this.address = addr;
    }

    public User1(User1 p){
        this.firstname = p.firstname;
        this.lastname = p.lastname;
        this.address = p.address;
    }
    @Override
    public Object clone() {
        User1 user2=null;
        try {
            user2 = (User1)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        user2.address=(Address1)address.clone();//深拷贝：就是对引用的对象单独拷贝一次哦。
        return  user2;
    }
}
