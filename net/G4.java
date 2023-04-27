/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 */
package net;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import net.SF;
import net.a1r;
import net.a3U;
import net.aL0;
import net.aP2;
import net.agz_0;
import net.ara_2;
import net.ch_2;
import net.rt_0;
import net.tr_1;
import net.vl_2;
import net.xd_1;
import net.ys_2;

public class G4
implements agz_0 {
    private String a = null;

    @Override
    public void a(String string, byte[] byArray, Throwable throwable) {
        block3: {
            aP2.b();
            String string2 = new String(byArray, a3U.b);
            JsonParser jsonParser = new JsonParser();
            JsonElement jsonElement = a1r.a(jsonParser, string2);
            rt_0 rt_02 = new rt_0(this.a);
            SF sF = xd_1.a(rt_02, jsonElement);
            if (sF == null) break block3;
            try {
                vl_2.a(sF, true);
                tr_1.a(this.a, sF);
            }
            catch (Exception exception) {
                ys_2.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a3U.d), string), a3U.c), ara_2.b(exception.getClass())), a3U.a), ch_2.b(exception)).toString());
            }
        }
    }

    public G4(String string) {
        this.a = string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

