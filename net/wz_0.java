/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import net.bd_0;
import net.el_0;
import net.xz_2;

/*
 * Renamed from net.Wz
 */
class wz_0
implements xz_2<Object> {
    bd_0 a;

    wz_0(bd_0 bd_02) {
        this.a = bd_02;
    }

    @Override
    public Packet getPacket() {
        return bd_0.a(this.a);
    }

    @Override
    public String getName() {
        return el_0.a;
    }
}

