/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import java.util.Map;

/*
 * Renamed from net.w4
 */
public class w4_0
extends wu_0
implements aHP {
    private Map<Integer, Integer> g = MapsInvoker.a();
    private String f;

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public DD e() {
        return DD.a;
    }

    public w4_0(String string, IChatComponent iChatComponent, int n) {
        super(iChatComponent, n);
        this.f = string;
    }

    @Override
    public void a(DD dD) {
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        throw new UnsupportedOperationException();
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    @Override
    public String b() {
        return this.f;
    }

    @Override
    public int c() {
        return MapInvoker.a(this.g);
    }

    @Override
    public int c(int n) {
        return MapInvoker.b(this.g, P8.d(n)) ? P8.b((Integer)MapInvoker.c(this.g, P8.d(n))) : 0;
    }

    @Override
    public void a(int n, int n2) {
        MapInvoker.c(this.g, P8.d(n), P8.d(n2));
    }
}

