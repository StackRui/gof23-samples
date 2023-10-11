package com.example.adapter.socket;

import com.example.adapter.plug.ThreeHolePlug;

public class ThreeHolePowerSocket implements ThreeHoleSocket<ThreeHolePlug> {

    @Override
    public void accept(ThreeHolePlug plug) {
        System.out.println("三孔插座,接到了" + plug.holeNum() + "孔插头");
    }
}
