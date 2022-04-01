package midterm.midterm_deepcopy;

public class Address1 implements Cloneable{
    String street;
    String city;
    String country;

    //standard constructors,getters and setters
    public void setAddr(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }
    public Address1(){
    }

    public Object clone(){
        Address1 addr=null;
        try {
            addr=(Address1)super.clone();
        } catch (CloneNotSupportedException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
        return addr;
    }
}
