public class PersonalComputer extends Product {
    private Motherboard motherboard;
    private Monitor monitor;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer,
                            Motherboard motherboard, Monitor monitor, ComputerCase computerCase) {
        super(model, manufacturer);
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.computerCase = computerCase;
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
}
