/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bf
 */
public class bf_1
extends am_0 {
    @Override
    public String b() {
        return a5p_0.b;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return a5p_0.a;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length >= 1 ? bf_1.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : null;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length > 0 && StringInvoker.c(stringArray[0]) > 1) {
            aek_1.a(ServerInvoker.R(ServerInvoker.d()), stringArray[0]);
            throw new i6_0();
        }
        throw new ip_2(a5p_0.f, new Object[0]);
    }
}

