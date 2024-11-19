public class Car {
    private Engine engine;

    // Injection de dépendance via le constructeur
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }
}