package others.mid_q1.midterm_deepcopy;

public class deep_copy {
    public static void main(String[] args){

        Address1 ad=new Address1();
        ad.setAddr("1260 republican st", "Seattle", "USA");
        User1 p1=new User1("Liangyu","Wang",ad);
        User1 p2 = (User1)  p1.clone();
        System.out.println(p1.address==p2.address);
        // 检验子对象的值有没有被修改
        System.out.println("*******检验子对象的值有没有被修改********");
        ad.setAddr("225 Terry Ave", "Seattle", "USA");
        System.out.println(p2.address.street);
        System.out.println(p1.address.street);

    }
}

//@Test
//public void whenModifyingOriginalObject_thenCopyShouldNotChange() {
//    Address address = new Address("Downing St 10", "London", "England");
//    User pm = new User("Prime", "Minister", address);
//    User deepCopy = new User(pm);
//
//    address.setCountry("Great Britain");
//    assertNotEquals(
//      pm.getAddress().getCountry(),
//      deepCopy.getAddress().getCountry());
//}
