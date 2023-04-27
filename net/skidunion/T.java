/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.StringInvoker;
import java.io.InputStream;
import java.net.URI;
import java.security.KeyStore;
import javax.net.SocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import kotlin.Metadata;
import kotlin.TypeCastException;
import net.a22;
import net.a2t_0;
import net.aLM;
import net.ara_2;
import net.axn_0;
import net.cs_0;
import net.skidunion.O;
import net.skidunion.aP;
import net.skidunion.i_0;
import net.skidunion.o_0;
import net.ve_0;
import net.yc_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u001f\u0010\f\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\r\"\u00020\u000b\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0006J\u001e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0005"}, d2={"Lnet/net.skidunion/T;", "", "serverURI", "Ljava/net/URI;", "(Ljava/net/URI;)V", "a", "Lnet/net.skidunion/aP;", "a", "()Lnet/net.skidunion/aP;", "a", "listener", "Lnet/net.skidunion/O;", "a", "", "([Lnet/net.skidunion/O;)Lnet/net.skidunion/T;", "b", "b", "keyStoreResourcePath", "", "storePassword", "keyPassword", "b", "Ljava/io/InputStream;", "resourcePath", "a", "Ljavax/net/SocketFactory;", "a", "hashFunction", "Lnet/net.skidunion/o;", "c", "secret", "a", "token"})
public class T {
    @NotNull
    private aP a;

    @NotNull
    public aP a() {
        return this.a;
    }

    @NotNull
    public aP b() {
        aP aP10;
        aP aP11 = aP10 = this.a;
        yc_1.e(aP11);
        return aP10;
    }

    @NotNull
    public T c(@NotNull String string) {
        zx_2.b(string, axn_0.k);
        yc_1.a(this.a, string);
        return this;
    }

    @NotNull
    public T a(@NotNull O o) {
        zx_2.b(o, axn_0.b);
        ve_0.a(yc_1.a(this.a), o);
        return this;
    }

    @NotNull
    public T b(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        zx_2.b(string, axn_0.i);
        zx_2.b(string2, axn_0.v);
        zx_2.b(string3, axn_0.e);
        this.a.setSocketFactory(this.a(string, string2, string3));
        return this;
    }

    @NotNull
    public T a(O ... oArray) {
        zx_2.b(oArray, axn_0.a);
        O[] oArray2 = oArray;
        aP.g();
        O[] oArray3 = oArray2;
        int n = oArray3.length;
        int n2 = 0;
        if (n2 < n) {
            O o;
            O o2 = o = oArray3[n2];
            ve_0.a(yc_1.a(this.a), o2);
            ++n2;
        }
        return this;
    }

    private static TypeCastException a(TypeCastException typeCastException) {
        return typeCastException;
    }

    private SocketFactory a(String string, String string2, String string3) {
        KeyStore keyStore = a2t_0.a(axn_0.p);
        Object object = string2;
        InputStream inputStream = this.b(string);
        KeyStore keyStore2 = keyStore;
        boolean bl = false;
        String string4 = object;
        if (string4 == null) {
            throw new TypeCastException(axn_0.o);
        }
        char[] cArray = StringInvoker.f(string4);
        zx_2.a((Object)cArray, axn_0.u);
        char[] cArray2 = cArray;
        a2t_0.a(keyStore2, inputStream, cArray2);
        Object object2 = aLM.a(axn_0.h);
        boolean bl2 = false;
        KeyManagerFactory keyManagerFactory = object2;
        boolean bl3 = false;
        String string5 = string3;
        KeyStore keyStore3 = keyStore;
        KeyManagerFactory keyManagerFactory2 = keyManagerFactory;
        String string6 = string5;
        if (string6 == null) {
            throw new TypeCastException(axn_0.s);
        }
        char[] cArray3 = StringInvoker.f(string6);
        zx_2.a((Object)cArray3, axn_0.m);
        char[] cArray4 = cArray3;
        aLM.a(keyManagerFactory2, keyStore3, cArray4);
        object = object2;
        Object object3 = a22.a(axn_0.l);
        boolean bl4 = false;
        Object object4 = object3;
        boolean bl5 = false;
        a22.a((TrustManagerFactory)object4, keyStore);
        object2 = object3;
        object3 = cs_0.a(axn_0.c);
        bl4 = false;
        object4 = object3;
        bl5 = false;
        Object object5 = object;
        zx_2.a(object5, axn_0.f);
        KeyManager[] keyManagerArray = aLM.a((KeyManagerFactory)object5);
        Object object6 = object2;
        zx_2.a(object6, axn_0.t);
        cs_0.a((SSLContext)object4, keyManagerArray, a22.a((TrustManagerFactory)object6), null);
        Object object7 = object3;
        zx_2.a(object7, axn_0.j);
        SSLSocketFactory sSLSocketFactory = cs_0.a((SSLContext)object7);
        zx_2.a((Object)sSLSocketFactory, axn_0.r);
        return sSLSocketFactory;
    }

    public T(@NotNull URI uRI) {
        zx_2.b(uRI, axn_0.d);
        this.a = new aP(uRI);
    }

    private InputStream b(String string) {
        InputStream inputStream = ara_2.b(((Object)((Object)i_0.a)).getClass(), string);
        zx_2.a((Object)inputStream, axn_0.n);
        return inputStream;
    }

    @NotNull
    public T a(@NotNull o_0 o_02) {
        zx_2.b(o_02, axn_0.g);
        yc_1.a(this.a, o_02);
        return this;
    }

    @NotNull
    public T a(@NotNull String string) {
        zx_2.b(string, axn_0.q);
        yc_1.b(this.a, string);
        return this;
    }
}

