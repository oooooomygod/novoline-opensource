/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.awt.Color;
import java.util.List;

public class IZ {
    UhcCrafts e;
    private float d;
    private float f = 132.0f;
    private float b = 22.0f;
    private int g;
    private ajn_0 a;
    private UhcCrafts c;
    private float h;

    public float a() {
        return this.d;
    }

    public void a(float f, float f2) {
        this.h = f;
        this.d = f2;
    }

    public ItemStack b() {
        return new ItemStack(a0k.e(this.a), 1);
    }

    public void a(int n, int n2, int n3) {
        UhcCrafts.d();
        if (this.b(n, n2) && n3 == 0) {
            if (a0k.h(this.a)) {
                int n4 = 0;
                if (n4 < a0k.c(this.a).length) {
                    Item item = a0k.c(this.a)[n4];
                    this.g = PlayerInvoker.a(UhcCrafts.q((UhcCrafts)this.e).player, item);
                    this.a(a0k.g(this.a), item, n4);
                    if (this.g == -1) {
                        UhcCrafts.a(this.e, alu_0.d(this.e), aC1.i, 2500, NotificationType.ERROR);
                        return;
                    }
                    ++n4;
                }
                if (a0k.g(this.a).equals(aC1.o)) {
                    if (PlayerInvoker.aa(UhcCrafts.c((UhcCrafts)this.e).player) >= 10.0f) {
                        UhcCrafts.c(this.e, alu_0.d(this.e), aC1.d, 2500, NotificationType.ERROR);
                        return;
                    }
                } else if (a0k.g(this.a).equals(aC1.f) && PlayerInvoker.aa(UhcCrafts.p((UhcCrafts)this.e).player) >= 10.0f && !alu_0.c(this.e)) {
                    UhcCrafts.b(this.e, alu_0.d(this.e), aC1.l, 2500, NotificationType.ERROR);
                    return;
                }
                n4 = UhcCrafts.l((UhcCrafts)this.e).player.bI.f;
                int n5 = 0;
                if (n5 < a0k.c(this.a).length) {
                    Item item = a0k.c(this.a)[n5];
                    this.g = PlayerInvoker.a(UhcCrafts.e((UhcCrafts)this.e).player, item);
                    this.a(a0k.g(this.a), item, n5);
                    PlayerControllerInvoker.a(UhcCrafts.s((UhcCrafts)this.e).playerController, n4, this.g, 0, 0, UhcCrafts.o((UhcCrafts)this.e).player);
                    PlayerControllerInvoker.a(UhcCrafts.d((UhcCrafts)this.e).playerController, n4, n5 + 1, 1, 0, UhcCrafts.i((UhcCrafts)this.e).player);
                    PlayerControllerInvoker.a(UhcCrafts.b((UhcCrafts)this.e).playerController, n4, this.g, 0, 0, UhcCrafts.r((UhcCrafts)this.e).player);
                    ++n5;
                }
            }
            UhcCrafts.d(this.e, alu_0.d(this.e), aC1.a, 2500, NotificationType.ERROR);
        }
    }

    public void a(double[] dArray) {
        aV3.a(aV3.a(), (double)this.h, (double)this.d, 132.0, 22.0, 6.0, 2.0, new Color(31, 31, 31), dArray, true);
    }

    public List<ItemStack> c() {
        return (List)aMF.a(aMF.a(a7r_0.e(a0k.c(this.a)), IZ::lambda$getLayout$0), aB0.a());
    }

    public boolean b(int n, int n2) {
        UhcCrafts.d();
        return (float)n > this.h && (float)n < this.h + 132.0f && (float)n2 > this.d && (float)n2 < this.d + 22.0f;
    }

    static ajn_0 a(IZ iZ) {
        return iZ.a;
    }

    private static ItemStack lambda$getLayout$0(Item item) {
        return new ItemStack(item, 1);
    }

    public IZ(UhcCrafts uhcCrafts, UhcCrafts uhcCrafts2, ajn_0 ajn_02) {
        this.e = uhcCrafts;
        this.f = 132.0f;
        this.b = 22.0f;
        this.a = ajn_02;
        this.c = uhcCrafts2;
    }

    public ItemStack a(Item item) {
        return new ItemStack(item, 1);
    }

    public void a(int n, int n2) {
        UhcCrafts.d();
        a7l_0.b(adj_1.a(ob_0.a, 17), a0k.g(this.a), this.h + 23.0f, this.d + 3.0f, this.b(n, n2) ? -1 : aol_1.b(new Color(200, 200, 200)), true);
        a7l_0.b(adj_1.a(ob_0.a, 15), aL0.a(aL0.c(aL0.a(aL0.c(new StringBuilder(), a0k.b(this.a)), aC1.c), a0k.d(this.a)), aC1.k).toString(), this.h + 23.0f, this.d + 12.5f, this.b(n, n2) ? -1 : aol_1.b(new Color(200, 200, 200)), true);
        a1V.a(this.b(), this.h + 3.0f, this.d + 3.0f);
    }

    public ItemStack a(Item item, int n) {
        return new ItemStack(item, 1, n);
    }

    public ItemStack a(int n) {
        return new ItemStack(a0k.e(this.a), 1, n);
    }

    public void a(String string, Item item, int n) {
        block10: {
            Item item2;
            block12: {
                block11: {
                    block9: {
                        UhcCrafts.d();
                        if (string.equals(aC1.h) && item == (item2 = px_0.a(Blocks.am))) {
                            this.g = PlayerInvoker.b(UhcCrafts.f((UhcCrafts)this.e).player, item, 1);
                        }
                        if (!string.equals(aC1.b)) break block9;
                        if (item != Items.dye) break block10;
                        this.g = PlayerInvoker.b(UhcCrafts.a((UhcCrafts)this.e).player, item, 15);
                    }
                    if (!string.equals(aC1.g)) break block11;
                    if (item != Items.dye) break block10;
                    this.g = PlayerInvoker.b(UhcCrafts.n((UhcCrafts)this.e).player, item, 15);
                }
                if (!string.equals(aC1.m)) break block12;
                if (item != Items.dye) break block10;
                this.g = PlayerInvoker.b(UhcCrafts.g((UhcCrafts)this.e).player, item, 3);
            }
            if (string.equals(aC1.n) && item == (item2 = px_0.a(Blocks.sapling))) {
                this.g = PlayerInvoker.b(UhcCrafts.h((UhcCrafts)this.e).player, item, 0);
            }
            if (string.equals(aC1.e) && item == (item2 = px_0.a(Blocks.b_))) {
                this.g = PlayerInvoker.b(UhcCrafts.k((UhcCrafts)this.e).player, item, n == 1 ? 14 : 0);
            }
            if (string.equals(aC1.j)) {
                if (item == Items.skull) {
                    this.g = PlayerInvoker.b(UhcCrafts.m((UhcCrafts)this.e).player, Items.skull, 3);
                }
                if (item == Items.dye) {
                    this.g = PlayerInvoker.b(UhcCrafts.j((UhcCrafts)this.e).player, Items.dye, 0);
                }
            }
        }
    }
}

