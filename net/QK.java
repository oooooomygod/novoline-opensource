/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import deobf.EntityPlayer;
import net.minecraft.world.GameType;
import deobf.IChatComponent;
import deobf.MCInvoker;
import deobf.NetHandlerPlayClient;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;

public class QK
extends Gui {
    private IChatComponent j;
    private GuiIngame i;
    private Minecraft k;
    private long g;
    private boolean l;
    private IChatComponent f;
    private static Ordering<NetworkPlayerInfo> h = aEP.a(new aI1(null));

    public void a(int n, za_2 za_22, acl_0 acl_02) {
        int n2;
        String string;
        Iterator iterator;
        int n3;
        int n4;
        NetHandlerPlayClient netHandlerPlayClient = this.k.player.connection;
        List list = aEP.a(h, aDM.b(netHandlerPlayClient));
        int n5 = 0;
        int n6 = 0;
        Iterator iterator2 = ListInvoker.iterator(list);
        while (dz_0.c(iterator2)) {
            NetworkPlayerInfo networkPlayerInfo = (NetworkPlayerInfo)dz_0.b(iterator2);
            n4 = FontRendererInvoker.a(this.k.fontRendererObj, this.a(networkPlayerInfo));
            n5 = MathInvoker.max(n5, n4);
            if (afi_1.c(acl_02) == PL.HEARTS) continue;
            n4 = FontRendererInvoker.a(this.k.fontRendererObj, aL0.c(aL0.a(new StringBuilder(), aR5.g), hs_0.d(VM.c(za_22, a4Z.d(aNL.a(networkPlayerInfo)), acl_02))).toString());
            n6 = MathInvoker.max(n6, n4);
        }
        list = ListInvoker.subList(list, 0, MathInvoker.b(ListInvoker.size(list), 80));
        int n7 = n3 = ListInvoker.size(list);
        n4 = 1;
        while (n7 > 20) {
            n7 = (n3 + ++n4 - 1) / n4;
        }
        boolean bl = MCInvoker.B(this.k) || NetworkManagerInvoker.f(aDM.a(MCInvoker.aa(this.k)));
        int n8 = afi_1.c(acl_02) == PL.HEARTS ? 90 : n6;
        int n9 = MathInvoker.b(n4 * (9 + n5 + n8 + 13), n - 50) / n4;
        int n10 = n / 2 - (n9 * n4 + (n4 - 1) * 5) / 2;
        int n11 = 10;
        int n12 = n9 * n4 + (n4 - 1) * 5;
        List list2 = null;
        List list3 = null;
        if (this.j != null) {
            list2 = FontRendererInvoker.b(this.k.fontRendererObj, aBO.a(this.j), n - 50);
            iterator = ListInvoker.iterator(list2);
            while (dz_0.c(iterator)) {
                string = (String)dz_0.b(iterator);
                n12 = MathInvoker.max(n12, FontRendererInvoker.a(this.k.fontRendererObj, string));
            }
        }
        if (this.f != null) {
            list3 = FontRendererInvoker.b(this.k.fontRendererObj, aBO.a(this.f), n - 50);
            iterator = ListInvoker.iterator(list3);
            while (dz_0.c(iterator)) {
                string = (String)dz_0.b(iterator);
                n12 = MathInvoker.max(n12, FontRendererInvoker.a(this.k.fontRendererObj, string));
            }
        }
        this.a(n / 2 - n12 / 2 - 1, n11 - 1, n / 2 + n12 / 2 + 1, n11 + ListInvoker.size(list2) * this.k.fontRendererObj.r, Integer.MIN_VALUE);
        iterator = ListInvoker.iterator(list2);
        while (dz_0.c(iterator)) {
            string = (String)dz_0.b(iterator);
            n2 = FontRendererInvoker.a(this.k.fontRendererObj, string);
            FontRendererInvoker.drawStringWithShadow(this.k.fontRendererObj, string, n / 2 - n2 / 2, n11, -1);
            n11 += this.k.fontRendererObj.r;
        }
        this.a(n / 2 - n12 / 2 - 1, ++n11 - 1, n / 2 + n12 / 2 + 1, n11 + n7 * 9, Integer.MIN_VALUE);
        for (int i = 0; i < n3; ++i) {
            int n13;
            int n14 = i / n7;
            n2 = i % n7;
            int n15 = n10 + n14 * n9 + n14 * 5;
            int n16 = n11 + n2 * 9;
            this.a(n15, n16, n15 + n9, n16 + 8, 0x20FFFFFF);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            if (i >= ListInvoker.size(list)) continue;
            NetworkPlayerInfo networkPlayerInfo = (NetworkPlayerInfo)ListInvoker.get(list, i);
            String string2 = this.a(networkPlayerInfo);
            GameProfile gameProfile = aNL.a(networkPlayerInfo);
            EntityPlayer entityPlayer = BlockInvoker.a(this.k.world, a4Z.a(gameProfile));
            int n17 = a6w_0.a(entityPlayer, aea_1.CAPE) && (a4Z.d(gameProfile).equals(aR5.e) || a4Z.d(gameProfile).equals(aR5.d)) ? 1 : 0;
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.k), aNL.k(networkPlayerInfo));
            int n18 = 16;
            int n19 = -8;
            Gui.a(n15, n16, 8.0f, (float)n18, 8, n19, 8, 8, 64.0f, 64.0f);
            if (a6w_0.a(entityPlayer, aea_1.HAT)) {
                int n20 = 16;
                int n21 = -8;
                Gui.a(n15, n16, 40.0f, (float)n20, 8, n21, 8, 8, 64.0f, 64.0f);
            }
            n15 += 9;
            if (aNL.c(networkPlayerInfo) == GameType.SPECTATOR) {
                string2 = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.ITALIC), string2).toString();
                FontRendererInvoker.drawStringWithShadow(this.k.fontRendererObj, string2, n15, n16, -1862270977);
            } else {
                FontRendererInvoker.drawStringWithShadow(this.k.fontRendererObj, string2, n15, n16, -1);
            }
            if (aNL.c(networkPlayerInfo) != GameType.SPECTATOR && (n17 = (n13 = n15 + n5 + 1) + n8) - n13 > 5) {
                this.a(acl_02, n16, a4Z.d(gameProfile), n13, n17, networkPlayerInfo);
            }
            this.a(n9, n15 - 9, n16, networkPlayerInfo);
        }
        n11 = n11 + n7 * 9 + 1;
        this.a(n / 2 - n12 / 2 - 1, n11 - 1, n / 2 + n12 / 2 + 1, n11 + ListInvoker.size(list3) * this.k.fontRendererObj.r, Integer.MIN_VALUE);
        Iterator iterator3 = ListInvoker.iterator(list3);
        while (dz_0.c(iterator3)) {
            String string3 = (String)dz_0.b(iterator3);
            n2 = FontRendererInvoker.a(this.k.fontRendererObj, string3);
            FontRendererInvoker.drawStringWithShadow(this.k.fontRendererObj, string3, n / 2 - n2 / 2, n11, -1);
            n11 += this.k.fontRendererObj.r;
        }
    }

    private EntityPlayer lambda$getListPlayers$0(NetworkPlayerInfo networkPlayerInfo) {
        return BlockInvoker.a(this.k.world, a4Z.a(aNL.a(networkPlayerInfo)));
    }

    public String a(NetworkPlayerInfo networkPlayerInfo) {
        StringBuilder stringBuilder = new StringBuilder(aNL.j(networkPlayerInfo) != null ? aBO.a(aNL.j(networkPlayerInfo)) : sd_1.a((Team)aNL.h(networkPlayerInfo), a4Z.d(aNL.a(networkPlayerInfo))));
        if (NovolineInvoker.h(NovolineInvoker.getInstance())) {
            // empty if block
        }
        return stringBuilder.toString();
    }

    public List<NetworkPlayerInfo> b() {
        return aEP.a(h, aDM.b(MCInvoker.aa(this.k)));
    }

    public void a(boolean bl) {
        if (!this.l) {
            this.g = MCInvoker.a();
        }
        this.l = bl;
    }

    public void b(IChatComponent iChatComponent) {
        this.j = iChatComponent;
    }

    public List<EntityPlayer> a() {
        return (List)aMF.a(aMF.a(ListInvoker.stream(aEP.a(h, aDM.b(MCInvoker.aa(this.k)))), this::lambda$getListPlayers$0), aB0.a());
    }

    protected void a(int n, int n2, int n3, NetworkPlayerInfo networkPlayerInfo) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.k), d);
        int n4 = 0;
        int n5 = 0;
        n5 = aNL.b(networkPlayerInfo) < 0 ? 5 : (aNL.b(networkPlayerInfo) < 150 ? 0 : (aNL.b(networkPlayerInfo) < 300 ? 1 : (aNL.b(networkPlayerInfo) < 600 ? 2 : (aNL.b(networkPlayerInfo) < 1000 ? 3 : 4))));
        zLevel += 100.0f;
        this.c(n2 + n - 11, n3, n4 * 10, 176 + n5 * 8, 10, 8);
        zLevel -= 100.0f;
    }

    public void a(IChatComponent iChatComponent) {
        this.f = iChatComponent;
    }

    public QK(Minecraft minecraft, GuiIngame guiIngame) {
        this.k = minecraft;
        this.i = guiIngame;
    }

    public void c() {
        this.j = null;
        this.f = null;
    }

    private void a(acl_0 acl_02, int n, String string, int n2, int n3, NetworkPlayerInfo networkPlayerInfo) {
        int n4 = hs_0.d(VM.c(afi_1.e(acl_02), string, acl_02));
        if (afi_1.c(acl_02) == PL.HEARTS) {
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.k), d);
            if (this.g == aNL.l(networkPlayerInfo)) {
                if (n4 < aNL.f(networkPlayerInfo)) {
                    aNL.b(networkPlayerInfo, MCInvoker.a());
                    aNL.c(networkPlayerInfo, GW.a(this.i) + 20);
                } else if (n4 > aNL.f(networkPlayerInfo)) {
                    aNL.b(networkPlayerInfo, MCInvoker.a());
                    aNL.c(networkPlayerInfo, GW.a(this.i) + 10);
                }
            }
            if (MCInvoker.a() - aNL.e(networkPlayerInfo) > 1000L || this.g != aNL.l(networkPlayerInfo)) {
                aNL.a(networkPlayerInfo, n4);
                aNL.b(networkPlayerInfo, n4);
                aNL.b(networkPlayerInfo, MCInvoker.a());
            }
            aNL.a(networkPlayerInfo, this.g);
            aNL.a(networkPlayerInfo, n4);
            int n5 = MathHelper.c((float)MathInvoker.max(n4, aNL.g(networkPlayerInfo)) / 2.0f);
            int n6 = MathInvoker.max(MathHelper.c((float)(n4 / 2)), MathInvoker.max(MathHelper.c((float)(aNL.g(networkPlayerInfo) / 2)), 10));
            boolean bl = aNL.d(networkPlayerInfo) > (long)GW.a(this.i) && (aNL.d(networkPlayerInfo) - (long)GW.a(this.i)) / 3L % 2L == 1L;
            float f = MathInvoker.a((float)(n3 - n2 - 4) / (float)n6, 9.0f);
            if (f > 3.0f) {
                int n7;
                for (n7 = n5; n7 < n6; ++n7) {
                    this.a((float)n2 + (float)n7 * f, (float)n, 25, 0, 9, 9);
                }
                for (n7 = 0; n7 < n5; ++n7) {
                    this.a((float)n2 + (float)n7 * f, (float)n, 25, 0, 9, 9);
                    if (n7 * 2 + 1 < aNL.g(networkPlayerInfo)) {
                        this.a((float)n2 + (float)n7 * f, (float)n, 70, 0, 9, 9);
                    }
                    if (n7 * 2 + 1 == aNL.g(networkPlayerInfo)) {
                        this.a((float)n2 + (float)n7 * f, (float)n, 79, 0, 9, 9);
                    }
                    if (n7 * 2 + 1 < n4) {
                        this.a((float)n2 + (float)n7 * f, (float)n, 52, 0, 9, 9);
                    }
                    if (n7 * 2 + 1 != n4) continue;
                    this.a((float)n2 + (float)n7 * f, (float)n, 61, 0, 9, 9);
                }
            } else {
                float f2 = MathHelper.b((float)n4 / 20.0f, 0.0f, 1.0f);
                int n8 = (int)((1.0f - f2) * 255.0f) << 16 | (int)(f2 * 255.0f) << 8;
                String string2 = aL0.a(aL0.a(new StringBuilder(), aR5.a), (float)n4 / 2.0f).toString();
                if (n3 - FontRendererInvoker.a(this.k.fontRendererObj, aL0.a(aL0.a(new StringBuilder(), string2), aR5.b).toString()) >= n2) {
                    string2 = aL0.a(aL0.a(new StringBuilder(), string2), aR5.f).toString();
                }
                FontRendererInvoker.drawStringWithShadow(this.k.fontRendererObj, string2, (n3 + n2) / 2 - FontRendererInvoker.a(this.k.fontRendererObj, string2) / 2, n, n8);
            }
        } else {
            String string3 = aL0.c(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.YELLOW), aR5.c), n4).toString();
            FontRendererInvoker.drawStringWithShadow(this.k.fontRendererObj, string3, n3 - FontRendererInvoker.a(this.k.fontRendererObj, string3), n, 0xFFFFFF);
        }
    }
}

