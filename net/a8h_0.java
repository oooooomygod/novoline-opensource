/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.ModelManagerInvoker;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from net.a8h
 */
public class a8h_0 {
    private Map<Integer, JE> b;
    private Map<Integer, aRJ> a = MapsInvoker.a();
    private ModelManager d;
    private Map<Item, vv_0> c;

    protected int b(ItemStack itemStack) {
        return act_2.y(itemStack) ? 0 : act_2.c(itemStack);
    }

    public a8h_0(ModelManager modelManager) {
        this.b = MapsInvoker.a();
        this.c = MapsInvoker.a();
        this.d = modelManager;
    }

    public ModelManager b() {
        return this.d;
    }

    protected JE c(Item item, int n) {
        return (JE)MapInvoker.c(this.b, P8.d(this.a(item, n)));
    }

    public void a(Item item, int n, aRJ aRJ2) {
        MapInvoker.c(this.a, P8.d(this.a(item, n)), aRJ2);
        MapInvoker.c(this.b, P8.d(this.a(item, n)), ModelManagerInvoker.a(this.d, aRJ2));
    }

    public void a() {
        MapInvoker.d(this.b);
        Iterator iterator = aS0.f(MapInvoker.b(this.a));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            MapInvoker.c(this.b, FG.b(entry), ModelManagerInvoker.a(this.d, (aRJ)FG.a(entry)));
        }
    }

    private int a(Item item, int n) {
        return px_0.a(item) << 16 | n;
    }

    public KM b(Item item, int n) {
        return aND.f(this.a(new ItemStack(item, 1, n)));
    }

    public KM a(Item item) {
        return this.b(item, 0);
    }

    public JE a(ItemStack itemStack) {
        Item item = act_2.k(itemStack);
        JE jE = this.c(item, this.b(itemStack));
        vv_0 vv_02 = (vv_0)MapInvoker.c(this.c, item);
        jE = ModelManagerInvoker.a(this.d, K_.a(vv_02, itemStack));
        jE = ModelManagerInvoker.a(this.d);
        return jE;
    }

    public void a(Item item, vv_0 vv_02) {
        MapInvoker.c(this.c, item, vv_02);
    }
}

