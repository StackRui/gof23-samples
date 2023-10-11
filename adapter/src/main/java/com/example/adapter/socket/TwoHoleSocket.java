package com.example.adapter.socket;

import com.example.adapter.plug.TwoHolePlug;

public interface TwoHoleSocket<T extends TwoHolePlug> {
    void accept(T TwoHolePlug);
}
