/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.MCInvoker;
import java.io.IOException;
import net.FT;
import net.I18n;
import net.QG;
import net.R8;
import net.RK;
import net.RenderManager;
import net.aig_2;
import net.apl_1;
import net.ne_0;
import net.rb_0;
import net.ri_0;

public class R1
extends RK {
    private float ak;
    private float aj;

    public static void a(int n, int n2, int n3, float f, float f2, EntityLivingBase entityLivingBase) {
        GlStateManagerInvoker.enableColorMaterial();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate(n, n2, 50.0f);
        GlStateManagerInvoker.c(-n3, n3, n3);
        GlStateManagerInvoker.b(180.0f, 0.0f, 0.0f, 1.0f);
        float f3 = entityLivingBase.aD;
        float f4 = entityLivingBase.rotationYaw;
        float f5 = entityLivingBase.rotationPitch;
        float f6 = entityLivingBase.aR;
        float f7 = entityLivingBase.aP;
        GlStateManagerInvoker.b(135.0f, 0.0f, 1.0f, 0.0f);
        ne_0.a();
        GlStateManagerInvoker.b(-135.0f, 0.0f, 1.0f, 0.0f);
        float f8 = (float)MathInvoker.b((double)(f / 40.0f));
        float f9 = -((float)MathInvoker.b((double)(f2 / 40.0f)));
        GlStateManagerInvoker.b(f9 * 20.0f, 1.0f, 0.0f, 0.0f);
        entityLivingBase.aD = f8 * 20.0f;
        entityLivingBase.rotationYaw = f8 * 40.0f;
        entityLivingBase.rotationPitch = f9 * 20.0f;
        entityLivingBase.aP = entityLivingBase.rotationYaw;
        entityLivingBase.aR = entityLivingBase.rotationYaw;
        GlStateManagerInvoker.translate(0.0f, 0.0f, 0.0f);
        RenderManager renderManager = MCInvoker.j(MCInvoker.f());
        FT.a(renderManager, 180.0f);
        FT.b(renderManager, false);
        FT.a(renderManager, entityLivingBase, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        FT.b(renderManager, true);
        entityLivingBase.aD = f3;
        entityLivingBase.rotationYaw = f4;
        entityLivingBase.rotationPitch = f5;
        entityLivingBase.aR = f6;
        entityLivingBase.aP = f7;
        GlStateManagerInvoker.popMatrix();
        ne_0.e();
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.d(apl_1.ab);
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.d(apl_1.S);
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ae);
        int n3 = this.P;
        int n4 = this.A;
        this.c(n3, n4, 0, 0, this.L, this.Y);
        R1.a(n3 + 51, n4 + 75, 30, (float)(n3 + 51) - this.ak, (float)(n4 + 75 - 50) - this.aj, this.t.player);
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        InventoryInvoker.c(this.t.player.inventory, null);
        if (PlayerControllerInvoker.d(this.t.playerController)) {
            MCInvoker.displayGuiScreen(this.t, new rb_0(this.t.player));
        } else {
            super.l();
        }
    }

    @Override
    public void g() {
        if (PlayerControllerInvoker.d(this.t.playerController)) {
            MCInvoker.displayGuiScreen(this.t, new rb_0(this.t.player));
        }
        this.b();
    }

    public R1(EntityPlayer entityPlayer) {
        super(entityPlayer.bp);
    }

    @Override
    protected void b(int n, int n2) {
        FontRendererInvoker.a(this.q, I18n.format(aig_2.a, new Object[0]), 86.0f, 16.0f, 0x404040);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 0) {
            MCInvoker.displayGuiScreen(this.t, new ri_0(this, PlayerInvoker.s(this.t.player)));
        } else if (qG.m == 1) {
            MCInvoker.displayGuiScreen(this.t, new R8(this, PlayerInvoker.s(this.t.player)));
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        super.a(n, n2, f);
        this.ak = n;
        this.aj = n2;
    }
}

