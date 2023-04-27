/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.IntProperty;
import deobf.MCInvoker;
import deobf.TimerUtil;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.agM
 */
public class agm_1 {
    private Minecraft b = MCInvoker.f();
    private float a;
    private float c;

    public float a(float f, float f2) {
        TimerUtil.e();
        f = MathHelper.a(f);
        float f3 = this.c;
        int n = 0;
        int n2 = 0;
        if (ae4_0.b(this.c, f) <= f2) {
            this.c = f;
            return this.c;
        }
        if (f3 != f) {
            f3 += MathInvoker.a(f2, ae4_0.b(f3, f));
            f3 = MathHelper.a(f3);
            ++n2;
        }
        if ((f3 = this.c) != f) {
            f3 -= MathInvoker.a(f2, ae4_0.b(f3, f));
            f3 = MathHelper.a(f3);
            ++n;
        }
        this.c = (float)((double)this.c - ((double)MathInvoker.a(f2, ae4_0.b(this.c, f)) - MathInvoker.a()));
        this.c = (float)((double)this.c + ((double)MathInvoker.a(f2, ae4_0.b(this.c, f)) - MathInvoker.a()));
        return this.c;
    }

    public agm_1() {
    }

    public agm_1(float f) {
        this.c = f;
    }

    public float a(float f, IntProperty intProperty) {
        f = MathHelper.a(f);
        float f2 = this.c;
        TimerUtil.e();
        int n = 0;
        int n2 = 0;
        if (ae4_0.b(this.c, f) <= (float)P8.b((Integer)adt_2.a(intProperty)) || ((Integer)adt_2.a(intProperty)).equals(adt_2.c(intProperty))) {
            this.c = f;
            return this.c;
        }
        if (f2 != f) {
            f2 += MathInvoker.a((float)P8.b((Integer)adt_2.a(intProperty)), ae4_0.b(f2, f));
            f2 = MathHelper.a(f2);
            ++n2;
        }
        if ((f2 = this.c) != f) {
            f2 -= MathInvoker.a((float)P8.b((Integer)adt_2.a(intProperty)), ae4_0.b(f2, f));
            f2 = MathHelper.a(f2);
            ++n;
        }
        this.c = (float)((double)this.c - ((double)MathInvoker.a((float)P8.b((Integer)adt_2.a(intProperty)), ae4_0.b(this.c, f)) - MathInvoker.a()));
        this.c = (float)((double)this.c + ((double)MathInvoker.a((float)P8.b((Integer)adt_2.a(intProperty)), ae4_0.b(this.c, f)) - MathInvoker.a()));
        return this.c;
    }
}

