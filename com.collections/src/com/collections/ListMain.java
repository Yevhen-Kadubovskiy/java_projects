package com.collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListMain {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(arrayList);

        ArrayList<String> colors = new ArrayList<String>();
        List arrayList3 = new ArrayList();
        Collection arrayList4 = new ArrayList();

        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add(1, "orange");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        colors.remove("orange");

        for (String color:colors) {
            System.out.println(color);
        }

        colors.remove(0);

        colors.forEach(System.out::println);

        colors.remove(0);

        colors.forEach(color -> {
            System.out.println(color);
        });

        Object[] colorObject = colors.toArray();
        String[] colorString = colors.toArray(new String[0]);

        String[] shapes = new String[]{"square", "circle", "triangle"};
        List shapeList = Arrays.asList(shapes);
        System.out.println(shapeList);
        System.out.println(shapeList.getClass().getName());
        System.out.println(colors.getClass().getName());

        LinkedList<String> orders = new LinkedList<>();
        orders.add("order 1");
        orders.add("order 2");
        orders.add("order 3");
        System.out.println(orders);
        orders.addFirst("order 4");
        orders.addLast("order 5");
        System.out.println(orders);
        orders.removeFirst();
        orders.removeLast();
        System.out.println(orders);

        List numberList = new ArrayList();
        numberList.add(10);
        numberList.add(5);
        numberList.add(1);
        numberList.add(3);
        numberList.add(9);

        System.out.println(numberList);
        Collections.sort(numberList);
        System.out.println(numberList);

        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Everest", 8848));
        mountains.add(new Mountain("Matterhorn", 4478));
        mountains.add(new Mountain("K2", 8611));

        Collections.sort(mountains);
        System.out.println(mountains.stream()
                    .map(Mountain::getName).collect(Collectors.toList()));

        Comparator<Mountain> mountainComparator = (o1, o2) -> o1.getHeight() - o2.getHeight();

        Collections.sort(mountains, mountainComparator);
        System.out.println(mountains.stream()
                .map(Mountain::getName).collect(Collectors.toList()));

        Comparator<Mountain> mountainComparator1 = (m1, m2) -> m2.getHeight() - m1.getHeight();

        Collections.sort(mountains, mountainComparator1);
        System.out.println(mountains.stream()
                .map(Mountain::getName).collect(Collectors.toList()));

    }
}
