/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C01PacketEncryptionResponse;
import java.security.PrivateKey;
import javax.crypto.SecretKey;

/*
 * Renamed from net.acr
 */
public class acr_1 {
    private static int b;

    static {
        if (acr_1.c() != 0) {
            acr_1.b(99);
        }
    }

    public static int b() {
        return b;
    }

    public static byte[] b(C01PacketEncryptionResponse c01PacketEncryptionResponse, PrivateKey privateKey) {
        return c01PacketEncryptionResponse.a(privateKey);
    }

    public static int c() {
        acr_1.b();
        return 39;
    }

    public static void b(int n) {
        b = n;
    }

    public static SecretKey a(C01PacketEncryptionResponse c01PacketEncryptionResponse, PrivateKey privateKey) {
        return c01PacketEncryptionResponse.b(privateKey);
    }
}

