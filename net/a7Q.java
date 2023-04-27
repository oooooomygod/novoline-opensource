/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.M0;
import net.WN;
import net.aL0;
import net.aP2;
import net.aem;
import net.bn_0;

public class a7Q {
    public static float a(JsonObject jsonObject, String string, float f) {
        aP2.b();
        JsonElement jsonElement = M0.d(jsonObject, string);
        return jsonElement == null ? f : WN.i(jsonElement);
    }

    public static boolean a(JsonObject jsonObject, String string, boolean bl) {
        aP2.b();
        JsonElement jsonElement = M0.d(jsonObject, string);
        return jsonElement == null ? bl : WN.b(jsonElement);
    }

    public static String a(JsonObject jsonObject, String string) {
        return a7Q.a(jsonObject, string, (String)null);
    }

    public static int[] a(JsonElement jsonElement, int n, int[] nArray) {
        aP2.b();
        if (jsonElement == null) {
            return nArray;
        }
        JsonArray jsonArray = WN.g(jsonElement);
        if (aem.a(jsonArray) != n) {
            throw new JsonParseException(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), bn_0.b), aem.a(jsonArray)), bn_0.e), n), bn_0.f), jsonArray).toString());
        }
        int n2 = 0;
        int[] nArray2 = new int[aem.a(jsonArray)];
        if (n2 < nArray2.length) {
            nArray2[n2] = WN.e(aem.a(jsonArray, n2));
            ++n2;
        }
        return nArray2;
    }

    public static float[] a(JsonElement jsonElement, int n, float[] fArray) {
        aP2.b();
        if (jsonElement == null) {
            return fArray;
        }
        JsonArray jsonArray = WN.g(jsonElement);
        if (aem.a(jsonArray) != n) {
            throw new JsonParseException(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), bn_0.d), aem.a(jsonArray)), bn_0.c), n), bn_0.a), jsonArray).toString());
        }
        int n2 = 0;
        float[] fArray2 = new float[aem.a(jsonArray)];
        if (n2 < fArray2.length) {
            fArray2[n2] = WN.i(aem.a(jsonArray, n2));
            ++n2;
        }
        return fArray2;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public static int[] b(JsonElement jsonElement, int n) {
        return a7Q.a(jsonElement, n, (int[])null);
    }

    public static String a(JsonObject jsonObject, String string, String string2) {
        aP2.b();
        JsonElement jsonElement = M0.d(jsonObject, string);
        return jsonElement == null ? string2 : WN.f(jsonElement);
    }

    public static float[] a(JsonElement jsonElement, int n) {
        return a7Q.a(jsonElement, n, (float[])null);
    }
}

