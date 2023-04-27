/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.SA;
import net.anu_2;
import net.apn_1;
import net.mj_2;
import net.wc_0;
import net.yr_1;

/*
 * Renamed from net.wJ
 */
public class wj_1 {
    public static Base64.Encoder d;
    public static Charset e;
    public static Base64.Decoder c;
    private SecretKeySpec b;
    private Cipher a;
    private static boolean f;

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public String d(byte[] byArray, byte[] byArray2) throws SA {
        return new String(this.b(byArray, byArray2));
    }

    public String c(byte[] byArray, byte[] byArray2) throws SA {
        return wc_0.a(d, this.a(byArray, byArray2));
    }

    public byte[] a(String string, byte[] byArray) throws SA {
        return this.b(apn_1.a(c, string), byArray);
    }

    public String d(String string, byte[] byArray) throws SA {
        return new String(this.b(apn_1.a(c, string), byArray));
    }

    public wj_1(String string) {
        this(StringInvoker.a(string, e));
    }

    static {
        e = StandardCharsets.UTF_8;
        c = anu_2.a();
        d = anu_2.b();
        wj_1.b(false);
    }

    public wj_1(byte[] byArray) {
        this.b = new SecretKeySpec(byArray, mj_2.a);
        try {
            this.a = yr_1.b(mj_2.b);
            return;
        }
        catch (NoSuchAlgorithmException | NoSuchPaddingException generalSecurityException) {
            throw new RuntimeException(generalSecurityException);
        }
    }

    public String c(String string, byte[] byArray) throws SA {
        return this.c(StringInvoker.a(string, e), byArray);
    }

    public byte[] b(byte[] byArray, byte[] byArray2) throws SA {
        byte[] byArray3;
        wj_1.b();
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(byArray2);
            yr_1.a(this.a, 2, this.b, ivParameterSpec);
            byArray3 = yr_1.a(this.a, byArray);
        }
        catch (Throwable throwable) {
            throw new SA(throwable);
        }
        if (ListInvoker.b() != null) {
            wj_1.b(false);
        }
        return byArray3;
    }

    public byte[] a(byte[] byArray, byte[] byArray2) throws SA {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(byArray2);
            yr_1.a(this.a, 1, this.b, ivParameterSpec);
            return yr_1.a(this.a, byArray);
        }
        catch (Throwable throwable) {
            throw new SA(throwable);
        }
    }

    public static boolean b() {
        return f;
    }

    public static boolean a() {
        wj_1.b();
        return true;
    }

    public byte[] b(String string, byte[] byArray) throws SA {
        return this.a(StringInvoker.a(string, e), byArray);
    }

    public static void b(boolean bl) {
        f = bl;
    }
}

