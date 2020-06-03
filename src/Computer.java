class Computer {
    private String name;
    private Processor processor;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer(String name, Processor processor, Memory memory, HardDrive hardDrive) {
        this.name = name;
        this.processor = processor;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ",\n processor=" + processor +
                ",\n memory=" + memory +
                ",\n hardDrive=" + hardDrive +
                '}';
    }
}
