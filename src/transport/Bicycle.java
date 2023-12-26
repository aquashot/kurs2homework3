package transport;

public class Bicycle extends Transport{
    public static final Integer Wheels=2;

    public Bicycle(String modelName) {super(modelName,Wheels);
    }

    @Override
    public void check() {
        super.check();
       updateTyre();
    }
}
