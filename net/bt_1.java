/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.List;
import java.util.regex.Matcher;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bT
 */
public class bt_1
extends am_0 {
    @Override
    public String b(ICommandSender iCommandSender) {
        return vb_1.e;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bt_1.a(stringArray, aHN.b(aek_1.f(ServerInvoker.R(ServerInvoker.d())))) : null;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length == 1 && StringInvoker.c(stringArray[0]) > 1) {
            Matcher matcher = ow_1.a(bm_2.b, stringArray[0]);
            if (wk_2.a(matcher)) {
                aHN.a(aek_1.f(ServerInvoker.R(ServerInvoker.d())), stringArray[0]);
                bt_1.a(iCommandSender, (ICommand)this, vb_1.c, stringArray[0]);
                return;
            }
            throw new ij_1(vb_1.a, new Object[0]);
        }
        throw new ip_2(vb_1.b, new Object[0]);
    }

    @Override
    public boolean a(ICommandSender iCommandSender) {
        return aHN.a(aek_1.f(ServerInvoker.R(ServerInvoker.d()))) && super.a(iCommandSender);
    }

    @Override
    public String b() {
        return vb_1.d;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}

