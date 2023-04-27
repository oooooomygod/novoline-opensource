/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.FG;
import net.M0;
import net.ResourceLocation;
import net.WN;
import net.a4c_0;
import net.a5Y;
import net.aHK;
import net.aL0;
import net.aOZ;
import net.aP2;
import net.aS0;
import net.aem;
import net.dz_0;
import net.no_0;
import net.q1_0;
import net.rm_1;
import net.up_0;
import net.ys_2;

public class aGA {
    private static JsonParser i;
    public static String n = "coordinates";
    public static String o = "ModelBox";
    public static String f = "models";
    public static String b = "boxes";
    public static String u = "baseId";
    public static String d = "id";
    public static String q = "invertAxis";
    public static String j = "rotate";
    public static String s = "mirrorTexture";
    public static String r = "sprites";
    public static String l = "textureSize";
    public static String v = "submodels";
    public static String k = "type";
    public static String w = "translate";
    public static String p = "scale";
    public static String e = "sizeAdd";
    public static String t = "submodel";
    public static String a = "PlayerItem";
    public static String g = "type";
    public static String h = "textureOffset";
    public static String c = "usePlayerTexture";
    public static String m = "attachTo";

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    private static int b(String string) {
        aP2.b();
        if (string == null) {
            return 0;
        }
        if (string.equals(aOZ.s)) {
            return 0;
        }
        if (string.equals(aOZ.A)) {
            return 1;
        }
        if (string.equals(aOZ.D)) {
            return 2;
        }
        if (string.equals(aOZ.p)) {
            return 3;
        }
        if (string.equals(aOZ.J)) {
            return 4;
        }
        if (string.equals(aOZ.F)) {
            return 5;
        }
        if (string.equals(aOZ.j)) {
            return 6;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), aOZ.n), string).toString());
        return 0;
    }

    private static ResourceLocation a(String string) {
        StringInvoker.d(string, 58);
        return new ResourceLocation(string);
    }

    private static void a(Object object, String string) {
        throw new JsonParseException(string);
    }

    private static a5Y a(JsonObject jsonObject, q1_0 q1_02) {
        int n;
        a5Y a5Y2;
        int n2;
        int n3;
        JsonArray jsonArray;
        float[] fArray;
        int n4;
        a5Y a5Y3 = new a5Y(q1_02);
        String string = StringInvoker.i(no_0.a(jsonObject, aOZ.M, aOZ.o));
        boolean bl = StringInvoker.a(string, (CharSequence)aOZ.i);
        aP2.b();
        boolean bl2 = StringInvoker.a(string, (CharSequence)aOZ.L);
        boolean bl3 = StringInvoker.a(string, (CharSequence)aOZ.l);
        float[] fArray2 = no_0.a(M0.d(jsonObject, aOZ.k), 3, new float[3]);
        if (bl) {
            fArray2[0] = -fArray2[0];
        }
        if (bl2) {
            fArray2[1] = -fArray2[1];
        }
        if (bl3) {
            fArray2[2] = -fArray2[2];
        }
        if ((n4 = 0) < (fArray = no_0.a(M0.d(jsonObject, aOZ.B), 3, new float[3])).length) {
            fArray[n4] = fArray[n4] / 180.0f * (float)Math.PI;
            ++n4;
        }
        if (bl) {
            fArray[0] = -fArray[0];
        }
        if (bl2) {
            fArray[1] = -fArray[1];
        }
        if (bl3) {
            fArray[2] = -fArray[2];
        }
        up_0.a(a5Y3, fArray2[0], fArray2[1], fArray2[2]);
        a5Y3.t = fArray[0];
        a5Y3.m = fArray[1];
        a5Y3.n = fArray[2];
        String string2 = StringInvoker.i(no_0.a(jsonObject, aOZ.c, aOZ.E));
        boolean bl4 = StringInvoker.a(string2, (CharSequence)aOZ.a);
        boolean bl5 = StringInvoker.a(string2, (CharSequence)aOZ.Q);
        if (bl4) {
            a5Y3.x = true;
        }
        if (bl5) {
            a5Y3.j = true;
        }
        if ((jsonArray = M0.a(jsonObject, aOZ.u)) != null && (n3 = 0) < aem.a(jsonArray)) {
            JsonObject jsonObject2 = WN.c(aem.a(jsonArray, n3));
            int[] nArray = no_0.a(M0.d(jsonObject2, aOZ.m), 2);
            throw new JsonParseException(aOZ.I);
        }
        JsonArray jsonArray2 = M0.a(jsonObject, aOZ.w);
        if (jsonArray2 != null && (n2 = 0) < aem.a(jsonArray2)) {
            JsonObject jsonObject3 = WN.c(aem.a(jsonArray2, n2));
            int[] nArray = no_0.a(M0.d(jsonObject3, aOZ.e), 2);
            throw new JsonParseException(aOZ.d);
        }
        JsonObject jsonObject4 = (JsonObject)M0.d(jsonObject, aOZ.V);
        if (jsonObject4 != null) {
            a5Y2 = aGA.a(jsonObject4, q1_02);
            up_0.a(a5Y3, a5Y2);
        }
        if ((n = 0) < aem.a((JsonArray)(a5Y2 = (JsonArray)M0.d(jsonObject, aOZ.t)))) {
            JsonObject jsonObject5 = (JsonObject)aem.a((JsonArray)a5Y2, n);
            a5Y a5Y4 = aGA.a(jsonObject5, q1_02);
            up_0.a(a5Y3, a5Y4);
            ++n;
        }
        return a5Y3;
    }

    public static aHK a(JsonObject jsonObject) {
        aP2.b();
        String string = no_0.a(jsonObject, aOZ.P);
        if (!ys_2.a((Object)string, (Object)aOZ.O)) {
            throw new JsonParseException(aL0.a(aL0.a(new StringBuilder(), aOZ.X), string).toString());
        }
        int[] nArray = no_0.a(M0.d(jsonObject, aOZ.H), 2);
        aGA.a(nArray, aOZ.R);
        Dimension dimension = new Dimension(nArray[0], nArray[1]);
        boolean bl = no_0.a(jsonObject, aOZ.v, false);
        JsonArray jsonArray = (JsonArray)M0.d(jsonObject, aOZ.S);
        aGA.a(jsonArray, aOZ.r);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        int n = 0;
        if (n < aem.a(jsonArray)) {
            Object object;
            String string2;
            JsonObject jsonObject2 = (JsonObject)aem.a(jsonArray, n);
            String string3 = no_0.a(jsonObject2, aOZ.q);
            if (string3 != null) {
                Map.Entry entry;
                string2 = (JsonObject)MapInvoker.c(hashMap, string3);
                if (string2 == null) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), aOZ.f), string3).toString());
                }
                if (dz_0.c((Iterator)(object = aS0.f(M0.a((JsonObject)string2)))) && !M0.c(jsonObject2, (String)FG.b(entry = (Map.Entry)dz_0.b((Iterator)object)))) {
                    M0.a(jsonObject2, (String)FG.b(entry), (JsonElement)FG.a(entry));
                }
            }
            if (!MapInvoker.b(hashMap, string2 = no_0.a(jsonObject2, aOZ.C))) {
                MapInvoker.c(hashMap, string2, jsonObject2);
            }
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), aOZ.x), string2).toString());
            object = aGA.a(jsonObject2, dimension);
            ListInvoker.add(arrayList, object);
            ++n;
        }
        a4c_0[] a4c_0Array = (a4c_0[])ListInvoker.toArray(arrayList, new a4c_0[ListInvoker.size(arrayList)]);
        return new aHK(dimension, bl, a4c_0Array);
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[21];
        int n = 0;
        String string = "T4?\u000f)U#T#\u0002I\"\u0006M):\u00046J\u0010U5;16X;E4\n\u0004\"M7R#\u0007S6,\b.\\1\u0005B)&\u0004)\tS3<\f5]'L5\bA2*\u00009Q\u0016O\u000bC)1\u0013>P,A2;\u0012\u0006B'-\u0004\u0013]\u0004T?.\u0004\bS3<\f5]'L\u0007S/$\u0004\u001b]&\np*?\u0018?K\u000bT#3\u000bT#&\u0015/K's/$\u0004\rT#&\u0015/K'o 8\u0012?M\u0006R)*\u0000.\\\u0005S%?\r?\nI((\u0004(M\u0003X/-";
        int n2 = "T4?\u000f)U#T#\u0002I\"\u0006M):\u00046J\u0010U5;16X;E4\n\u0004\"M7R#\u0007S6,\b.\\1\u0005B)&\u0004)\tS3<\f5]'L5\bA2*\u00009Q\u0016O\u000bC)1\u0013>P,A2;\u0012\u0006B'-\u0004\u0013]\u0004T?.\u0004\bS3<\f5]'L\u0007S/$\u0004\u001b]&\np*?\u0018?K\u000bT#3\u000bT#&\u0015/K's/$\u0004\rT#&\u0015/K'o 8\u0012?M\u0006R)*\u0000.\\\u0005S%?\r?\nI((\u0004(M\u0003X/-".length();
        int n3 = 9;
        int n4 = -1;
        while (true) {
            int n5 = 119;
            int n6 = ++n4;
            String string2 = string.substring(n6, n6 + n3);
            int n7 = -1;
            boolean bl = true;
            do {
                char[] cArray;
                block7: {
                    int n8;
                    char[] cArray2;
                    int n9;
                    int n10;
                    block6: {
                        if (!bl || (bl = false) || !true) {
                            string = "\u000bijUs\rP\u0003xlRn\u001a\b+o|Bp=k\u001e";
                            n2 = "\u000bijUs\rP\u0003xlRn\u001a\b+o|Bp=k\u001e".length();
                            n3 = 13;
                            n4 = -1;
                            n5 = 49;
                            int n11 = ++n4;
                            string2 = string.substring(n11, n11 + n3);
                            n7 = 0;
                        }
                        char[] cArray3 = string2.toCharArray();
                        int n12 = cArray3.length;
                        n10 = 0;
                        n9 = n5;
                        cArray2 = cArray3;
                        n8 = n12;
                        if (n12 <= 1) break block6;
                        cArray = cArray2;
                        n8 = n8;
                        if (n8 <= n10) break block7;
                    }
                    do {
                        cArray2 = cArray2;
                        int n13 = n10;
                        int cfr_ignored_1 = n10 % 7;
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x57));
                        ++n10;
                        n9 = n9;
                        cArray = cArray2;
                        n8 = n8;
                    } while (n8 > n10);
                }
                stringArray[n++] = new String(cArray).intern();
            } while ((n4 += n3) >= n2);
            n3 = string.charAt(n4);
        }
    }

    private static a4c_0 a(JsonObject jsonObject, Dimension dimension) {
        aP2.b();
        String string = no_0.a(jsonObject, aOZ.U);
        if (!ys_2.a((Object)string, (Object)aOZ.N)) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), aOZ.G), string).toString());
            return null;
        }
        String string2 = no_0.a(jsonObject, aOZ.T);
        int n = aGA.b(string2);
        float f = no_0.a(jsonObject, aOZ.K, 1.0f);
        rm_1 rm_12 = new rm_1();
        rm_12.b = dimension.width;
        rm_12.e = dimension.height;
        a5Y a5Y2 = aGA.a(jsonObject, rm_12);
        a4c_0 a4c_02 = new a4c_0(n, f, a5Y2);
        return a4c_02;
    }
}

