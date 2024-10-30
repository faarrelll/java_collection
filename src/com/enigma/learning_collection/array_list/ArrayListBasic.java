package com.enigma.learning_collection.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListBasic {
    public static void main(String[] args) {
        // array fixed size
        String[] names = new String[2];
        names[0] = "Ujang";
        names[1] = "Udin";
//        names.length
//        names[2] = "Samsul";

        // array list dynamic size
//        ArrayList<String> nameList = new ArrayList<String>();
        List<String> nameList = new ArrayList<>();
        nameList.add("Odin");
        nameList.add("Odin");
        nameList.add("Odin");
        nameList.addAll(List.of("Udin", "Udin"));
        nameList.add("Samsul");
        System.out.println("nameList " + nameList);
        nameList.remove("Odin");

        System.out.println("nameList " + nameList);
        nameList.removeAll(Collections.singleton("Odin"));
        nameList.removeAll(List.of("Odin"));
        System.out.println("nameList " + nameList);
        System.out.println("nameList.indexOf(Samsul) " + nameList.indexOf("Samsul"));
        System.out.println("check apakah samsul ada di nameList " + nameList.contains("Samsul"));
        System.out.println("jumlah element di nameList: " + nameList.size());

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
//        numberList.add(Integer.valueOf(1));

        // =========
        String[] colors = {"red", "green", "blue"};

        List<String> colorList = new ArrayList<>(List.of(colors));
        colorList.add("yellow");
        System.out.println(colorList);

        List<String> colorList2 = new ArrayList<>(Arrays.asList(colors));
        colorList2.add("yellow");
        System.out.println("colorList2" + colorList2);

//        List<String> colorList4 = Arrays.asList(colors);
//        colorList4.add("yellow");
//        System.out.println("colorList4" + colorList4);

//        List<String> colorList3 = List.of(colors); // imutable artinya gak bisa diubah atau ditambah
//        colorList3.add("yellow");
//        System.out.println(colorList3);


        String[] colorArray = colorList2.toArray(new String[colorList2.size()]);
        System.out.println(Arrays.toString(colorArray));

    }
}
