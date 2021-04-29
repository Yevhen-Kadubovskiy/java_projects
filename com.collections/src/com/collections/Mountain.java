package com.collections;

public class Mountain implements Comparable<Mountain> {
    private String name;

    @Override
    public int compareTo(Mountain o) {
        return o.height - this.height;
    }

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;
}
