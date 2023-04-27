/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.b5
 */
public class b5_0
extends am_0 {
    @Override
    public int a() {
        return 2;
    }

    protected String[] a() {
        return ServerInvoker.r(ServerInvoker.d());
    }

    private static iy_2 a(iy_2 iy_22) {
        return iy_22;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 2) {
            throw new ip_2(ajK.f, new Object[0]);
        }
        EntityPlayerMP entityPlayerMP = b5_0.f(iCommandSender, stringArray[0]);
        alj_1.a(iCommandSender, a9N.AFFECTED_ITEMS, 0);
        try {
            b5_0.a(stringArray[1], 0);
            boolean bl = true;
        }
        catch (iy_2 iy_22) {
            xr_1.a(stringArray[1]);
            throw iy_22;
        }
        a6w_0.n(entityPlayerMP);
        throw new ht_1(ajK.g, new Object[0]);
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? b5_0.a(stringArray, this.a()) : (stringArray.length == 2 ? b5_0.a(stringArray, xr_1.a()) : null);
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return ajK.a;
    }

    @Override
    public String b() {
        return ajK.b;
    }
}

