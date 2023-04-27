/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.HttpResponse
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.impl.client.CloseableHttpClient
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import net.skidunion.Protection;

/*
 * Renamed from net.wL
 */
public class wl_1 {
    private GuiMainMenu o;
    private boolean d;
    private float a;
    private boolean e;
    private float g;
    private float j;
    private float f;
    private String b;
    private boolean q;
    private String m;
    private float i;
    private String l = aen_1.a;
    private float n;
    private float k;
    private float p;
    private float c;
    private float h;

    public String b() {
        return this.b;
    }

    public static String a(String string) {
        CloseableHttpClient closeableHttpClient = CE.c();
        HttpGet httpGet = new HttpGet(string);
        Y2.a(httpGet, aen_1.d, aL0.a(aL0.a(new StringBuilder(), aen_1.h), Protection.h).toString());
        CloseableHttpResponse closeableHttpResponse = null;
        try {
            closeableHttpResponse = aXI.a(closeableHttpClient, (HttpUriRequest)httpGet);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
        try {
            return IOUtilsInvoker.b(pR.a(V9.a((HttpResponse)closeableHttpResponse)), StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            a4E.b(iOException);
            return aen_1.p;
        }
    }

    public float c() {
        return this.g;
    }

    private void lambda$mouseClicked$1(String string, Throwable throwable) {
        this.b = string;
    }

    public wl_1(GuiMainMenu guiMainMenu, float f, float f2, float f3, String string, String string2) {
        this.m = aen_1.i;
        this.b = aen_1.b;
        this.o = guiMainMenu;
        this.n = f;
        this.g = f2;
        this.j = f3;
        this.f = f3;
        this.l = string;
        this.i = f3;
        this.k = f3;
        this.m = string2;
        this.b = aen_1.n;
    }

    public void a(float f) {
        this.j = f;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public boolean b(int n, int n2) {
        ant_0.b();
        return (float)n >= this.n - 6.0f && (float)n <= this.n - 6.0f + this.i * 2.0f && (float)n2 >= this.g + 15.0f && (float)n2 <= this.k * 2.0f - 5.0f;
    }

    public void a(int n, int n2, int n3) {
        block14: {
            wl_1 wl_12;
            Object object;
            block15: {
                ant_0.b();
                if (this.q) {
                    return;
                }
                if (!this.a(n, n2) || n3 != 0) break block14;
                if (this.l.equals(aen_1.o)) {
                    try {
                        als_2.a(als_2.a(), aen_1.e);
                        break block14;
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                boolean bl = this.e = !this.e;
                if (!this.e) break block15;
                object = ListInvoker.iterator(aQE.a(this.o));
                if (dz_0.c((Iterator)object) && !(wl_12 = (wl_1)dz_0.b((Iterator)object)).equals(this)) {
                    wl_12.q = true;
                }
                if (this.m == null) break block14;
                object = avs_1.a(this::lambda$mouseClicked$0, (Executor)aFW.a());
                avs_1.b((CompletableFuture)object, this::lambda$mouseClicked$1);
            }
            this.b = aen_1.k;
            this.c = 0.0f;
            object = ListInvoker.iterator(aQE.a(this.o));
            if (dz_0.c((Iterator)object) && !(wl_12 = (wl_1)dz_0.b((Iterator)object)).equals(this)) {
                wl_12.q = false;
            }
        }
        if (this.e && this.l.equals(aen_1.l) && this.b(n, n2) && n3 == 0) {
            try {
                als_2.a(als_2.a(), aen_1.g);
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
        if (this.e && (float)n >= this.n - 23.0f + this.i * 2.0f && (float)n <= this.n - 23.0f + this.i * 2.0f + 5.0f && (float)n2 >= this.g && (float)n2 <= this.g + this.k * 2.0f - 30.0f) {
            this.d = true;
            this.h = n2;
        }
    }

    private String lambda$mouseClicked$0() {
        return wl_1.a(this.m);
    }

    public boolean e() {
        ant_0.b();
        return this.e || this.i - this.j > 1.0f && this.k - this.j > 1.0f;
    }

    public void a(int n, int n2, Color color, Color color2) {
        double d;
        ant_0.b();
        aV3.a(aV3.a(), (double)(this.n - 15.0f), (double)(this.g - 15.0f), (double)(this.i * 2.0f), (double)(this.k * 2.0f), (double)(this.j * 2.0f), 2.0, color, false);
        FontRenderer fontRenderer = adj_1.a(bj_0.a, 30);
        FontRenderer fontRenderer2 = adj_1.a(ob_0.a, 17);
        a7l_0.b(fontRenderer, this.l, this.n - (float)(a7l_0.a(fontRenderer, this.l) / 2), this.g - (float)(a7l_0.a(fontRenderer) / 2), !this.q ? (this.a(n, n2) ? aol_1.b(color2) : 0xFFFFFF) : aol_1.b(new Color(200, 200, 200)), false);
        double d2 = 0.0;
        int n3 = 0;
        if (this.b != null && !StringInvoker.g(this.b)) {
            n3 = ListInvoker.size(this.a(fontRenderer2));
            d2 = n3 * (a7l_0.a(fontRenderer2) + 3) / 2;
        }
        double d3 = this.b == null || StringInvoker.g(this.b) ? 15.0 : MathInvoker.a(20.0 + d2, 140.0);
        double d4 = d = this.b == null || StringInvoker.g(this.b) ? (double)((a7l_0.a(fontRenderer2, aen_1.c) + 35) / 2) : 120.0;
        if (this.e) {
            this.i = (float)MathInvoker.a(d, (double)this.i + (d - (double)this.i) * 0.025);
            this.k = (float)MathInvoker.a(d3, (double)this.k + (d3 - (double)this.k) * 0.025);
            ListInvoker.b(new ListInvoker[4]);
        }
        if (this.i > this.j || this.k > this.j) {
            this.i = (float)((double)this.i + (double)(this.j - this.i) * 0.04);
            this.k = (float)((double)this.k + (double)(this.j - this.k) * 0.04);
        }
        double d5 = this.k * 2.0f - 31.0f;
        double d6 = this.k * 2.0f - 5.0f - (this.g - this.j);
        double d7 = n3 * (a7l_0.a(fontRenderer2) + 3) + 8;
        double d8 = d6 / d7 * d5;
        double d9 = d5 - d8;
        double d10 = d7 - d5;
        double d11 = d10 / d9;
        this.a = (float)((double)this.a + (double)(this.p - this.a) * 0.1);
        this.p = (float)((double)this.c * d11);
        if (d7 > d6) {
            int n4;
            if (this.b(n, n2) && (n4 = MouseInvoker.m()) != 0) {
                if (n4 < 0) {
                    this.c += 10.0f;
                }
                this.c -= 10.0f;
            }
            this.c = (float)MathHelper.b((double)this.c, 0.0, d5 - d8);
        }
        if (this.e) {
            if (this.b != null && !StringInvoker.g(this.b)) {
                adp_0.b(false);
                a1V.c(this.n - 6.0f, this.g + 15.0f, this.n - 6.0f + this.i * 2.0f, this.k * 2.0f - 5.0f, -1);
                adp_0.a(true);
                List<String> list = this.a(fontRenderer2);
                int n5 = 0;
                Iterator iterator = ListInvoker.iterator(list);
                if (dz_0.c(iterator)) {
                    String string = (String)dz_0.b(iterator);
                    a7l_0.b(fontRenderer2, string, this.n - 5.0f, this.g + 15.0f + (float)(n5 * (a7l_0.a(fontRenderer2) + 3)) - this.a, -1, true);
                    ++n5;
                }
                adp_0.a();
                if (d7 > d6) {
                    aV3.a(aV3.a(), (double)(this.n - 23.0f + this.i * 2.0f), (double)this.g, 5.0, (double)(this.k * 2.0f - 30.0f), 4.0, 3.0, new Color(25, 25, 25), false);
                    aV3.a(aV3.a(), (double)(this.n - 22.5f + this.i * 2.0f), (double)(this.g + 0.5f + this.c), 4.0, (double)((float)d8), 4.0, 2.0, color2, false);
                }
            }
            adp_0.b(false);
            a1V.a(this.n - this.j, this.g - this.j, this.i * 2.0f, this.k * 2.0f, 25.0f, -1);
            adp_0.a(true);
            a7l_0.b(fontRenderer2, aen_1.j, this.n + 10.0f, this.g - 4.0f, -1, true);
            adp_0.a();
        }
        if (this.d && (float)n2 - this.h != 0.0f) {
            this.c += (float)n2 - this.h;
            this.c = (float)MathHelper.b((double)this.c, 0.0, d5 - d8);
            this.h = n2;
        }
    }

    public void a() {
        this.d = false;
    }

    public List<String> a(FontRenderer fontRenderer) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
        ant_0.b();
        String[] stringArray = StringInvoker.g(this.b, aen_1.f);
        int n = stringArray.length;
        int n2 = 0;
        if (n2 < n) {
            String string = stringArray[n2];
            if (!StringInvoker.g(string)) {
                float f = this.i * 2.0f - 35.0f;
                if ((float)a7l_0.a(fontRenderer, string) > f) {
                    String string2 = a7l_0.a(fontRenderer, string, (int)f, false);
                    String string3 = StringInvoker.a(string, (CharSequence)string2, (CharSequence)aen_1.m);
                    ListInvoker.add(copyOnWriteArrayList, string2);
                    if (!StringInvoker.g(string3)) {
                        ListInvoker.add(copyOnWriteArrayList, string3);
                    }
                }
                ListInvoker.add(copyOnWriteArrayList, string);
            }
            ++n2;
        }
        return copyOnWriteArrayList;
    }

    public float d() {
        return this.n;
    }

    public float f() {
        return this.j;
    }

    public boolean a(int n, int n2) {
        ant_0.b();
        return MathInvoker.b((double)(this.n - (float)n), 2.0) + MathInvoker.b((double)(this.g - (float)n2), 2.0) <= (double)(this.j * this.j);
    }
}

