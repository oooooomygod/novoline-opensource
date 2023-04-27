/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bS
 */
public class bs_1
extends am_0 {
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length >= 1 && stringArray.length <= 2) {
            int n = (300 + a5_0.a(new Random(), 600)) * 20;
            if (stringArray.length >= 2) {
                n = bs_1.a(stringArray[1], 1, 1000000) * 20;
            }
            WorldServer worldServer = ServerInvoker.d().r[0];
            WorldInfo worldInfo = aV8.s(worldServer);
            if (StringInvoker.d(aGG.d, stringArray[0])) {
                uv_2.i(worldInfo, n);
                uv_2.h(worldInfo, 0);
                uv_2.b(worldInfo, 0);
                uv_2.d(worldInfo, false);
                uv_2.e(worldInfo, false);
                bs_1.a(iCommandSender, (ICommand)this, aGG.i, new Object[0]);
            } else if (StringInvoker.d(aGG.m, stringArray[0])) {
                uv_2.i(worldInfo, 0);
                uv_2.h(worldInfo, n);
                uv_2.b(worldInfo, n);
                uv_2.d(worldInfo, true);
                uv_2.e(worldInfo, false);
                bs_1.a(iCommandSender, (ICommand)this, aGG.j, new Object[0]);
            } else {
                if (!StringInvoker.d(aGG.a, stringArray[0])) {
                    throw new ip_2(aGG.f, new Object[0]);
                }
                uv_2.i(worldInfo, 0);
                uv_2.h(worldInfo, n);
                uv_2.b(worldInfo, n);
                uv_2.d(worldInfo, true);
                uv_2.e(worldInfo, true);
                bs_1.a(iCommandSender, (ICommand)this, aGG.c, new Object[0]);
            }
            return;
        }
        throw new ip_2(aGG.h, new Object[0]);
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aGG.b;
    }

    @Override
    public String b() {
        return aGG.k;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bs_1.a(stringArray, aGG.l, aGG.g, aGG.e) : null;
    }

    @Override
    public int a() {
        return 2;
    }
}

