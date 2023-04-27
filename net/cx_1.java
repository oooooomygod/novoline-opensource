/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.cx
 */
public class cx_1
extends am_0 {
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 4) {
            throw new ip_2(pt_2.h, new Object[0]);
        }
        alj_1.a(iCommandSender, a9N.AFFECTED_BLOCKS, 0);
        cx_1.b(iCommandSender, stringArray, 0, false);
        BlocksInvoker.a(stringArray[3]);
        throw new iy_2(pt_2.k, stringArray[3]);
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length > 0 && stringArray.length <= 3 ? cx_1.b(stringArray, 0, blockPos) : (stringArray.length == 4 ? cx_1.a(stringArray, a82.c(Block.m)) : null);
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return pt_2.j;
    }

    @Override
    public int a() {
        return 2;
    }

    private static az3_0 a(az3_0 az3_02) {
        return az3_02;
    }

    @Override
    public String b() {
        return pt_2.f;
    }
}

