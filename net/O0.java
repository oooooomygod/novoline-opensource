/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.ITextureObject;
import java.nio.ByteBuffer;
import java.util.Properties;
import net.N4;
import net.ResourceLocation;
import net.TB;
import net.a8q_0;
import net.aH3;
import net.aL0;
import net.aP2;
import net.amw_1;
import net.dk_1;
import net.ys_2;
import org.lwjgl.opengl.GL11;

public class O0 {
    private String h = null;
    private int i;
    private int k;
    private int d;
    private String l = null;
    private int j;
    byte[] f;
    private amw_1[] b;
    private ByteBuffer g;
    private int c = -1;
    ResourceLocation a = null;
    private int e;

    public String c() {
        return this.l;
    }

    public String a() {
        return this.h;
    }

    public int e() {
        return this.b.length;
    }

    public boolean f() {
        aP2.b();
        if (this.c < 0) {
            ITextureObject iTextureObject = aH3.a(this.a);
            return false;
        }
        if (this.g == null) {
            this.g = N4.e(this.f.length);
            a8q_0.a(this.g, this.f);
            this.f = null;
        }
        if (!this.d()) {
            return false;
        }
        int n = this.d * this.e * 4;
        int n2 = this.g();
        int n3 = n * n2;
        if (n3 + n > a8q_0.b(this.g)) {
            return false;
        }
        a8q_0.c(this.g, n3);
        GlStateManagerInvoker.k(this.c);
        GL11.glTexSubImage2D((int)3553, (int)0, (int)this.i, (int)this.j, (int)this.d, (int)this.e, (int)6408, (int)5121, (ByteBuffer)this.g);
        return true;
    }

    public O0(String string, byte[] byArray, String string2, ResourceLocation resourceLocation, int n, int n2, int n3, int n4, Properties properties, int n5) {
        aP2.b();
        this.i = 0;
        this.j = 0;
        this.d = 0;
        this.e = 0;
        this.b = null;
        this.k = 0;
        this.f = null;
        this.g = null;
        this.h = string;
        this.l = string2;
        this.a = resourceLocation;
        this.i = n;
        this.j = n2;
        this.d = n3;
        this.e = n4;
        int n6 = n3 * n4 * 4;
        if (byArray.length % n6 != 0) {
            ys_2.d(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), TB.f), byArray.length), TB.a), n3), TB.e), n4).toString());
        }
        this.f = byArray;
        int n7 = byArray.length / n6;
        if (dk_1.a(properties, (Object)TB.g) != null) {
            int n8 = 0;
            if (dk_1.a(properties, (Object)aL0.c(aL0.a(new StringBuilder(), TB.b), n8).toString()) != null) {
                n7 = n8 + 1;
                ++n8;
            }
        }
        String string3 = (String)dk_1.a(properties, (Object)TB.d);
        int n9 = ys_2.a(string3, n5);
        this.b = new amw_1[n7];
        int n10 = 0;
        if (n10 < this.b.length) {
            amw_1 amw_12;
            String string4 = (String)dk_1.a(properties, (Object)aL0.c(aL0.a(new StringBuilder(), TB.h), n10).toString());
            int n11 = ys_2.a(string4, n10);
            String string5 = (String)dk_1.a(properties, (Object)aL0.c(aL0.a(new StringBuilder(), TB.c), n10).toString());
            int n12 = ys_2.a(string5, n9);
            this.b[n10] = amw_12 = new amw_1(n11, n12);
            ++n10;
        }
    }

    public int g() {
        aP2.b();
        if (this.b.length <= 0) {
            return 0;
        }
        if (this.k >= this.b.length) {
            this.k = 0;
        }
        amw_1 amw_12 = this.b[this.k];
        return amw_12.c;
    }

    public ResourceLocation b() {
        return this.a;
    }

    public boolean d() {
        aP2.b();
        if (this.b.length <= 0) {
            return false;
        }
        if (this.k >= this.b.length) {
            this.k = 0;
        }
        amw_1 amw_12 = this.b[this.k];
        ++amw_12.a;
        if (amw_12.a < amw_12.b) {
            return false;
        }
        amw_12.a = 0;
        ++this.k;
        if (this.k >= this.b.length) {
            this.k = 0;
        }
        return true;
    }
}

