/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import deobf.MCInvoker;
import deobf.NBTTagList;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;

public class V8 {
    private Minecraft c;
    private List<ServerData> a = my_0.c();
    private static Logger b = LogManagerInvoker.c();

    public void a() {
        try {
            NBTTagList nBTTagList = new NBTTagList();
            Object object = ListInvoker.iterator(this.a);
            while (dz_0.c((Iterator)object)) {
                ServerData serverData = (ServerData)dz_0.b((Iterator)object);
                kv_0.a(nBTTagList, aKZ.b(serverData));
            }
            object = new NBTTagCompound();
            tn_0.a((NBTTagCompound)object, acp_1.e, nBTTagList);
            aR8.a((NBTTagCompound)object, new File(this.c.mcDataDir, acp_1.b));
        }
        catch (Exception exception) {
            LoggerInvoker.a(b, acp_1.f, exception);
        }
    }

    public ServerData a(int n) {
        return (ServerData)ListInvoker.get(this.a, n);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public V8(Minecraft minecraft) {
        this.c = minecraft;
        this.b();
    }

    public void a(ServerData serverData) {
        ListInvoker.add(this.a, serverData);
    }

    public void b(int n) {
        ListInvoker.remove(this.a, n);
    }

    public void a(int n, ServerData serverData) {
        ListInvoker.set(this.a, n, serverData);
    }

    public void a(int n, int n2) {
        ServerData serverData = this.a(n);
        ListInvoker.set(this.a, n, this.a(n2));
        ListInvoker.set(this.a, n2, serverData);
        this.a();
    }

    public int c() {
        return ListInvoker.size(this.a);
    }

    public static void b(ServerData serverData) {
        V8 v8 = new V8(MCInvoker.f());
        v8.b();
        for (int i = 0; i < v8.c(); ++i) {
            ServerData serverData2 = v8.a(i);
            if (!serverData2.h.equals(serverData.h) || !serverData2.k.equals(serverData.k)) continue;
            v8.a(i, serverData);
            break;
        }
        v8.a();
    }

    public void b() {
        try {
            ListInvoker.clear(this.a);
            NBTTagCompound nBTTagCompound = aR8.a(new File(this.c.mcDataDir, acp_1.a));
            return;
        }
        catch (Exception exception) {
            LoggerInvoker.a(b, acp_1.c, exception);
            return;
        }
    }
}

