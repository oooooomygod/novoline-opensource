/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.ChatComponentStyle;
import deobf.IChatComponent;
import deobf.MinecraftServer;
import java.util.Iterator;
import net.HX;
import net.P8;
import net.QU;
import net.VM;
import net.a3V;
import net.aL0;
import net.acl_0;
import net.aod_2;
import net.aru_2;
import net.dz_0;
import net.hs_0;
import net.za_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aoO
 */
public class aoo_1
extends ChatComponentStyle {
    private String d = aru_2.e;
    private String c;
    private String e;

    public void a(String string) {
        this.d = string;
    }

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aru_2.a), this.c), '\''), aru_2.f), this.e), '\''), aru_2.c), this.a), aru_2.b), this.d()), '}').toString();
    }

    public String b() {
        return this.c;
    }

    public aoo_1(String string, String string2) {
        this.c = string;
        this.e = string2;
    }

    @Override
    public String c() {
        MinecraftServer minecraftServer = ServerInvoker.d();
        if (ServerInvoker.B(minecraftServer) && aod_2.a(this.d)) {
            acl_0 acl_02;
            za_2 za_22 = a3V.b(ServerInvoker.a(minecraftServer, 0));
            if (VM.a(za_22, this.c, acl_02 = VM.a(za_22, this.e))) {
                QU qU = VM.c(za_22, this.c, acl_02);
                this.a(StringInvoker.a(aru_2.g, new Object[]{P8.d(hs_0.d(qU))}));
            } else {
                this.d = aru_2.d;
            }
        }
        return this.d;
    }

    public String a() {
        return this.e;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aoo_1)) {
            return false;
        }
        aoo_1 aoo_12 = (aoo_1)object;
        return this.c.equals(aoo_12.c) && this.e.equals(aoo_12.e) && super.equals(object);
    }

    public aoo_1 c() {
        aoo_1 aoo_12 = new aoo_1(this.c, this.e);
        aoo_12.a(this.d);
        aoo_12.a(HX.c(this.d()));
        Iterator<IChatComponent> iterator = this.a().iterator();
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
            aoo_12.a(iChatComponent.b());
        }
        return aoo_12;
    }
}

