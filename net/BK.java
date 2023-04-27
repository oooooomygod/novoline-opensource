/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.modules.player.InvManager;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import java.awt.Color;

public class BK {
    public Item b;
    RW a;
    public float c;
    private static ListInvoker[] d;
    public float e;

    public void b(float f, float f2, float f3, float f4) {
        this.c = f3;
        this.e = f4;
        BK.b();
        InvManager invManager = (InvManager)ModuleInvoker.isEnable(ModuleRegistry.INVMANAGER);
        ListProperty listProperty = ld_2.e(invManager);
        a1V.a(f3, f4, f3 + 20.0f, f4 + 20.0f, 2.0f, aol_1.b(new Color(29, 29, 29, 255)), ava_0.b(listProperty, P8.d(px_0.a(this.b))) ? aol_1.b(aol_1.a(aol_1.a(new Color(40, 40, 40, 255)))) : (this.a(f, f2, f3, f4) ? aol_1.b(aol_1.d(new Color(40, 40, 40, 255))) : aol_1.b(new Color(40, 40, 40, 255))));
        if (this.b != null) {
            ne_0.f();
            GlStateManagerInvoker.enableDepth();
            DU.b(MCInvoker.A(RW.a(this.a)), new ItemStack(this.b), f3 + 2.0f, f4 + 2.0f);
            ne_0.e();
            GlStateManagerInvoker.disableDepth();
        }
    }

    public void a(float f, float f2, int n) {
        BK.b();
        if (this.a(f, f2, this.c, this.e) && n == 0) {
            int n2;
            InvManager invManager = (InvManager)ModuleInvoker.isEnable(ModuleRegistry.INVMANAGER);
            ListProperty listProperty = ld_2.e(invManager);
            if (ava_0.b(listProperty, P8.d(n2 = px_0.a(this.b)))) {
                ava_0.c(listProperty, P8.d(n2));
            }
            ava_0.a(listProperty, (Object)P8.d(n2));
        }
    }

    public static ListInvoker[] b() {
        return d;
    }

    public boolean a(float f, float f2, float f3, float f4) {
        BK.b();
        return f > f3 && f < f3 + 20.0f && f2 > f4 && f2 < f4 + 20.0f;
    }

    static {
        if (BK.b() != null) {
            BK.b(new ListInvoker[2]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        d = listInvokerArray;
    }

    public BK(RW rW, Item item) {
        this.a = rW;
        this.b = item;
    }
}

