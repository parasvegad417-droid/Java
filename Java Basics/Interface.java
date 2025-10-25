interface Bicycle {
    int a = 34;
    void applybreak(int decrement);
    void speedupo(int increment);
}

class AvonCycle implements Bicycle {
    void blowHorn() {
        System.out.println("Blow Horn Please");
    }
    public void applybreak(int increment) {
        System.out.println(increment);
    }
    public void speedupo(int increment) {
        System.out.println(increment);
    }
}
public class Interface {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();
        a.speedupo(1);
    }

}
