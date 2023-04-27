/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

public class aHO
implements avh_2 {
    private Minecraft a = MCInvoker.f();

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        return false;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        String string;
        int n8 = n3 + n5 / 2 - FontRendererInvoker.d(this.a.fontRendererObj) / 2;
        FontRendererInvoker.a(this.a.fontRendererObj, I18n.format(aH8.c, new Object[0]), this.a.currentScreen.n / 2 - FontRendererInvoker.a(this.a.fontRendererObj, I18n.format(aH8.d, new Object[0])) / 2, n8, 0xFFFFFF);
        switch ((int)(MCInvoker.a() / 300L % 4L)) {
            default: {
                string = aH8.a;
                break;
            }
            case 1: 
            case 3: {
                string = aH8.e;
                break;
            }
            case 2: {
                string = aH8.b;
            }
        }
        FontRendererInvoker.a(this.a.fontRendererObj, string, this.a.currentScreen.n / 2 - FontRendererInvoker.a(this.a.fontRendererObj, string) / 2, n8 + FontRendererInvoker.d(this.a.fontRendererObj), 0x808080);
    }
}

