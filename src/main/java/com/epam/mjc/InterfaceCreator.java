package com.epam.mjc;

import java.util.*;
import java.util.stream.*;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> list = new ArrayList<>();
            for (Integer num: arg) {
                list.add(num / divider);
            }
            return list;
        };
    }
}
