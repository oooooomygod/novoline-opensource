/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IChatComponent;
import net.IMetadataSection;

/*
 * Renamed from net.aQd
 */
public class aqd_0
implements IMetadataSection {
    private int a;
    private IChatComponent b;

    public aqd_0(IChatComponent iChatComponent, int n) {
        this.b = iChatComponent;
        this.a = n;
    }

    public int b() {
        return this.a;
    }

    public IChatComponent a() {
        return this.b;
    }
}

