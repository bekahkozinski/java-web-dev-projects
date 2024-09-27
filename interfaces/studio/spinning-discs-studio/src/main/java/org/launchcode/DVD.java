package org.launchcode;

public class DVD extends BaseDisc implements Rewritable {
    public DVD(String name, int storageCapacity, String discType, String discContents) {
        super(name, storageCapacity, discType, discContents);
    }

    // TODO: Implement your custom interface.
    @Override
    public void spinDisc() {
        System.out.println("The DVD is spinning!");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to DVD disc!");
    }


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
