/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.IChatComponent;
import java.util.List;
import net.ChatComponentText;
import net.Y3;
import net.anl_2;
import net.dp_1;
import net.mh_2;
import net.mq_0;
import net.my_0;

/*
 * Renamed from net.qe
 */
public class qe_2
implements anl_2 {
    private List<dp_1> a = my_0.c();

    @Override
    public IChatComponent a() {
        return new ChatComponentText(Y3.a);
    }

    @Override
    public List<dp_1> b() {
        return this.a;
    }

    public qe_2() {
        ListInvoker.add(this.a, new mq_0());
        ListInvoker.add(this.a, new mh_2());
    }
}

