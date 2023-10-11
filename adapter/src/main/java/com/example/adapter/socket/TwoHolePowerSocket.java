package com.example.adapter.socket;

import com.example.adapter.plug.TwoHolePlug;

public class TwoHolePowerSocket implements TwoHoleSocket<TwoHolePlug> {

    @Override
    public void accept(TwoHolePlug plug) {
        System.out.println("插入了" + plug + "孔插座");
    }
}
