/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import deobf.Vec3;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.cr
 */
public class cr_0
extends am_0 {
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        Object object;
        World world;
        if (stringArray.length < 1) {
            throw new ip_2(axt_1.f, new Object[0]);
        }
        String string = stringArray[0];
        BlockPos blockPos = alj_1.d(iCommandSender);
        Vec3 vec3 = alj_1.f(iCommandSender);
        double d = vec3.xCoord;
        double d2 = vec3.yCoord;
        double d3 = vec3.zCoord;
        if (stringArray.length >= 4) {
            d = cr_0.a(d, stringArray[1], true);
            d2 = cr_0.a(d2, stringArray[2], false);
            d3 = cr_0.a(d3, stringArray[3], true);
            blockPos = new BlockPos(d, d2, d3);
        }
        if (!aV8.isBlockLoaded(world = alj_1.a(iCommandSender), blockPos)) {
            throw new ht_1(axt_1.l, new Object[0]);
        }
        if (axt_1.c.equals(string)) {
            aV8.a(world, new ou_2(world, d, d2, d3));
            cr_0.a(iCommandSender, (ICommand)this, axt_1.k, new Object[0]);
            return;
        }
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        if (stringArray.length >= 5) {
            object = cr_0.a(iCommandSender, stringArray, 4);
            try {
                nBTTagCompound = jv_2.a(aBO.d((IChatComponent)object));
            }
            catch (az3_0 az3_02) {
                throw new ht_1(axt_1.d, az3_02.getMessage());
            }
        }
        tn_0.a(nBTTagCompound, axt_1.m, string);
        try {
            object = ub_1.a(nBTTagCompound, world);
            throw new ht_1(axt_1.n, new Object[0]);
        }
        catch (RuntimeException runtimeException) {
            throw new ht_1(axt_1.a, new Object[0]);
        }
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? cr_0.a(stringArray, ub_1.a()) : (stringArray.length > 1 && stringArray.length <= 4 ? cr_0.b(stringArray, 1, blockPos) : null);
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return axt_1.b;
    }

    @Override
    public String b() {
        return axt_1.i;
    }

    @Override
    public int a() {
        return 2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

