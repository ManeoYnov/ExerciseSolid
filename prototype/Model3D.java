package org.example.creational.tp.prototype;

import jdk.internal.icu.text.NormalizerBase;

public class Model3D implements ModelPrototype {

    public String name;
    public int size;
    public String color;
    public String texture;

    public Model3D(String name, int size, String color, String texture) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.texture = texture;
    }


    @Override
    public ModelPrototype clone() {
        return new Model3D(name, size, color, texture);
    }
}
