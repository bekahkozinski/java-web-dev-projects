package org.launchcode;

public class CD extends BaseDisc {
    public CD(String name, int storageCapacity, String discType, String discContents) {
        super(name, storageCapacity, discType, discContents);
    }

    @Override
    public void spinDisc() {
        System.out.println("The " + getName() + " CD is spinning!");
    }

    @Override
    public void writeData() {
        System.out.println("The data is being written for the DVD!");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
