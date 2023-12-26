package transport;

public class Car extends Transport {

    public Car(String modelName) {
        super(modelName, 4);
    }

    protected Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        updateTyre();
        checkEngine();
    }
}

