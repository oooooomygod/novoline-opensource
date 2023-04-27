/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.List;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;

/*
 * Renamed from net.bs
 */
public class bs_2
extends am_0 {
    @Override
    public String b() {
        return aHM.c;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bs_2.a(stringArray, aHM.e, aHM.d) : null;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length >= 1 && StringInvoker.d(stringArray[0], aHM.b)) {
            alj_1.a(iCommandSender, new aoz_1(aHM.f, P8.d(aHN.b(aek_1.f(ServerInvoker.R(ServerInvoker.d()))).length)));
            alj_1.a(iCommandSender, new ChatComponentText(bs_2.a(aHN.b(aek_1.f(ServerInvoker.R(ServerInvoker.d()))))));
        } else {
            alj_1.a(iCommandSender, new aoz_1(aHM.g, P8.d(aCY.b(aek_1.o(ServerInvoker.R(ServerInvoker.d()))).length)));
            alj_1.a(iCommandSender, new ChatComponentText(bs_2.a(aCY.b(aek_1.o(ServerInvoker.R(ServerInvoker.d()))))));
        }
    }

    @Override
    public boolean a(ICommandSender iCommandSender) {
        return (aHN.a(aek_1.f(ServerInvoker.R(ServerInvoker.d()))) || aCY.a(aek_1.o(ServerInvoker.R(ServerInvoker.d())))) && super.a(iCommandSender);
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aHM.a;
    }
}

