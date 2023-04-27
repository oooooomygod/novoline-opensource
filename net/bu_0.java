/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EnumDifficulty;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bU
 */
public class bu_0
extends am_0 {
    @Override
    public String b() {
        return aab_1.k;
    }

    @Override
    public int a() {
        return 2;
    }

    protected EnumDifficulty a(String string) throws ht_1, iy_2 {
        return !StringInvoker.d(string, aab_1.n) && !StringInvoker.d(string, aab_1.j) ? (!StringInvoker.d(string, aab_1.h) && !StringInvoker.d(string, aab_1.i) ? (!StringInvoker.d(string, aab_1.b) && !StringInvoker.d(string, aab_1.o) ? (!StringInvoker.d(string, aab_1.d) && !StringInvoker.d(string, aab_1.g) ? aYj.a(bu_0.a(string, 0, 3)) : EnumDifficulty.HARD) : EnumDifficulty.NORMAL) : EnumDifficulty.EASY) : EnumDifficulty.PEACEFUL;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aab_1.e;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length <= 0) {
            throw new ip_2(aab_1.a, new Object[0]);
        }
        EnumDifficulty enumDifficulty = this.a(stringArray[0]);
        ServerInvoker.a(ServerInvoker.d(), enumDifficulty);
        bu_0.a(iCommandSender, (ICommand)this, aab_1.c, new aoz_1(aYj.b(enumDifficulty), new Object[0]));
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bu_0.a(stringArray, aab_1.p, aab_1.l, aab_1.m, aab_1.f) : null;
    }
}

