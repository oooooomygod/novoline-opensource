/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.bN
 */
public class bn_1
extends am_0 {
    protected void b(ICommandSender iCommandSender, int n) {
        for (int i = 0; i < ServerInvoker.d().r.length; ++i) {
            a3V.a(ServerInvoker.d().r[i], (long)n);
        }
    }

    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bn_1.a(stringArray, aPO.o, aPO.g, aPO.w) : (stringArray.length == 2 && stringArray[0].equals(aPO.j) ? bn_1.a(stringArray, aPO.h, aPO.s) : (stringArray.length == 2 && stringArray[0].equals(aPO.m) ? bn_1.a(stringArray, aPO.r, aPO.u) : null));
    }

    @Override
    public int a() {
        return 2;
    }

    protected void a(ICommandSender iCommandSender, int n) {
        for (int i = 0; i < ServerInvoker.d().r.length; ++i) {
            WorldServer worldServer = ServerInvoker.d().r[i];
            a3V.a(worldServer, a3V.y(worldServer) + (long)n);
        }
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length > 1) {
            if (stringArray[0].equals(aPO.b)) {
                int n = stringArray[1].equals(aPO.k) ? 1000 : (stringArray[1].equals(aPO.a) ? 13000 : bn_1.a(stringArray[1], 0));
                this.b(iCommandSender, n);
                bn_1.a(iCommandSender, (ICommand)this, aPO.l, P8.d(n));
                return;
            }
            if (stringArray[0].equals(aPO.c)) {
                int n = bn_1.a(stringArray[1], 0);
                this.a(iCommandSender, n);
                bn_1.a(iCommandSender, (ICommand)this, aPO.n, P8.d(n));
                return;
            }
            if (stringArray[0].equals(aPO.f)) {
                if (stringArray[1].equals(aPO.d)) {
                    int n = (int)(aV8.g(alj_1.a(iCommandSender)) % Integer.MAX_VALUE);
                    alj_1.a(iCommandSender, a9N.QUERY_RESULT, n);
                    bn_1.a(iCommandSender, (ICommand)this, aPO.v, P8.d(n));
                    return;
                }
                if (stringArray[1].equals(aPO.i)) {
                    int n = (int)(aV8.d(alj_1.a(iCommandSender)) % Integer.MAX_VALUE);
                    alj_1.a(iCommandSender, a9N.QUERY_RESULT, n);
                    bn_1.a(iCommandSender, (ICommand)this, aPO.p, P8.d(n));
                    return;
                }
            }
        }
        throw new ip_2(aPO.t, new Object[0]);
    }

    @Override
    public String b() {
        return aPO.q;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return aPO.e;
    }
}

