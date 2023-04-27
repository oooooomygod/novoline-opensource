/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.text.Charsets
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net.skidunion;

import cc.novoline.invoke.StringInvoker;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.text.Charsets;
import net.BH;
import net.EE;
import net.a2e_0;
import net.aMR;
import net.anu_2;
import net.apn_1;
import net.skidunion.J;
import net.skidunion.aF;
import net.skidunion.n_0;
import net.wc_0;
import net.yr_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020\u0013H\u0002R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\b\u000eR\u0018\u0010\u000f\u001a\n \u000b*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\b\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0005\u00a8\u0006&"}, d2={"Lnet/net.skidunion/a6;", "Lnet/net.skidunion/n;", "()V", "h", "Ljava/security/PublicKey;", "(Ljava/security/PublicKey;)V", "c", "Ljava/security/PrivateKey;", "(Ljava/security/PrivateKey;)V", "e", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "l", "Ljava/util/Base64$Decoder;", "k", "f", "Ljava/util/Base64$Encoder;", "a", "j", "Ljava/security/KeyPair;", "b", "", "f", "()Ljava/security/PrivateKey;", "a", "g", "()Ljava/security/PublicKey;", "a", "a", "", "data", "", "a", "c", "b", "d", "e", "d", "client"})
public class a6
implements n_0 {
    @Nullable
    private PublicKey h;
    private KeyPair j;
    private static KeyFactory i;
    private Base64.Encoder a;
    private static String[] g;
    private Cipher e;
    private Base64.Decoder k;
    public static aF d;
    @Nullable
    private PrivateKey c;
    private int b = 2048;
    private static Base64.Encoder f;
    private static Base64.Decoder l;

    public a6(@NotNull PublicKey publicKey) {
        zx_2.b(publicKey, BH.d);
        this.b = 2048;
        this.e = yr_1.b(BH.f);
        this.k = anu_2.a();
        this.a = anu_2.b();
        this.h = publicKey;
    }

    public a6(@NotNull PrivateKey privateKey) {
        zx_2.b(privateKey, BH.e);
        this.b = 2048;
        this.e = yr_1.b(BH.w);
        this.k = anu_2.a();
        this.a = anu_2.b();
        this.c = privateKey;
    }

    public static void b(String[] stringArray) {
        g = stringArray;
    }

    @NotNull
    public byte[] a(@NotNull byte[] byArray) throws J {
        a6.c();
        zx_2.b(byArray, BH.h);
        if (this.c == null) {
            throw (Throwable)new J(BH.z);
        }
        try {
            yr_1.a(this.e, 2, this.c);
            byte[] byArray2 = yr_1.a(this.e, byArray);
            zx_2.a((Object)byArray2, BH.v);
            return byArray2;
        }
        catch (Exception exception) {
            throw (Throwable)new J(BH.x, exception);
        }
    }

    public static Base64.Decoder b() {
        return l;
    }

    private KeyPair e() {
        try {
            KeyPairGenerator keyPairGenerator;
            KeyPairGenerator keyPairGenerator2 = keyPairGenerator = aMR.a(BH.n);
            aMR.a(keyPairGenerator2, this.b);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            zx_2.a((Object)keyPair, BH.i);
            return keyPair;
        }
        catch (Exception exception) {
            throw (Throwable)new J(BH.l, exception);
        }
    }

    public void a(@Nullable PublicKey publicKey) {
        this.h = publicKey;
    }

    static {
        d = new aF(null);
        l = anu_2.a();
        f = anu_2.b();
        a6.b(new String[3]);
        i = a2e_0.a(BH.m);
    }

    public void a(@Nullable PrivateKey privateKey) {
        this.c = privateKey;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static String[] c() {
        return g;
    }

    @Override
    @NotNull
    public byte[] a(@NotNull String string) throws J {
        a6.c();
        zx_2.b(string, BH.c);
        if (this.c == null) {
            throw (Throwable)new J(BH.b);
        }
        try {
            yr_1.a(this.e, 2, this.c);
            byte[] byArray = yr_1.a(this.e, apn_1.a(this.k, string));
            zx_2.a((Object)byArray, BH.u);
            return byArray;
        }
        catch (Exception exception) {
            throw (Throwable)new J(BH.o, exception);
        }
    }

    @Override
    @NotNull
    public byte[] b(@NotNull String string) throws J {
        a6.c();
        zx_2.b(string, BH.q);
        if (this.h == null) {
            throw (Throwable)new J(BH.r);
        }
        try {
            yr_1.a(this.e, 1, this.h);
            String string2 = string;
            Cipher cipher = this.e;
            Charset charset = Charsets.UTF_8;
            byte[] byArray = StringInvoker.a(string2, charset);
            zx_2.a((Object)byArray, BH.A);
            byte[] byArray2 = byArray;
            byte[] byArray3 = yr_1.a(cipher, byArray2);
            zx_2.a((Object)byArray3, BH.a);
            return byArray3;
        }
        catch (Exception exception) {
            throw (Throwable)new J(BH.y, exception);
        }
    }

    @Nullable
    public PublicKey g() {
        return this.h;
    }

    @Override
    @NotNull
    public String c(@NotNull String string) throws J {
        zx_2.b(string, BH.t);
        byte[] byArray = this.a(string);
        return new String(byArray, Charsets.UTF_8);
    }

    public a6() {
        a6.c();
        this.b = 2048;
        this.e = yr_1.b(BH.j);
        this.k = anu_2.a();
        this.a = anu_2.b();
        KeyPair keyPair = this.j = this.e();
        if (keyPair == null) {
            zx_2.a(BH.p);
        }
        this.h = EE.b(keyPair);
        KeyPair keyPair2 = this.j;
        if (keyPair2 == null) {
            zx_2.a(BH.k);
        }
        this.c = EE.a(keyPair2);
    }

    public static Base64.Encoder d() {
        return f;
    }

    public static KeyFactory a() {
        return i;
    }

    @Nullable
    public PrivateKey f() {
        return this.c;
    }

    @Override
    @NotNull
    public String d(@NotNull String string) throws J {
        zx_2.b(string, BH.s);
        String string2 = wc_0.a(this.a, this.b(string));
        zx_2.a((Object)string2, BH.g);
        return string2;
    }
}

