/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.Vec3;
import net.minecraft.network.packts.S29PacketSoundEffect;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bZ
 */
public class bz_0
extends am_0 {
    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 2 ? bz_0.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : (stringArray.length > 2 && stringArray.length <= 5 ? bz_0.b(stringArray, 2, blockPos) : null);
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return n == 1;
    }

    @Override
    public String b() {
        return aez_0.b;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aez_0.d;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        double d;
        if (stringArray.length < 2) {
            throw new ip_2(this.b(iCommandSender), new Object[0]);
        }
        int n = 0;
        String string = stringArray[n++];
        EntityPlayerMP entityPlayerMP = bz_0.f(iCommandSender, stringArray[n++]);
        Vec3 vec3 = alj_1.f(iCommandSender);
        double d2 = vec3.xCoord;
        if (stringArray.length > n) {
            d2 = bz_0.a(d2, stringArray[n++], true);
        }
        double d3 = vec3.yCoord;
        if (stringArray.length > n) {
            d3 = bz_0.b(d3, stringArray[n++], 0, 0, false);
        }
        double d4 = vec3.zCoord;
        if (stringArray.length > n) {
            d4 = bz_0.a(d4, stringArray[n++], true);
        }
        double d5 = 1.0;
        if (stringArray.length > n) {
            d5 = bz_0.a(stringArray[n++], 0.0, 3.4028234663852886E38);
        }
        double d6 = 1.0;
        if (stringArray.length > n) {
            d6 = bz_0.a(stringArray[n++], 0.0, 2.0);
        }
        double d7 = 0.0;
        if (stringArray.length > n) {
            d7 = bz_0.a(stringArray[n], 0.0, 1.0);
        }
        int cfr_ignored_2 = (d = d5 - 1.0) == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
        double d8 = 16.0;
        double d9 = EntityPlayerInvoker.c(entityPlayerMP, d2, d3, d4);
        if (d9 > d8) {
            double d10 = d7 - 0.0;
            int cfr_ignored_3 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
            throw new ht_1(aez_0.a, EntityPlayerInvoker.s(entityPlayerMP));
        }
        qv_0.a(entityPlayerMP.playerNetServerHandler, new S29PacketSoundEffect(string, d2, d3, d4, (float)d5, (float)d6));
        bz_0.a(iCommandSender, (ICommand)this, aez_0.c, string, EntityPlayerInvoker.s(entityPlayerMP));
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}

