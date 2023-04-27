/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.TypeCastException;
import net.GP;
import net.P8;
import net.adw_2;
import net.qn_1;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\r\u001a\u00020\n*\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2={"Lnet/net.skidunion/S;", "", "()V", "a", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "b", "a", "", "input", "", "b", "a", "a", "client"})
public class S {
    private static MessageDigest b;
    public static S d;
    private static String[] c;
    private static MessageDigest a;

    private byte[] a(@NotNull MessageDigest messageDigest, String string) {
        String string2 = string;
        Charset charset = StandardCharsets.UTF_8;
        zx_2.a((Object)charset, qn_1.i);
        Charset charset2 = charset;
        MessageDigest messageDigest2 = messageDigest;
        String string3 = string2;
        if (string3 == null) {
            throw new TypeCastException(qn_1.g);
        }
        byte[] byArray = StringInvoker.a(string3, charset2);
        zx_2.a((Object)byArray, qn_1.k);
        byte[] byArray2 = byArray;
        byte[] byArray3 = GP.a(messageDigest2, byArray2);
        zx_2.a((Object)byArray3, qn_1.m);
        return byArray3;
    }

    private S() {
    }

    @NotNull
    public String b(@NotNull String string) {
        zx_2.b(string, qn_1.a);
        MessageDigest messageDigest = a;
        zx_2.a((Object)messageDigest, qn_1.b);
        return this.a(this.a(messageDigest, string));
    }

    private String a(byte[] byArray) {
        StringBuffer stringBuffer = new StringBuffer();
        int n = 0;
        S.b();
        int n2 = byArray.length;
        if (n < n2) {
            String string = P8.b(0xFF & byArray[n]);
            if (StringInvoker.c(string) == 1) {
                adw_2.a(stringBuffer, '0');
            }
            adw_2.a(stringBuffer, string);
            ++n;
        }
        String string = stringBuffer.toString();
        zx_2.a((Object)string, qn_1.c);
        String string2 = string;
        n2 = 0;
        String string3 = string2;
        if (string3 == null) {
            throw new TypeCastException(qn_1.e);
        }
        String string4 = StringInvoker.i(string3);
        zx_2.a((Object)string4, qn_1.j);
        return string4;
    }

    public static void b(String[] stringArray) {
        c = stringArray;
    }

    @NotNull
    public String a(@NotNull String string) {
        S.b();
        zx_2.b(string, qn_1.d);
        MessageDigest messageDigest = b;
        zx_2.a((Object)messageDigest, qn_1.f);
        String string2 = this.a(this.a(messageDigest, string));
        if (ListInvoker.b() != null) {
            S.b(new String[1]);
        }
        return string2;
    }

    private static TypeCastException a(TypeCastException typeCastException) {
        return typeCastException;
    }

    static {
        S s;
        d = s = new S();
        b = GP.a(qn_1.h);
        a = GP.a(qn_1.l);
        S.b(new String[3]);
    }

    public static String[] b() {
        return c;
    }
}

