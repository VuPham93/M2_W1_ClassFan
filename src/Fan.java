public class Fan {
        public final int SLOW = 1;
        public final int MEDIUM = 2;
        public final int FAST = 3;

        private int speed = SLOW;
        private boolean status = false;
        private double radius = 10;
        private String color = "blue";

        public String getColor() {
            return color;
        }

        public String getRadius() {
            return String.valueOf(radius);
        }

        public String isOn() {
            return String.valueOf(status);
        }

        public String getSpeed() {
            return String.valueOf(speed);
        }

        public void setSpeed(int fanSpeed) {
            speed = fanSpeed;
        }
        public void setOn(boolean on) {
            status = on;
        }
        public void setRadius(double fanRadius) {
            radius = fanRadius;
        }
        public void setColor(String fanColor) {
            color = fanColor;
        }
        public String getInfo() {
            return "Status = " + isOn() + " | Radius = " + getRadius() + " | Color = " + getColor() + " | Speed = " + getSpeed();
        }
}
