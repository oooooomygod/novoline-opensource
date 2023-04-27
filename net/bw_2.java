/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bw
 */
public class bw_2
extends am_0 {
    @Override
    public int a() {
        return 0;
    }

    @Override
    public String b() {
        return agn_2.b;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length <= 0) {
            throw new ip_2(agn_2.a, new Object[0]);
        }
        IChatComponent iChatComponent = bw_2.a(iCommandSender, stringArray, 0, !(iCommandSender instanceof EntityPlayer));
        aek_1.a(ServerInvoker.R(ServerInvoker.d()), new aoz_1(agn_2.d, alj_1.c(iCommandSender), iChatComponent));
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return bw_2.a(stringArray, ServerInvoker.r(ServerInvoker.d()));
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return agn_2.c;
    }
}

