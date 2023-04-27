/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import net.minecraft.network.packts.S19PacketEntityStatus;
import java.util.Iterator;
import java.util.List;

import net.ChatComponentText;
import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.bG
 */
public class bg_0
extends am_0 {
    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        w__0 w__02 = this.a();
        String string = stringArray.length > 0 ? stringArray[0] : aBD.b;
        String string2 = stringArray.length > 1 ? bg_0.a(stringArray, 1) : aBD.i;
        switch (stringArray.length) {
            case 0: {
                alj_1.a(iCommandSender, new ChatComponentText(bg_0.a(J9.b(w__02))));
                break;
            }
            case 1: {
                if (!J9.b(w__02, string)) {
                    throw new ht_1(aBD.g, string);
                }
                String string3 = J9.a(w__02, string);
                alj_1.a(iCommandSender, aBO.a(axq_2.a(new ChatComponentText(string), aBD.j), string3));
                alj_1.a(iCommandSender, a9N.QUERY_RESULT, J9.d(w__02, string));
                break;
            }
            default: {
                if (J9.a(w__02, string, wb_2.BOOLEAN_VALUE) && !aBD.h.equals(string2) && !aBD.c.equals(string2)) {
                    throw new ht_1(aBD.l, string2);
                }
                J9.a(w__02, string, string2);
                bg_0.a(w__02, string);
                bg_0.a(iCommandSender, (ICommand)this, aBD.a, new Object[0]);
            }
        }
    }

    @Override
    public String b() {
        return aBD.k;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aBD.d;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    public static void a(w__0 w__02, String string) {
        if (aBD.m.equals(string)) {
            byte by = (byte)(J9.c(w__02, string) ? 22 : 23);
            Iterator iterator = ListInvoker.iterator(aek_1.l(ServerInvoker.R(ServerInvoker.d())));
            while (dz_0.c(iterator)) {
                EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
                qv_0.a(entityPlayerMP.playerNetServerHandler, new S19PacketEntityStatus(entityPlayerMP, by));
            }
        }
    }

    private w__0 a() {
        return ServerInvoker.a(ServerInvoker.d(), 0).K();
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        w__0 w__02;
        if (stringArray.length == 1) {
            return bg_0.a(stringArray, J9.b(this.a()));
        }
        if (stringArray.length == 2 && J9.a(w__02 = this.a(), stringArray[0], wb_2.BOOLEAN_VALUE)) {
            return bg_0.a(stringArray, aBD.e, aBD.f);
        }
        return null;
    }
}

