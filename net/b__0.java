/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.IChatComponent;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.b_
 */
public class b__0
extends am_0 {
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length > 0 && !StringInvoker.g(stringArray[0])) {
            IChatComponent iChatComponent = b__0.a(iCommandSender, stringArray, 0, true);
            aek_1.a(ServerInvoker.R(ServerInvoker.d()), new aoz_1(a5r_0.a, alj_1.c(iCommandSender), iChatComponent));
            return;
        }
        throw new ip_2(a5r_0.c, new Object[0]);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return a5r_0.d;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length >= 1 ? b__0.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : null;
    }

    @Override
    public String b() {
        return a5r_0.b;
    }
}

