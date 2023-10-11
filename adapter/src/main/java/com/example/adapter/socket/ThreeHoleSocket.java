package com.example.adapter.socket;

import com.example.adapter.plug.ThreeHolePlug;

public interface ThreeHoleSocket<T extends ThreeHolePlug> {
    void accept(T ThreeHolePlug);
}
