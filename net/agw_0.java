/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import deobf.Framebuffer;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import net.Ei;
import net.JH;
import net.M0;
import net.ResourceLocation;
import net.TextureManager;
import net.UE;
import net.WN;
import net.a1r;
import net.aGC;
import net.aI_;
import net.aL0;
import net.aem;
import net.ark_1;
import net.db_0;
import net.dz_0;

/*
 * Renamed from net.aGw
 */
public class agw_0
extends aGC {
    private static ListInvoker[] l;

    public static void b(ListInvoker[] listInvokerArray) {
        l = listInvokerArray;
    }

    @Override
    public void a(TextureManager textureManager, ResourceLocation resourceLocation) throws IOException, JsonSyntaxException {
        JsonElement jsonElement;
        Iterator iterator;
        int n;
        JsonArray jsonArray;
        agw_0.b();
        JsonObject jsonObject = this.c();
        if (Ei.c(jsonObject, ark_1.h)) {
            jsonArray = M0.a(jsonObject, ark_1.c);
            n = 0;
            iterator = aem.b(jsonArray);
            if (dz_0.c(iterator)) {
                jsonElement = (JsonElement)dz_0.b(iterator);
                try {
                    super.b(jsonElement);
                }
                catch (Exception exception) {
                    JH jH = UE.a(exception);
                    UE.a(jH, aL0.a(aL0.c(aL0.a(new StringBuilder(), ark_1.f), n), ark_1.i).toString());
                    throw jH;
                }
                ++n;
            }
        }
        if (Ei.c(jsonObject, ark_1.b)) {
            jsonArray = M0.a(jsonObject, ark_1.g);
            n = 0;
            iterator = aem.b(jsonArray);
            if (dz_0.c(iterator)) {
                jsonElement = (JsonElement)dz_0.b(iterator);
                try {
                    super.a(textureManager, jsonElement);
                }
                catch (Exception exception) {
                    JH jH = UE.a(exception);
                    UE.a(jH, aL0.a(aL0.c(aL0.a(new StringBuilder(), ark_1.e), n), ark_1.d).toString());
                    throw jH;
                }
                ++n;
            }
        }
        if (ListInvoker.b() != null) {
            agw_0.b(new ListInvoker[2]);
        }
    }

    static {
        if (agw_0.b() == null) {
            agw_0.b(new ListInvoker[5]);
        }
    }

    public agw_0(TextureManager textureManager, aI_ aI_2, Framebuffer framebuffer, ResourceLocation resourceLocation) throws IOException, JsonSyntaxException {
        super(textureManager, aI_2, framebuffer, resourceLocation);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public JsonObject c() {
        agw_0.b();
        String string = ark_1.a;
        double d = 3.6900000000000004;
        JsonObject jsonObject = WN.c(a1r.a(new JsonParser(), StringInvoker.a(Locale.ENGLISH, string, new Object[]{db_0.a(d), db_0.a(d), db_0.a(d)})));
        ListInvoker.b(new ListInvoker[2]);
        return jsonObject;
    }

    public static ListInvoker[] b() {
        return l;
    }
}

