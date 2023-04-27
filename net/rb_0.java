/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.Rb
 */
public class rb_0
extends RK {
    private boolean at;
    private static int aj;
    private aX0 ap;
    private static ResourceLocation ar;
    private boolean am;
    private Slot an;
    private List<Slot> ak;
    private float as;
    private static wu_0 ao;
    private sc_0 aq;
    private boolean al;

    public int a() {
        return aj;
    }

    @Override
    protected void b() {
        int n = this.P;
        super.b();
        if (this.aq != null && this.P != n) {
            this.aq.x = this.P + 82;
        }
    }

    private void b(CreativeTabs creativeTabs) {
        int n = aj;
        aj = aw3_0.d(creativeTabs);
        aap_1 aap_12 = (aap_1)this.F;
        aS0.e(this.K);
        ListInvoker.clear(aap_12.j);
        aw3_0.a(creativeTabs, aap_12.j);
        if (creativeTabs == CreativeTabs.o) {
            Container container = this.t.player.bp;
            if (this.ak == null) {
                this.ak = aap_12.b;
            }
            aap_12.b = my_0.c();
            for (int i = 0; i < ListInvoker.size(container.b); ++i) {
                a74 a742 = new a74(this, (Slot)ListInvoker.get(container.b, i), i);
                ListInvoker.add(aap_12.b, a742);
                a742.d = -2000;
                a742.a = -2000;
            }
            this.an = new Slot(ao, 0, 173, 112);
            ListInvoker.add(aap_12.b, this.an);
        } else if (n == aw3_0.d(CreativeTabs.o)) {
            aap_12.b = this.ak;
            this.ak = null;
        }
        if (this.aq != null) {
            if (creativeTabs == CreativeTabs.e) {
                hc_1.b(this.aq, true);
                hc_1.a(this.aq, false);
                hc_1.c(this.aq, true);
                hc_1.b(this.aq, a5k_0.a);
                this.j();
            } else {
                hc_1.b(this.aq, false);
                hc_1.a(this.aq, true);
                hc_1.c(this.aq, false);
            }
        }
        this.as = 0.0f;
        aap_12.a(0.0f);
    }

    static wu_0 m() {
        return ao;
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        int n4 = n - this.P;
        int n5 = n2 - this.A;
        for (CreativeTabs creativeTabs : CreativeTabs.t) {
            if (!this.a(creativeTabs, n4, n5)) continue;
            return;
        }
        super.b(n, n2, n3);
    }

    @Override
    public void g() {
        if (!PlayerControllerInvoker.d(this.t.playerController)) {
            MCInvoker.displayGuiScreen(this.t, new R1(this.t.player));
        }
        this.b();
    }

    @Override
    public void i() {
        super.i();
        if (this.t.player != null && this.t.player.inventory != null) {
            afy_2.b(this.t.player.bp, this.ap);
        }
        KeyboardInvoker.a(false);
    }

    @Override
    public void c() throws IOException {
        super.c();
        int n = MouseInvoker.h();
        if (this.l()) {
            int n2 = ListInvoker.size(((aap_1)this.F).j) / 9 - 5;
            n = 1;
            n = -1;
            this.as = (float)((double)this.as - (double)n / (double)n2);
            this.as = MathHelper.b(this.as, 0.0f, 1.0f);
            ((aap_1)this.F).a(this.as);
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        boolean bl = MouseInvoker.c(0);
        int n3 = this.P;
        int n4 = this.A;
        int n5 = n3 + 175;
        int n6 = n4 + 18;
        int n7 = n5 + 14;
        int n8 = n6 + 112;
        if (!this.am && n >= n5 && n2 >= n6 && n < n7 && n2 < n8) {
            this.al = this.l();
        }
        this.al = false;
        this.am = bl;
        if (this.al) {
            this.as = ((float)(n2 - n6) - 7.5f) / ((float)(n8 - n6) - 15.0f);
            this.as = MathHelper.b(this.as, 0.0f, 1.0f);
            ((aap_1)this.F).a(this.as);
        }
        super.a(n, n2, f);
        for (CreativeTabs creativeTabs : CreativeTabs.t) {
            if (this.b(creativeTabs, n, n2)) break;
        }
        if (this.an != null && aj == aw3_0.d(CreativeTabs.o) && this.a(this.an.a, this.an.d, 16, 16, n, n2)) {
            this.a(I18n.format(a5k_0.d, new Object[0]), n, n2);
        }
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.disableLighting();
    }

    @Override
    public void l() {
        if (PlayerControllerInvoker.d(this.t.playerController)) {
            super.l();
            ListInvoker.clear(this.l);
            KeyboardInvoker.a(true);
            this.aq = new sc_0(0, this.q, this.P + 82, this.A + 6, 89, FontRendererInvoker.d(this.q));
            hc_1.a(this.aq, 15);
            hc_1.e(this.aq, false);
            hc_1.b(this.aq, false);
            hc_1.c(this.aq, 0xFFFFFF);
            int n = aj;
            aj = -1;
            this.b(CreativeTabs.t[n]);
            this.ap = new aX0(this.t);
            afy_2.a(this.t.player.bp, this.ap);
        } else {
            MCInvoker.displayGuiScreen(this.t, new R1(this.t.player));
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void a(ItemStack itemStack, int n, int n2) {
        if (aj == aw3_0.d(CreativeTabs.e)) {
            Map map;
            List list = act_2.a(itemStack, (EntityPlayer)this.t.player, this.t.gameSettings.bm);
            CreativeTabs creativeTabs = px_0.j(act_2.k(itemStack));
            if (act_2.k(itemStack) == Items.enchanted_book && MapInvoker.a(map = alf_0.a(itemStack)) == 1) {
                yl_2 yl_22 = xr_1.a(P8.b((Integer)dz_0.b(aS0.f(MapInvoker.c(map)))));
                for (CreativeTabs creativeTabs2 : CreativeTabs.t) {
                    if (!aw3_0.a(creativeTabs2, yl_22.g)) continue;
                    creativeTabs = creativeTabs2;
                    break;
                }
            }
            ListInvoker.add(list, 1, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a5k_0.c), (Object)anw_0.BOLD), (Object)anw_0.BLUE), I18n.format(aw3_0.f(creativeTabs), new Object[0])).toString());
            for (int i = 0; i < ListInvoker.size(list); ++i) {
                ListInvoker.set(list, i, aL0.a(aL0.a(new StringBuilder(), (Object)act_2.D((ItemStack)itemStack).rarityColor), (String)ListInvoker.get(list, i)).toString());
            }
            this.a(list, n, n2);
        } else {
            super.a(itemStack, n, n2);
        }
    }

    public rb_0(EntityPlayer entityPlayer) {
        super(new aap_1(entityPlayer));
        entityPlayer.bI = this.F;
        this.Y = 136;
        this.L = 195;
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (aj != aw3_0.d(CreativeTabs.e)) {
            if (awu_1.a(this.t.gameSettings.a)) {
                this.b(CreativeTabs.e);
            } else {
                super.a(c, n);
            }
        } else {
            if (this.at) {
                this.at = false;
                hc_1.b(this.aq, a5k_0.e);
            }
            if (!this.d(n)) {
                if (hc_1.a(this.aq, c, n)) {
                    this.j();
                } else {
                    super.a(c, n);
                }
            }
        }
    }

    static {
        ar = new ResourceLocation(a5k_0.g);
        ao = new wu_0(a5k_0.b, true, 45);
        aj = aw3_0.d(CreativeTabs.m);
    }

    private boolean l() {
        return aj != aw3_0.d(CreativeTabs.o) && aw3_0.a(CreativeTabs.t[aj]) && ((aap_1)this.F).a();
    }

    @Override
    protected void b(int n, int n2) {
        CreativeTabs creativeTabs = CreativeTabs.t[aj];
        if (aw3_0.b(creativeTabs)) {
            GlStateManagerInvoker.disableBlend();
            FontRendererInvoker.a(this.q, I18n.format(aw3_0.f(creativeTabs), new Object[0]), 8.0f, 6.0f, 0x404040);
        }
    }

    protected boolean b(CreativeTabs creativeTabs, int n, int n2) {
        int n3 = aw3_0.e(creativeTabs);
        int n4 = 28 * n3;
        int n5 = 0;
        n4 = n3 == 5 ? this.L - 28 + 2 : (n4 += n3);
        n5 = aw3_0.c(creativeTabs) ? (n5 -= 32) : (n5 += this.Y);
        if (this.a(n4 + 3, n5 + 3, 23, 27, n, n2)) {
            this.a(I18n.format(aw3_0.f(creativeTabs), new Object[0]), n, n2);
            return true;
        }
        return false;
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        ne_0.f();
        CreativeTabs creativeTabs = CreativeTabs.t[aj];
        for (CreativeTabs creativeTabs2 : CreativeTabs.t) {
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ar);
            if (aw3_0.d(creativeTabs2) == aj) continue;
            this.a(creativeTabs2);
        }
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), new ResourceLocation(aL0.a(aL0.a(new StringBuilder(), a5k_0.f), aw3_0.h(creativeTabs)).toString()));
        this.c(this.P, this.A, 0, 0, this.L, this.Y);
        hc_1.d(this.aq);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        int n3 = this.P + 175;
        int n4 = this.A + 18;
        int n5 = n4 + 112;
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ar);
        if (aw3_0.a(creativeTabs)) {
            this.c(n3, n4 + (int)((float)(n5 - n4 - 17) * this.as), 232 + (this.l() ? 0 : 12), 0, 12, 15);
        }
        this.a(creativeTabs);
        if (creativeTabs == CreativeTabs.o) {
            aw9_0.a(this.P + 43, this.A + 45, 20, this.P + 43 - n, this.A + 45 - 30 - n2, this.t.player);
        }
    }

    private void j() {
        aap_1 aap_12 = (aap_1)this.F;
        ListInvoker.clear(aap_12.j);
        Iterator object = aLP.a(Item.k);
        while (dz_0.c(object)) {
            Item string = (Item)dz_0.b(object);
            if (px_0.j(string) == null) continue;
            px_0.a(string, string, null, aap_12.j);
        }
        for (yl_2 yl_22 : yl_2.m) {
            if (yl_22.g == null) continue;
            arw_2.a(Items.enchanted_book, yl_22, aap_12.j);
        }
        Iterator iterator = ListInvoker.iterator(aap_12.j);
        String string = StringInvoker.i(hc_1.a(this.aq));
        while (dz_0.c(iterator)) {
            ItemStack itemStack = (ItemStack)dz_0.b(iterator);
            boolean bl = false;
            Iterator iterator2 = ListInvoker.iterator(act_2.a(itemStack, (EntityPlayer)this.t.player, this.t.gameSettings.bm));
            while (dz_0.c(iterator2)) {
                String string2 = (String)dz_0.b(iterator2);
                if (!StringInvoker.a(StringInvoker.i(tc_0.b(string2)), (CharSequence)string)) continue;
                bl = true;
                break;
            }
            dz_0.a(iterator);
        }
        this.as = 0.0f;
        aap_12.a(0.0f);
    }

    @Override
    protected void a(int n, int n2, int n3) {
        int n4 = n - this.P;
        int n5 = n2 - this.A;
        for (CreativeTabs creativeTabs : CreativeTabs.t) {
            if (!this.a(creativeTabs, n4, n5)) continue;
            this.b(creativeTabs);
            return;
        }
        super.a(n, n2, n3);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 0) {
            MCInvoker.displayGuiScreen(this.t, new ri_0(this, PlayerInvoker.s(this.t.player)));
        }
        if (qG.m == 1) {
            MCInvoker.displayGuiScreen(this.t, new R8(this, PlayerInvoker.s(this.t.player)));
        }
    }

    @Override
    protected void a(Slot slot, int n, int n2, int n3) {
        this.at = true;
        boolean bl = n3 == 1;
        int n4 = n3 = n == -999 ? 4 : n3;
        if (aj != aw3_0.d(CreativeTabs.o) && n3 != 5) {
            aSK aSK2 = this.t.player.inventory;
            if (InventoryInvoker.f(aSK2) != null) {
                PlayerInvoker.a(this.t.player, InventoryInvoker.f(aSK2), true);
                PlayerControllerInvoker.a(this.t.playerController, InventoryInvoker.f(aSK2));
                InventoryInvoker.c(aSK2, null);
                if (n2 == 1) {
                    ItemStack itemStack = act_2.b(InventoryInvoker.f(aSK2), 1);
                    PlayerInvoker.a(this.t.player, itemStack, true);
                    PlayerControllerInvoker.a(this.t.playerController, itemStack);
                    if (InventoryInvoker.f((aSK)aSK2).a == 0) {
                        InventoryInvoker.c(aSK2, null);
                    }
                }
            }
        } else if (slot == this.an) {
            for (int i = 0; i < ListInvoker.size(afy_2.a(this.t.player.bp)); ++i) {
                PlayerControllerInvoker.a(this.t.playerController, null, i);
            }
        } else if (aj == aw3_0.d(CreativeTabs.o)) {
            if (slot == this.an) {
                InventoryInvoker.c(this.t.player.inventory, null);
            } else if (n3 == 4 && ItemStackInvoker.e(slot)) {
                ItemStack itemStack = ItemStackInvoker.a(slot, 1);
                PlayerInvoker.a(this.t.player, itemStack, true);
                PlayerControllerInvoker.a(this.t.playerController, itemStack);
            } else if (n3 == 4 && InventoryInvoker.f(this.t.player.inventory) != null) {
                PlayerInvoker.a(this.t.player, InventoryInvoker.f(this.t.player.inventory), true);
                PlayerControllerInvoker.a(this.t.playerController, InventoryInvoker.f(this.t.player.inventory));
                InventoryInvoker.c(this.t.player.inventory, null);
            } else {
                afy_2.a(this.t.player.bp, n, n2, n3, this.t.player);
                afy_2.b(this.t.player.bp);
            }
        } else if (n3 != 5 && slot.e == ao) {
            aSK aSK3 = this.t.player.inventory;
            ItemStack itemStack = InventoryInvoker.f(aSK3);
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            if (n3 == 2) {
                if (n2 < 9) {
                    ItemStack itemStack3 = act_2.C(itemStack2);
                    itemStack3.a = act_2.f(itemStack3);
                    InventoryInvoker.a(this.t.player.inventory, n2, itemStack3);
                    afy_2.b(this.t.player.bp);
                }
                return;
            }
            if (n3 == 3) {
                if (InventoryInvoker.f(aSK3) == null && ItemStackInvoker.e(slot)) {
                    ItemStack itemStack4 = act_2.C(ItemStackInvoker.a(slot));
                    itemStack4.a = act_2.f(itemStack4);
                    InventoryInvoker.c(aSK3, itemStack4);
                }
                return;
            }
            if (n3 == 4) {
                ItemStack itemStack5 = act_2.C(itemStack2);
                itemStack5.a = 1;
                PlayerInvoker.a(this.t.player, itemStack5, true);
                PlayerControllerInvoker.a(this.t.playerController, itemStack5);
                return;
            }
            if (act_2.a(itemStack, itemStack2)) {
                itemStack.a = act_2.f(itemStack);
            } else {
                InventoryInvoker.c(aSK3, act_2.e(itemStack2));
                itemStack = InventoryInvoker.f(aSK3);
                itemStack.a = act_2.f(itemStack);
            }
        } else {
            afy_2.a(this.F, n, n2, n3, this.t.player);
            if (afy_2.a(n2) == 2) {
                int n5 = 0;
                while (true) {
                    PlayerControllerInvoker.a(this.t.playerController, ItemStackInvoker.a(afy_2.a(this.F, 45 + n5)), 36 + n5);
                    ++n5;
                }
            }
            ItemStack itemStack = ItemStackInvoker.a(afy_2.a(this.F, slot.b));
            PlayerControllerInvoker.a(this.t.playerController, itemStack, slot.b - ListInvoker.size(this.F.b) + 9 + 36);
        }
    }

    protected boolean a(CreativeTabs creativeTabs, int n, int n2) {
        int n3 = aw3_0.e(creativeTabs);
        int n4 = 28 * n3;
        int n5 = 0;
        n4 = n3 == 5 ? this.L - 28 + 2 : (n4 += n3);
        n5 = aw3_0.c(creativeTabs) ? (n5 -= 32) : (n5 += this.Y);
        return n >= n4 && n <= n4 + 28 && n2 >= n5 && n2 <= n5 + 32;
    }

    protected void a(CreativeTabs creativeTabs) {
        boolean bl = aw3_0.d(creativeTabs) == aj;
        aw3_0.c(creativeTabs);
        int n = aw3_0.e(creativeTabs);
        int n2 = n * 28;
        int n3 = 0;
        int n4 = this.P + 28 * n;
        int n5 = this.A;
        int n6 = 32;
        n4 = n == 5 ? this.P + this.L - 28 : (n4 += n);
        GlStateManagerInvoker.disableLighting();
        this.c(n4, n5 -= 28, n2, n3 += 32, 28, n6);
        zLevel = 100.0f;
        this.i.e = 100.0f;
        n5 = n5 + 8 + 1;
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.c();
        ItemStack itemStack = aw3_0.g(creativeTabs);
        DU.b(this.i, itemStack, n4 += 6, n5);
        DU.a(this.i, this.q, itemStack, n4, n5);
        GlStateManagerInvoker.disableLighting();
        this.i.e = 0.0f;
        zLevel = 0.0f;
    }
}

