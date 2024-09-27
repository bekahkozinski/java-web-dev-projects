package org.launchcode;

public class Main {
    public static void main(String[] args) {

        CD myCD1 = new CD ("A Fever You Can't Sweat Out", 300, "CD", "Music");
        CD myCD2 = new CD ("Spirit Stallion of the Cimmaron", 500, "CD", "Soundtrack");
        DVD myDVD1 = new DVD ("Ice Age", 2000, "DVD", "movie");
        DVD myDVD2 = new DVD ("Super Mario Bros Movie", 1000, "DVD", "movie");
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD1.whatIsIt();
        myCD2.spinDisc();
        myDVD1.writeData();
    }
}