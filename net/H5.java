/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.IChatComponent;
import java.util.Iterator;
import java.util.List;
import net.AT;
import net.ChatComponentText;
import net.ChatStyle;
import net.ET;
import net.HX;
import net.ICommandSender;
import net.aBO;
import net.aIW;
import net.aiz_0;
import net.ans_2;
import net.aob_1;
import net.aoo_1;
import net.aoz_1;
import net.axq_2;
import net.ayj_0;
import net.dz_0;
import net.ht_1;
import net.il_2;

public class H5 {
    public static IChatComponent a(ICommandSender iCommandSender, IChatComponent iChatComponent, Entity entity) throws ht_1 {
        Object object;
        Object object2;
        IChatComponent iChatComponent2 = null;
        if (iChatComponent instanceof aoo_1) {
            object2 = (aoo_1)iChatComponent;
            String string = ET.c((aoo_1)object2);
            if (ans_2.a(string)) {
                object = ans_2.b(iCommandSender, string, Entity.class);
                if (ListInvoker.size((List)object) != 1) {
                    throw new il_2();
                }
                string = ayj_0.x((Entity)ListInvoker.get((List)object, 0));
            }
            iChatComponent2 = string.equals(aiz_0.a) ? new aoo_1(ayj_0.x(entity), ET.a((aoo_1)object2)) : new aoo_1(string, ET.a((aoo_1)object2));
            ET.a((aoo_1)iChatComponent2, ET.b((aoo_1)object2));
        } else if (iChatComponent instanceof aob_1) {
            object2 = AT.a((aob_1)iChatComponent);
            iChatComponent2 = ans_2.a(iCommandSender, (String)object2);
            iChatComponent2 = new ChatComponentText(aiz_0.b);
        } else if (iChatComponent instanceof ChatComponentText) {
            iChatComponent2 = new ChatComponentText(axq_2.a((ChatComponentText)iChatComponent));
        } else {
            if (!(iChatComponent instanceof aoz_1)) {
                return iChatComponent;
            }
            object2 = aIW.d((aoz_1)iChatComponent);
            for (int i = 0; i < ((Object[])object2).length; ++i) {
                object = object2[i];
                if (!(object instanceof IChatComponent)) continue;
                object2[i] = H5.a(iCommandSender, (IChatComponent)object, entity);
            }
            iChatComponent2 = new aoz_1(aIW.e((aoz_1)iChatComponent), object2);
        }
        object2 = aBO.f(iChatComponent);
        aBO.a(iChatComponent2, HX.c((ChatStyle)object2));
        Iterator iterator = ListInvoker.iterator(aBO.b(iChatComponent));
        while (dz_0.c(iterator)) {
            object = (IChatComponent)dz_0.b(iterator);
            aBO.a(iChatComponent2, H5.a(iCommandSender, (IChatComponent)object, entity));
        }
        return iChatComponent2;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}

