/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import deobf.Entity;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.c3
 */
public class c3_0
extends am_0 {
    @Override
    public String b(ICommandSender iCommandSender) {
        return al2_0.f;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String b() {
        return al2_0.c;
    }

    private static az3_0 a(az3_0 az3_02) {
        return az3_02;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? c3_0.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : null;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 1) {
            throw new ip_2(al2_0.e, new Object[0]);
        }
        Entity entity = c3_0.b(iCommandSender, stringArray[0]);
        NBTTagCompound nBTTagCompound = null;
        if (stringArray.length >= 2) {
            try {
                nBTTagCompound = jv_2.a(c3_0.a(stringArray, 1));
            }
            catch (az3_0 az3_02) {
                throw new ht_1(al2_0.b, az3_02.getMessage());
            }
        }
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        ayj_0.b(entity, nBTTagCompound2);
        if (!S1.a(nBTTagCompound, nBTTagCompound2, true)) {
            throw new ht_1(al2_0.a, ayj_0.x(entity));
        }
        c3_0.a(iCommandSender, (ICommand)this, al2_0.d, ayj_0.x(entity));
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }
}

