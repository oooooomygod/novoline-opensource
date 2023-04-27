/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package net;

import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.M0;
import net.WK;
import net.WN;
import net.aL0;
import net.aet_0;
import net.aw__0;

/*
 * Renamed from net.Yx
 */
public class yx_0 {
    public static String a(JsonElement jsonElement, String string) {
        if (WN.k(jsonElement)) {
            return WN.f(jsonElement);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.a), string), WK.d), yx_0.b(jsonElement)).toString());
    }

    public static int d(JsonObject jsonObject, String string) {
        if (M0.c(jsonObject, string)) {
            return yx_0.e(M0.d(jsonObject, string), string);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.y), string), WK.A).toString());
    }

    public static boolean a(JsonObject jsonObject, String string, boolean bl) {
        return M0.c(jsonObject, string) ? yx_0.f(M0.d(jsonObject, string), string) : bl;
    }

    public static boolean a(JsonElement jsonElement) {
        return WN.k(jsonElement) && aet_0.b(WN.d(jsonElement));
    }

    public static boolean h(JsonObject jsonObject, String string) {
        return yx_0.k(jsonObject, string) && aet_0.b(M0.e(jsonObject, string));
    }

    public static String c(JsonObject jsonObject, String string) {
        if (M0.c(jsonObject, string)) {
            return yx_0.a(M0.d(jsonObject, string), string);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.D), string), WK.w).toString());
    }

    public static int a(JsonObject jsonObject, String string, int n) {
        return M0.c(jsonObject, string) ? yx_0.e(M0.d(jsonObject, string), string) : n;
    }

    public static float b(JsonObject jsonObject, String string) {
        if (M0.c(jsonObject, string)) {
            return yx_0.d(M0.d(jsonObject, string), string);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.C), string), WK.I).toString());
    }

    public static String a(JsonObject jsonObject, String string, String string2) {
        return M0.c(jsonObject, string) ? yx_0.a(M0.d(jsonObject, string), string) : string2;
    }

    public static float d(JsonElement jsonElement, String string) {
        if (WN.k(jsonElement) && aet_0.d(WN.d(jsonElement))) {
            return WN.i(jsonElement);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.l), string), WK.o), yx_0.b(jsonElement)).toString());
    }

    public static JsonObject a(JsonObject jsonObject, String string, JsonObject jsonObject2) {
        return M0.c(jsonObject, string) ? yx_0.b(M0.d(jsonObject, string), string) : jsonObject2;
    }

    public static float a(JsonObject jsonObject, String string, float f) {
        return M0.c(jsonObject, string) ? yx_0.d(M0.d(jsonObject, string), string) : f;
    }

    public static boolean f(JsonObject jsonObject, String string) {
        return yx_0.k(jsonObject, string) && aet_0.c(M0.e(jsonObject, string));
    }

    public static boolean k(JsonObject jsonObject, String string) {
        return yx_0.a(jsonObject, string) && WN.k(M0.d(jsonObject, string));
    }

    public static JsonArray a(JsonObject jsonObject, String string, JsonArray jsonArray) {
        return M0.c(jsonObject, string) ? yx_0.c(M0.d(jsonObject, string), string) : jsonArray;
    }

    public static JsonObject b(JsonElement jsonElement, String string) {
        if (WN.h(jsonElement)) {
            return WN.c(jsonElement);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.j), string), WK.m), yx_0.b(jsonElement)).toString());
    }

    public static int e(JsonElement jsonElement, String string) {
        if (WN.k(jsonElement) && aet_0.d(WN.d(jsonElement))) {
            return WN.e(jsonElement);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.r), string), WK.q), yx_0.b(jsonElement)).toString());
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    public static String b(JsonElement jsonElement) {
        aw__0.a(StringInvoker.a(jsonElement), WK.H, 10);
        return WK.f;
    }

    public static JsonArray i(JsonObject jsonObject, String string) {
        if (M0.c(jsonObject, string)) {
            return yx_0.c(M0.d(jsonObject, string), string);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.g), string), WK.i).toString());
    }

    public static boolean g(JsonObject jsonObject, String string) {
        if (M0.c(jsonObject, string)) {
            return yx_0.f(M0.d(jsonObject, string), string);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.s), string), WK.b).toString());
    }

    public static JsonArray c(JsonElement jsonElement, String string) {
        if (WN.a(jsonElement)) {
            return WN.g(jsonElement);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.k), string), WK.E), yx_0.b(jsonElement)).toString());
    }

    public static boolean f(JsonElement jsonElement, String string) {
        if (WN.k(jsonElement)) {
            return WN.b(jsonElement);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.e), string), WK.B), yx_0.b(jsonElement)).toString());
    }

    public static JsonObject j(JsonObject jsonObject, String string) {
        if (M0.c(jsonObject, string)) {
            return yx_0.b(M0.d(jsonObject, string), string);
        }
        throw new JsonSyntaxException(aL0.a(aL0.a(aL0.a(new StringBuilder(), WK.G), string), WK.c).toString());
    }

    public static boolean e(JsonObject jsonObject, String string) {
        return yx_0.a(jsonObject, string) && WN.a(M0.d(jsonObject, string));
    }

    public static boolean a(JsonObject jsonObject, String string) {
        return M0.d(jsonObject, string) != null;
    }
}

