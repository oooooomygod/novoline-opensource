/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bK
 */
public class bk_1
extends am_0 {
    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return bk_1.a(stringArray, ServerInvoker.r(ServerInvoker.d()));
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 2) {
            throw new ip_2(aIO.d, new Object[0]);
        }
        EntityPlayerMP entityPlayerMP = bk_1.f(iCommandSender, stringArray[0]);
        if (entityPlayerMP == iCommandSender) {
            throw new i6_0(aIO.b, new Object[0]);
        }
        IChatComponent iChatComponent = bk_1.a(iCommandSender, stringArray, 1, !(iCommandSender instanceof EntityPlayer));
        aoz_1 aoz_12 = new aoz_1(aIO.h, alj_1.c(iCommandSender), aBO.c(iChatComponent));
        aoz_1 aoz_13 = new aoz_1(aIO.g, a6w_0.w(entityPlayerMP), aBO.c(iChatComponent));
        HX.a(HX.a(aIW.a(aoz_12), anw_0.GRAY), Boolean.TRUE);
        HX.a(HX.a(aIW.a(aoz_13), anw_0.GRAY), Boolean.TRUE);
        a6w_0.a((EntityPlayer)entityPlayerMP, aoz_12);
        alj_1.a(iCommandSender, aoz_13);
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public List<String> a() {
        return a7r_0.a(new String[]{aIO.a, aIO.e});
    }

    @Override
    public String b() {
        return aIO.f;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aIO.c;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}

