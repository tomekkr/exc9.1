class Memory extends Component implements Tweakable {
    private int amount;
    private double speed;
    private double currentTemperature;
    private double maxSafeTemperature;
    private final double temperatureIncreasePer100MHz = 15;

    public Memory(String name, String producer, String serialNumber, int amount, int speed, int currentTemperature, int maxSafeTemperature) {
        super(name, producer, serialNumber);
        this.amount = amount;
        this.speed = speed;
        this.currentTemperature = currentTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
    }


    @Override
    public void tweak(double addSpeed) {
        double newTemperature = currentTemperature + addSpeed / 100 * temperatureIncreasePer100MHz;
        if (checkTemperature(newTemperature)) {
            currentTemperature = newTemperature;
            speed += addSpeed;
        } else {
            System.out.println("Nie można podkręcić pamięci RAM ze względu na ryzyko przegrzania!");
        }
    }

    private boolean checkTemperature(double temperature) {
        return temperature <= maxSafeTemperature;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "amount=" + amount +
                ", speed=" + speed +
                ", currentTemperature=" + currentTemperature +
                ", maxSafeTemperature=" + maxSafeTemperature +
                '}';
    }
}
