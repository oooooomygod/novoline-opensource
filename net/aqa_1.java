/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.modules.player.Scaffold;
import net.minecraft.init.Blocks;
import deobf.IntProperty;
import cc.novoline.modules.player.InvManager;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import java.awt.Color;

/*
 * Renamed from net.aqA
 */
public class aqa_1 {
    private Item f;
    private int b;
    private boolean g;
    private boolean c;
    rp_0 d;
    private float h;
    private IntProperty a;
    private float e;

    public IntProperty b() {
        return this.a;
    }

    public void c() {
        BK.b();
        InvManager invManager = (InvManager)ModuleInvoker.isEnable(ModuleRegistry.INVMANAGER);
        Scaffold scaffold = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
        if (P8.b((Integer)adt_2.a(ld_2.a(invManager))) == this.b) {
            this.a = ld_2.a(invManager);
        }
        if (P8.b((Integer)adt_2.a(ld_2.f(invManager))) == this.b) {
            this.a = ld_2.f(invManager);
        }
        if (P8.b((Integer)adt_2.a(ld_2.g(invManager))) == this.b) {
            this.a = ld_2.g(invManager);
        }
        if (P8.b((Integer)adt_2.a(ld_2.d(invManager))) == this.b) {
            this.a = ld_2.d(invManager);
        }
        if (P8.b((Integer)adt_2.a(ld_2.c(invManager))) == this.b) {
            this.a = ld_2.c(invManager);
        }
        if (P8.b((Integer)adt_2.a(ld_2.b(invManager))) == this.b) {
            this.a = ld_2.b(invManager);
        }
        if (P8.b((Integer)adt_2.a(ld_2.h(invManager))) == this.b) {
            this.a = ld_2.h(invManager);
        }
        if (P8.b((Integer)adt_2.a(ma_1.e(scaffold))) == this.b) {
            this.a = ma_1.e(scaffold);
        }
    }

    public boolean b(float f, float f2) {
        BK.b();
        return f >= this.e && f <= this.e + 20.0f && f2 >= this.h && f2 <= this.h + 20.0f;
    }

    public Item a() {
        return this.f;
    }

    static boolean b(aqa_1 aqa_12) {
        return aqa_12.g;
    }

    public int d() {
        return this.b;
    }

    static int c(aqa_1 aqa_12) {
        return aqa_12.b;
    }

    static boolean a(aqa_1 aqa_12, boolean bl) {
        aqa_12.g = bl;
        return aqa_12.g;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    static IntProperty a(aqa_1 aqa_12) {
        return aqa_12.a;
    }

    public aqa_1(rp_0 rp_02, int n, float f, float f2) {
        BK.b();
        this.d = rp_02;
        this.b = n;
        this.e = f;
        this.h = f2;
        InvManager invManager = (InvManager)ModuleInvoker.isEnable(ModuleRegistry.INVMANAGER);
        Scaffold scaffold = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
        if (P8.b((Integer)adt_2.a(ld_2.a(invManager))) == n) {
            this.a(true);
            this.f = Items.golden_apple;
        }
        if (P8.b((Integer)adt_2.a(ld_2.f(invManager))) == n) {
            this.a(true);
            this.f = Items.diamond_axe;
        }
        if (P8.b((Integer)adt_2.a(ld_2.g(invManager))) == n) {
            this.a(true);
            this.f = Items.bow;
        }
        if (P8.b((Integer)adt_2.a(ld_2.d(invManager))) == n) {
            this.a(true);
            this.f = Items.skull;
        }
        if (P8.b((Integer)adt_2.a(ld_2.c(invManager))) == n) {
            this.a(true);
            this.f = Items.diamond_shovel;
        }
        if (P8.b((Integer)adt_2.a(ld_2.b(invManager))) == n) {
            this.a(true);
            this.f = Items.diamond_pickaxe;
        }
        if (P8.b((Integer)adt_2.a(ld_2.h(invManager))) == n) {
            this.a(true);
            this.f = Items.diamond_sword;
        }
        if (P8.b((Integer)adt_2.a(ma_1.e(scaffold))) == n) {
            this.a(true);
            this.f = px_0.a(Blocks.stone);
        }
        this.c();
    }

    public void a(float f, float f2) {
        BK.b();
        a1V.a(this.e, this.h, this.e + 20.0f, this.h + 20.0f, 1.0f, aol_1.b(new Color(29, 29, 29, 255)), this.b(f, f2) || this.g ? aol_1.b(aol_1.a(new Color(40, 40, 40, 255))) : aol_1.b(new Color(40, 40, 40, 255)));
        if (this.e() && this.f != null) {
            ne_0.f();
            GlStateManagerInvoker.enableDepth();
            DU.b(MCInvoker.A(rp_0.a(this.d)), new ItemStack(this.f), this.e + 2.0f, this.h + 2.0f);
            ne_0.e();
            GlStateManagerInvoker.disableDepth();
        }
    }

    public void a(Item item) {
        this.f = item;
    }

    public boolean e() {
        return this.c;
    }

    static IntProperty a(aqa_1 aqa_12, IntProperty intProperty) {
        aqa_12.a = intProperty;
        return aqa_12.a;
    }
}

