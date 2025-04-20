package org.arkadipta.autowire.usingannotetions;

public class Laptop {
    private String brand;
    private String modelName;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
