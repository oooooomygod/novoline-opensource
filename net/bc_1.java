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
 * Renamed from net.bC
 */
public class bc_1
extends am_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String b() {
        return vh_1.c;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return vh_1.e;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length == 1 && !StringInvoker.g(stringArray[0])) {
            MinecraftServer minecraftServer = ServerInvoker.d();
            fr_0.a(aek_1.p(ServerInvoker.R(minecraftServer)), stringArray[0]);
            throw new ht_1(vh_1.b, stringArray[0]);
        }
        throw new ip_2(vh_1.d, new Object[0]);
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bc_1.a(stringArray, aek_1.i(ServerInvoker.R(ServerInvoker.d()))) : null;
    }
}

