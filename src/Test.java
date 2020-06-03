class Test {
    public static void main(String[] args) {
        Processor processor = new Processor("Super Procesor", "ABC", "AX543", 2400, 90, 130);
        Memory memory = new Memory("Szybka pamięć", "XYZ", "1234LKS-100", 4096, 1000, 50, 80);
        HardDrive hardDrive = new HardDrive("Pojemny dysk", "DriveX", "WDD-2123-XL", 50000);
        Computer computer = new Computer("The Best", processor, memory, hardDrive);

        System.out.println(computer);
        computer.getProcessor().tweak(80);
        computer.getMemory().tweak(220);
        System.out.println(computer);
    }
}
