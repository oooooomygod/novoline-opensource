/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.NBTTagCompound;
import net.ServerResourceMode;
import net.ahr_0;
import net.dz_0;
import net.tn_0;
import net.vm_0;

public class ServerData {
    private boolean m;
    public boolean d;
    public String k;
    public String j;
    private ServerResourceMode f;
    public String a = vm_0.h;
    private String b;
    public int l = 47;
    public static List<ahr_0> g = new ArrayList<ahr_0>();
    public String i;
    public String e;
    public String h;
    public long c;

    public ServerData(String string, String string2, boolean bl) {
        this.f = ServerResourceMode.PROMPT;
        this.h = string;
        this.k = string2;
        this.m = bl;
    }

    public void a(String string) {
        this.b = string;
    }

    public NBTTagCompound a() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tn_0.a(nBTTagCompound, vm_0.c, this.h);
        tn_0.a(nBTTagCompound, vm_0.i, this.k);
        if (this.b != null) {
            tn_0.a(nBTTagCompound, vm_0.b, this.b);
        }
        if (this.f == ServerResourceMode.ENABLED) {
            tn_0.a(nBTTagCompound, vm_0.e, true);
        } else if (this.f == ServerResourceMode.DISABLED) {
            tn_0.a(nBTTagCompound, vm_0.k, false);
        }
        return nBTTagCompound;
    }

    public String e() {
        return this.b;
    }

    public void a(ServerData serverData) {
        this.k = serverData.k;
        this.h = serverData.h;
        this.a(serverData.d());
        this.b = serverData.b;
        this.m = serverData.m;
    }

    public void a(ServerResourceMode serverResourceMode) {
        this.f = serverResourceMode;
    }

    public ServerResourceMode d() {
        return this.f;
    }

    public ahr_0 c() {
        Iterator iterator = ListInvoker.iterator(g);
        while (dz_0.c(iterator)) {
            ahr_0 ahr_02 = (ahr_0)dz_0.b(iterator);
            if (!ahr_0.a(ahr_02).equals(this.k)) continue;
            return ahr_02;
        }
        return new ahr_0(this.k, this.c);
    }

    public static ServerData a(NBTTagCompound nBTTagCompound) {
        ServerData serverData = new ServerData(tn_0.m(nBTTagCompound, vm_0.g), tn_0.m(nBTTagCompound, vm_0.j), false);
        if (tn_0.a(nBTTagCompound, vm_0.d, 8)) {
            serverData.a(tn_0.m(nBTTagCompound, vm_0.l));
        }
        if (tn_0.a(nBTTagCompound, vm_0.f, 1)) {
            if (tn_0.c(nBTTagCompound, vm_0.a)) {
                serverData.a(ServerResourceMode.ENABLED);
            } else {
                serverData.a(ServerResourceMode.DISABLED);
            }
        } else {
            serverData.a(ServerResourceMode.PROMPT);
        }
        return serverData;
    }

    public boolean b() {
        return this.m;
    }
}

