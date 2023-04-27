/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.TextureManagerInvoker;
import deobf.IChatComponent;
import deobf.MCInvoker;
import net.ChatComponentText;
import net.adc_1;
import net.aee_2;
import net.ans_0;
import net.dp_1;
import net.se_2;
import net.sg_0;
import net.wh_1;

/*
 * Renamed from net.atr
 */
class atr_0
implements dp_1 {
    @Override
    public IChatComponent b() {
        return new ChatComponentText(se_2.a);
    }

    private atr_0() {
    }

    atr_0(adc_1 adc_12) {
        this();
    }

    @Override
    public void a(float f, int n) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), sg_0.i);
        wh_1.a(0, 0, 128.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(aee_2 aee_22) {
        ans_0.c(aee_22);
    }
}

