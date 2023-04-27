/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayer;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.b9
 */
public class b9_0
extends am_0 {
    protected String[] a() {
        return ServerInvoker.d().C();
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length <= 0) {
            throw new ip_2(apo_2.b, new Object[0]);
        }
        String string = stringArray[0];
        boolean bl = StringInvoker.c(string, apo_2.e) || StringInvoker.c(string, apo_2.h);
        if (StringInvoker.c(string) > 1) {
            string = StringInvoker.b(string, 0, StringInvoker.c(string) - 1);
        }
        int n = b9_0.d(string);
        EntityPlayerMP entityPlayerMP = stringArray.length > 1 ? b9_0.f(iCommandSender, stringArray[1]) : b9_0.a(iCommandSender);
        alj_1.a(iCommandSender, a9N.QUERY_RESULT, entityPlayerMP.bL);
        a6w_0.a((EntityPlayer)entityPlayerMP, -(n *= -1));
        b9_0.a(iCommandSender, (ICommand)this, apo_2.i, P8.d(n), a6w_0.C(entityPlayerMP));
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return n == 1;
    }

    @Override
    public String b() {
        return apo_2.c;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return apo_2.f;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 2 ? b9_0.a(stringArray, this.a()) : null;
    }
}

