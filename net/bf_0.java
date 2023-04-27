/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.List;

import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bF
 */
public class bf_0
extends am_0 {
    @Override
    public int a() {
        return 2;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 8) {
            throw new ip_2(ei_0.e, new Object[0]);
        }
        for (B7 b7 : B7.values()) {
            if (aYK.b(b7) ? StringInvoker.e(stringArray[0], aYK.e(b7)) : stringArray[0].equals(aYK.e(b7))) break;
        }
        throw new ht_1(ei_0.b, stringArray[0]);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String b() {
        return ei_0.i;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bf_0.a(stringArray, aYK.a()) : (stringArray.length > 1 && stringArray.length <= 4 ? bf_0.b(stringArray, 1, blockPos) : (stringArray.length == 10 ? bf_0.a(stringArray, ei_0.c, ei_0.j) : null));
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return ei_0.g;
    }
}

