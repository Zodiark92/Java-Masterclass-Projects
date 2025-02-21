package dev.lpa;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("Name: %s%nPrice: %.2f%nQuantity: %d%n%n", type, price, quantity);
    }

    public abstract void showDetails();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

class Monitor extends ProductForSale {

    public Monitor(String type, double price) {
        super(type, price);
        this.description = "TEMPEST High Definition 24-inch Monitor";
    }

    @Override
    public void showDetails() {
        System.out.println("Type:" + type);
        System.out.println("Description: " + description);
        System.out.println("From professional work at the offices or personal use at home. CIS Secure enhances the full featured Neovo LW-24G to make it TEMPEST Level One compliant with two-strand LC Fiber video input. The DTD-LED24-08-L1 is the newest addition to CIS’s line up for TEMPEST 24-inch desktop monitors");
        System.out.println("Price: " + price + "\n");
    }

}

class Case extends ProductForSale {

    public Case(String type, double price) {
        super(type, price);
        this.description = "Corsair CORSAIR 6500X RGB Mid Tower";
    }

    @Override
    public void showDetails() {
        System.out.println("Type:" + type);
        System.out.println("Description: " + description);
        System.out.println("The CORSAIR iCUE 6500X RGB system cabinet is designed for enthusiasts seeking a blend of style and functionality. This mid-tower chassis features a sophisticated dual chamber layout, tempered-glass panels on the front and side, and vibrant RGB fans, all controlled by the CORSAIR iCUE RGB software. It supports a wide range of cooling options, including space for multiple 120 mm or 140 mm fans and radiators up to 360 mm, ensuring your components stay cool under load. The 6500X RGB also offers ample room for high-end components, with support for CPU coolers up to 190 mm, power supplies up to 225 mm, and video cards up to 400 mm in length. Connectivity is no issue, thanks to the inclusion of a USB-C 3.2 Gen 2 port, four USB 3.2 Gen 1 ports, and a headphone/microphone jack on the front panel. Whether you're a gamer, content creator, or PC enthusiast, the CORSAIR iCUE 6500X RGB offers the features and flexibility to build your dream system.");
        System.out.println("Price: " + price + "\n");
    }

}

class Notebook extends ProductForSale {

    public Notebook(String type, double price) {
        super(type, price);
        this.description = "Legion Pro 7 16IRX9H";
    }

    @Override
    public void showDetails() {
        System.out.println("Type:" + type);
        System.out.println("Description: " + description);
        System.out.println("Intel® Core™ processors boast a newly optimized hybrid architecture and industry-leading technology that take gaming and creativity to the next level. With Intel, anything is possible. In games and real life, Intel empowers you to express yourself to advance toward new successes.");
        System.out.println("Price: " + price + "\n");
    }

}

