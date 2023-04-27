/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.IChatComponent;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bm
 */
public class bm_2
extends am_0 {
    public static Pattern b = ow_1.c(ox_1.d);

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bm_2.a(stringArray, ServerInvoker.r(ServerInvoker.d())) : null;
    }

    @Override
    public int a() {
        return 3;
    }

    protected void a(ICommandSender iCommandSender, String string, String string2) {
        a8i_0 a8i_02 = new a8i_0(string, (Date)null, alj_1.g(iCommandSender), (Date)null, string2);
        aHN.a(aek_1.f(ServerInvoker.R(ServerInvoker.d())), a8i_02);
        List list = aek_1.b(ServerInvoker.R(ServerInvoker.d()), string);
        Object[] objectArray = new String[ListInvoker.size(list)];
        int n = 0;
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            qv_0.a(entityPlayerMP.playerNetServerHandler, ox_1.b);
            objectArray[n++] = EntityPlayerInvoker.s(entityPlayerMP);
        }
        if (ListInvoker.isEmpty(list)) {
            bm_2.a(iCommandSender, (ICommand)this, ox_1.g, string);
        } else {
            bm_2.a(iCommandSender, (ICommand)this, ox_1.a, string, bm_2.a(objectArray));
        }
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return ox_1.h;
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length >= 1 && StringInvoker.c(stringArray[0]) > 1) {
            IChatComponent iChatComponent = stringArray.length >= 2 ? bm_2.a(iCommandSender, stringArray, 1) : null;
            Matcher matcher = ow_1.a(b, stringArray[0]);
            if (wk_2.a(matcher)) {
                this.a(iCommandSender, stringArray[0], null);
                return;
            }
            aek_1.a(ServerInvoker.R(ServerInvoker.d()), stringArray[0]);
            throw new i6_0(ox_1.f, new Object[0]);
        }
        throw new ip_2(ox_1.c, new Object[0]);
    }

    @Override
    public String b() {
        return ox_1.e;
    }

    @Override
    public boolean a(ICommandSender iCommandSender) {
        return aHN.a(aek_1.f(ServerInvoker.R(ServerInvoker.d()))) && super.a(iCommandSender);
    }
}

