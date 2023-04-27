/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ServerInvoker;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.bo
 */
public class bo_0
extends am_0 {
    @Override
    public int a() {
        return 2;
    }

    private static az3_0 a(az3_0 az3_02) {
        return az3_02;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bo_0.a(stringArray, this.a()) : (stringArray.length == 2 ? bo_0.a(stringArray, aLP.b(Item.k)) : null);
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        EntityPlayerMP entityPlayerMP = stringArray.length == 0 ? bo_0.a(iCommandSender) : bo_0.f(iCommandSender, stringArray[0]);
        Item item = stringArray.length >= 2 ? bo_0.a(iCommandSender, stringArray[1]) : null;
        int n = stringArray.length >= 3 ? bo_0.a(stringArray[2], -1) : -1;
        int n2 = stringArray.length >= 4 ? bo_0.a(stringArray[3], -1) : -1;
        NBTTagCompound nBTTagCompound = null;
        if (stringArray.length >= 5) {
            try {
                nBTTagCompound = jv_2.a(bo_0.a(stringArray, 4));
            }
            catch (az3_0 az3_02) {
                throw new ht_1(hg_1.c, az3_02.getMessage());
            }
        }
        if (stringArray.length >= 2) {
            throw new ht_1(hg_1.b, EntityPlayerInvoker.s(entityPlayerMP));
        }
        int n3 = InventoryInvoker.a(entityPlayerMP.inventory, item, n, n2, nBTTagCompound);
        afy_2.b(entityPlayerMP.bp);
        if (!aSY.a(entityPlayerMP.abilities)) {
            EntityPlayerInvoker.o(entityPlayerMP);
        }
        alj_1.a(iCommandSender, a9N.AFFECTED_ITEMS, n3);
        throw new ht_1(hg_1.f, EntityPlayerInvoker.s(entityPlayerMP));
    }

    @Override
    public String b() {
        return hg_1.e;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    protected String[] a() {
        return ServerInvoker.r(ServerInvoker.d());
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return hg_1.g;
    }
}

