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
 * Renamed from net.ahI
 */
public class ahi_1
extends ahp_2<ahw_1> {
    private int j;
    private String a;
    private String i = kr_0.a;
    private float h;
    private Vec2d k;
    private Vec2d g;

    public ahi_1(ahw_1 ahw_12, String string, int n) {
        super(ahw_12);
        this.a = string;
        this.j = n;
    }

    @Override
    public void a(char c, int n) {
        block6: {
            block7: {
                ahx_1.b();
                if (!this.b()) break block6;
                if (n != 14) break block7;
                if (StringInvoker.c(this.i) == 0) break block6;
                this.i = StringInvoker.b(this.i, 0, StringInvoker.c(this.i) - 1);
            }
            if (n == 1 || n == 28) {
                this.a(false);
            }
            if (n != 14 && n != 219 && n != 157 && n != 29 && n != 54 && n != 42 && n != 15 && n != 58 && n != 211 && n != 199 && n != 210 && n != 200 && n != 208 && n != 205 && n != 203 && n != 56 && n != 184 && n != 197 && n != 70 && n != 207 && n != 201 && n != 209 && n != 221 && n != 59 && n != 60 && n != 61 && n != 62 && n != 63 && n != 64 && n != 65 && n != 66 && n != 67 && n != 68 && n != 87 && n != 88) {
                this.i = aL0.a(aL0.a(new StringBuilder(), this.i), c).toString();
                StringBuilder stringBuilder = new StringBuilder();
                Iterator iterator = ListInvoker.iterator(this.a(adj_1.a(ng_0.a, 20), this.i));
                if (dz_0.c(iterator)) {
                    String string = (String)dz_0.b(iterator);
                    aL0.a(stringBuilder, string);
                }
                this.i = stringBuilder.toString();
            }
        }
    }

    public List<String> a(FontRenderer fontRenderer, String string) {
        ahx_1.b();
        ArrayList arrayList = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder();
        float f = 0.0f;
        char[] cArray = StringInvoker.f(string);
        int n = cArray.length;
        int n2 = 0;
        if (n2 < n) {
            char c = cArray[n2];
            StringBuilder stringBuilder2 = new StringBuilder();
            if ((double)(f + (float)a7l_0.a(fontRenderer, aL0.a(aL0.a(stringBuilder2, c), kr_0.b).toString())) >= this.k.x - 25.0) {
                ListInvoker.add(arrayList, aL0.a(aL0.a(new StringBuilder(), stringBuilder.toString()), c).toString());
                stringBuilder = new StringBuilder(c);
                f = 0.0f;
            }
            aL0.a(stringBuilder, c);
            f += (float)a7l_0.a(fontRenderer, aL0.a(aL0.a(new StringBuilder(), c), kr_0.c).toString());
            ++n2;
        }
        if (!StringInvoker.g(stringBuilder.toString())) {
            ListInvoker.add(arrayList, stringBuilder.toString());
        }
        return ListInvoker.subList(arrayList, 0, MathInvoker.b(this.j, MathInvoker.max(0, ListInvoker.size(arrayList))));
    }

    @Override
    public void a(int n, int n2, int n3) {
        block5: {
            block4: {
                ahx_1.b();
                if (this.b()) break block4;
                if (!this.a(n, n2) || n3 != 0) break block5;
                this.a(!this.b());
            }
            if (n3 == 0) {
                this.a(false);
            }
        }
    }

    public void b(Vec2d vec2d) {
        this.g = vec2d;
    }

    @Override
    public void a(int n, int n2) {
    }

    public void a(Vec2d vec2d) {
        this.k = vec2d;
    }

    public boolean a(int n, int n2) {
        ahx_1.b();
        return (double)n > this.g.x && (double)n < this.g.x + this.k.x && (double)n2 > this.g.y + 18.0 && (double)n2 < this.g.y + 18.0 + this.k.y;
    }

    @Override
    public void b(int n, int n2) {
        ahx_1.b();
        if (this.a(n, n2) || this.b()) {
            this.h += (1.0f - this.h) * 0.04f;
            ListInvoker.b(new ListInvoker[1]);
        }
        this.h -= this.h * 0.04f;
        aV3.a(aV3.a(), this.g.x, this.g.y + 18.0, this.k.x, this.k.y, 6.0, 2.0, new Color(a1V.a(new Color(26, 26, 26), new Color(20, 20, 20), (double)this.h)), avf_2.e((AltList)((ahv_2)((ahw_1)this.c()).c()).c()), true);
    }

    @Override
    public void c(int n, int n2) {
        ahx_1.b();
        a7l_0.b(adj_1.a(ob_0.a, 25), this.a, this.g.x, this.g.y, -1, true);
        FontRenderer fontRenderer = adj_1.a(ng_0.a, 20);
        double d = this.g.y + 22.0;
        Iterator iterator = ListInvoker.iterator(this.a(fontRenderer, this.i));
        if (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            a7l_0.b(fontRenderer, string, this.g.x + 3.0, d, aol_1.b(new Color(200, 200, 200)), true);
            d += 15.0;
        }
    }

    public String b() {
        return this.i;
    }

    public void a(String string) {
        this.i = string;
    }

    public Vec2d a() {
        return this.g;
    }

    @Override
    public Vec2d c() {
        return this.k;
    }
}

