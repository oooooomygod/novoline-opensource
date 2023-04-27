/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.LinkedHashMap;
import java.util.Map;
import net.IBlockState;
import net.a6r_0;
import net.aAB;
import net.aL0;
import net.aRJ;
import net.atF;
import net.auk_2;
import net.hp_2;
import net.kz_2;
import net.xu_0;

class a6I
extends a6r_0 {
    atF b;

    @Override
    protected aRJ a(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = MapsInvoker.b((Map)BlockStateInvoker.b(iBlockState));
        String string = xu_0.a(hp_2.Q, (aAB)MapInvoker.a((Map)linkedHashMap, hp_2.Q));
        MapInvoker.a((Map)linkedHashMap, hp_2.R);
        String string2 = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, hp_2.R)) ? kz_2.a : kz_2.c;
        return new aRJ(aL0.a(aL0.a(new StringBuilder(), string), kz_2.b).toString(), string2);
    }

    a6I(atF atF2) {
        this.b = atF2;
    }
}

