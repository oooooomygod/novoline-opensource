/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.MouseInvoker;

public class MouseHelper {
    public int b;
    public int a;

    public void c() {
        MouseInvoker.a(DisplayInvoker.getWidth() / 2, DisplayInvoker.getHeight() / 2);
        MouseInvoker.a(false);
    }

    public void a() {
        this.b = MouseInvoker.o();
        this.a = MouseInvoker.n();
    }

    public void b() {
        MouseInvoker.a(true);
        this.b = 0;
        this.a = 0;
    }
}

