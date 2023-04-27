/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import com.google.common.base.Charsets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import deobf.Framebuffer;
import deobf.ITextureObject;
import deobf.OpenGlHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.Ei;
import net.G3;
import net.JH;
import net.P8;
import net.ResourceLocation;
import net.UE;
import net.WN;
import net.a1r;
import net.aI_;
import net.aL0;
import net.aWP;
import net.aem;
import net.agj_2;
import net.aoy_2;
import net.apl_1;
import net.atP;
import net.axw_1;
import net.az4_0;
import net.dw_0;
import net.dz_0;
import net.gu_0;
import net.j6_0;
import net.my_0;
import net.s0_0;
import net.u3_0;
import net.ul_0;
import net.ul_2;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.atp
 */
public class atp_0 {
    private int t;
    private List<String> f;
    private static boolean l;
    private boolean a;
    private Map<String, Object> s = MapsInvoker.a();
    private Map<String, gu_0> d;
    private static int j;
    private static atp_0 o;
    private ul_0 i;
    private List<Integer> p;
    private static Logger e;
    private List<Integer> m;
    private atP k;
    private List<String> r;
    private String h;
    private static G3 g;
    private atP q;
    private List<Integer> b;
    private boolean n;
    private List<gu_0> c;

    public void g() {
        Object object;
        this.n = false;
        o = this;
        az4_0.a(this.i);
        if (this.t != j) {
            OpenGlHelper.h(this.t);
            j = this.t;
        }
        if (this.a) {
            GlStateManagerInvoker.b();
        } else {
            GlStateManagerInvoker.A();
        }
        for (int i = 0; i < ListInvoker.size(this.b); ++i) {
            if (MapInvoker.c(this.s, ListInvoker.get(this.f, i)) == null) continue;
            GlStateManagerInvoker.d(apl_1.S + i);
            GlStateManagerInvoker.enableTexture2D();
            object = MapInvoker.c(this.s, ListInvoker.get(this.f, i));
            int n = -1;
            if (object instanceof Framebuffer) {
                n = ((Framebuffer)object).e;
                continue;
            }
            if (object instanceof ITextureObject) {
                n = u3_0.c((ITextureObject)object);
                continue;
            }
            if (!(object instanceof Integer)) continue;
            n = P8.b((Integer)object);
        }
        Iterator iterator = ListInvoker.iterator(this.c);
        while (dz_0.c(iterator)) {
            object = (gu_0)dz_0.b(iterator);
            ul_2.b((gu_0)object);
        }
    }

    public void a() {
        this.n = true;
    }

    public void f() {
        OpenGlHelper.h(0);
        j = -1;
        o = null;
        l = true;
        for (int i = 0; i < ListInvoker.size(this.b); ++i) {
            if (MapInvoker.c(this.s, ListInvoker.get(this.f, i)) == null) continue;
            GlStateManagerInvoker.d(apl_1.S + i);
            GlStateManagerInvoker.k(0);
        }
    }

    static {
        e = LogManagerInvoker.c();
        g = new G3();
        o = null;
        j = -1;
        l = true;
    }

    private void b() {
        Object object;
        int n = 0;
        int n2 = 0;
        while (n < ListInvoker.size(this.f)) {
            object = (String)ListInvoker.get(this.f, n);
            int n3 = OpenGlHelper.a(this.t, (CharSequence)object);
            if (n3 == -1) {
                LoggerInvoker.warn(e, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), agj_2.m), this.h), agj_2.p), (String)object), agj_2.y).toString());
                MapInvoker.a(this.s, object);
                ListInvoker.remove(this.f, n2);
                --n2;
            } else {
                ListInvoker.add(this.b, P8.d(n3));
            }
            ++n;
            ++n2;
        }
        Iterator iterator = ListInvoker.iterator(this.c);
        while (dz_0.c(iterator)) {
            object = (gu_0)dz_0.b(iterator);
            String string = ul_2.a((gu_0)object);
            int n4 = OpenGlHelper.a(this.t, string);
            if (n4 == -1) {
                LoggerInvoker.warn(e, aL0.a(aL0.a(aL0.a(new StringBuilder(), agj_2.o), string), agj_2.k).toString());
                continue;
            }
            ListInvoker.add(this.p, P8.d(n4));
            ul_2.a((gu_0)object, n4);
            MapInvoker.c(this.d, string, object);
        }
    }

    public atp_0(aI_ aI_2, String string) throws IOException {
        this.f = my_0.c();
        this.b = my_0.c();
        this.c = my_0.c();
        this.p = my_0.c();
        this.d = MapsInvoker.a();
        JsonParser jsonParser = new JsonParser();
        ResourceLocation resourceLocation = new ResourceLocation(aL0.a(aL0.a(aL0.a(new StringBuilder(), agj_2.H), string), agj_2.l).toString());
        this.h = string;
        InputStream inputStream = null;
        try {
            Object object;
            Object object2;
            inputStream = dw_0.b(j6_0.b(aI_2, resourceLocation));
            JsonObject jsonObject = WN.c(a1r.a(jsonParser, IOUtilsInvoker.b(inputStream, Charsets.UTF_8)));
            Object object3 = Ei.f(jsonObject, agj_2.I);
            String string2 = Ei.f(jsonObject, agj_2.A);
            JsonArray jsonArray = Ei.a(jsonObject, agj_2.v, null);
            int n = 0;
            Iterator iterator = aem.b(jsonArray);
            while (dz_0.c(iterator)) {
                object2 = (JsonElement)dz_0.b(iterator);
                try {
                    this.a((JsonElement)object2);
                    ++n;
                }
                catch (Exception exception) {
                    JH jH = UE.a(exception);
                    UE.a(jH, aL0.a(aL0.c(aL0.a(new StringBuilder(), agj_2.d), n), agj_2.t).toString());
                    throw jH;
                }
            }
            JsonArray jsonArray2 = Ei.a(jsonObject, agj_2.e, null);
            int n2 = 0;
            this.m = my_0.b(aem.a(jsonArray2));
            this.r = my_0.b(aem.a(jsonArray2));
            object2 = aem.b(jsonArray2);
            while (dz_0.c((Iterator)object2)) {
                object = (JsonElement)dz_0.b((Iterator)object2);
                try {
                    ListInvoker.add(this.r, Ei.c(object, agj_2.G));
                    ++n2;
                }
                catch (Exception exception) {
                    JH jH = UE.a(exception);
                    UE.a(jH, aL0.a(aL0.c(aL0.a(new StringBuilder(), agj_2.b), n2), agj_2.a).toString());
                    throw jH;
                }
            }
            try {
                JsonArray jsonArray3 = Ei.a(jsonObject, agj_2.F, null);
                int n3 = 0;
                object = aem.b(jsonArray3);
                while (dz_0.c((Iterator)object)) {
                    JsonElement jsonElement = (JsonElement)dz_0.b((Iterator)object);
                    try {
                        this.b(jsonElement);
                        ++n3;
                    }
                    catch (Exception exception) {
                        JH jH = UE.a(exception);
                        UE.a(jH, aL0.a(aL0.c(aL0.a(new StringBuilder(), agj_2.z), n3), agj_2.n).toString());
                        throw jH;
                    }
                }
                this.i = az4_0.a(Ei.a(jsonObject, agj_2.E, null));
                this.a = Ei.a(jsonObject, agj_2.w, true);
                this.k = aoy_2.a(aI_2, aWP.VERTEX, (String)object3);
                this.q = aoy_2.a(aI_2, aWP.FRAGMENT, string2);
                this.t = s0_0.a(s0_0.b());
                s0_0.a(s0_0.b(), this);
                this.b();
                if (this.r != null) {
                    Iterator iterator2 = ListInvoker.iterator(this.r);
                    while (dz_0.c(iterator2)) {
                        object = (String)dz_0.b(iterator2);
                        int n4 = OpenGlHelper.b(this.t, (CharSequence)object);
                        ListInvoker.add(this.m, P8.d(n4));
                    }
                }
                this.a();
                return;
            }
            catch (Exception exception) {
                object3 = UE.a(exception);
                UE.b((JH)object3, axw_1.b(resourceLocation));
                throw object3;
            }
        }
        finally {
            IOUtilsInvoker.closeQuietly(inputStream);
        }
    }

    public atP h() {
        return this.q;
    }

    private void b(JsonElement jsonElement) throws JH {
        Object object;
        JsonObject jsonObject = Ei.d(jsonElement, agj_2.r);
        String string = Ei.f(jsonObject, agj_2.D);
        int n = ul_2.a(Ei.f(jsonObject, agj_2.c));
        int n2 = Ei.e(jsonObject, agj_2.s);
        float[] fArray = new float[MathInvoker.max(n2, 16)];
        JsonArray jsonArray = Ei.b(jsonObject, agj_2.i);
        if (aem.a(jsonArray) != n2 && aem.a(jsonArray) > 1) {
            throw new JH(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), agj_2.B), n2), agj_2.f), aem.a(jsonArray)), agj_2.j).toString());
        }
        int n3 = 0;
        Iterator iterator = aem.b(jsonArray);
        while (dz_0.c(iterator)) {
            object = (JsonElement)dz_0.b(iterator);
            try {
                fArray[n3] = Ei.b(object, agj_2.x);
                ++n3;
            }
            catch (Exception exception) {
                JH jH = UE.a(exception);
                UE.a(jH, aL0.a(aL0.c(aL0.a(new StringBuilder(), agj_2.C), n3), agj_2.q).toString());
                throw jH;
            }
        }
        if (n2 > 1 && aem.a(jsonArray) == 1) {
            while (n3 < n2) {
                fArray[n3] = fArray[0];
                ++n3;
            }
        }
        int n4 = n2 > 1 && n2 <= 4 && n < 8 ? n2 - 1 : 0;
        object = new gu_0(string, n + n4, n2, this);
        if (n <= 3) {
            ul_2.a((gu_0)object, (int)fArray[0], (int)fArray[1], (int)fArray[2], (int)fArray[3]);
        } else if (n <= 7) {
            ul_2.a((gu_0)object, fArray[0], fArray[1], fArray[2], fArray[3]);
        } else {
            ul_2.a((gu_0)object, fArray);
        }
        ListInvoker.add(this.c, object);
    }

    public atP c() {
        return this.k;
    }

    public void a(String string, Object object) {
        MapInvoker.a(this.s, string);
        MapInvoker.c(this.s, string, object);
        this.a();
    }

    public int e() {
        return this.t;
    }

    public gu_0 a(String string) {
        return (gu_0)MapInvoker.a(this.d, (Object)string, g);
    }

    public gu_0 b(String string) {
        return (gu_0)MapInvoker.a(this.d, (Object)string, null);
    }

    public void d() {
        s0_0.b(s0_0.b(), this);
    }

    private void a(JsonElement jsonElement) throws JH {
        JsonObject jsonObject = Ei.d(jsonElement, agj_2.h);
        String string = Ei.f(jsonObject, agj_2.u);
        if (!Ei.g(jsonObject, agj_2.g)) {
            MapInvoker.c(this.s, string, null);
            ListInvoker.add(this.f, string);
        } else {
            ListInvoker.add(this.f, string);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

