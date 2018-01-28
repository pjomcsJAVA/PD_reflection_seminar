package com.pt;

import isec.pd.Local;

public class LocalClass implements Local {

    public void start(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(i);
        }
    }
}
