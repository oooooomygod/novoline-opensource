/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.EntityPlayer;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.BlockPos;

public class bO
extends am_0 {
    private static iy_2 a(iy_2 iy_22) {
        return iy_22;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        if (stringArray.length == 1) {
            Set set = MapInvoker.c(this.a());
            return bO.a(stringArray, (String[])aS0.a(set, new String[0]));
        }
        return null;
    }

    @Override
    public String b() {
        return a8t_0.d;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void a(long var1_1, ICommandSender var3_2, short var4_3, String[] var5_4) throws ht_1 {
        block4: {
            var6_5 = this.a(var3_2);
            var7_6 = (ListInvoker.size(var6_5) - 1) / 7;
            if (var5_4.length != 0) break block4;
            v0 = 0;
            ** GOTO lbl9
        }
        try {
            v0 = bO.a(var5_4[0], 1, var7_6 + 1) - 1;
lbl9:
            // 2 sources

            var8_7 = v0;
        }
        catch (iy_2 var9_8) {
            var10_10 = this.a();
            var11_12 = (ICommand)MapInvoker.c(var10_10, var5_4[0]);
            throw new ip_2(var11_12.b(var3_2), new Object[0]);
        }
        var9_9 = MathInvoker.b((var8_7 + 1) * 7, ListInvoker.size(var6_5));
        var10_11 = new aoz_1(a8t_0.b, new Object[]{P8.d(var8_7 + 1), P8.d(var7_6 + 1)});
        HX.a(aIW.a(var10_11), anw_0.DARK_GREEN);
        alj_1.a(var3_2, var10_11);
        for (var11_13 = var8_7 * 7; var11_13 < var9_9; ++var11_13) {
            var12_15 = (ICommand)ListInvoker.get(var6_5, var11_13);
            var13_16 = new aoz_1(var12_15.b(var3_2), new Object[0]);
            HX.a(aIW.a(var13_16), new awv_1(k_0.SUGGEST_COMMAND, aL0.a(aL0.a(aL0.a(new StringBuilder(), a8t_0.c), var12_15.b()), a8t_0.e).toString()));
            alj_1.a(var3_2, var13_16);
        }
        if (var3_2 instanceof EntityPlayer) {
            var11_14 = new aoz_1(a8t_0.f, new Object[0]);
            HX.a(aIW.a(var11_14), anw_0.GREEN);
            alj_1.a(var3_2, var11_14);
        }
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return a8t_0.a;
    }

    protected Map<String, ICommand> a() {
        return ServerInvoker.k(ServerInvoker.d()).a();
    }

    protected List<ICommand> a(ICommandSender iCommandSender) {
        List list = yh_1.a(ServerInvoker.k(ServerInvoker.d()), iCommandSender);
        asg_0.d(list);
        return list;
    }

    @Override
    public List<String> a() {
        return a7r_0.a(new String[]{a8t_0.g});
    }
}

