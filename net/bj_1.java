/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.MinecraftServer;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bJ
 */
public class bj_1
extends am_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(ICommandSender iCommandSender) {
        return aCY.a(aek_1.o(ServerInvoker.R(ServerInvoker.d()))) && super.a(iCommandSender);
    }

    @Override
    public String b() {
        return ay6_0.c;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length == 1 && !StringInvoker.g(stringArray[0])) {
            MinecraftServer minecraftServer = ServerInvoker.d();
            aCY.a(aek_1.o(ServerInvoker.R(minecraftServer)), stringArray[0]);
            throw new ht_1(ay6_0.a, stringArray[0]);
        }
        throw new ip_2(ay6_0.b, new Object[0]);
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bj_1.a(stringArray, aCY.b(aek_1.o(ServerInvoker.R(ServerInvoker.d())))) : null;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return ay6_0.d;
    }
}

