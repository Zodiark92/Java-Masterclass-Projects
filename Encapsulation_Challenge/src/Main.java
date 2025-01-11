public class Main {
    public static void main(String[] args) {

        System.out.println("Standard Printer");

        Printer standardPrinter = new Printer(80, false);

        addTonerToPrinter(standardPrinter, 10);
        addTonerToPrinter(standardPrinter, 30);
        addTonerToPrinter(standardPrinter, 10);

        System.out.println("Printed: " + standardPrinter.printPages(8));
        System.out.println("Printed: " + standardPrinter.printPages(9));

        System.out.printf("Total pages printed: %d %n", standardPrinter.getPagesPrinted());

        System.out.println("Duplex Printer");

        Printer duplexPrinter = new Printer(true);
        addTonerToPrinter(duplexPrinter, 10);

        System.out.println("Printed: " + duplexPrinter.printPages(4));
        System.out.println("Printed: " + duplexPrinter.printPages(7));

        System.out.printf("Total pages printed: %d %n", duplexPrinter.getPagesPrinted());
    }

    public static void addTonerToPrinter(Printer printer, int amount){
        if(printer.addToner(amount) > 0){
            System.out.printf("Added %d%nToner value: %d %n", amount, printer.getTonerLevel());
        } else {
            System.out.println("The toner level cannot get over 100");
        }
    }

}