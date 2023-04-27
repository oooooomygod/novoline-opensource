/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.gui.inventory;

import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.utils.Timer;
import cc.novoline.modules.player.AutoArmor;
import net.minecraft.inventory.Container;
import deobf.GuiScreen;
import cc.novoline.modules.visual.HUD;
import cc.novoline.modules.player.InvManager;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.OpenGlHelper;
import net.minecraft.renderer.texture.TextureMap;
import java.awt.Color;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.lwjgl.opengl.GL11;

public abstract class GuiContainer
extends GuiScreen {
    private long af;
    private cy_1 M;
    private boolean T;
    private List<cy_1> w;
    private KillAura R;
    private int E;
    private Slot W;
    public Container F;
    public int Y = 166;
    private cy_1 S;
    protected boolean C;
    public int L = 176;
    private Timer aa;
    private InvManager Q;
    private Slot U;
    private ChestStealer X;
    private ItemStack ah;
    private cy_1 Z;
    private ax4_0 ab = new ax4_0();
    private Slot ad;
    protected int P;
    private AutoArmor N;
    private int O;
    protected int A;
    private cy_1 y;
    private long V;
    private Slot ag;
    private boolean D;
    private int z;
    private int H;
    private ItemStack x;
    private long B;
    private Slot ac;
    protected Set<Slot> K = axe_2.a();
    private int G;
    private int v;
    private boolean J;
    private ItemStack I;
    public static ResourceLocation ae = new ResourceLocation(avo_2.b);

    protected boolean d(int n) {
        if (InventoryInvoker.f(this.t.player.inventory) == null && this.U != null) {
            int n2 = 0;
            while (true) {
                if (n == GameSettingsInvoker.getKeyCode(this.t.gameSettings.E[n2])) {
                    this.a(this.U, this.U.b, n2, 2);
                    return true;
                }
                ++n2;
            }
        }
        return false;
    }

    private static IOException b(IOException iOException) {
        return iOException;
    }

    private void a() {
        ItemStack itemStack = InventoryInvoker.f(this.t.player.inventory);
        if (this.C) {
            this.v = itemStack.a;
            Iterator iterator = aS0.f(this.K);
            while (dz_0.c(iterator)) {
                Slot slot = (Slot)dz_0.b(iterator);
                ItemStack itemStack2 = act_2.C(itemStack);
                int n = ItemStackInvoker.a(slot) == null ? 0 : ItemStackInvoker.a((Slot)slot).a;
                afy_2.a(this.K, this.E, itemStack2, n);
                if (itemStack2.a > act_2.f(itemStack2)) {
                    itemStack2.a = act_2.f(itemStack2);
                }
                if (itemStack2.a > ItemStackInvoker.c(slot, itemStack2)) {
                    itemStack2.a = ItemStackInvoker.c(slot, itemStack2);
                }
                this.v -= itemStack2.a - n;
            }
        }
    }

    private void a(ItemStack itemStack, int n, int n2, String string) {
        GlStateManagerInvoker.translate(0.0f, 0.0f, 32.0f);
        zLevel = 200.0f;
        this.i.e = 200.0f;
        DU.b(this.i, itemStack, n, n2);
        DU.a(this.i, this.q, itemStack, n, n2 - (this.ah == null ? 0 : 8), string);
        zLevel = 0.0f;
        this.i.e = 0.0f;
    }

    private static void lambda$initGui$0(cy_1 cy_12) {
        _j_0.a(cy_1.a(cy_12), 0.2);
    }

    private int a(Color color, Color color2) {
        int n = (int)((float)aol_1.c(color) + (float)(aol_1.c(color2) - aol_1.c(color)) * 1.0f);
        int n2 = (int)((float)aol_1.g(color) + (float)(aol_1.g(color2) - aol_1.g(color)) * 1.0f);
        int n3 = (int)((float)aol_1.f(color) + (float)(aol_1.f(color2) - aol_1.f(color)) * 1.0f);
        int n4 = (int)((float)aol_1.e(color) + (float)(aol_1.e(color2) - aol_1.e(color)) * 1.0f);
        try {
            return aol_1.b(new Color(n, n2, n3, n4));
        }
        catch (Exception exception) {
            return -1;
        }
    }

    private void a(int n, int n2, int n3, int n4, float f) {
        int n5;
        int n6;
        Object object;
        this.a(f, n, n2);
        GlStateManagerInvoker.y();
        ne_0.e();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableDepth();
        super.a(n, n2, f);
        ne_0.f();
        GL11.glPushMatrix();
        GlStateManagerInvoker.translate(n3, n4, 0.0f);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.c();
        this.U = null;
        int n7 = 240;
        int n8 = 240;
        OpenGlHelper.a(apl_1.ab, n7, (float)n8);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        ChestStealer chestStealer = (ChestStealer)ModuleInvoker.isEnable(ModuleRegistry.CHESTSTEALER);
        if (!ty_2.d(chestStealer)) {
            for (int i = 0; i < ListInvoker.size(this.F.b); ++i) {
                object = (Slot)ListInvoker.get(this.F.b, i);
                this.a((Slot)object);
                if (!this.a((Slot)object, n, n2) || !ItemStackInvoker.c((Slot)object)) continue;
                this.U = object;
                GlStateManagerInvoker.disableLighting();
                GlStateManagerInvoker.disableDepth();
                n6 = ((Slot)object).a;
                n5 = ((Slot)object).d;
                GlStateManagerInvoker.a(true, true, true, false);
                this.b(n6, n5, n6 + 16, n5 + 16, -2130706433, -2130706433);
                GlStateManagerInvoker.a(true, true, true, true);
                GlStateManagerInvoker.D();
                GlStateManagerInvoker.enableDepth();
            }
        }
        ne_0.e();
        this.b(n, n2);
        ne_0.f();
        aSK aSK2 = this.t.player.inventory;
        object = this.ah == null ? InventoryInvoker.f(aSK2) : this.ah;
        n6 = 8;
        n5 = this.ah == null ? 8 : 16;
        String string = null;
        if (this.ah != null && this.T) {
            object = act_2.C((ItemStack)object);
            ((ItemStack)object).a = MathHelper.c((float)((ItemStack)object).a / 2.0f);
        } else if (this.C && aS0.d(this.K) > 1) {
            object = act_2.C((ItemStack)object);
            ((ItemStack)object).a = this.v;
            if (((ItemStack)object).a == 0) {
                string = aL0.a(aL0.a(aL0.a(new StringBuilder(), avo_2.c), (Object)anw_0.YELLOW), avo_2.d).toString();
            }
        }
        this.a((ItemStack)object, n - n3 - n6, n2 - n4 - n5, string);
        if (this.x != null) {
            float f2 = (float)(MCInvoker.a() - this.B) / 100.0f;
            if (f2 >= 1.0f) {
                f2 = 1.0f;
                this.x = null;
            }
            n5 = this.W.a - this.O;
            int n9 = this.W.d - this.H;
            int n10 = this.O + (int)((float)n5 * f2);
            int n11 = this.H + (int)((float)n9 * f2);
            this.a(this.x, n10, n11, null);
        }
        GL11.glPopMatrix();
        if (InventoryInvoker.f(aSK2) == null && this.U != null && ItemStackInvoker.e(this.U)) {
            ItemStack itemStack = ItemStackInvoker.a(this.U);
            this.a(itemStack, n, n2);
        }
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.enableDepth();
        ne_0.a();
    }

    private boolean a(Slot slot, int n, int n2) {
        return this.a(slot.a, slot.d, 16, 16, n, n2);
    }

    private void a(Slot slot) {
        int n = slot.a;
        int n2 = slot.d;
        ItemStack itemStack = ItemStackInvoker.a(slot);
        boolean bl = slot == this.ac && this.ah != null && !this.T;
        ItemStack itemStack2 = InventoryInvoker.f(this.t.player.inventory);
        String string = null;
        if (slot == this.ac && this.ah != null && this.T) {
            itemStack = act_2.C(itemStack);
            itemStack.a /= 2;
        } else if (this.C && aS0.c(this.K, slot)) {
            if (aS0.d(this.K) == 1) {
                return;
            }
            if (afy_2.a(slot, itemStack2, true) && afy_2.a(this.F, slot)) {
                itemStack = act_2.C(itemStack2);
                afy_2.a(this.K, this.E, itemStack, ItemStackInvoker.a(slot) == null ? 0 : ItemStackInvoker.a((Slot)slot).a);
                if (itemStack.a > act_2.f(itemStack)) {
                    string = aL0.c(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.YELLOW), avo_2.g), act_2.f(itemStack)).toString();
                    itemStack.a = act_2.f(itemStack);
                }
                if (itemStack.a > ItemStackInvoker.c(slot, itemStack)) {
                    string = aL0.c(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.YELLOW), avo_2.e), ItemStackInvoker.c(slot, itemStack)).toString();
                    itemStack.a = ItemStackInvoker.c(slot, itemStack);
                }
            } else {
                aS0.a(this.K, slot);
                this.a();
            }
        }
        zLevel = 100.0f;
        this.i.e = 100.0f;
        String string2 = ItemStackInvoker.d(slot);
        KM kM = h9.b(MCInvoker.f(this.t), string2);
        GlStateManagerInvoker.disableLighting();
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), TextureMap.r);
        this.a(n, n2, kM, 16, 16);
        GlStateManagerInvoker.D();
        this.a(n, n2, n + 16, n2 + 16, -2130706433);
        GlStateManagerInvoker.enableDepth();
        DU.b(this.i, itemStack, n, n2);
        DU.a(this.i, this.q, itemStack, n, n2, string);
        this.i.e = 0.0f;
        zLevel = 0.0f;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    protected void a(int n, int n2, int n3) {
        super.a(n, n2, n3);
        Slot slot = this.a(n, n2);
        int n4 = this.P;
        int n5 = this.A;
        boolean bl = n < n4 || n2 < n5 || n >= n4 + this.L || n2 >= n5 + this.Y;
        int n6 = -1;
        n6 = slot.b;
        n6 = -999;
        if (this.J && afy_2.a(this.F, null, slot)) {
            if (GuiContainer.j()) {
                if (slot.e != null && this.I != null) {
                    Iterator iterator = ListInvoker.iterator(this.F.b);
                    while (dz_0.c(iterator)) {
                        Slot slot2 = (Slot)dz_0.b(iterator);
                        if (!ItemStackInvoker.a(slot2, this.t.player) || !ItemStackInvoker.e(slot2) || slot2.e != slot.e || !afy_2.a(slot2, this.I, true)) continue;
                        this.a(slot2, slot2.b, n3, 1);
                    }
                }
            } else {
                this.a(slot, n6, n3, 6);
            }
            this.J = false;
            this.V = 0L;
        } else {
            if (this.C && this.z != n3) {
                this.C = false;
                aS0.e(this.K);
                this.D = true;
                return;
            }
            if (this.D) {
                this.D = false;
                return;
            }
            if (this.ac != null && this.t.gameSettings.Y) {
                if (n3 == 1) {
                    if (this.ah == null && slot != this.ac) {
                        this.ah = ItemStackInvoker.a(this.ac);
                    }
                    boolean bl2 = afy_2.a(slot, this.ah, false);
                    if (this.ah != null) {
                        this.a(this.ac, this.ac.b, n3, 0);
                        this.a(slot, n6, 0, 0);
                        if (InventoryInvoker.f(this.t.player.inventory) != null) {
                            this.a(this.ac, this.ac.b, n3, 0);
                            this.O = n - n4;
                            this.H = n2 - n5;
                            this.W = this.ac;
                            this.x = this.ah;
                            this.B = MCInvoker.a();
                        } else {
                            this.x = null;
                        }
                    } else if (this.ah != null) {
                        this.O = n - n4;
                        this.H = n2 - n5;
                        this.W = this.ac;
                        this.x = this.ah;
                        this.B = MCInvoker.a();
                    }
                    this.ah = null;
                    this.ac = null;
                }
            } else if (this.C && !aS0.b(this.K)) {
                this.a(null, -999, afy_2.a(0, this.E), 5);
                Iterator iterator = aS0.f(this.K);
                while (dz_0.c(iterator)) {
                    Slot slot3 = (Slot)dz_0.b(iterator);
                    this.a(slot3, slot3.b, afy_2.a(1, this.E), 5);
                }
                this.a(null, -999, afy_2.a(2, this.E), 5);
            } else if (InventoryInvoker.f(this.t.player.inventory) != null) {
                if (n3 == GameSettingsInvoker.getKeyCode(this.t.gameSettings.b6) + 100) {
                    this.a(slot, n6, n3, 3);
                } else {
                    boolean bl3 = false;
                    this.I = ItemStackInvoker.e(slot) ? ItemStackInvoker.a(slot) : null;
                    this.a(slot, n6, n3, 1);
                }
            }
        }
        if (InventoryInvoker.f(this.t.player.inventory) == null) {
            this.V = 0L;
        }
        this.C = false;
    }

    @Override
    public void i() {
        if (this.t.player != null) {
            afy_2.b(this.F, this.t.player);
        }
        ListInvoker.clear(this.w);
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        boolean bl = n3 == GameSettingsInvoker.getKeyCode(this.t.gameSettings.b6) + 100;
        Slot slot = this.a(n, n2);
        long l4 = MCInvoker.a();
        this.J = this.ad == slot && l4 - this.V < 250L && this.G == n3;
        this.D = false;
        if (n3 != 1) {
            // empty if block
        }
        int n4 = this.P;
        int n5 = this.A;
        boolean bl2 = n < n4 || n2 < n5 || n >= n4 + this.L || n2 >= n5 + this.Y;
        int n6 = -1;
        n6 = slot.b;
        n6 = -999;
        if (this.t.gameSettings.Y && InventoryInvoker.f(this.t.player.inventory) == null) {
            MCInvoker.displayGuiScreen(this.t, null);
            return;
        }
        if (this.t.gameSettings.Y) {
            if (ItemStackInvoker.e(slot)) {
                this.ac = slot;
                this.ah = null;
                this.T = n3 == 1;
            } else {
                this.ac = null;
            }
        } else if (!this.C) {
            if (InventoryInvoker.f(this.t.player.inventory) == null) {
                if (n3 == GameSettingsInvoker.getKeyCode(this.t.gameSettings.b6) + 100) {
                    this.a(slot, n6, n3, 3);
                } else {
                    int n7 = 0;
                    this.I = ItemStackInvoker.e(slot) ? ItemStackInvoker.a(slot) : null;
                    n7 = 1;
                    this.a(slot, n6, n3, n7);
                }
                this.D = true;
            } else {
                this.C = true;
                this.z = n3;
                aS0.e(this.K);
                this.E = 0;
            }
        }
        this.ad = slot;
        this.V = l4;
        this.G = n3;
        Iterator iterator = ListInvoker.iterator(this.w);
        while (dz_0.c(iterator)) {
            cy_1 cy_12 = (cy_1)dz_0.b(iterator);
            axn_2.a(cy_12, n, n2);
        }
        super.b(n, n2, n3);
    }

    @Override
    public void l() {
        super.l();
        this.t.player.bI = this.F;
        this.P = (this.n - this.L) / 2;
        this.A = (this.f - this.Y) / 2;
        if (this.t.al == null) {
            HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
            if (StringPropertyInvoker.isMode(cw_2.A(hUD), avo_2.h)) {
                abl_1.b(this.aa);
            } else if (StringPropertyInvoker.isMode(cw_2.A(hUD), avo_2.f)) {
                _j_0.a(this.ab, 0.4);
                ListInvoker.forEach(this.w, GuiContainer::lambda$initGui$0);
            }
        }
    }

    protected void a(Slot slot, int n, int n2, int n3) {
        n = slot.b;
        PlayerControllerInvoker.b(this.t.playerController, this.F.f, n, n2, n3, this.t.player);
    }

    public GuiContainer(Container container) {
        this.R = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
        this.N = (AutoArmor)ModuleInvoker.isEnable(ModuleRegistry.AUTOARMOR);
        this.X = (ChestStealer)ModuleInvoker.isEnable(ModuleRegistry.CHESTSTEALER);
        this.Q = (InvManager)ModuleInvoker.isEnable(ModuleRegistry.INVMANAGER);
        this.Z = new cy_1(this, this.R, 10.0, 8.0, 160.0, 20.0);
        this.y = new cy_1(this, this.N, 10.0, 38.0, 160.0, 20.0);
        this.M = new cy_1(this, this.X, 10.0, 68.0, 160.0, 20.0);
        this.S = new cy_1(this, this.Q, 10.0, 98.0, 160.0, 20.0);
        this.w = my_0.a(new cy_1[]{this.Z, this.y, this.M, this.S});
        this.aa = new Timer();
        this.F = container;
        this.D = true;
    }

    protected void b(int n, int n2) {
    }

    @Override
    protected void a(int n, int n2, int n3, long l4) {
        Slot slot = this.a(n, n2);
        ItemStack itemStack = InventoryInvoker.f(this.t.player.inventory);
        if (this.ac != null && this.t.gameSettings.Y) {
            if (n3 == 1) {
                if (this.ah == null) {
                    if (slot != this.ac && ItemStackInvoker.a(this.ac) != null) {
                        this.ah = act_2.C(ItemStackInvoker.a(this.ac));
                    }
                } else if (this.ah.a > 1 && afy_2.a(slot, this.ah, false)) {
                    long l5 = MCInvoker.a();
                    if (this.ag == slot) {
                        if (l5 - this.af > 500L) {
                            this.a(this.ac, this.ac.b, 0, 0);
                            this.a(slot, slot.b, 1, 0);
                            this.a(this.ac, this.ac.b, 0, 0);
                            this.af = l5 + 750L;
                            --this.ah.a;
                        }
                    } else {
                        this.ag = slot;
                        this.af = l5;
                    }
                }
            }
        } else if (this.C && itemStack.a > aS0.d(this.K) && afy_2.a(slot, itemStack, true) && ItemStackInvoker.b(slot, itemStack) && afy_2.a(this.F, slot)) {
            aS0.b(this.K, slot);
            this.a();
        }
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (n == 1 || n == GameSettingsInvoker.getKeyCode(this.t.gameSettings.a0)) {
            PlayerInvoker.P(this.t.player);
        }
        this.d(n);
        if (this.U != null && ItemStackInvoker.e(this.U)) {
            if (n == GameSettingsInvoker.getKeyCode(this.t.gameSettings.b6)) {
                this.a(this.U, this.U.b, 0, 3);
            } else if (n == GameSettingsInvoker.getKeyCode(this.t.gameSettings.ak)) {
                this.a(this.U, this.U.b, GuiContainer.m() ? 1 : 0, 4);
            }
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        Object object;
        int n3 = this.P;
        int n4 = this.A;
        ScaledResolution scaledResolution = new ScaledResolution(this.t);
        if (!ty_2.d(this.X)) {
            this.h();
            object = ListInvoker.iterator(this.w);
            while (dz_0.c((Iterator)object)) {
                cy_1 cy_12;
                cy_1.a(cy_12, axn_2.b(cy_12 = (cy_1)dz_0.b((Iterator)object), n, n2) ? 0xFFFFFF : hb_2.a(150, 150, 150));
                double d = cy_1.d(cy_12) + cy_1.b(cy_12) / 2.0;
                double d2 = cy_1.c(cy_12) + cy_1.e(cy_12) / 2.0;
                _j_0.a(cy_1.a(cy_12), d, d2, 0.03, cy_12::a, 200L);
            }
        }
        object = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        double d = ScaledResolutionInvoker.f(scaledResolution) / 2.0;
        double d3 = ScaledResolutionInvoker.c(scaledResolution) / 2.0;
        if (StringPropertyInvoker.isMode(cw_2.A((HUD)object), avo_2.a)) {
            GL11.glPushMatrix();
            double d4 = 0.5 - abl_1.a(this.aa, 200L, 0.5);
            GL11.glTranslated((double)0.0, (double)((double)(-(this.A + this.Y)) * d4), (double)0.0);
            this.a(n, n2, n3, n4, f);
            GL11.glPopMatrix();
        } else if (StringPropertyInvoker.isMode(cw_2.A((HUD)object), avo_2.i)) {
            _j_0.a(this.ab, d, d3, 0.03, () -> this.lambda$drawScreen$1(n, n2, n3, n4, f), 200L);
        } else {
            this.a(n, n2, n3, n4, f);
        }
    }

    private void lambda$drawScreen$1(int n, int n2, int n3, int n4, float f) {
        this.a(n, n2, n3, n4, f);
    }

    private Slot a(int n, int n2) {
        for (int i = 0; i < ListInvoker.size(this.F.b); ++i) {
            Slot slot = (Slot)ListInvoker.get(this.F.b, i);
            if (!this.a(slot, n, n2)) continue;
            return slot;
        }
        return null;
    }

    @Override
    public void g() {
        super.g();
        if (!PlayerInvoker.L(this.t.player) || this.t.player.isDead) {
            PlayerInvoker.P(this.t.player);
        }
    }

    protected boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.P;
        int n8 = this.A;
        return (n5 -= n7) >= n - 1 && n5 < n + n3 + 1 && (n6 -= n8) >= n2 - 1 && n6 < n2 + n4 + 1;
    }

    protected abstract void a(float var1, int var2, int var3);
}

