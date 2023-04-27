/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.C7;
import net.a2e_0;
import net.a3X;
import net.ams_0;
import net.apn_1;
import net.skidunion.a6;
import net.wc_0;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2={"Lnet/net.skidunion/aF;", "", "()V", "decoder", "Ljava/util/Base64$Decoder;", "kotlin.jvm.PlatformType", "encoder", "Ljava/util/Base64$Encoder;", "keyFactory", "Ljava/security/KeyFactory;", "a", "Ljava/security/PrivateKey;", "privateKeyBytes", "", "privateKeyBase64", "", "b", "Ljava/security/PublicKey;", "publicKeyBytes", "publicKeyBase64", "a", "privateKey", "a", "publicKey", "client"})
public class aF {
    @NotNull
    public PrivateKey a(@NotNull String string) {
        zx_2.b(string, a3X.k);
        byte[] byArray = apn_1.a(a6.b(), string);
        zx_2.a((Object)byArray, a3X.h);
        return this.a(byArray);
    }

    @NotNull
    public String a(@NotNull PublicKey publicKey) {
        zx_2.b(publicKey, a3X.c);
        String string = wc_0.a(a6.d(), C7.a(publicKey));
        zx_2.a((Object)string, a3X.b);
        return string;
    }

    @NotNull
    public PublicKey b(@NotNull String string) {
        zx_2.b(string, a3X.l);
        byte[] byArray = apn_1.a(a6.b(), string);
        zx_2.a((Object)byArray, a3X.a);
        return this.b(byArray);
    }

    @NotNull
    public PublicKey b(@NotNull byte[] byArray) {
        zx_2.b(byArray, a3X.f);
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byArray);
        PublicKey publicKey = a2e_0.a(a6.a(), x509EncodedKeySpec);
        zx_2.a((Object)publicKey, a3X.g);
        return publicKey;
    }

    private aF() {
    }

    @NotNull
    public String a(@NotNull PrivateKey privateKey) {
        zx_2.b(privateKey, a3X.d);
        String string = wc_0.a(a6.d(), ams_0.a(privateKey));
        zx_2.a((Object)string, a3X.j);
        return string;
    }

    @NotNull
    public PrivateKey a(@NotNull byte[] byArray) {
        zx_2.b(byArray, a3X.i);
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(byArray);
        PrivateKey privateKey = a2e_0.b(a6.a(), pKCS8EncodedKeySpec);
        zx_2.a((Object)privateKey, a3X.e);
        return privateKey;
    }

    public aF(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

