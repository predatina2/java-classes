package com.example.hadlak.house;

public class Furniture {

    private String name;
    private String material;
    private String style;

    public Furniture(String name, String material, String style) {
        this.name = name;
        this.material = material;
        this.style = style;
    }

    public Furniture(String name, String material) {
        this(name, material, "standard");
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }
}
