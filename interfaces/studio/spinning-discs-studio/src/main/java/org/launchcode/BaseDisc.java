package org.launchcode;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private String discType;
    private String discContents;

    public BaseDisc(String name, int storageCapacity, String discType, String discContents) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.discContents = discContents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getDiscContents() {
        return discContents;
    }

    public void setDiscContents(String discContents) {
        this.discContents = discContents;
    }

    public void whatIsIt() {
        System.out.println("This " + discType + " is " + name + "!" + "\n It has a storage capacity of " + storageCapacity + ".");
    }

    public abstract void spinDisc();

    public abstract void writeData();
}
