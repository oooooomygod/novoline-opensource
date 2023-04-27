/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.IChatComponent;
import deobf.MCInvoker;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.mh
 */
public class mh_2
implements anl_2,
dp_1 {
    private List<dp_1> a = my_0.c();

    @Override
    public void a(float f, int n) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), sg_0.i);
        wh_1.a(0, 0, 16.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }

    public mh_2() {
        Minecraft minecraft = MCInvoker.f();
        Iterator iterator = ms_0.a(VM.d(BlockInvoker.o(minecraft.world)));
        while (dz_0.c(iterator)) {
            a35 a352 = (a35)dz_0.b(iterator);
            ListInvoker.add(this.a, new CL(a352));
        }
    }

    @Override
    public IChatComponent b() {
        return new ChatComponentText(V1.a);
    }

    @Override
    public boolean a() {
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            dp_1 dp_12 = (dp_1)dz_0.b(iterator);
            if (!dp_12.a()) continue;
            return true;
        }
        return false;
    }

    @Override
    public IChatComponent a() {
        return new ChatComponentText(V1.b);
    }

    @Override
    public List<dp_1> b() {
        return this.a;
    }

    @Override
    public void a(aee_2 aee_22) {
        ans_0.a(aee_22, this);
    }
}

