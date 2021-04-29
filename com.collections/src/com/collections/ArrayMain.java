package com.collections;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {

        int[] ids = new int[10];
        System.out.println(ids[0]);

        String[] instruments = new String[]{"guitar", "drums", "bass"};
        System.out.println(instruments.length);
        System.out.println(instruments[0]);

        for (int i = 0; i < ids.length; i++) {
            ids[i] = i * i;
            System.out.println(ids[i]);
        }

        for (String instrument:instruments) {
            System.out.println(instrument);
        }

        Arrays.sort(instruments);
        System.out.println(Arrays.toString(instruments));
        for (String instrument:instruments
             ) {
            System.out.println(instrument);
        }

        int[] fibArray = new int[]{0, 1, 5, 2, 3, 1, 8, 13};
        Arrays.sort(fibArray);
        System.out.println(Arrays.binarySearch(fibArray, 3));

        int[][] multiArray = new int[3][3];
        String[][] multiArray2 = new String[3][10];

        String[][] westCoastCitys = new String[][]{
                {"LA", "San Francisco", "San Diego"},
                {"Seattle", "Tacoma"},
                {"Portland"},
        };
        for (int i = 0; i < westCoastCitys.length; i++) {
            for (int j = 0; j < westCoastCitys[i].length; j++) {
                System.out.println(westCoastCitys[i][j]);
            }
        }

        for (String[] row:westCoastCitys) {
            for (String city:row) {
                System.out.println(city);
            }
        }
    }


}
