/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Predicate;
import deobf.Entity;
import java.util.Iterator;
import java.util.Map;
import net.FG;
import net.VM;
import net.a3V;
import net.aS0;
import net.dz_0;
import net.ot_1;
import net.za_2;

class AR
implements Predicate<Entity> {
    Map a;

    public boolean a(Entity entity) {
        za_2 za_22 = a3V.b(ServerInvoker.a(ServerInvoker.d(), 0));
        Iterator iterator = aS0.f(MapInvoker.b(this.a));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            String string = (String)FG.b(entry);
            if (StringInvoker.c(string, ot_1.a) && StringInvoker.c(string) > 4) {
                string = StringInvoker.b(string, 0, StringInvoker.c(string) - 4);
            }
            VM.a(za_22, string);
            return false;
        }
        return true;
    }

    AR(Map map) {
        this.a = map;
    }
}

