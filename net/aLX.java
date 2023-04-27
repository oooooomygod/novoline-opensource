/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package net;

import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import net.a5R;
import net.a8w_0;
import net.aZR;
import net.amt_1;
import net.ch_2;
import net.te_0;
import org.json.JSONObject;

public class aLX {
    private static ListInvoker[] b;

    public static JSONObject a(String string) {
        aLX.b();
        try {
            URL uRL = new URL(string);
            HttpURLConnection httpURLConnection = (HttpURLConnection)a5R.e(uRL);
            te_0.a(httpURLConnection, a8w_0.b);
            te_0.a(httpURLConnection, a8w_0.c, a8w_0.e);
            InputStream inputStream = te_0.c(httpURLConnection);
            return new JSONObject(IOUtilsInvoker.b(inputStream, amt_1.c()));
        }
        catch (Exception exception) {
            ch_2.a(exception);
            JSONObject jSONObject = aZR.a(aZR.a(new JSONObject(), a8w_0.f, false), a8w_0.a, a8w_0.d);
            ListInvoker.b(new ListInvoker[4]);
            return jSONObject;
        }
    }

    static {
        if (aLX.b() != null) {
            aLX.b(new ListInvoker[4]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

