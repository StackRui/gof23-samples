package com.example.adapter;

import com.example.adapter.plug.ThreeHolePlug;
import com.example.adapter.plug.TwoHolePlug;
import com.example.adapter.socket.ThreeHolePowerSocket;
import com.example.adapter.socket.TwoHoleSocket;

public class TwoToThreeAdapter extends ThreeHolePowerSocket implements TwoHoleSocket<TwoHolePlug> {
    @Override
    public void accept(TwoHolePlug twoHolePlug) {
        System.out.println("2转3适配器,接到了" + twoHolePlug.holeNum() + "孔插头");
        System.out.println("2孔插头转换为3孔插头");
        this.accept(new ThreeHolePlug());
    }
}
