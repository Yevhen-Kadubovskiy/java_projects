package com.collections;

public class Widget<T> {
    public static void main(String[] args) {

        Widget<String> widget = new Widget<>();
        widget.setType("Hello");

        String[] strings = new String[]{"Hi", "There", "World"};
        System.out.println(Widget.firstArrayElement(strings));
    }

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static <T> T firstArrayElement(T[] t){
        if (t.length > 0){
            return t[0];
        }
        return null;
    }
}
