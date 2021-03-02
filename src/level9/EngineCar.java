package level9;

public class EngineCar {
    Engine engine;
    public static void main(String[] args) {

    }

    class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }
        public void stop() {
            isRunning = false;
        }
    }
}
