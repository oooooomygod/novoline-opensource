/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import net.ads_1;
import net.wo_0;

/*
 * Renamed from net.adM
 */
public class adm_1
extends ads_1 {
    @Override
    public void a(String string, wo_0 wo_02) {
        MapInvoker.c(this.b, string, wo_02);
    }

    @Override
    public void a() {
    }

    @Override
    public wo_0 a(Class<? extends wo_0> clazz, String string) {
        return (wo_0)MapInvoker.c(this.b, string);
    }

    public adm_1() {
        super(null);
    }

    @Override
    public int a(String string) {
        return 0;
    }
}

