/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Chunk;
import net.minecraft.network.packts.S21PacketChunkData;

/*
 * Renamed from net.arF
 */
public class arf_1 {
    public static byte[] d(S21PacketChunkData s21PacketChunkData) {
        return s21PacketChunkData.e();
    }

    public static int a(S21PacketChunkData s21PacketChunkData) {
        return s21PacketChunkData.b();
    }

    public static boolean e(S21PacketChunkData s21PacketChunkData) {
        return s21PacketChunkData.c();
    }

    public static ek_0 a(Chunk chunk, boolean bl, boolean bl2, int n) {
        return S21PacketChunkData.a(chunk, bl, bl2, n);
    }

    public static int b(S21PacketChunkData s21PacketChunkData) {
        return s21PacketChunkData.a();
    }

    public static int c(S21PacketChunkData s21PacketChunkData) {
        return s21PacketChunkData.d();
    }
}

