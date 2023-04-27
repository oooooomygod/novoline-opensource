/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.javafx.geom.Vec2d
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import com.sun.javafx.geom.Vec2d;
import cc.novoline.gui.alt.AltList;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aha
 */
public class aha_2
extends ahp_2<ahv_1> {
    private Vec2d j;
    private int g;
    private String k;
    private Vec2d i;
    private String h = aua_0.b;
    private float a;

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public void b(int n, int n2) {
        ah2_0.a();
        if (this.a(n, n2) || this.b()) {
            this.a += (1.0f - this.a) * 0.04f;
            ListInvoker.b(new ListInvoker[4]);
        }
        this.a -= this.a * 0.04f;
        aV3.a(aV3.a(), this.j.x, this.j.y + 18.0, this.i.x, this.i.y, 6.0, 2.0, new Color(a1V.a(new Color(26, 26, 26), new Color(20, 20, 20), (double)this.a)), avf_2.e((AltList)((ahv_2)((ahu_2)((ahv_1)this.c()).c()).c()).c()), true);
    }

    @Override
    public void a(int n, int n2, int n3) {
        block5: {
            block4: {
                ah2_0.d();
                if (this.b()) break block4;
                if (!this.a(n, n2) || n3 != 0) break block5;
                this.a(!this.b());
            }
            if (n3 == 0) {
                this.a(false);
            }
        }
    }

    public void a(String string) {
        this.h = string;
    }

    public void b(Vec2d vec2d) {
        this.j = vec2d;
    }

    public String b() {
        return this.h;
    }

    public aha_2(ahv_1 ahv_12, String string, int n) {
        super(ahv_12);
        this.k = string;
        this.g = n;
    }

    public boolean a(int n, int n2) {
        ah2_0.a();
        return (double)n > this.j.x && (double)n < this.j.x + this.i.x && (double)n2 > this.j.y + 18.0 && (double)n2 < this.j.y + 18.0 + this.i.y;
    }

    @Override
    public Vec2d c() {
        return this.j;
    }

    @Override
    public void c(int n, int n2) {
        ah2_0.a();
        a7l_0.b(adj_1.a(ob_0.a, 25), this.k, this.j.x, this.j.y, -1, true);
        FontRenderer fontRenderer = adj_1.a(ng_0.a, 20);
        double d = this.j.y + 22.0;
        Iterator iterator = ListInvoker.iterator(this.a(fontRenderer, this.h));
        if (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            a7l_0.b(fontRenderer, string, this.j.x + 3.0, d, aol_1.b(new Color(200, 200, 200)), true);
            d += 15.0;
        }
    }

    @Override
    public void a(char c, int n) {
        block6: {
            block7: {
                ah2_0.d();
                if (!this.b()) break block6;
                if (n != 14) break block7;
                if (StringInvoker.c(this.h) == 0) break block6;
                this.h = StringInvoker.b(this.h, 0, StringInvoker.c(this.h) - 1);
            }
            if (n == 1 || n == 28) {
                this.a(false);
            }
            if (n != 14 && n != 219 && n != 157 && n != 29 && n != 54 && n != 42 && n != 15 && n != 58 && n != 211 && n != 199 && n != 210 && n != 200 && n != 208 && n != 205 && n != 203 && n != 56 && n != 184 && n != 197 && n != 70 && n != 207 && n != 201 && n != 209 && n != 221 && n != 59 && n != 60 && n != 61 && n != 62 && n != 63 && n != 64 && n != 65 && n != 66 && n != 67 && n != 68 && n != 87 && n != 88) {
                this.h = aL0.a(aL0.a(new StringBuilder(), this.h), c).toString();
                StringBuilder stringBuilder = new StringBuilder();
                Iterator iterator = ListInvoker.iterator(this.a(adj_1.a(ng_0.a, 20), this.h));
                if (dz_0.c(iterator)) {
                    String string = (String)dz_0.b(iterator);
                    aL0.a(stringBuilder, string);
                }
                this.h = stringBuilder.toString();
            }
        }
    }

    public List<String> a(FontRenderer fontRenderer, String string) {
        ArrayList arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        float f = 0.0f;
        ah2_0.a();
        char[] cArray = StringInvoker.f(string);
        int n = cArray.length;
        int n2 = 0;
        if (n2 < n) {
            char c = cArray[n2];
            StringBuilder stringBuilder2 = new StringBuilder();
            if ((double)(f + (float)a7l_0.a(fontRenderer, aL0.a(aL0.a(stringBuilder2, c), aua_0.c).toString())) >= this.i.x - 25.0) {
                ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), stringBuilder.toString()), c).toString());
                stringBuilder = new StringBuilder(c);
                f = 0.0f;
            }
            aL0.a(stringBuilder, c);
            f += (float)a7l_0.a(fontRenderer, aL0.a(aL0.a(new StringBuilder(), c), aua_0.a).toString());
            ++n2;
        }
        if (!StringInvoker.g(stringBuilder.toString())) {
            ListInvoker.add(arrayList, stringBuilder.toString());
        }
        return ListInvoker.subList(arrayList, 0, MathInvoker.b(this.g, MathInvoker.max(0, ListInvoker.size(arrayList))));
    }

    public void a(Vec2d vec2d) {
        this.i = vec2d;
    }

    public Vec2d a() {
        return this.i;
    }
}

