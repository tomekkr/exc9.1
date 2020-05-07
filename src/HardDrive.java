class HardDrive extends Component {
    private int capacity;

    public HardDrive(String name, String producer, String serialNumber, int capacity) {
        super(name, producer, serialNumber);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "capacity=" + capacity +
                '}';
    }
}

