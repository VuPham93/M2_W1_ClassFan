public class FanTest {
    public static void main(String[] args) {

        Fan newFan = new Fan();

        Fan newFan1 = new Fan();
        newFan1.setSpeed(newFan1.FAST);
        newFan1.setRadius(3);
        newFan1.setColor("yellow");
        newFan1.setOn(true);


        Fan newFan2 = new Fan();
        newFan2.setSpeed(newFan2.MEDIUM);
        newFan2.setRadius(8);
        newFan2.setColor("green");
        newFan2.setOn(false);

        System.out.println("Fan default: " + newFan.getInfo());
        System.out.println("Fan 1: " + newFan1.getInfo());
        System.out.println("Fan 2: " + newFan2.getInfo());
    }
}
