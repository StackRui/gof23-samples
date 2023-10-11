package com.example;

import com.example.adapter.TwoToThreeAdapter;
import com.example.adapter.plug.TwoHolePlug;

public class Main {
    public static void main(String[] args) {
        System.out.println("向2转3适配器插入二孔插头");
        new TwoToThreeAdapter().accept(new TwoHolePlug());
    }
}
