/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.Entity;
import deobf.ICommandManager;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.ba
 */
public class ba_1
extends am_0 {
    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? ba_1.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : (stringArray.length > 1 && stringArray.length <= 4 ? ba_1.b(stringArray, 1, blockPos) : (stringArray.length > 5 && stringArray.length <= 8 && US.f.equals(stringArray[4]) ? ba_1.b(stringArray, 5, blockPos) : (stringArray.length == 9 && US.c.equals(stringArray[4]) ? ba_1.a(stringArray, a82.c(Block.m)) : null)));
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return US.d;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        Object object;
        if (stringArray.length < 5) {
            throw new ip_2(US.e, new Object[0]);
        }
        Entity entity = ba_1.a(iCommandSender, stringArray[0], Entity.class);
        double d = ba_1.a(entity.posX, stringArray[1], false);
        double d2 = ba_1.a(entity.posY, stringArray[2], false);
        double d3 = ba_1.a(entity.posZ, stringArray[3], false);
        BlockPos blockPos = new BlockPos(d, d2, d3);
        int n = 4;
        if (US.h.equals(stringArray[4]) && stringArray.length > 10) {
            object = ayj_0.b(entity);
            double d4 = ba_1.a(d, stringArray[5], false);
            double d5 = ba_1.a(d2, stringArray[6], false);
            double d6 = ba_1.a(d3, stringArray[7], false);
            Block block = ba_1.e(iCommandSender, stringArray[8]);
            int n2 = ba_1.a(stringArray[9], -1, 15);
            BlockPos blockPos2 = new BlockPos(d4, d5, d6);
            IBlockState iBlockState = aV8.q((World)object, blockPos2);
            if (BlockStateInvoker.getBlock(iBlockState) != block || BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState) != n2) {
                throw new ht_1(US.b, US.i, ayj_0.x(entity));
            }
            n = 10;
        }
        object = ba_1.a(stringArray, n);
        adt_1 adt_12 = new adt_1(this, entity, iCommandSender, blockPos, d, d2, d3);
        ICommandManager iCommandManager = ServerInvoker.k(ServerInvoker.d());
        try {
            int n3 = yh_1.a(iCommandManager, adt_12, (String)object);
            if (n3 < 1) {
                throw new ht_1(US.a, object);
            }
            return;
        }
        catch (Throwable throwable) {
            throw new ht_1(US.j, object, ayj_0.x(entity));
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String b() {
        return US.g;
    }
}

