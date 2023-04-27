/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.Ei;
import net.M0;
import net.P8;
import net.WN;
import net.a5u_0;
import net.asi_2;
import net.auk_2;
import net.axx_1;
import net.il_0;

/*
 * Renamed from net.aqS
 */
public class aqs_1
implements JsonDeserializer<asi_2>,
JsonSerializer<asi_2> {
    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public asi_2 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        asi_2 asi_22 = new asi_2();
        try {
            asi_22.E = Ei.a(jsonObject, a5u_0.a2, asi_22.E);
            asi_22.a = Ei.a(jsonObject, a5u_0.B, asi_22.a);
            asi_22.ac = Ei.a(jsonObject, a5u_0.aX, asi_22.ac);
            asi_22.m = Ei.a(jsonObject, a5u_0.s, asi_22.m);
            asi_22.G = Ei.a(jsonObject, a5u_0.T, asi_22.G);
            asi_22.ai = Ei.a(jsonObject, a5u_0.bb, asi_22.ai);
            asi_22.ao = Ei.a(jsonObject, a5u_0.ap, asi_22.ao);
            asi_22.S = Ei.a(jsonObject, a5u_0.ay, asi_22.S);
            asi_22.al = Ei.a(jsonObject, a5u_0.bK, asi_22.al);
            asi_22.i = Ei.a(jsonObject, a5u_0.q, asi_22.i);
            asi_22.z = Ei.a(jsonObject, a5u_0.bO, asi_22.z);
            asi_22.b = Ei.a(jsonObject, a5u_0.bJ, asi_22.b);
            asi_22.y = Ei.a(jsonObject, a5u_0.a3, asi_22.y);
            asi_22.f = Ei.a(jsonObject, a5u_0.bn, asi_22.f);
            asi_22.W = Ei.a(jsonObject, a5u_0.a9, asi_22.W);
            asi_22.ag = Ei.a(jsonObject, a5u_0.F, asi_22.ag);
            asi_22.O = Ei.a(jsonObject, a5u_0.bw, asi_22.O);
            asi_22.N = Ei.a(jsonObject, a5u_0.aR, asi_22.N);
            asi_22.d = Ei.a(jsonObject, a5u_0.aK, asi_22.d);
            asi_22.I = Ei.a(jsonObject, a5u_0.am, asi_22.I);
            asi_22.ab = Ei.a(jsonObject, a5u_0.bM, asi_22.ab);
            asi_22.j = Ei.a(jsonObject, a5u_0.P, asi_22.j);
            asi_22.ah = Ei.a(jsonObject, a5u_0.al, asi_22.ah);
            asi_22.af = Ei.a(jsonObject, a5u_0.by, asi_22.af);
            asi_22.ak = Ei.a(jsonObject, a5u_0.bu, asi_22.ak);
            asi_22.Z = Ei.a(jsonObject, a5u_0.au, asi_22.Z);
            asi_22.D = Ei.a(jsonObject, a5u_0.a6, asi_22.D);
            asi_22.x = Ei.a(jsonObject, a5u_0.bl, asi_22.x);
            asi_22.C = Ei.a(jsonObject, a5u_0.O, asi_22.C);
            asi_22.J = Ei.a(jsonObject, a5u_0.N, asi_22.J);
            asi_22.X = Ei.a(jsonObject, a5u_0.r, asi_22.X);
            asi_22.ap = Ei.a(jsonObject, a5u_0.aI, asi_22.ap);
            if (asi_22.ap < 38 && asi_22.ap >= -1) {
                if (asi_22.ap >= il_0.q.s) {
                    asi_22.ap += 2;
                }
            } else {
                asi_22.ap = -1;
            }
            asi_22.u = Ei.a(jsonObject, a5u_0.ag, asi_22.u);
            asi_22.az = Ei.a(jsonObject, a5u_0.bG, asi_22.az);
            asi_22.t = Ei.a(jsonObject, a5u_0.aQ, asi_22.t);
            asi_22.as = Ei.a(jsonObject, a5u_0.a5, asi_22.as);
            asi_22.aq = Ei.a(jsonObject, a5u_0.bz, asi_22.aq);
            asi_22.L = Ei.a(jsonObject, a5u_0.br, asi_22.L);
            asi_22.R = Ei.a(jsonObject, a5u_0.ac, asi_22.R);
            asi_22.F = Ei.a(jsonObject, a5u_0.at, asi_22.F);
            asi_22.B = Ei.a(jsonObject, a5u_0.bI, asi_22.B);
            asi_22.am = Ei.a(jsonObject, a5u_0.bq, asi_22.am);
            asi_22.H = Ei.a(jsonObject, a5u_0.bE, asi_22.H);
            asi_22.an = Ei.a(jsonObject, a5u_0.z, asi_22.an);
            asi_22.P = Ei.a(jsonObject, a5u_0.aA, asi_22.P);
            asi_22.p = Ei.a(jsonObject, a5u_0.a1, asi_22.p);
            asi_22.v = Ei.a(jsonObject, a5u_0.bi, asi_22.v);
            asi_22.h = Ei.a(jsonObject, a5u_0.ah, asi_22.h);
            asi_22.av = Ei.a(jsonObject, a5u_0.S, asi_22.av);
            asi_22.K = Ei.a(jsonObject, a5u_0.af, asi_22.K);
            asi_22.aa = Ei.a(jsonObject, a5u_0.n, asi_22.aa);
            asi_22.at = Ei.a(jsonObject, a5u_0.aN, asi_22.at);
            asi_22.s = Ei.a(jsonObject, a5u_0.H, asi_22.s);
            asi_22.k = Ei.a(jsonObject, a5u_0.aB, asi_22.k);
            asi_22.w = Ei.a(jsonObject, a5u_0.a8, asi_22.w);
            asi_22.g = Ei.a(jsonObject, a5u_0.ab, asi_22.g);
            asi_22.q = Ei.a(jsonObject, a5u_0.bx, asi_22.q);
            asi_22.ae = Ei.a(jsonObject, a5u_0.aO, asi_22.ae);
            asi_22.T = Ei.a(jsonObject, a5u_0.L, asi_22.T);
            asi_22.aw = Ei.a(jsonObject, a5u_0.d, asi_22.aw);
            asi_22.aA = Ei.a(jsonObject, a5u_0.as, asi_22.aA);
            asi_22.o = Ei.a(jsonObject, a5u_0.aG, asi_22.o);
            asi_22.M = Ei.a(jsonObject, a5u_0.p, asi_22.M);
            asi_22.Q = Ei.a(jsonObject, a5u_0.aw, asi_22.Q);
            asi_22.au = Ei.a(jsonObject, a5u_0.aC, asi_22.au);
            asi_22.n = Ei.a(jsonObject, a5u_0.a4, asi_22.n);
            asi_22.U = Ei.a(jsonObject, a5u_0.bm, asi_22.U);
            asi_22.r = Ei.a(jsonObject, a5u_0.bo, asi_22.r);
            asi_22.e = Ei.a(jsonObject, a5u_0.j, asi_22.e);
            asi_22.A = Ei.a(jsonObject, a5u_0.be, asi_22.A);
            asi_22.V = Ei.a(jsonObject, a5u_0.aV, asi_22.V);
            asi_22.ar = Ei.a(jsonObject, a5u_0.ba, asi_22.ar);
            asi_22.ax = Ei.a(jsonObject, a5u_0.E, asi_22.ax);
            asi_22.l = Ei.a(jsonObject, a5u_0.aD, asi_22.l);
            asi_22.Y = Ei.a(jsonObject, a5u_0.aZ, asi_22.Y);
            asi_22.c = Ei.a(jsonObject, a5u_0.U, asi_22.c);
            asi_22.ad = Ei.a(jsonObject, a5u_0.i, asi_22.ad);
            asi_22.aj = Ei.a(jsonObject, a5u_0.a0, asi_22.aj);
            return asi_22;
        }
        catch (Exception exception) {}
        return asi_22;
    }

    public JsonElement a(asi_2 asi_22, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        M0.a(jsonObject, a5u_0.ai, axx_1.a(asi_22.E));
        M0.a(jsonObject, a5u_0.bN, axx_1.a(asi_22.a));
        M0.a(jsonObject, a5u_0.aa, axx_1.a(asi_22.ac));
        M0.a(jsonObject, a5u_0.aF, axx_1.a(asi_22.m));
        M0.a(jsonObject, a5u_0.y, axx_1.a(asi_22.G));
        M0.a(jsonObject, a5u_0.az, axx_1.a(asi_22.ai));
        M0.a(jsonObject, a5u_0.bA, axx_1.a(asi_22.ao));
        M0.a(jsonObject, a5u_0.bh, axx_1.a(asi_22.S));
        M0.a(jsonObject, a5u_0.bs, axx_1.a(asi_22.al));
        M0.a(jsonObject, a5u_0.ax, axx_1.a(asi_22.i));
        M0.a(jsonObject, a5u_0.A, axx_1.a(asi_22.z));
        M0.a(jsonObject, a5u_0.C, axx_1.a(asi_22.b));
        M0.a(jsonObject, a5u_0.aE, axx_1.a(asi_22.y));
        M0.a(jsonObject, a5u_0.a_, axx_1.a(asi_22.f));
        M0.a(jsonObject, a5u_0.X, axx_1.a(asi_22.W));
        M0.a(jsonObject, a5u_0.bg, axx_1.a(asi_22.ag));
        M0.a(jsonObject, a5u_0.bc, P8.d(asi_22.O));
        M0.a(jsonObject, a5u_0.bL, auk_2.b(asi_22.N));
        M0.a(jsonObject, a5u_0.aJ, auk_2.b(asi_22.d));
        M0.a(jsonObject, a5u_0.aT, P8.d(asi_22.I));
        M0.a(jsonObject, a5u_0.bj, auk_2.b(asi_22.ab));
        M0.a(jsonObject, a5u_0.k, auk_2.b(asi_22.j));
        M0.a(jsonObject, a5u_0.bf, auk_2.b(asi_22.ah));
        M0.a(jsonObject, a5u_0.t, auk_2.b(asi_22.af));
        M0.a(jsonObject, a5u_0.v, auk_2.b(asi_22.ak));
        M0.a(jsonObject, a5u_0.l, auk_2.b(asi_22.Z));
        M0.a(jsonObject, a5u_0.V, auk_2.b(asi_22.D));
        M0.a(jsonObject, a5u_0.Q, P8.d(asi_22.x));
        M0.a(jsonObject, a5u_0.ao, auk_2.b(asi_22.C));
        M0.a(jsonObject, a5u_0.aY, P8.d(asi_22.J));
        M0.a(jsonObject, a5u_0.bd, auk_2.b(asi_22.X));
        M0.a(jsonObject, a5u_0.ak, P8.d(asi_22.ap));
        M0.a(jsonObject, a5u_0.I, P8.d(asi_22.u));
        M0.a(jsonObject, a5u_0.ar, P8.d(asi_22.az));
        M0.a(jsonObject, a5u_0.aq, P8.d(asi_22.t));
        M0.a(jsonObject, a5u_0.ae, P8.d(asi_22.as));
        M0.a(jsonObject, a5u_0.w, P8.d(asi_22.aq));
        M0.a(jsonObject, a5u_0.aP, P8.d(asi_22.L));
        M0.a(jsonObject, a5u_0.aM, P8.d(asi_22.R));
        M0.a(jsonObject, a5u_0.ad, P8.d(asi_22.F));
        M0.a(jsonObject, a5u_0.J, P8.d(asi_22.B));
        M0.a(jsonObject, a5u_0.R, P8.d(asi_22.am));
        M0.a(jsonObject, a5u_0.Z, P8.d(asi_22.H));
        M0.a(jsonObject, a5u_0.aW, P8.d(asi_22.an));
        M0.a(jsonObject, a5u_0.aL, P8.d(asi_22.P));
        M0.a(jsonObject, a5u_0.a7, P8.d(asi_22.p));
        M0.a(jsonObject, a5u_0.bv, P8.d(asi_22.v));
        M0.a(jsonObject, a5u_0.aS, P8.d(asi_22.h));
        M0.a(jsonObject, a5u_0.bt, P8.d(asi_22.av));
        M0.a(jsonObject, a5u_0.h, P8.d(asi_22.K));
        M0.a(jsonObject, a5u_0.bF, P8.d(asi_22.aa));
        M0.a(jsonObject, a5u_0.f, P8.d(asi_22.at));
        M0.a(jsonObject, a5u_0.o, P8.d(asi_22.s));
        M0.a(jsonObject, a5u_0.u, P8.d(asi_22.k));
        M0.a(jsonObject, a5u_0.aH, P8.d(asi_22.w));
        M0.a(jsonObject, a5u_0.bp, P8.d(asi_22.g));
        M0.a(jsonObject, a5u_0.bC, P8.d(asi_22.q));
        M0.a(jsonObject, a5u_0.e, P8.d(asi_22.ae));
        M0.a(jsonObject, a5u_0.g, P8.d(asi_22.T));
        M0.a(jsonObject, a5u_0.b, P8.d(asi_22.aw));
        M0.a(jsonObject, a5u_0.bk, P8.d(asi_22.aA));
        M0.a(jsonObject, a5u_0.aU, P8.d(asi_22.o));
        M0.a(jsonObject, a5u_0.a, P8.d(asi_22.M));
        M0.a(jsonObject, a5u_0.aj, P8.d(asi_22.Q));
        M0.a(jsonObject, a5u_0.G, P8.d(asi_22.au));
        M0.a(jsonObject, a5u_0.bB, P8.d(asi_22.n));
        M0.a(jsonObject, a5u_0.bH, P8.d(asi_22.U));
        M0.a(jsonObject, a5u_0.m, P8.d(asi_22.r));
        M0.a(jsonObject, a5u_0.M, P8.d(asi_22.e));
        M0.a(jsonObject, a5u_0.an, P8.d(asi_22.A));
        M0.a(jsonObject, a5u_0.K, P8.d(asi_22.V));
        M0.a(jsonObject, a5u_0.av, P8.d(asi_22.ar));
        M0.a(jsonObject, a5u_0.bD, P8.d(asi_22.ax));
        M0.a(jsonObject, a5u_0.D, P8.d(asi_22.l));
        M0.a(jsonObject, a5u_0.x, P8.d(asi_22.Y));
        M0.a(jsonObject, a5u_0.W, P8.d(asi_22.c));
        M0.a(jsonObject, a5u_0.Y, P8.d(asi_22.ad));
        M0.a(jsonObject, a5u_0.c, P8.d(asi_22.aj));
        return jsonObject;
    }
}

