/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import com.google.common.collect.Ordering;
import net.minecraft.world.GameType;
import deobf.IChatComponent;
import deobf.MCInvoker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.Mq
 */
public class mq_0
implements anl_2,
dp_1 {
    private List<dp_1> b = my_0.c();
    private static Ordering<NetworkPlayerInfo> a = aEP.a(mq_0::lambda$static$0);

    @Override
    public IChatComponent b() {
        return new ChatComponentText(M6.a);
    }

    @Override
    public void a(float f, int n) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), sg_0.i);
        wh_1.a(0, 0, 0.0f, 0.0f, 16, 16, 256.0f, 256.0f);
    }

    @Override
    public void a(aee_2 aee_22) {
        ans_0.a(aee_22, this);
    }

    private static int lambda$static$0(NetworkPlayerInfo networkPlayerInfo, NetworkPlayerInfo networkPlayerInfo2) {
        return v9_0.a(v9_0.a(v9_0.a(), a4Z.a(aNL.a(networkPlayerInfo)), a4Z.a(aNL.a(networkPlayerInfo2))));
    }

    public mq_0() {
        this(aEP.a(a, aDM.b(MCInvoker.aa(MCInvoker.f()))));
    }

    @Override
    public IChatComponent a() {
        return new ChatComponentText(M6.b);
    }

    @Override
    public List<dp_1> b() {
        return this.b;
    }

    public mq_0(Collection<NetworkPlayerInfo> collection) {
        Iterator iterator = ListInvoker.iterator(aEP.a(a, collection));
        while (dz_0.c(iterator)) {
            NetworkPlayerInfo networkPlayerInfo = (NetworkPlayerInfo)dz_0.b(iterator);
            if (aNL.c(networkPlayerInfo) == GameType.SPECTATOR) continue;
            ListInvoker.add(this.b, new f6_0(aNL.a(networkPlayerInfo)));
        }
    }

    @Override
    public boolean a() {
        return !ListInvoker.isEmpty(this.b);
    }
}

