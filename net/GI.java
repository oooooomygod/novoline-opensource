/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.S01PacketEncryptionRequest;
import java.security.PublicKey;

public class GI {
    public static String b(S01PacketEncryptionRequest s01PacketEncryptionRequest) {
        return s01PacketEncryptionRequest.a();
    }

    public static byte[] c(S01PacketEncryptionRequest s01PacketEncryptionRequest) {
        return s01PacketEncryptionRequest.c();
    }

    public static PublicKey a(S01PacketEncryptionRequest s01PacketEncryptionRequest) {
        return s01PacketEncryptionRequest.b();
    }
}

