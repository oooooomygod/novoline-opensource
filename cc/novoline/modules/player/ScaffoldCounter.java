/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.modules.player;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import java.awt.Color;
import net.Ba;
import net.MD;
import net.P8;
import net.ScaledResolution;
import net._j_0;
import net.a1V;
import net.a7l_0;
import net.aV3;
import net.aYW;
import net.act_2;
import net.adt_2;
import net.auk_2;
import net.db_0;
import net.ma_1;

public class ScaffoldCounter {
    Scaffold a;

    public ScaffoldCounter(Scaffold scaffold) {
        this.a = scaffold;
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        Scaffold.p();
        if (_j_0.a(Scaffold.e(this.a)) <= 0.0) {
            EventManagerInvoker.b(this);
            return;
        }
        ScaledResolution scaledResolution = new ScaledResolution(Scaffold.i(this.a));
        double d = ScaledResolutionInvoker.f(scaledResolution);
        double d2 = ScaledResolutionInvoker.c(scaledResolution);
        boolean bl = auk_2.a((Boolean)Ba.b(Scaffold.b(this.a)));
        double d3 = d / 2.0;
        double d4 = d2 - (double)(bl ? 158 : 131) + (double)((bl ? 46 : 18) / 2);
        _j_0.a(Scaffold.e(this.a), d3, d4, 0.14, () -> this.lambda$draw$0(bl, d, d2), 200L);
    }

    private void lambda$draw$0(boolean bl, double d, double d2) {
        ItemStack itemStack;
        Scaffold.n();
        String string = StringInvoker.a(ma_1.b(this.a));
        if (auk_2.a((Boolean)Ba.b(Scaffold.d(this.a)))) {
            double d3 = 10 * (bl ? 4 : StringInvoker.c(string));
            aV3.a(aV3.a(), d / 2.0 - d3 / 2.0, d2 - (double)(bl ? 158 : 131), d3, 46.0, MathInvoker.a(24.0, db_0.b((Double)MD.b(Scaffold.a(this.a)))), (double)P8.b((Integer)adt_2.a(Scaffold.f(this.a))), new Color(0, 0, 0, P8.b((Integer)adt_2.a(Scaffold.c(this.a)))), true);
        }
        if (bl && act_2.k(itemStack = InventoryInvoker.c(Scaffold.h((Scaffold)this.a).player.inventory, P8.b((Integer)adt_2.a(Scaffold.getSlot(this.a))) - 1)) != null && act_2.k(itemStack) instanceof ItemBlock) {
            a1V.a(itemStack, d / 2.0 - 8.0, d2 - 150.0, 0.75);
        }
        a7l_0.a(aYW.a, (CharSequence)string, d / 2.0, d2 - 125.0, 0xFFFFFF, true);
    }
}

