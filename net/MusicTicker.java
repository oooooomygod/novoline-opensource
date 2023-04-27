/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import deobf.ITickable;
import deobf.MCInvoker;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class MusicTicker
implements ITickable {
    private Minecraft b;
    private Random c = new Random();
    private aCD d;
    private int a = 100;

    public void a(if_0 if_02) {
        this.d = aih_1.a(any_1.c(if_02));
        SoundHandlerInvoker.c(MCInvoker.l(this.b), this.d);
        this.a = Integer.MAX_VALUE;
    }

    @Override
    public void b() {
        if_0 if_02 = MCInvoker.Q(this.b);
        if (this.d != null) {
            if (!any_1.c(if_02).equals(ati_0.c(this.d))) {
                SoundHandlerInvoker.a(MCInvoker.l(this.b), this.d);
                this.a = MathHelper.a(this.c, 0, any_1.a(if_02) / 2);
            }
            if (!SoundHandlerInvoker.b(MCInvoker.l(this.b), this.d)) {
                this.d = null;
                this.a = MathInvoker.b(MathHelper.a(this.c, any_1.a(if_02), any_1.b(if_02)), this.a);
            }
        }
        if (this.d == null && this.a-- <= 0) {
            this.a(if_02);
        }
    }

    public MusicTicker(Minecraft minecraft) {
        this.b = minecraft;
    }

    public void a() {
        if (this.d != null) {
            SoundHandlerInvoker.a(MCInvoker.l(this.b), this.d);
            this.d = null;
            this.a = 0;
        }
    }
}

