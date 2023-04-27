/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufInputStream
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.MCInvoker;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;

public class aYU
implements avh_2 {
    private Minecraft h;
    private DynamicTexture c;
    private String e;
    private static Logger f = LogManagerInvoker.c();
    private static ResourceLocation g;
    private ServerData j;
    private static ThreadPoolExecutor i;
    private R5 d;
    private long k;
    private ResourceLocation a;
    private static ResourceLocation b;

    protected aYU(R5 r5, ServerData serverData) {
        this.d = r5;
        this.j = serverData;
        this.h = MCInvoker.f();
        this.a = new ResourceLocation(aL0.a(aL0.a(aL0.a(new StringBuilder(), NC.o), serverData.k), NC.m).toString());
        this.c = (DynamicTexture)TextureManagerInvoker.b(MCInvoker.E(this.h), this.a);
    }

    private boolean b() {
        return true;
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 <= 32) {
            if (n5 < 32 && n5 > 16 && this.b()) {
                aWJ.a(this.d, n);
                aWJ.a(this.d);
                return true;
            }
            if (n5 < 16 && n6 < 16 && aWJ.a(this.d, this, n)) {
                aWJ.b(this.d, this, n, aLW.b());
                return true;
            }
            if (n5 < 16 && n6 > 16 && aWJ.b(this.d, this, n)) {
                aWJ.a(this.d, this, n, aLW.b());
                return true;
            }
        }
        aWJ.a(this.d, n);
        if (MCInvoker.a() - this.k < 250L) {
            aWJ.a(this.d);
        }
        this.k = MCInvoker.a();
        return false;
    }

    private void a() {
        block9: {
            BufferedImage bufferedImage;
            block7: {
                block8: {
                    if (aKZ.d(this.j) != null) break block8;
                    TextureManagerInvoker.a(MCInvoker.E(this.h), this.a);
                    this.c = null;
                    break block9;
                }
                ByteBuf byteBuf = FH.a(aKZ.d(this.j), Charsets.UTF_8);
                ByteBuf byteBuf2 = aQ7.a(byteBuf);
                try {
                    bufferedImage = aiv_2.a((InputStream)new ByteBufInputStream(byteBuf2));
                    ag4_0.b(jj_0.f(bufferedImage) == 64, NC.s, new Object[0]);
                    ag4_0.b(jj_0.d(bufferedImage) == 64, NC.c, new Object[0]);
                    if (this.c != null) break block7;
                    this.c = new DynamicTexture(jj_0.f(bufferedImage), jj_0.d(bufferedImage));
                }
                catch (Throwable throwable) {
                    LoggerInvoker.a(f, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), NC.e), this.j.h), NC.b), this.j.k), NC.d).toString(), throwable);
                    aKZ.a(this.j, null);
                    return;
                }
                finally {
                    awm_0.k(byteBuf);
                    awm_0.k(byteBuf2);
                }
                TextureManagerInvoker.a(MCInvoker.E(this.h), this.a, this.c);
            }
            jj_0.a(bufferedImage, 0, 0, jj_0.f(bufferedImage), jj_0.d(bufferedImage), arp_1.b(this.c), 0, jj_0.f(bufferedImage));
            arp_1.a(this.c);
        }
    }

    private void lambda$drawEntry$0() {
        try {
            try {
                aQV.a(aWJ.b(this.d), this.j);
            }
            catch (UnknownHostException unknownHostException) {
                this.j.c = -1L;
                this.j.e = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_RED), NC.l).toString();
            }
        }
        catch (Exception exception) {
            this.j.c = -1L;
            this.j.e = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_RED), NC.i).toString();
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        i = new ScheduledThreadPoolExecutor(5, agg_0.a(agg_0.a(agg_0.a(new ThreadFactoryBuilder(), NC.k), true)));
        g = new ResourceLocation(NC.r);
        b = new ResourceLocation(NC.a);
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        if (!this.j.d) {
            this.j.d = true;
            this.j.c = -2L;
            this.j.e = NC.n;
            this.j.j = NC.p;
            p8_0.a(i, this::lambda$drawEntry$0);
        }
        boolean bl2 = this.j.l > 47;
        boolean bl3 = this.j.l < 47;
        FontRendererInvoker.a(this.h.fontRendererObj, this.j.h, n2 + 32 + 3, n3 + 1, 0xFFFFFF);
        List list = FontRendererInvoker.b(this.h.fontRendererObj, this.j.e, n4 - 32 - 2);
        for (int i = 0; i < MathInvoker.b(ListInvoker.size(list), 2); ++i) {
            FontRendererInvoker.a(this.h.fontRendererObj, (String)ListInvoker.get(list, i), n2 + 32 + 3, n3 + 12 + FontRendererInvoker.d(this.h.fontRendererObj) * i, 0x808080);
        }
        String string = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.DARK_RED), this.j.a).toString();
        int n8 = FontRendererInvoker.a(this.h.fontRendererObj, string);
        FontRendererInvoker.a(this.h.fontRendererObj, string, n2 + n4 - n8 - 15 - 2, n3 + 1, 0x808080);
        int n9 = 0;
        String string2 = null;
        int n10 = 5;
        String string3 = NC.j;
        string2 = this.j.i;
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.h), Gui.d);
        wh_1.a(n2 + n4 - 15, n3, n9 * 10, 176 + n10 * 8, 10, 8, 256.0f, 256.0f);
        if (aKZ.d(this.j) != null && !aKZ.d(this.j).equals(this.e)) {
            this.e = aKZ.d(this.j);
            this.a();
            a3A.a(aWJ.c(this.d));
        }
        if (this.c != null) {
            this.a(n2, n3, this.a);
        } else {
            this.a(n2, n3, g);
        }
        int n11 = n6 - n2;
        int n12 = n7 - n3;
        if (n11 >= n4 - 15 && n11 <= n4 - 5 && n12 <= 8) {
            aWJ.a(this.d, string3);
        } else if (n11 >= n4 - n8 - 15 - 2 && n11 <= n4 - 15 - 2 && n12 <= 8) {
            aWJ.a(this.d, string2);
        }
        if (!this.h.gameSettings.Y) {
            // empty if block
        }
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.h), b);
        GW.a(this.h.ingameGUI, n2, n3, n2 + 32, n3 + 32, -1601138544);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        int n13 = n6 - n2;
        int n14 = n7 - n3;
        if (this.b()) {
            if (n13 < 32 && n13 > 16) {
                wh_1.a(n2, n3, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
            } else {
                wh_1.a(n2, n3, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
            }
        }
        if (aWJ.a(this.d, this, n)) {
            if (n13 < 16 && n14 < 16) {
                wh_1.a(n2, n3, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
            } else {
                wh_1.a(n2, n3, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
            }
        }
        if (aWJ.b(this.d, this, n)) {
            if (n13 < 16 && n14 > 16) {
                wh_1.a(n2, n3, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
            } else {
                wh_1.a(n2, n3, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
            }
        }
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    protected void a(int n, int n2, ResourceLocation resourceLocation) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.h), resourceLocation);
        GlStateManagerInvoker.enableBlend();
        wh_1.a(n, n2, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        GlStateManagerInvoker.disableBlend();
    }

    public ServerData c() {
        return this.j;
    }
}

