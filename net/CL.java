/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.IChatComponent;
import deobf.MCInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.ChatComponentText;
import net.GW;
import net.MathHelper;
import net.NetworkPlayerInfo;
import net.ResourceLocation;
import net.a35;
import net.a4Z;
import net.a5_0;
import net.aDM;
import net.aNL;
import net.aUi;
import net.aee_2;
import net.af__0;
import net.ans_0;
import net.dp_1;
import net.dz_0;
import net.mq_0;
import net.ms_0;
import net.my_0;
import net.sd_1;
import net.wh_1;

class CL
implements dp_1 {
    private List<NetworkPlayerInfo> a;
    private a35 b;
    private ResourceLocation c;

    @Override
    public void a(aee_2 aee_22) {
        ans_0.a(aee_22, new mq_0(this.a));
    }

    @Override
    public boolean a() {
        return !ListInvoker.isEmpty(this.a);
    }

    @Override
    public void a(float f, int n) {
        int n2 = -1;
        String string = FontRendererInvoker.a(sd_1.g(this.b));
        if (StringInvoker.c(string) >= 2) {
            n2 = FontRendererInvoker.b(MCInvoker.f().fontRendererObj, StringInvoker.b(string, 1));
        }
        float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n2 & 0xFF) / 255.0f;
        GW.a(MCInvoker.f().ingameGUI, 1, 1, 15, 15, MathHelper.c(f2 * f, f3 * f, f4 * f) | n << 24);
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), this.c);
        GlStateManagerInvoker.color(f, f, f, (float)n / 255.0f);
        wh_1.a(2, 2, 8.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
        wh_1.a(2, 2, 40.0f, 8.0f, 8, 8, 12, 12, 64.0f, 64.0f);
    }

    public CL(a35 a352) {
        this.b = a352;
        this.a = my_0.c();
        Object object = ms_0.a(sd_1.d(a352));
        while (dz_0.c((Iterator)object)) {
            String string = (String)dz_0.b((Iterator)object);
            NetworkPlayerInfo networkPlayerInfo = aDM.a(MCInvoker.aa(MCInvoker.f()), string);
            ListInvoker.add(this.a, networkPlayerInfo);
        }
        if (!ListInvoker.isEmpty(this.a)) {
            object = a4Z.d(aNL.a((NetworkPlayerInfo)ListInvoker.get(this.a, a5_0.a(new Random(), ListInvoker.size(this.a)))));
            this.c = aUi.a((String)object);
            aUi.a(this.c, (String)object);
        } else {
            this.c = af__0.a();
        }
    }

    @Override
    public IChatComponent b() {
        return new ChatComponentText(sd_1.c(this.b));
    }
}

