/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.Cache
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.cache.Cache;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import net.M0;
import net.WN;
import net.a0_0;
import net.a4W;
import net.aCw;
import net.aFW;
import net.aL0;
import net.aLY;
import net.aM4;
import net.aZ2;
import net.amv_2;
import net.anw_0;
import net.asl_0;
import net.avg_1;
import net.azp_2;
import net.p5;
import net.te_0;
import net.vb_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.bW
 */
public class bw_1
extends a0_0 {
    private SimpleDateFormat k;
    private Cache<String, aCw> l = aM4.a(aM4.a(aM4.c(), 5L, TimeUnit.MINUTES));

    public void d(String string, int n) {
        aFW.a(aFW.a(), () -> this.lambda$print$0(string, n));
    }

    private void lambda$null$2(HttpURLConnection httpURLConnection) {
        this.e(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), avg_1.k).toString());
    }

    private @NonNull String a(@NonNull aCw aCw2) {
        amv_2.b();
        List<azp_2> list = aCw2.b();
        if (ListInvoker.isEmpty(list)) {
            throw new RuntimeException();
        }
        if (ListInvoker.size(list) == 1) {
            return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), avg_1.z), (Object)anw_0.GOLD), (Object)anw_0.BOLD), ((azp_2)ListInvoker.get(list, 0)).a()), avg_1.x).toString();
        }
        azp_2 azp_22 = (azp_2)ListInvoker.get(list, 0);
        String string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), avg_1.C), anw_0.GOLD.toString()), (Object)anw_0.BOLD), azp_22.a()), (Object)anw_0.GOLD), avg_1.B).toString();
        StringBuilder stringBuilder = new StringBuilder(string);
        int n = 1;
        if (n < ListInvoker.size(list) - 1) {
            azp_22 = (azp_2)ListInvoker.get(list, n++);
            aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(stringBuilder, avg_1.D), (Object)anw_0.GOLD), avg_1.a), azp_22.a()), avg_1.i), this.a(azp_22.b())), avg_1.j);
        }
        azp_22 = (azp_2)ListInvoker.get(list, n);
        aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(stringBuilder, avg_1.m), (Object)anw_0.GOLD), avg_1.h), azp_22.a()), avg_1.d), this.a(azp_22.b())), avg_1.f);
        return stringBuilder.toString();
    }

    private @NonNull String a(long l4) {
        return aZ2.a(this.k, new Date(l4));
    }

    private aCw lambda$getPlayer$3(String string) throws Exception {
        amv_2.b();
        HttpURLConnection httpURLConnection = vb_0.a(aL0.a(aL0.a(new StringBuilder(), avg_1.l), string).toString());
        JsonElement jsonElement = vb_0.a(httpURLConnection, arg_0 -> this.lambda$null$1(string, arg_0), JsonElement.class);
        if (jsonElement == null) {
            return null;
        }
        if ((jsonElement = M0.d(WN.c(jsonElement), avg_1.c)) == null || !WN.k(jsonElement)) {
            throw new RuntimeException(avg_1.b);
        }
        String string2 = WN.f(jsonElement);
        httpURLConnection = vb_0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), avg_1.o), string2), avg_1.s).toString());
        JsonArray jsonArray = (JsonArray)vb_0.a(httpURLConnection, this::lambda$null$2, JsonArray.class);
        return new aCw((List)a4W.a(vb_0.a(), (JsonElement)jsonArray, new p5(this).getType()), null);
    }

    public bw_1(@NonNull Novoline novoline, String string, String string2) {
        super(novoline, string, string2);
        this.k = new SimpleDateFormat(avg_1.e);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void a(String[] stringArray, int n, int n2) {
        amv_2.b();
        if (stringArray.length < 1) {
            this.b(avg_1.u);
            return;
        }
        String string = stringArray[0];
        this.d(string, 0);
    }

    private void lambda$null$1(String string, HttpURLConnection httpURLConnection) {
        try {
            this.e(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), avg_1.y), string), avg_1.r), te_0.f(httpURLConnection)), avg_1.g).toString());
        }
        catch (IOException iOException) {
            this.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), avg_1.w), string), avg_1.n).toString());
            LoggerInvoker.b(this.c(), avg_1.p, iOException);
        }
    }

    public aCw a(@NonNull String string) throws ExecutionException {
        asl_0.a(string, avg_1.q);
        return (aCw)aLY.a(this.l, StringInvoker.i(string), () -> this.lambda$getPlayer$3(string));
    }

    private void lambda$print$0(String string, int n) {
        amv_2.b();
        try {
            aCw aCw2 = this.a(string);
            return;
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(this.c(), avg_1.A, throwable);
            return;
        }
    }
}

