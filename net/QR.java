/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.client.Minecraft;

public class QR<T>
extends qa_0 {
    protected CopyOnWriteArrayList<ko_0<T>> o = new CopyOnWriteArrayList();
    protected FontRenderer n;
    protected List<ko_0<T>> p = asg_0.b(this.o);
    protected Supplier<T> q;

    protected void b() {
        int n = a7l_0.a(this.n) + 4;
        HZ.b();
        int n2 = this.g + 4;
        Object object = JM.a(this.q);
        Iterator iterator = HU.a(this.o);
        if (dz_0.c(iterator)) {
            ko_0 ko_02 = (ko_0)dz_0.b(iterator);
            String string = D9.a(ko_02, object);
            if (ko_02 instanceof HP) {
                // empty if block
            }
            a7l_0.a(this.n, (CharSequence)string, this.j + 6, this.g + (n2 += n), aol_1.b(new Color(198, 198, 198)));
        }
    }

    protected void b(Minecraft minecraft, int n, int n2) {
        super.a(minecraft, n, n2);
    }

    public List<ko_0<T>> a() {
        return this.p;
    }

    public QR(String string, int n, int n2, int n3, int n4, int n5, Supplier<T> supplier, FontRenderer fontRenderer) {
        super(string, n, n2, n3, n4, n5);
        this.q = supplier;
        this.n = fontRenderer;
    }

    @Override
    public void a(Minecraft minecraft, int n, int n2) {
        super.a(minecraft, n, n2);
        this.b();
    }

    public void b(Function<T, String> function) {
        HU.a(this.o, HZ.a(function));
    }

    public void a(Function<T, String> function) {
        HU.a(this.o, HP.a(function));
    }

    public QR(String string, int n, int n2, int n3, int n4, int n5, Supplier<T> supplier, FontRenderer fontRenderer, FontRenderer fontRenderer2) {
        super(string, n, n2, n3, n4, n5, fontRenderer2);
        this.q = supplier;
        this.n = fontRenderer;
    }

    public QR(String string, int n, int n2, int n3, int n4, int n5, Supplier<T> supplier) {
        super(string, n, n2, n3, n4, n5);
        this.q = supplier;
        this.n = adj_1.a(VX.a, 28);
    }

    public FontRenderer c() {
        return this.n;
    }

    public void a(String string) {
        HU.a(this.o, td_2.a(string));
    }
}

