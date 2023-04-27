/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import net.VZ;
import net.a1c;
import net.aRt;
import net.ast_0;
import net.auh_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aZj
 */
public class azj_0 {
    private static long a = a1c.a(669359217625274098L, -1295528597550653512L, MethodHandles.lookup().lookupClass()).a(108921823070684L);
    private static String b = "This is a utility class and cannot be instantiated";

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private azj_0(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ a;
        throw new UnsupportedOperationException(b);
    }

    @NotNull
    public static aRt a(int n) {
        return VZ.a(n);
    }

    static {
        long l4 = a ^ 0x29291D8D0BC2L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        int n = 2;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l4 >>> 56);
        int n2 = 1;
        while (true) {
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l4 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    @NotNull
    public static auh_2 b(int n) {
        return ast_0.a(n);
    }
}

