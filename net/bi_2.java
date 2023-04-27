/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import com.google.gson.JsonParseException;
import deobf.IChatComponent;
import net.minecraft.network.packts.S45PacketTitle;
import java.util.List;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bi
 */
public class bi_2
extends am_0 {
    @Override
    public String b() {
        return BL.d;
    }

    @Override
    public int a() {
        return 2;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return BL.k;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bi_2.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : (stringArray.length == 2 ? bi_2.a(stringArray, O9.a()) : null);
    }

    @Override
    public boolean a(String[] stringArray, int n) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 2) {
            throw new ip_2(BL.n, new Object[0]);
        }
        if (stringArray.length < 3) {
            if (BL.j.equals(stringArray[1])) throw new ip_2(BL.g, new Object[0]);
            if (BL.l.equals(stringArray[1])) {
                throw new ip_2(BL.g, new Object[0]);
            }
            if (BL.m.equals(stringArray[1])) {
                throw new ip_2(BL.c, new Object[0]);
            }
        }
        EntityPlayerMP entityPlayerMP = bi_2.f(iCommandSender, stringArray[0]);
        xz_0 xz_02 = O9.a(stringArray[1]);
        if (xz_02 != xz_0.CLEAR && xz_02 != xz_0.RESET) {
            S45PacketTitle s45PacketTitle;
            if (xz_02 == xz_0.TIMES) {
                if (stringArray.length != 5) {
                    throw new ip_2(BL.o, new Object[0]);
                }
                int n = bi_2.d(stringArray[2]);
                int n2 = bi_2.d(stringArray[3]);
                int n3 = bi_2.d(stringArray[4]);
                S45PacketTitle s45PacketTitle2 = new S45PacketTitle(n, n2, n3);
                qv_0.a(entityPlayerMP.playerNetServerHandler, s45PacketTitle2);
                bi_2.a(iCommandSender, (ICommand)this, BL.p, new Object[0]);
                return;
            }
            if (stringArray.length < 3) {
                throw new ip_2(BL.f, new Object[0]);
            }
            String string = bi_2.a(stringArray, 2);
            try {
                IChatComponent iChatComponent = aGU.a(string);
                s45PacketTitle = new S45PacketTitle(xz_02, a7C.a(iCommandSender, iChatComponent, entityPlayerMP));
            }
            catch (JsonParseException jsonParseException) {
                Throwable throwable = aDS.a(jsonParseException);
                throw new ij_1(BL.h, BL.e);
            }
            qv_0.a(entityPlayerMP.playerNetServerHandler, s45PacketTitle);
            bi_2.a(iCommandSender, (ICommand)this, BL.b, new Object[0]);
            return;
        }
        if (stringArray.length != 2) {
            throw new ip_2(BL.i, new Object[0]);
        }
        S45PacketTitle s45PacketTitle = new S45PacketTitle(xz_02, null);
        qv_0.a(entityPlayerMP.playerNetServerHandler, s45PacketTitle);
        bi_2.a(iCommandSender, (ICommand)this, BL.a, new Object[0]);
    }
}

