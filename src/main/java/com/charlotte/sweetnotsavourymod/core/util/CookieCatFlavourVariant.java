package com.charlotte.sweetnotsavourymod.core.util;

import java.util.Arrays;
import java.util.Comparator;

public enum CookieCatFlavourVariant {
    CHOCOLATE(0);




    private static final CookieCatFlavourVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CookieCatFlavourVariant::getId)).toArray(CookieCatFlavourVariant[]::new);
    private final int id;

    private CookieCatFlavourVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static CookieCatFlavourVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
