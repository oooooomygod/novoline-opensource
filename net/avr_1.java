/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.KB;
import net.NX;
import net.ResourceLocation;
import net.aac_0;
import net.ah9_0;
import net.ark_0;
import net.j__0;
import net.nh_1;
import net.ro_1;

/*
 * Renamed from net.avR
 */
public class avr_1
implements KB<nh_1> {
    private j__0 a;
    private static ResourceLocation c = new ResourceLocation(NX.a);
    private ro_1 b = new ro_1(0.5f);

    public avr_1(j__0 j__02) {
        this.a = j__02;
    }

    @Override
    public void a(nh_1 nh_12, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (ark_0.c(nh_12)) {
            ah9_0.a(this.a, c);
            aac_0.a(this.b, ah9_0.a(this.a));
            aac_0.a(this.b, nh_12, f, f2, f4, f5, f6, f7);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

