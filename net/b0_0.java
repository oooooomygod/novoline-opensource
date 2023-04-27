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
 * Renamed from net.b0
 */
public class b0_0
extends am_0 {
    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length >= 1 ? b0_0.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : null;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length >= 1 && !StringInvoker.g(stringArray[0])) {
            MinecraftServer minecraftServer = ServerInvoker.d();
            aUu.a(ServerInvoker.L(minecraftServer), stringArray[0]);
            throw new ht_1(aeb_1.c, stringArray[0]);
        }
        throw new ip_2(aeb_1.f, new Object[0]);
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aeb_1.d;
    }

    @Override
    public int a() {
        return 3;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b() {
        return aeb_1.a;
    }

    @Override
    public boolean a(ICommandSender iCommandSender) {
        return aCY.a(aek_1.o(ServerInvoker.R(ServerInvoker.d()))) && super.a(iCommandSender);
    }
}

