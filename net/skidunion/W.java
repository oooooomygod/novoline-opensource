/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.text.Charsets
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.text.Charsets;
import net.M0;
import net.WN;
import net.a1r;
import net.a4W;
import net.a7r_0;
import net.aQ_;
import net.am9_0;
import net.ama_2;
import net.anu_2;
import net.apn_1;
import net.azt_0;
import net.skidunion.J;
import net.skidunion.S;
import net.skidunion.a6;
import net.skidunion.n_0;
import net.wc_0;
import net.yr_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\f\u0010\u0018\u001a\u00020\u0013*\u00020\u0019H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lnet/net.skidunion/W;", "Lnet/net.skidunion/n;", "password", "", "(Ljava/lang/String;)V", "d", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "e", "Ljava/util/Base64$Encoder;", "c", "Lcom/google/gson/Gson;", "b", "Ljavax/crypto/Mac;", "f", "Ljavax/crypto/spec/SecretKeySpec;", "a", "Ljava/security/SecureRandom;", "a", "", "data", "c", "b", "d", "a", "Lcom/google/gson/JsonElement;", "client"})
public class W
implements n_0 {
    private SecureRandom a;
    private Cipher d;
    private SecretKeySpec f;
    private Base64.Encoder e;
    private Mac b;
    private Gson c;

    @Override
    @NotNull
    public String d(@NotNull String string) {
        Charset charset;
        Cipher cipher;
        Object object;
        zx_2.b(string, am9_0.b);
        a6.c();
        JsonObject jsonObject = new JsonObject();
        Cipher cipher2 = this.d;
        zx_2.a((Object)cipher2, am9_0.k);
        byte[] byArray = new byte[yr_1.a(cipher2)];
        boolean bl = false;
        boolean bl2 = false;
        byte[] byArray2 = byArray;
        ama_2.a(this.a, byArray2);
        byte[] byArray3 = byArray;
        try {
            yr_1.a(this.d, 1, this.f, new IvParameterSpec(byArray3));
            azt_0.a(this.b, this.f);
            object = string;
            cipher = this.d;
            charset = Charsets.UTF_8;
            boolean bl3 = false;
        }
        catch (Exception exception) {
            throw (Throwable)new J(am9_0.F, exception);
        }
        byte[] byArray4 = StringInvoker.a((String)object, charset);
        zx_2.a((Object)byArray4, am9_0.E);
        byte[] byArray5 = byArray4;
        byArray = yr_1.a(cipher, byArray5);
        object = azt_0.a(this.b, byArray);
        M0.a(jsonObject, am9_0.p, wc_0.a(this.e, byArray3));
        M0.a(jsonObject, am9_0.l, wc_0.a(this.e, (byte[])object));
        M0.a(jsonObject, am9_0.B, wc_0.a(this.e, byArray));
        String string2 = a4W.a(this.c, (JsonElement)jsonObject);
        zx_2.a((Object)string2, am9_0.d);
        ListInvoker.b(new ListInvoker[2]);
        return string2;
    }

    public W(@NotNull String string) {
        a6.c();
        zx_2.b(string, am9_0.x);
        this.a = new SecureRandom();
        this.d = yr_1.b(am9_0.w);
        Mac mac = azt_0.a(am9_0.v);
        zx_2.a((Object)mac, am9_0.t);
        this.b = mac;
        String string2 = aQ_.b(S.d, string);
        int n = 0;
        int n2 = 16;
        W w = this;
        String string3 = string2;
        if (string3 == null) {
            throw new TypeCastException(am9_0.j);
        }
        String string4 = StringInvoker.b(string3, n, n2);
        zx_2.a((Object)string4, am9_0.c);
        Object object = string4;
        string2 = object;
        Charset charset = Charsets.UTF_8;
        n2 = 0;
        String string5 = string2;
        if (string5 == null) {
            throw new TypeCastException(am9_0.C);
        }
        byte[] byArray = StringInvoker.a(string5, charset);
        zx_2.a((Object)byArray, am9_0.q);
        object = byArray;
        String string6 = am9_0.n;
        Object object2 = object;
        w.f = new SecretKeySpec((byte[])object2, string6);
        this.c = new Gson();
        this.e = anu_2.b();
        if (ListInvoker.b() != null) {
            a6.b(new String[4]);
        }
    }

    @Override
    @NotNull
    public String c(@NotNull String string) {
        zx_2.b(string, am9_0.g);
        byte[] byArray = this.a(string);
        return new String(byArray, Charsets.UTF_8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public byte[] a(@NotNull String string) throws J {
        zx_2.b(string, am9_0.y);
        a6.c();
        JsonElement jsonElement = a1r.a(new JsonParser(), string);
        zx_2.a((Object)jsonElement, am9_0.A);
        JsonObject jsonObject = WN.c(jsonElement);
        JsonElement jsonElement2 = M0.d(jsonObject, am9_0.e);
        zx_2.a((Object)jsonElement2, am9_0.s);
        byte[] byArray = this.a(jsonElement2);
        JsonElement jsonElement3 = M0.d(jsonObject, am9_0.z);
        zx_2.a((Object)jsonElement3, am9_0.r);
        byte[] byArray2 = this.a(jsonElement3);
        JsonElement jsonElement4 = M0.d(jsonObject, am9_0.m);
        zx_2.a((Object)jsonElement4, am9_0.u);
        byte[] byArray3 = this.a(jsonElement4);
        try {
            try {
                azt_0.a(this.b, this.f);
                if (a7r_0.a(byArray3, azt_0.a(this.b, byArray))) {
                    yr_1.a(this.d, 2, this.f, new IvParameterSpec(byArray2));
                    byte[] byArray4 = yr_1.a(this.d, byArray);
                    zx_2.a((Object)byArray4, am9_0.i);
                    return byArray4;
                }
                throw (Throwable)new J(am9_0.D);
            }
            catch (J j) {
                throw (Throwable)j;
            }
        }
        catch (Exception exception) {
            throw (Throwable)new J(am9_0.h, exception);
        }
    }

    private byte[] a(@NotNull JsonElement jsonElement) {
        byte[] byArray = apn_1.a(anu_2.a(), WN.f(jsonElement));
        zx_2.a((Object)byArray, am9_0.G);
        return byArray;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    @NotNull
    public byte[] b(@NotNull String string) throws J {
        zx_2.b(string, am9_0.o);
        String string2 = this.d(string);
        Charset charset = Charsets.UTF_8;
        String string3 = string2;
        if (string3 == null) {
            throw new TypeCastException(am9_0.a);
        }
        byte[] byArray = StringInvoker.a(string3, charset);
        zx_2.a((Object)byArray, am9_0.f);
        return byArray;
    }
}

