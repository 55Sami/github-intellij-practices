class SmartWatch {
    int steps = 2000;

    void addSteps(int steps) {
        steps = steps + 500;
    }
}

public class MainTest4 {
    public static void main(String[] args) {
        SmartWatch watch = new SmartWatch();
        watch.addSteps(1000);
        System.out.println(watch.steps);

    }
}

