/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.world.GameType;
import java.util.Comparator;

class aI1
implements Comparator<NetworkPlayerInfo> {
    private aI1() {
    }

    public int a(NetworkPlayerInfo networkPlayerInfo, NetworkPlayerInfo networkPlayerInfo2) {
        a35 a352 = aNL.h(networkPlayerInfo);
        a35 a353 = aNL.h(networkPlayerInfo2);
        return v9_0.a(v9_0.a(v9_0.a(v9_0.a(v9_0.a(), aNL.c(networkPlayerInfo) != GameType.SPECTATOR, aNL.c(networkPlayerInfo2) != GameType.SPECTATOR), (Comparable)((Object)sd_1.h(a352)), (Comparable)((Object)sd_1.h(a353))), (Comparable)((Object)a4Z.d(aNL.a(networkPlayerInfo))), (Comparable)((Object)a4Z.d(aNL.a(networkPlayerInfo2)))));
    }

    aI1(NU nU) {
        this();
    }
}

