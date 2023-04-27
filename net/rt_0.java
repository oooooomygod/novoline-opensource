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

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import deobf.MCInvoker;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import net.M0;
import net.OQ;
import net.ResourceLocation;
import net.SF;
import net.a1r;
import net.a4E;
import net.aFY;
import net.aGA;
import net.aHK;
import net.aI8;
import net.aL0;
import net.aOF;
import net.aP2;
import net.aem;
import net.ara_2;
import net.ch_2;
import net.no_0;
import net.vl_2;
import net.ys_2;
import net.z8_0;

/*
 * Renamed from net.rT
 */
public class rt_0 {
    public static String b = "type";
    private String a = null;
    public static String d;
    public static String c;

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public SF a(JsonElement jsonElement) {
        aP2.b();
        if (jsonElement == null) {
            throw new JsonParseException(aL0.a(aL0.a(new StringBuilder(), OQ.d), this.a).toString());
        }
        JsonObject jsonObject = (JsonObject)jsonElement;
        SF sF = new SF();
        int n = 0;
        JsonArray jsonArray = (JsonArray)M0.d(jsonObject, OQ.l);
        if (n < aem.a(jsonArray)) {
            aHK aHK2;
            String string;
            JsonObject jsonObject2 = (JsonObject)aem.a(jsonArray, n);
            no_0.a(jsonObject2, OQ.e, true);
            String string2 = no_0.a(jsonObject2, OQ.c);
            if (string2 == null) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), OQ.r), this.a).toString());
            }
            if ((string = no_0.a(jsonObject2, OQ.b)) == null) {
                string = aL0.a(aL0.a(aL0.a(new StringBuilder(), OQ.q), string2), OQ.h).toString();
            }
            if (!z8_0.a(aHK2 = this.a(string))) {
                String string3 = no_0.a(jsonObject2, OQ.k);
                if (string3 == null) {
                    string3 = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), OQ.o), string2), OQ.m), this.a), OQ.v).toString();
                }
                BufferedImage bufferedImage = this.b(string3);
                z8_0.a(aHK2, bufferedImage);
                ResourceLocation resourceLocation = new ResourceLocation(OQ.a, string3);
                z8_0.a(aHK2, resourceLocation);
            }
            vl_2.a(sF, aHK2);
            ++n;
        }
        return sF;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u001e\u007fn\u001a\u0010\u0004\u0003r{\u0012\u0006\u0016h\u007f\u001e\u0015H";
        int n2 = "\u001e\u007fn\u001a\u0010\u0004\u0003r{\u0012\u0006\u0016h\u007f\u001e\u0015H".length();
        int n3 = 5;
        int n4 = -1;
        while (true) {
            char[] cArray;
            block5: {
                int n5;
                char[] cArray2;
                int n6;
                int n7;
                block4: {
                    int n8 = ++n4;
                    char[] cArray3 = string.substring(n8, n8 + n3).toCharArray();
                    int n9 = cArray3.length;
                    n7 = 0;
                    n6 = 108;
                    cArray2 = cArray3;
                    n5 = n9;
                    if (n9 <= 1) break block4;
                    cArray = cArray2;
                    n5 = n5;
                    if (n5 <= n7) break block5;
                }
                do {
                    cArray2 = cArray2;
                    int n10 = n7;
                    int cfr_ignored_0 = n7 % 7;
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x1B));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                c = stringArray2[2];
                b = stringArray2[1];
                d = stringArray2[0];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private aHK a(String string) {
        String string2 = aL0.a(aL0.a(new StringBuilder(), OQ.t), string).toString();
        try {
            byte[] byArray = aFY.a(string2, MCInvoker.R(MCInvoker.f()));
            String string3 = new String(byArray, OQ.s);
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = (JsonObject)a1r.a(jsonParser, string3);
            new aGA();
            aHK aHK2 = aOF.a(jsonObject);
            return aHK2;
        }
        catch (Exception exception) {
            ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), OQ.f), string), OQ.p), ara_2.b(exception.getClass())), OQ.i), ch_2.b(exception)).toString());
            return null;
        }
    }

    public rt_0(String string) {
        this.a = string;
    }

    private BufferedImage b(String string) {
        String string2 = aL0.a(aL0.a(new StringBuilder(), OQ.u), string).toString();
        try {
            byte[] byArray = aFY.a(string2, MCInvoker.R(MCInvoker.f()));
            BufferedImage bufferedImage = aI8.a(new ByteArrayInputStream(byArray));
            return bufferedImage;
        }
        catch (IOException iOException) {
            ys_2.d(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), OQ.j), string), OQ.g), ara_2.b(iOException.getClass())), OQ.n), a4E.a(iOException)).toString());
            return null;
        }
    }
}

