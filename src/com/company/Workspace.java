package com.company;


import com.thoughtworks.xstream.converters.basic.StringBufferConverter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class Workspace implements Serializable {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add(new String("This is a string"));

        addList(list);
        System.out.println();
    }

    private static void addList(List list) {

        list.add(new Integer(4));
    }


}

