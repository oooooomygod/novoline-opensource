/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.ServerInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.bP
 */
public class bp_1
extends am_0 {
    private static Map<String, Integer> b = MapsInvoker.a();

    @Override
    public String b(ICommandSender iCommandSender) {
        return UP.d;
    }

    protected String[] a() {
        return ServerInvoker.r(ServerInvoker.d());
    }

    @Override
    public String b() {
        return UP.l;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        Object object;
        Item item;
        if (stringArray.length < 1) {
            throw new ip_2(UP.e, new Object[0]);
        }
        if (stringArray[0].equals(UP.w)) {
            if (stringArray.length < 6) {
                throw new ip_2(UP.I, new Object[0]);
            }
        } else if (!stringArray[0].equals(UP.x)) {
            throw new ip_2(UP.p, new Object[0]);
        }
        int n = 4;
        int n2 = this.a(stringArray[n++]);
        try {
            item = bp_1.a(iCommandSender, stringArray[n]);
        }
        catch (iy_2 iy_22) {
            if (BlocksInvoker.a(stringArray[n]) != Blocks.air) {
                throw iy_22;
            }
            item = null;
        }
        int n3 = stringArray.length > ++n ? bp_1.a(stringArray[n++], 1, 64) : 1;
        int n4 = stringArray.length > n ? bp_1.d(stringArray[n++]) : 0;
        ItemStack itemStack = new ItemStack(item, n3, n4);
        if (stringArray.length > n) {
            object = aBO.d(bp_1.a(iCommandSender, stringArray, n));
            try {
                act_2.b(itemStack, jv_2.a((String)object));
            }
            catch (az3_0 az3_02) {
                throw new ht_1(UP.c, az3_02.getMessage());
            }
        }
        if (act_2.k(itemStack) == null) {
            itemStack = null;
        }
        alj_1.a(iCommandSender, a9N.AFFECTED_ITEMS, 0);
        object = bp_1.b(iCommandSender, stringArray, 1, false);
        World world = alj_1.a(iCommandSender);
        TileEntity tileEntity = aV8.z(world, (BlockPos)object);
        if (!(tileEntity instanceof rs_1)) {
            throw new ht_1(UP.C, P8.d(amv_2.j((BlockPos)object)), P8.d(amv_2.h((BlockPos)object)), P8.d(amv_2.i((BlockPos)object)));
        }
        rs_1 rs_12 = (rs_1)((Object)tileEntity);
        if (n2 < apw_0.c(rs_12)) {
            apw_0.a(rs_12, n2, itemStack);
        }
        alj_1.a(iCommandSender, a9N.AFFECTED_ITEMS, n3);
        bp_1.a(iCommandSender, (ICommand)this, UP.D, P8.d(n2), P8.d(n3), UP.t);
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bp_1.a(stringArray, UP.y, UP.i) : (stringArray.length == 2 && stringArray[0].equals(UP.u) ? bp_1.a(stringArray, this.a()) : (stringArray.length >= 2 && stringArray.length <= 4 && stringArray[0].equals(UP.E) ? bp_1.b(stringArray, 1, blockPos) : (!(stringArray.length == 3 && stringArray[0].equals(UP.v) || stringArray.length == 5 && stringArray[0].equals(UP.g)) ? (!(stringArray.length == 4 && stringArray[0].equals(UP.a) || stringArray.length == 6 && stringArray[0].equals(UP.L)) ? null : bp_1.a(stringArray, aLP.b(Item.k))) : bp_1.a(stringArray, MapInvoker.c(b)))));
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return stringArray.length > 0 && stringArray[0].equals(UP.H) && n == 1;
    }

    private int a(String string) throws ht_1 {
        if (!MapInvoker.b(b, string)) {
            throw new ht_1(UP.o, string);
        }
        return P8.b((Integer)MapInvoker.c(b, string));
    }

    static {
        int n = 0;
        while (true) {
            MapInvoker.c(b, aL0.c(aL0.a(new StringBuilder(), UP.b), n).toString(), P8.d(n));
            ++n;
        }
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public int a() {
        return 2;
    }
}

