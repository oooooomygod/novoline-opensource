/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import net.IMetadataSection;
import net.asg_0;

/*
 * Renamed from net.aVm
 */
public class avm_0
implements IMetadataSection {
    private List<Integer> c;
    private boolean b;
    private boolean a;

    public avm_0(boolean bl, boolean bl2, List<Integer> list) {
        this.a = bl;
        this.b = bl2;
        this.c = list;
    }

    public boolean c() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }

    public List<Integer> a() {
        return asg_0.b(this.c);
    }
}

