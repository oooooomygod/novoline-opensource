/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.crash.CrashReportCategory;
import deobf.NBTBase;
import deobf.NBTTagList;
import net.minecraft.util.ReportedException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NBTTagCompound
extends NBTBase {
    private Map<String, NBTBase> b = MapsInvoker.a();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte b(String string) {
        block3: {
            try {
                if (this.a(string, 99)) break block3;
                return 0;
            }
            catch (ClassCastException classCastException) {
                return 0;
            }
        }
        byte by = alo_1.e((aDU)MapInvoker.c(this.b, string));
        return by;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long o(String string) {
        block3: {
            try {
                if (this.a(string, 99)) break block3;
                return 0L;
            }
            catch (ClassCastException classCastException) {
                return 0L;
            }
        }
        long l4 = alo_1.f((aDU)MapInvoker.c(this.b, string));
        return l4;
    }

    private static byte b(DataInput dataInput, gy_0 gy_02) throws IOException {
        return atG.g(dataInput);
    }

    public Long a(String string, Long l4) {
        NBTBase nBTBase = (NBTBase)MapInvoker.c(this.b, string);
        if (nBTBase.a() != 4) {
            return l4;
        }
        return lx_2.b(O3.a((aDR)nBTBase));
    }

    public void a(String string, int[] nArray) {
        MapInvoker.c(this.b, string, new aDO(nArray));
    }

    public void a(String string, short s) {
        MapInvoker.c(this.b, string, new aDA(s));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public short f(String string) {
        block3: {
            try {
                if (this.a(string, 99)) break block3;
                return 0;
            }
            catch (ClassCastException classCastException) {
                return 0;
            }
        }
        short s = alo_1.b((aDU)MapInvoker.c(this.b, string));
        return s;
    }

    void a(DataOutput dataOutput) throws IOException {
        Iterator iterator = aS0.f(MapInvoker.c(this.b));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            NBTBase nBTBase = (NBTBase)MapInvoker.c(this.b, string);
            NBTTagCompound.a(string, nBTBase, dataOutput);
        }
        K4.a(dataOutput, 0);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(a1W.h);
        Iterator iterator = aS0.f(MapInvoker.b(this.b));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (aL0.a(stringBuilder) != 1) {
                aL0.a(stringBuilder, ',');
            }
            aL0.a(aL0.a(aL0.a(stringBuilder, (String)FG.b(entry)), ':'), FG.a(entry));
        }
        return aL0.a(stringBuilder, '}').toString();
    }

    public void a(String string, NBTBase nBTBase) {
        MapInvoker.c(this.b, string, nBTBase);
    }

    public void g(String string) {
        MapInvoker.a(this.b, string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int[] c(String string) {
        int[] nArray;
        block3: {
            try {
                if (this.a(string, 11)) break block3;
                nArray = new int[]{};
                return nArray;
            }
            catch (ClassCastException classCastException) {
                throw new ReportedException(this.a(string, 11, classCastException));
            }
        }
        nArray = ayv_2.a((aDO)MapInvoker.c(this.b, string));
        return nArray;
    }

    public void a(String string, double d) {
        MapInvoker.c(this.b, string, new aD5(d));
    }

    public NBTBase l(String string) {
        return (NBTBase)MapInvoker.c(this.b, string);
    }

    public void a(String string, boolean bl) {
        this.a(string, (byte)1);
    }

    public byte a(String string) {
        NBTBase nBTBase = (NBTBase)MapInvoker.c(this.b, string);
        return nBTBase.a();
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.b.hashCode();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void a(String string, NBTBase nBTBase, DataOutput dataOutput) throws IOException {
        K4.a(dataOutput, nBTBase.a());
        if (nBTBase.a() != 0) {
            K4.a(dataOutput, string);
            nBTBase.a(dataOutput);
        }
    }

    private CrashReport a(String string, int n, ClassCastException classCastException) {
        CrashReport crashReport = CrashInvoker.makeCrashReport(classCastException, a1W.k);
        CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, a1W.a, 1);
        CrashReportCategoryInvoker.a(crashReportCategory, a1W.j, new V5(this, string));
        CrashReportCategoryInvoker.a(crashReportCategory, a1W.g, new ade_0(this, n));
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, a1W.i, string);
        return crashReport;
    }

    public NBTTagList b(String string, int n) {
        NBTTagList nBTTagList;
        block6: {
            NBTTagList nBTTagList2;
            block5: {
                block4: {
                    try {
                        if (this.a(string) == 9) break block4;
                        return new NBTTagList();
                    }
                    catch (ClassCastException classCastException) {
                        throw new ReportedException(this.a(string, 9, classCastException));
                    }
                }
                nBTTagList2 = (NBTTagList)MapInvoker.c(this.b, string);
                if (kv_0.c(nBTTagList2) <= 0 || kv_0.d(nBTTagList2) == n) break block5;
                nBTTagList = new NBTTagList();
                break block6;
            }
            nBTTagList = nBTTagList2;
        }
        return nBTTagList;
    }

    public Integer a(String string, Integer n) {
        NBTBase nBTBase = (NBTBase)MapInvoker.c(this.b, string);
        if (nBTBase.a() != 3) {
            return n;
        }
        return P8.d(aRU.a((ada_0)nBTBase));
    }

    public void a(NBTTagCompound nBTTagCompound) {
        Iterator iterator = aS0.f(MapInvoker.c(nBTTagCompound.b));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            NBTBase nBTBase = (NBTBase)MapInvoker.c(nBTTagCompound.b, string);
            if (nBTBase.a() == 10) {
                if (this.a(string, 10)) {
                    NBTTagCompound nBTTagCompound2 = this.e(string);
                    nBTTagCompound2.a((NBTTagCompound)nBTBase);
                    continue;
                }
                this.a(string, nBTBase.d());
                continue;
            }
            this.a(string, nBTBase.d());
        }
    }

    public Set<String> a() {
        return MapInvoker.c(this.b);
    }

    public void b(String string, String string2) {
        MapInvoker.c(this.b, string, new NBTTagString(string2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte[] d(String string) {
        byte[] byArray;
        block3: {
            try {
                if (this.a(string, 7)) break block3;
                byArray = new byte[]{};
                return byArray;
            }
            catch (ClassCastException classCastException) {
                throw new ReportedException(this.a(string, 7, classCastException));
            }
        }
        byArray = tl_1.a((adh_0)MapInvoker.c(this.b, string));
        return byArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String k(String string) {
        String string2;
        block3: {
            try {
                if (this.a(string, 8)) break block3;
                string2 = a1W.f;
                return string2;
            }
            catch (ClassCastException classCastException) {
                return a1W.d;
            }
        }
        string2 = ((NBTBase)MapInvoker.c(this.b, string)).c();
        return string2;
    }

    public void a(String string, float f) {
        MapInvoker.c(this.b, string, new aDD(f));
    }

    @Override
    public NBTBase d() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        Iterator iterator = aS0.f(MapInvoker.c(this.b));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            nBTTagCompound.a(string, ((NBTBase)MapInvoker.c(this.b, string)).d());
        }
        return nBTTagCompound;
    }

    void a(DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        byte by;
        a5g_0.a(gy_02, 384L);
        if (n > 512) {
            throw new RuntimeException(a1W.b);
        }
        MapInvoker.d(this.b);
        while ((by = NBTTagCompound.b(dataInput, gy_02)) != 0) {
            String string = NBTTagCompound.a(dataInput, gy_02);
            a5g_0.a(gy_02, 224 + 16 * StringInvoker.c(string));
            NBTBase nBTBase = NBTTagCompound.a(by, string, dataInput, n + 1, gy_02);
            if (MapInvoker.c(this.b, string, nBTBase) == null) continue;
            a5g_0.a(gy_02, 288L);
        }
    }

    @Override
    public boolean b() {
        return MapInvoker.e(this.b);
    }

    public void a(String string, byte[] byArray) {
        MapInvoker.c(this.b, string, new adh_0(byArray));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float i(String string) {
        block3: {
            try {
                if (this.a(string, 99)) break block3;
                return 0.0f;
            }
            catch (ClassCastException classCastException) {
                return 0.0f;
            }
        }
        float f = alo_1.c((aDU)MapInvoker.c(this.b, string));
        return f;
    }

    public boolean a(String string, int n) {
        byte by = this.a(string);
        if (by == n) {
            return true;
        }
        if (n != 99) {
            return false;
        }
        return by == 1 || by == 2 || by == 3 || by == 4 || by == 5 || by == 6;
    }

    public NBTTagCompound a(String string, NBTTagCompound nBTTagCompound) {
        NBTBase nBTBase = (NBTBase)MapInvoker.c(this.b, string);
        if (nBTBase.a() != 10) {
            return nBTTagCompound;
        }
        return (NBTTagCompound)nBTBase;
    }

    private static String a(DataInput dataInput, gy_0 gy_02) throws IOException {
        return atG.b(dataInput);
    }

    public void a(String string, byte by) {
        MapInvoker.c(this.b, string, new aD4(by));
    }

    public boolean j(String string) {
        return this.b(string) != 0;
    }

    static NBTBase a(byte by, String string, DataInput dataInput, int n, gy_0 gy_02) throws IOException {
        NBTBase nBTBase = NBTBase.a(by);
        try {
            nBTBase.a(dataInput, n, gy_02);
            return nBTBase;
        }
        catch (IOException iOException) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(iOException, a1W.e);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, a1W.m);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, a1W.l, string);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, a1W.c, axt_2.a(by));
            throw new ReportedException(crashReport);
        }
    }

    @Override
    public byte a() {
        return 10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int h(String string) {
        block3: {
            try {
                if (this.a(string, 99)) break block3;
                return 0;
            }
            catch (ClassCastException classCastException) {
                return 0;
            }
        }
        int n = alo_1.a((aDU)MapInvoker.c(this.b, string));
        return n;
    }

    @Override
    public boolean equals(Object object) {
        if (super.equals(object)) {
            NBTTagCompound nBTTagCompound = (NBTTagCompound)object;
            return MapInvoker.b(this.b).equals(MapInvoker.b(nBTTagCompound.b));
        }
        return false;
    }

    public void c(String string, int n) {
        MapInvoker.c(this.b, string, new ada_0(n));
    }

    public String a(String string, String string2) {
        NBTBase nBTBase = (NBTBase)MapInvoker.c(this.b, string);
        if (nBTBase.a() != 8) {
            return string2;
        }
        return nBTBase.c();
    }

    public boolean m(String string) {
        return MapInvoker.b(this.b, string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public NBTTagCompound e(String string) {
        NBTTagCompound nBTTagCompound;
        block3: {
            try {
                if (this.a(string, 10)) break block3;
                nBTTagCompound = new NBTTagCompound();
                return nBTTagCompound;
            }
            catch (ClassCastException classCastException) {
                throw new ReportedException(this.a(string, 10, classCastException));
            }
        }
        nBTTagCompound = (NBTTagCompound)MapInvoker.c(this.b, string);
        return nBTTagCompound;
    }

    static Map b(NBTTagCompound nBTTagCompound) {
        return nBTTagCompound.b;
    }

    public void a(String string, long l4) {
        MapInvoker.c(this.b, string, new aDR(l4));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public double n(String string) {
        block3: {
            try {
                if (this.a(string, 99)) break block3;
                return 0.0;
            }
            catch (ClassCastException classCastException) {
                return 0.0;
            }
        }
        double d = alo_1.d((aDU)MapInvoker.c(this.b, string));
        return d;
    }
}

