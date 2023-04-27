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
import net.a5X;
import net.a6r_0;
import net.aL0;
import net.aRJ;
import net.atF;
import net.auk_2;
import net.hp_2;
import net.hv_0;
import net.mp_0;
import net.xu_0;

/*
 * Renamed from net.a6g
 */
class a6g_0
extends a6r_0 {
    atF b;

    a6g_0(atF atF2) {
        this.b = atF2;
    }

    @Override
    protected aRJ a(IBlockState iBlockState) {
        LinkedHashMap linkedHashMap = MapsInvoker.b((Map)BlockStateInvoker.b(iBlockState));
        String string = xu_0.a(hv_0.R, (mp_0)MapInvoker.a((Map)linkedHashMap, hv_0.R));
        MapInvoker.a((Map)linkedHashMap, hp_2.R);
        String string2 = auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, hv_0.Q)) ? a5X.a : a5X.c;
        return new aRJ(aL0.a(aL0.a(new StringBuilder(), string), a5X.b).toString(), string2);
    }
}

