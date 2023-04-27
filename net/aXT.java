/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.TextureManagerInvoker;
import deobf.IChatComponent;
import deobf.MCInvoker;
import net.ChatComponentText;
import net.aYR;
import net.aee_2;
import net.dp_1;
import net.sg_0;
import net.wh_1;

class aXT
implements dp_1 {
    private int b;
    private boolean a;

    @Override
    public boolean a() {
        return this.a;
    }

    @Override
    public void a(aee_2 aee_22) {
        aee_2.a(aee_22, this.b);
    }

    @Override
    public void a(float f, int n) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), sg_0.i);
        if (this.b < 0) {
            wh_1.a(0, 0, 144.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        } else {
            wh_1.a(0, 0, 160.0f, 0.0f, 16, 16, 256.0f, 256.0f);
        }
    }

    public aXT(int n, boolean bl) {
        this.b = n;
        this.a = bl;
    }

    @Override
    public IChatComponent b() {
        return this.b < 0 ? new ChatComponentText(aYR.b) : new ChatComponentText(aYR.a);
    }
}

