/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.bM
 */
public class bm_1
extends am_0 {
    @Override
    public List<String> a(ICommandSender iCommandSender, String[] stringArray, BlockPos blockPos) {
        return stringArray.length == 1 ? bm_1.a(stringArray, E0.B, E0.ad, E0.p, E0.i, E0.x, E0.K) : (stringArray.length == 2 && stringArray[0].equals(E0.ae) ? bm_1.a(stringArray, E0.n, E0.N) : (stringArray.length >= 2 && stringArray.length <= 3 && stringArray[0].equals(E0.H) ? bm_1.a(stringArray, 1, blockPos) : (stringArray.length == 2 && stringArray[0].equals(E0.m) ? bm_1.a(stringArray, E0.af, E0.z) : null)));
    }

    protected agl_1 a() {
        return ServerInvoker.d().r[0].R();
    }

    @Override
    public void a(long l4, ICommandSender iCommandSender, short s, String[] stringArray) throws ht_1 {
        if (stringArray.length < 1) {
            throw new ip_2(E0.t, new Object[0]);
        }
        agl_1 agl_12 = this.a();
        if (stringArray[0].equals(E0.q)) {
            if (stringArray.length != 2 && stringArray.length != 3) {
                throw new ip_2(E0.aj, new Object[0]);
            }
            double d = ak9_0.i(agl_12);
            double d2 = bm_1.a(stringArray[1], 1.0, 6.0E7);
            long l5 = stringArray.length > 2 ? bm_1.a(stringArray[2], 0L, 9223372036854775L) * 1000L : 0L;
            long l6 = l5 - 0L;
            int cfr_ignored_1 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
            ak9_0.b(agl_12, d2);
            bm_1.a(iCommandSender, (ICommand)this, E0.f, StringInvoker.a(E0.U, new Object[]{db_0.a(d2)}), StringInvoker.a(E0.F, new Object[]{db_0.a(d)}));
        } else if (stringArray[0].equals(E0.ac)) {
            if (stringArray.length != 2 && stringArray.length != 3) {
                throw new ip_2(E0.ah, new Object[0]);
            }
            double d = ak9_0.e(agl_12);
            double d3 = d + bm_1.a(stringArray[1], -d, 6.0E7 - d);
            long l7 = ak9_0.n(agl_12) + (stringArray.length > 2 ? bm_1.a(stringArray[2], 0L, 9223372036854775L) * 1000L : 0L);
            if (l7 > 0L) {
                ak9_0.a(agl_12, d, d3, l7);
                if (d > d3) {
                    bm_1.a(iCommandSender, (ICommand)this, E0.h, StringInvoker.a(E0.b, new Object[]{db_0.a(d3)}), StringInvoker.a(E0.am, new Object[]{db_0.a(d)}), lx_2.c(l7 / 1000L));
                } else {
                    bm_1.a(iCommandSender, (ICommand)this, E0.e, StringInvoker.a(E0.g, new Object[]{db_0.a(d3)}), StringInvoker.a(E0.L, new Object[]{db_0.a(d)}), lx_2.c(l7 / 1000L));
                }
            } else {
                ak9_0.b(agl_12, d3);
                bm_1.a(iCommandSender, (ICommand)this, E0.aa, StringInvoker.a(E0.j, new Object[]{db_0.a(d3)}), StringInvoker.a(E0.r, new Object[]{db_0.a(d)}));
            }
        } else if (stringArray[0].equals(E0.G)) {
            if (stringArray.length != 3) {
                throw new ip_2(E0.D, new Object[0]);
            }
            BlockPos blockPos = alj_1.d(iCommandSender);
            double d = bm_1.a((double)amv_2.j(blockPos) + 0.5, stringArray[1], true);
            double d4 = bm_1.a((double)amv_2.i(blockPos) + 0.5, stringArray[2], true);
            ak9_0.b(agl_12, d, d4);
            bm_1.a(iCommandSender, (ICommand)this, E0.P, db_0.a(d), db_0.a(d4));
        } else if (stringArray[0].equals(E0.c)) {
            if (stringArray.length < 2) {
                throw new ip_2(E0.v, new Object[0]);
            }
            if (stringArray[1].equals(E0.I)) {
                if (stringArray.length != 3) {
                    throw new ip_2(E0.T, new Object[0]);
                }
                double d = bm_1.a(stringArray[2], 0.0);
                double d5 = ak9_0.b(agl_12);
                ak9_0.c(agl_12, d);
                bm_1.a(iCommandSender, (ICommand)this, E0.k, StringInvoker.a(E0.V, new Object[]{db_0.a(d)}), StringInvoker.a(E0.ag, new Object[]{db_0.a(d5)}));
            } else if (stringArray[1].equals(E0.M)) {
                if (stringArray.length != 3) {
                    throw new ip_2(E0.S, new Object[0]);
                }
                double d = bm_1.a(stringArray[2], 0.0);
                double d6 = ak9_0.d(agl_12);
                ak9_0.a(agl_12, d);
                bm_1.a(iCommandSender, (ICommand)this, E0.u, StringInvoker.a(E0.W, new Object[]{db_0.a(d)}), StringInvoker.a(E0.ak, new Object[]{db_0.a(d6)}));
            }
        } else if (stringArray[0].equals(E0.Y)) {
            if (stringArray.length < 2) {
                throw new ip_2(E0.y, new Object[0]);
            }
            int n = bm_1.a(stringArray[2], 0);
            if (stringArray[1].equals(E0.w)) {
                if (stringArray.length != 3) {
                    throw new ip_2(E0.E, new Object[0]);
                }
                int n2 = ak9_0.f(agl_12);
                ak9_0.c(agl_12, n);
                bm_1.a(iCommandSender, (ICommand)this, E0.Q, P8.d(n), P8.d(n2));
            } else if (stringArray[1].equals(E0.R)) {
                if (stringArray.length != 3) {
                    throw new ip_2(E0.A, new Object[0]);
                }
                int n3 = ak9_0.k(agl_12);
                ak9_0.a(agl_12, n);
                bm_1.a(iCommandSender, (ICommand)this, E0.X, P8.d(n), P8.d(n3));
            }
        } else {
            if (!stringArray[0].equals(E0.C)) {
                throw new ip_2(E0.J, new Object[0]);
            }
            double d = ak9_0.e(agl_12);
            alj_1.a(iCommandSender, a9N.QUERY_RESULT, MathHelper.floor_double(d + 0.5));
            alj_1.a(iCommandSender, new aoz_1(E0.ab, StringInvoker.a(E0.a, new Object[]{db_0.a(d)})));
        }
    }

    @Override
    public String b(ICommandSender iCommandSender) {
        return E0.l;
    }

    @Override
    public String b() {
        return E0.s;
    }

    @Override
    public int a() {
        return 2;
    }

    private static ht_1 a(ht_1 ht_12) {
        return ht_12;
    }
}

