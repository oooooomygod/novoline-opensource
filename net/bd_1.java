/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import net.ICommand;
import net.ICommandSender;
import net.NBTTagCompound;
import net.aBO;
import net.am_0;
import net.ayj_0;
import net.az3_0;
import net.azk_1;
import net.ht_1;
import net.ip_2;
import net.jv_2;
import net.tn_0;

/*
 * Renamed from net.bD
 */
public class bd_1
extends am_0 {
    @Override
    public String b() {
        return azk_1.f;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return azk_1.a;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        NBTTagCompound nBTTagCompound;
        if (stringArray.length < 2) {
            throw new ip_2(azk_1.c, new Object[0]);
        }
        Entity entity = bd_1.b(iCommandSender, stringArray[0]);
        if (entity instanceof EntityPlayer) {
            throw new ht_1(azk_1.d, ayj_0.P(entity));
        }
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        ayj_0.b(entity, nBTTagCompound2);
        NBTTagCompound nBTTagCompound3 = (NBTTagCompound)tn_0.a(nBTTagCompound2);
        try {
            nBTTagCompound = jv_2.a(aBO.d(bd_1.a(iCommandSender, stringArray, 1)));
        }
        catch (az3_0 az3_02) {
            throw new ht_1(azk_1.g, az3_02.getMessage());
        }
        tn_0.a(nBTTagCompound, azk_1.i);
        tn_0.a(nBTTagCompound, azk_1.b);
        tn_0.a(nBTTagCompound2, nBTTagCompound);
        if (nBTTagCompound2.equals(nBTTagCompound3)) {
            throw new ht_1(azk_1.e, nBTTagCompound2.toString());
        }
        ayj_0.c(entity, nBTTagCompound2);
        bd_1.a(iCommandSender, (ICommand)this, azk_1.h, nBTTagCompound2.toString());
    }

    private static az3_0 a(az3_0 az3_02) {
        return az3_02;
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    @Override
    public int a() {
        return 2;
    }
}

