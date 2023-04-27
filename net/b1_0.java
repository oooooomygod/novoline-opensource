/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.mojang.authlib.GameProfile;
import deobf.MinecraftServer;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.b1
 */
public class b1_0
extends am_0 {
    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        if (stringArray.length == 1) {
            String string = stringArray[stringArray.length - 1];
            ArrayList arrayList = my_0.c();
            for (GameProfile gameProfile : ServerInvoker.J(ServerInvoker.d())) {
                if (aek_1.a(ServerInvoker.R(ServerInvoker.d()), gameProfile) || !b1_0.a(string, a4Z.d(gameProfile))) continue;
                ListInvoker.add(arrayList, a4Z.d(gameProfile));
            }
            return arrayList;
        }
        return null;
    }

    @Override
    public String b() {
        return GG.d;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return GG.a;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length == 1 && !StringInvoker.g(stringArray[0])) {
            MinecraftServer minecraftServer = ServerInvoker.d();
            aUu.a(ServerInvoker.L(minecraftServer), stringArray[0]);
            throw new ht_1(GG.e, stringArray[0]);
        }
        throw new ip_2(GG.c, new Object[0]);
    }

    @Override
    public int a() {
        return 3;
    }
}

