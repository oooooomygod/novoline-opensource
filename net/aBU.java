/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.HL;
import net.IE;
import net.ResourceLocation;
import net.W9;
import net.a4M;
import net.a4W;
import net.aB9;
import net.aL0;
import net.aL1;
import net.aLZ;
import net.aSZ;
import net.afm_2;
import net.ahb_2;
import net.apa_1;
import net.asg_0;
import net.dz_0;
import net.go_0;
import net.ma_0;
import net.ms_0;
import net.ox_0;
import net.st_0;
import net.vf_0;
import net.vl_1;
import org.apache.logging.log4j.Logger;

public class aBU {
    private boolean b;
    protected ResourceLocation j;
    protected aBU f;
    private List<IE> d;
    protected Map<String, String> e;
    static Gson g;
    public String i = W9.d;
    private static Logger a;
    private boolean c;
    private HL h;

    public List<IE> d() {
        return this.f() ? this.f.d() : this.d;
    }

    private boolean d(String string) {
        return StringInvoker.b(string, 0) == '#';
    }

    public HL c() {
        aSZ aSZ2 = this.a(go_0.THIRD_PERSON);
        aSZ aSZ3 = this.a(go_0.FIRST_PERSON);
        aSZ aSZ4 = this.a(go_0.HEAD);
        aSZ aSZ5 = this.a(go_0.GUI);
        aSZ aSZ6 = this.a(go_0.GROUND);
        aSZ aSZ7 = this.a(go_0.FIXED);
        return new HL(aSZ2, aSZ3, aSZ4, aSZ5, aSZ6, aSZ7);
    }

    private boolean f() {
        return this.f != null;
    }

    public boolean h() {
        return this.c;
    }

    protected aBU(List<IE> list, Map<String, String> map, boolean bl, boolean bl2, HL hL) {
        this(null, list, map, bl, bl2, hL);
    }

    public ResourceLocation e() {
        return this.j;
    }

    public boolean b(String string) {
        return !W9.c.equals(this.c(string));
    }

    public void b(Map<ResourceLocation, aBU> map) {
        if (this.j != null) {
            this.f = (aBU)MapInvoker.c(map, this.j);
        }
    }

    public static aBU a(String string) {
        return aBU.a(new StringReader(string));
    }

    private aBU(ResourceLocation resourceLocation, List<IE> list, Map<String, String> map, boolean bl, boolean bl2, HL hL) {
        this.d = list;
        this.b = bl;
        this.c = bl2;
        this.e = map;
        this.j = resourceLocation;
        this.h = hL;
    }

    public boolean a() {
        return this.f() ? this.f.a() : this.b;
    }

    public boolean b() {
        return this.j == null || this.f != null && this.f.b();
    }

    protected aBU(ResourceLocation resourceLocation, Map<String, String> map, boolean bl, boolean bl2, HL hL) {
        this(resourceLocation, asg_0.e(), map, bl, bl2, hL);
    }

    public static void a(Map<ResourceLocation, aBU> map) {
        Iterator iterator = ms_0.a(map.values());
        while (dz_0.c(iterator)) {
            aBU aBU2 = (aBU)dz_0.b(iterator);
            try {
                aBU aBU3 = aBU2.f;
                aBU aBU4 = aBU3.f;
                while (aBU3 != aBU4) {
                    aBU3 = aBU3.f;
                    aBU4 = aBU4.f.f;
                }
                throw new aLZ();
            }
            catch (NullPointerException nullPointerException) {
            }
        }
    }

    private aSZ a(go_0 go_02) {
        return this.f != null && !afm_2.b(this.h, go_02) ? this.f.a(go_02) : afm_2.a(this.h, go_02);
    }

    public aBU g() {
        return this.f() ? this.f.g() : this;
    }

    static {
        a = LogManagerInvoker.c();
        g = aB9.b(aB9.a(aB9.a(aB9.a(aB9.a(aB9.a(aB9.a(new GsonBuilder(), aBU.class, (Object)new ox_0()), IE.class, (Object)new vl_1()), aL1.class, (Object)new vf_0()), a4M.class, (Object)new ahb_2()), aSZ.class, (Object)new st_0()), HL.class, (Object)new apa_1()));
    }

    public String c(String string) {
        if (!this.d(string)) {
            string = aL0.a(aL0.a(new StringBuilder(), '#'), string).toString();
        }
        return this.a(string, new ma_0(this, null));
    }

    private static aLZ a(aLZ aLZ2) {
        return aLZ2;
    }

    public static aBU a(Reader reader) {
        return (aBU)a4W.a(g, reader, aBU.class);
    }

    private String a(String string, ma_0 ma_02) {
        if (this.d(string)) {
            if (this == ma_02.a) {
                LoggerInvoker.warn(a, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), W9.a), string), W9.f), this.i).toString());
                return W9.e;
            }
            String string2 = (String)MapInvoker.c(this.e, StringInvoker.a(string, 1));
            if (this.f()) {
                string2 = this.f.a(string, ma_02);
            }
            ma_02.a = this;
            if (this.d(string2)) {
                string2 = ma_02.b.a(string2, ma_02);
            }
            return !this.d(string2) ? string2 : W9.b;
        }
        return string;
    }
}

