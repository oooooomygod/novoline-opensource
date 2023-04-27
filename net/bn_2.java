/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bn
 */
public class bn_2
extends am_0 {
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 4) {
            throw new ip_2(ym_2.i, new Object[0]);
        }
        alj_1.a(iCommandSender, a9N.AFFECTED_BLOCKS, 0);
        BlockPos blockPos = bn_2.b(iCommandSender, stringArray, 0, false);
        World world = alj_1.a(iCommandSender);
        if (!aV8.isBlockLoaded(world, blockPos)) {
            throw new ht_1(ym_2.b, new Object[0]);
        }
        aV8.z(world, blockPos);
        throw new ht_1(ym_2.g, new Object[0]);
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return ym_2.a;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length > 0 && stringArray.length <= 3 ? bn_2.b(stringArray, 0, blockPos) : null;
    }

    @Override
    public String b() {
        return ym_2.f;
    }

    private static az3_0 a(az3_0 az3_02) {
        return az3_02;
    }

    @Override
    public int a() {
        return 2;
    }
}

