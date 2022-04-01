package midterm.midterm_shallowcopy;

public class shal_copy {
    public static void main(String[] args){
        Address addr = new Address();
        addr.setAddr("1260 republican st", "Seattle", "USA");
        User p1 = new User("Liangyu","Wang",addr);
        User p2 = (User)  p1.clone();
        System.out.println(p1.address==p2.address);
        // 检验子对象的值有没有被修改
        System.out.println("*******检验子对象的值有没有被修改********");
        addr.setAddr("225 Terry Ave", "Seattle", "USA");
        System.out.println(p2.address.street);
        System.out.println(p1.address.street);

        //浅拷贝没有复制子对象，否则会为子对象单独申请空间创建实例并为其赋相同值；
        //对象1和被复制出来的对象1所指向的子对象是同一个，子对象值一改之后，两个访问到的值都是被改之后的。

    }
}

//public void whenShallowCopying_thenObjectsShouldNotBeSame() {
//
//    Address address = new Address("Downing St 10", "London", "England");
//    User pm = new User("Prime", "Minister", address);
//
//    User shallowCopy = new User(
//      pm.getFirstName(), pm.getLastName(), pm.getAddress());
//
//    assertThat(shallowCopy)
//      .isNotSameAs(pm);
//}