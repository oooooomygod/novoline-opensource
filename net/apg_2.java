/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Chunk;
import net.minecraft.network.packts.S22PacketMultiBlockChange;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.apg
 */
public class apg_2 {
    private IBlockState b;
    S22PacketMultiBlockChange a;
    private short c;

    public apg_2(S22PacketMultiBlockChange s22PacketMultiBlockChange, short s, IBlockState iBlockState) {
        this.a = s22PacketMultiBlockChange;
        this.c = s;
        this.b = iBlockState;
    }

    public short b() {
        return this.c;
    }

    public apg_2(S22PacketMultiBlockChange s22PacketMultiBlockChange, short s, Chunk chunk) {
        this.a = s22PacketMultiBlockChange;
        this.c = s;
        this.b = aqp_2.b(chunk, this.a());
    }

    public BlockPos a() {
        return new BlockPos(aV0.a(S22PacketMultiBlockChange.a(this.a), this.c >> 12 & 0xF, this.c & 0xFF, this.c >> 8 & 0xF));
    }

    public IBlockState c() {
        return this.b;
    }
}

