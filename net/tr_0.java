/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GuiYesNoCallback;
import deobf.MCInvoker;
import java.util.List;
import net.ml_1;
import net.sg_1;

/*
 * Renamed from net.tR
 */
class tr_0
implements GuiYesNoCallback {
    sg_1 a;

    @Override
    public void a(boolean bl, int n) {
        List list = ml_1.a(this.a.a, this.a);
        MCInvoker.displayGuiScreen(this.a.c, this.a.a);
        ListInvoker.remove(list, this.a);
        ListInvoker.add(ml_1.c(this.a.a), 0, this.a);
    }

    tr_0(sg_1 sg_12) {
        this.a = sg_12;
    }
}

