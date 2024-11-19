class Main {
    public static void main(String[] args) {
        // Utilisation avec un moteur électrique
        Engine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.start(); // Affiche : Electric engine started.

        // Utilisation avec un moteur à essence
        Engine gasolineEngine = new GasolineEngine();
        Car gasolineCar = new Car(gasolineEngine);
        gasolineCar.start(); // Affiche : Gasoline engine started.
    }
}