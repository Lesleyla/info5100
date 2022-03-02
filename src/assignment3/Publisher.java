package assignment3;

public class Publisher {
    public static void main(String[] args) {

        SeattlePoliceDepartment notification = new SeattlePoliceDepartment();

        Person p1 = new Person("John", 45);
        Person p2 = new Person("May", 21);
        Person p3 = new Person("Lena", 33);
        Person p4 = new Person("Eric", 18);

        notification.Subscribe(p1);
        notification.Subscribe(p2);
        notification.Subscribe(p3);
        notification.Subscribe(p4);

        p1.subscribeSPD(notification);
        p2.subscribeSPD(notification);
        p3.subscribeSPD(notification);
        p4.subscribeSPD(notification);

        notification.publish();

        notification.Unsubscribe(p1);
        notification.Unsubscribe(p3);

        notification.publish();
    }
}
