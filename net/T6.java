/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.SoundHandler;
import net.Ti;
import net.aag_1;
import net.aif_0;
import net.ajZ;
import net.atL;
import net.qz_2;


class T6
implements qz_2<atL> {
    SoundHandler b;
    String a;
    ResourceLocation c;
    Ti d;

    public atL a() {
        ajZ cfr_ignored_0 = (ajZ)aif_0.a(SoundHandler.a(this.b), this.c);
        return SoundHandler.f;
    }

    T6(SoundHandler soundHandler, String string, Ti ti) {
        this.b = soundHandler;
        this.a = string;
        this.d = ti;
        this.c = new ResourceLocation(this.a, aag_1.a(this.d));
    }

    @Override
    public int a() {
        ajZ cfr_ignored_0 = (ajZ)aif_0.a(SoundHandler.a(this.b), this.c);
        return 0;
    }
}

