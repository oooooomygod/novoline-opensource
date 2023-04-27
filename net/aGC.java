/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  org.lwjgl.util.vector.Matrix4f
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import com.google.common.base.Charsets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import deobf.Framebuffer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.Ei;
import net.JH;
import net.M0;
import net.ResourceLocation;
import net.TextureManager;
import net.UE;
import net.WN;
import net.a1r;
import net.a4S;
import net.aF8;
import net.aI_;
import net.aL0;
import net.aNF;
import net.aak_2;
import net.abh_2;
import net.aem;
import net.axw_1;
import net.dw_0;
import net.dz_0;
import net.j6_0;
import net.ms_0;
import net.my_0;
import net.wk_1;
import org.lwjgl.util.vector.Matrix4f;

public class aGC {
    private aI_ c;
    public List<aF8> b = my_0.c();
    private float j;
    private List<Framebuffer> d;
    private float f;
    private int k;
    private Matrix4f h;
    private Framebuffer e;
    private int g;
    private Map<String, Framebuffer> a = MapsInvoker.a();
    private String i;

    protected void a(TextureManager textureManager, JsonElement jsonElement) throws IOException {
        JsonObject jsonObject = Ei.d(jsonElement, wk_1.y);
        Ei.f(jsonObject, wk_1.H);
        String string = Ei.f(jsonObject, wk_1.n);
        String string2 = Ei.f(jsonObject, wk_1.E);
        this.b(string);
        this.b(string2);
        throw new JH(aL0.a(aL0.a(aL0.a(new StringBuilder(), wk_1.u), string), wk_1.j).toString());
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    private void c() {
        this.h = new Matrix4f();
        a4S.a(this.h);
        this.h.m00 = 2.0f / (float)this.e.i;
        this.h.m11 = 2.0f / (float)(-this.e.c);
        this.h.m22 = -0.0020001999f;
        this.h.m33 = 1.0f;
        this.h.m03 = -1.0f;
        this.h.m13 = 1.0f;
        this.h.m23 = -1.0001999f;
    }

    public aGC(TextureManager textureManager, aI_ aI_2, Framebuffer framebuffer, ResourceLocation resourceLocation) throws IOException, JsonSyntaxException {
        this.d = my_0.c();
        this.c = aI_2;
        this.e = framebuffer;
        this.f = 0.0f;
        this.j = 0.0f;
        this.g = framebuffer.g;
        this.k = framebuffer.d;
        this.i = resourceLocation.toString();
        this.c();
        this.a(textureManager, resourceLocation);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(TextureManager textureManager, ResourceLocation resourceLocation) throws IOException, JsonSyntaxException {
        JsonParser jsonParser = new JsonParser();
        InputStream inputStream = null;
        try {
            JsonElement jsonElement;
            Iterator iterator;
            int n;
            JsonArray jsonArray;
            abh_2 abh_22 = j6_0.b(this.c, resourceLocation);
            inputStream = dw_0.b(abh_22);
            JsonObject jsonObject = WN.c(a1r.a(jsonParser, IOUtilsInvoker.b(inputStream, Charsets.UTF_8)));
            if (Ei.c(jsonObject, wk_1.l)) {
                jsonArray = M0.a(jsonObject, wk_1.N);
                n = 0;
                iterator = aem.b(jsonArray);
                while (dz_0.c(iterator)) {
                    jsonElement = (JsonElement)dz_0.b(iterator);
                    try {
                        this.b(jsonElement);
                        ++n;
                    }
                    catch (Exception exception) {
                        JH jH = UE.a(exception);
                        UE.a(jH, aL0.a(aL0.c(aL0.a(new StringBuilder(), wk_1.e), n), wk_1.K).toString());
                        throw jH;
                    }
                }
            }
            if (Ei.c(jsonObject, wk_1.G)) {
                jsonArray = M0.a(jsonObject, wk_1.M);
                n = 0;
                iterator = aem.b(jsonArray);
                while (dz_0.c(iterator)) {
                    jsonElement = (JsonElement)dz_0.b(iterator);
                    try {
                        this.a(textureManager, jsonElement);
                        ++n;
                    }
                    catch (Exception exception) {
                        JH jH = UE.a(exception);
                        UE.a(jH, aL0.a(aL0.c(aL0.a(new StringBuilder(), wk_1.P), n), wk_1.T).toString());
                        throw jH;
                    }
                }
            }
        }
        catch (Exception exception) {
            try {
                JH jH = UE.a(exception);
                UE.b(jH, axw_1.b(resourceLocation));
                throw jH;
            }
            catch (Throwable throwable) {
                IOUtilsInvoker.closeQuietly(inputStream);
                throw throwable;
            }
        }
        IOUtilsInvoker.closeQuietly(inputStream);
    }

    public Framebuffer a(String string) {
        return (Framebuffer)MapInvoker.c(this.a, string);
    }

    public void a(String string, int n, int n2) {
        Framebuffer framebuffer = new Framebuffer(n, n2, true);
        FramebufferInvoker.setFramebufferColor(framebuffer, 0.0f, 0.0f, 0.0f, 0.0f);
        MapInvoker.c(this.a, string, framebuffer);
        if (n == this.g && n2 == this.k) {
            ListInvoker.add(this.d, framebuffer);
        }
    }

    public void b() {
        Object object;
        Iterator iterator = ms_0.a(this.a.values());
        while (dz_0.c(iterator)) {
            object = (Framebuffer)dz_0.b(iterator);
            FramebufferInvoker.f((Framebuffer)object);
        }
        iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            object = (aF8)dz_0.b(iterator);
            aNF.a((aF8)object);
        }
        ListInvoker.clear(this.b);
    }

    public void a(float f) {
        if (f < this.j) {
            this.f += 1.0f - this.j;
            this.f += f;
        } else {
            this.f += f - this.j;
        }
        this.j = f;
        while (this.f > 20.0f) {
            this.f -= 20.0f;
        }
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            aF8 aF82 = (aF8)dz_0.b(iterator);
            aNF.a(aF82, this.f / 20.0f);
        }
    }

    private void a(JsonElement jsonElement) throws JH {
        JsonObject jsonObject = Ei.d(jsonElement, wk_1.F);
        String string = Ei.f(jsonObject, wk_1.z);
        aak_2.a(aNF.b((aF8)ListInvoker.get(this.b, ListInvoker.size(this.b) - 1)), string);
        throw new JH(aL0.a(aL0.a(aL0.a(new StringBuilder(), wk_1.d), string), wk_1.f).toString());
    }

    private Framebuffer b(String string) {
        return null;
    }

    public aF8 a(String string, Framebuffer framebuffer, Framebuffer framebuffer2) throws IOException {
        aF8 aF82 = new aF8(this.c, string, framebuffer, framebuffer2);
        ListInvoker.add(this.b, ListInvoker.size(this.b), aF82);
        return aF82;
    }

    public String a() {
        return this.i;
    }

    public void a(int n, int n2) {
        Object object;
        this.g = this.e.i;
        this.k = this.e.c;
        this.c();
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            object = (aF8)dz_0.b(iterator);
            aNF.a((aF8)object, this.h);
        }
        iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            object = (Framebuffer)dz_0.b(iterator);
            FramebufferInvoker.a((Framebuffer)object, n, n2);
        }
    }

    protected void b(JsonElement jsonElement) throws JH {
        if (Ei.a(jsonElement)) {
            this.a(WN.f(jsonElement), this.g, this.k);
        } else {
            JsonObject jsonObject = Ei.d(jsonElement, wk_1.I);
            String string = Ei.f(jsonObject, wk_1.g);
            int n = Ei.a(jsonObject, wk_1.L, this.g);
            int n2 = Ei.a(jsonObject, wk_1.v, this.k);
            if (MapInvoker.b(this.a, string)) {
                throw new JH(aL0.a(aL0.a(new StringBuilder(), string), wk_1.D).toString());
            }
            this.a(string, n, n2);
        }
    }
}

