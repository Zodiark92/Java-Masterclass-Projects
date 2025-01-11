public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex) {
        this(100, duplex);
    }

    public Printer(int tonerLevel, boolean duplex) {
        //correction
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
      // this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(this.tonerLevel + tonerAmount > 100){
            return -1;
        }
        this.tonerLevel += tonerAmount;
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToAdd = pages;
        if(this.duplex){
            pagesToAdd = (pages / 2) + (pages % 2);
            System.out.println("pages printed in duplex mode");
        }
        this.pagesPrinted += pagesToAdd;
        return pagesToAdd;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
