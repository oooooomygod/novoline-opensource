/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.ChatComponentStyle;
import deobf.IChatComponent;
import java.util.Iterator;
import net.HX;
import net.a7I;
import net.aL0;
import net.dz_0;

/*
 * Renamed from net.aoB
 */
public class aob_1
extends ChatComponentStyle {
    private String c;

    @Override
    public aob_1 b() {
        aob_1 aob_12 = new aob_1(this.c);
        aob_12.a(HX.c(this.d()));
        Iterator<IChatComponent> iterator = this.a().iterator();
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            aob_12.a(iChatComponent.b());
        }
        return aob_12;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a7I.c), this.c), '\''), a7I.b), this.a), a7I.a), this.d()), '}').toString();
    }

    public aob_1(String string) {
        this.c = string;
    }

    public String a() {
        return this.c;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aob_1)) {
            return false;
        }
        aob_1 aob_12 = (aob_1)object;
        return this.c.equals(aob_12.c) && super.equals(object);
    }
}

