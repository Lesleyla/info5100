package assignment1;

public class solution10 {

    public static void main(String[] args) {
        Box box1 = new Box(10.0, 6.0, 8.0);
        Box box2 = new Box(9.0, 3.0, 6.0);
        double vol;

        //get vol of first box
        vol = box1.volume();
        System.out.println("the box volume of box1 is:" + vol);

        //get vol of second box
        vol = box2.volume();
        System.out.println("the box volume of box2 is:" + vol);
    }
}
