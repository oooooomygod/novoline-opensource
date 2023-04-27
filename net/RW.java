/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayer;
import deobf.FontRenderer;
import deobf.GuiScreen;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import java.awt.Color;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.Minecraft;

public class RW
extends GuiScreen {
    private so_0 x;
    private int v = 1;
    private List<BK> w;
    private Minecraft y = MCInvoker.f();

    @Override
    protected void a(char c, int n) throws IOException {
        Item item;
        Iterator iterator;
        BK.b();
        ade_1.a(this.x, c, n);
        if (!StringInvoker.g(ade_1.a(this.x))) {
            ListInvoker.clear(this.w);
            this.v = 1;
            iterator = aLP.a(Item.k);
            if (dz_0.c(iterator)) {
                String string;
                String string2;
                item = (Item)dz_0.b(iterator);
                ItemStack itemStack = new ItemStack(item);
                List list = act_2.a(itemStack, (EntityPlayer)this.y.player, this.y.gameSettings.bm);
                String string3 = StringInvoker.i(ade_1.a(this.x));
                boolean bl = false;
                Iterator iterator2 = ListInvoker.iterator(list);
                if (dz_0.c(iterator2) && StringInvoker.a(string2 = StringInvoker.i(tc_0.b(string = (String)dz_0.b(iterator2))), (CharSequence)string3)) {
                    bl = true;
                }
            }
        }
        ListInvoker.clear(this.w);
        this.v = 1;
        iterator = aLP.a(Item.k);
        if (dz_0.c(iterator)) {
            item = (Item)dz_0.b(iterator);
            ListInvoker.add(this.w, new BK(this, item));
        }
        super.a(c, n);
    }

    @Override
    public void a(int n, int n2, float f) {
        BK.b();
        Minecraft minecraft = this.y;
        double d = ua_2.a(true);
        ScaledResolution scaledResolution = new ScaledResolution(minecraft);
        float f2 = ScaledResolutionInvoker.a(scaledResolution) / 2;
        float f3 = ScaledResolutionInvoker.g(scaledResolution) / 2;
        float f4 = f2 - 100.0f;
        float f5 = f3 - 90.0f;
        ml_0 ml_02 = FK.c();
        switch (alm_1.a[ml_02.ordinal()]) {
            case 1: {
                if (this.v - 10 <= 0) break;
                this.v -= 10;
                ListInvoker.b(new ListInvoker[3]);
            }
            case 2: {
                if (this.v + 90 > ListInvoker.size(this.w)) break;
                this.v += 10;
            }
        }
        arn_1.d((double)(f2 - 100.0f) - 0.5, (double)f3 - 104.0, (double)(f2 + 100.0f) + 0.5, f3 - 90.0f, aol_1.b(new Color(29, 29, 29, 255)));
        FontRendererInvoker.a(this.y.fontRendererCrack, aix_0.a, f2 - 100.0f + 2.0f, f3 - 104.0f + 3.0f, -1, true);
        int n3 = this.v;
        if (n3 < MathHelper.a(this.v + 90, this.v, ListInvoker.size(this.w) + 1)) {
            BK bK = (BK)ListInvoker.get(this.w, n3 - 1);
            int n4 = ua_2.a(n);
            int n5 = ua_2.b(n2);
            ado_2.a(bK, n4, n5, f4, f5);
            f4 += 20.0f;
            if (n3 % 10 == 0) {
                f4 = f2 - 100.0f;
                f5 += 20.0f;
            }
            ++n3;
        }
        ade_1.b(this.x);
        ua_2.a(d);
        super.a(n, n2, f);
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        int n4 = ua_2.a(n);
        BK.b();
        int n5 = ua_2.b(n2);
        this.x.a(n4, n5, n3);
        Iterator iterator = ListInvoker.iterator(this.w);
        if (dz_0.c(iterator)) {
            BK bK = (BK)dz_0.b(iterator);
            ado_2.a(bK, n4, n5, n3);
        }
        super.b(n4, n5, n3);
    }

    static FontRenderer d(RW rW) {
        return rW.q;
    }

    static FontRenderer c(RW rW) {
        return rW.q;
    }

    static FontRenderer f(RW rW) {
        return rW.q;
    }

    static FontRenderer b(RW rW) {
        return rW.q;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void l() {
        Minecraft minecraft = this.y;
        BK.b();
        ScaledResolution scaledResolution = new ScaledResolution(minecraft);
        float f = ScaledResolutionInvoker.a(scaledResolution) / 2;
        float f2 = ScaledResolutionInvoker.g(scaledResolution) / 2;
        ListInvoker.clear(this.w);
        this.v = 1;
        Iterator iterator = aLP.a(Item.k);
        if (dz_0.c(iterator)) {
            Item item = (Item)dz_0.b(iterator);
            ListInvoker.add(this.w, new BK(this, item));
        }
        this.x = new so_0(this, 0, this.y.fontRendererCrack, (int)(f + 20.0f), (int)(f2 - 109.0f + 2.0f), 78, 20);
        super.l();
    }

    static FontRenderer h(RW rW) {
        return rW.q;
    }

    static FontRenderer i(RW rW) {
        return rW.q;
    }

    static FontRenderer e(RW rW) {
        return rW.q;
    }

    static Minecraft a(RW rW) {
        return rW.y;
    }

    static FontRenderer g(RW rW) {
        return rW.q;
    }

    public RW() {
        this.w = new CopyOnWriteArrayList<BK>();
    }
}

