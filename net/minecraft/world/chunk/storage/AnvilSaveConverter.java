/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.world.chunk.storage;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SaveHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.ISaveHandler;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.IProgressUpdate;
import net.OV;
import net.SK;
import net.SaveFormatOld;
import net.WorldInfo;
import net.WorldType;
import net.a4E;
import net.a8_;
import net.aBJ;
import net.aL0;
import net.aVP;
import net.aW8;
import net.aip_2;
import net.asg_0;
import net.aw__0;
import net.awe_2;
import net.ayj_1;
import net.cd_2;
import net.ct_2;
import net.dr_1;
import net.dz_0;
import net.il_0;
import net.my_0;
import net.uv_2;
import net.zq_2;
import org.apache.logging.log4j.Logger;


public class AnvilSaveConverter
extends SaveFormatOld {
    private static Logger c = LogManagerInvoker.c();

    public AnvilSaveConverter(File file) {
        super(file);
    }

    private void a(String string) {
        File file = new File(this.b, string);
        if (!zq_2.m(file)) {
            LoggerInvoker.warn(c, ayj_1.d);
        } else {
            File file2 = new File(file, ayj_1.g);
            if (!zq_2.m(file2)) {
                LoggerInvoker.warn(c, ayj_1.q);
            } else {
                File file3 = new File(file, ayj_1.p);
                if (!zq_2.a(file2, file3)) {
                    LoggerInvoker.warn(c, ayj_1.f);
                }
            }
        }
    }

    @Override
    public List<dr_1> b() throws awe_2 {
        if (this.b != null && zq_2.m(this.b) && zq_2.r(this.b)) {
            File[] fileArray;
            ArrayList arrayList = my_0.c();
            for (File file : fileArray = zq_2.h(this.b)) {
                String string;
                WorldInfo worldInfo;
                if (!zq_2.r(file) || (worldInfo = this.f(string = file.getName())).F() != 19132 && worldInfo.F() != 19133) continue;
                boolean bl = worldInfo.F() != this.a();
                String string2 = uv_2.z(worldInfo);
                if (aw__0.b((CharSequence)string2)) {
                    string2 = string;
                }
                ListInvoker.add(arrayList, new dr_1(string, string2, uv_2.p(worldInfo), 0L, uv_2.C(worldInfo), bl, uv_2.t(worldInfo), uv_2.g(worldInfo)));
            }
            return arrayList;
        }
        throw new awe_2(ayj_1.n);
    }

    protected int a() {
        return 19133;
    }

    @Override
    public boolean e(String string) {
        WorldInfo worldInfo = this.f(string);
        return worldInfo.F() != this.a();
    }

    @Override
    public boolean a(String string, IProgressUpdate iProgressUpdate) {
        aip_2.a(iProgressUpdate, 0);
        ArrayList arrayList = my_0.c();
        ArrayList arrayList2 = my_0.c();
        ArrayList arrayList3 = my_0.c();
        File file = new File(this.b, string);
        File file2 = new File(file, ayj_1.l);
        File file3 = new File(file, ayj_1.i);
        LoggerInvoker.info(c, ayj_1.k);
        this.a(file, arrayList);
        if (zq_2.m(file2)) {
            this.a(file2, arrayList2);
        }
        if (zq_2.m(file3)) {
            this.a(file3, arrayList3);
        }
        int n = ListInvoker.size(arrayList) + ListInvoker.size(arrayList2) + ListInvoker.size(arrayList3);
        LoggerInvoker.info(c, aL0.c(aL0.a(new StringBuilder(), ayj_1.h), n).toString());
        WorldInfo worldInfo = this.f(string);
        ct_2 ct_22 = null;
        ct_22 = uv_2.r(worldInfo) == WorldType.e ? new cd_2(il_0.G, 0.5f) : new ct_2(uv_2.j(worldInfo), uv_2.r(worldInfo), uv_2.n(worldInfo));
        this.a(new File(file, ayj_1.t), arrayList, ct_22, 0, n, iProgressUpdate);
        this.a(new File(file2, ayj_1.c), arrayList2, (ct_2)new cd_2(il_0.q, 0.0f), ListInvoker.size(arrayList), n, iProgressUpdate);
        this.a(new File(file3, ayj_1.a), arrayList3, (ct_2)new cd_2(il_0.l, 0.0f), ListInvoker.size(arrayList) + ListInvoker.size(arrayList2), n, iProgressUpdate);
        uv_2.e(worldInfo, 19133);
        if (uv_2.r(worldInfo) == WorldType.g) {
            uv_2.a(worldInfo, WorldType.n);
        }
        this.a(string);
        ISaveHandler iSaveHandler = this.a(string, false);
        SaveHandlerInvoker.a(iSaveHandler, worldInfo);
        return true;
    }

    @Override
    public boolean a(String string) {
        WorldInfo worldInfo = this.f(string);
        return worldInfo.F() == 19132;
    }

    private void a(File file, Collection<File> collection) {
        File file2 = new File(file, ayj_1.o);
        Object[] objectArray = zq_2.a(file2, new aVP(this));
        asg_0.a(collection, objectArray);
    }

    @Override
    public ISaveHandler a(String string, boolean bl) {
        return new SK(this.b, string, bl);
    }

    @Override
    public String a() {
        return ayj_1.j;
    }

    private void a(File file, Iterable<File> iterable, ct_2 ct_22, int n, int n2, IProgressUpdate iProgressUpdate) {
        Iterator iterator = OV.a(iterable);
        while (dz_0.c(iterator)) {
            File file2 = (File)dz_0.b(iterator);
            this.a(file, file2, ct_22, n, n2, iProgressUpdate);
            int n3 = (int)MathInvoker.f(100.0 * (double)(++n) / (double)n2);
            aip_2.a(iProgressUpdate, n3);
        }
    }

    @Override
    public void c() {
        aW8.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(File file, File file2, ct_2 ct_22, int n, int n2, IProgressUpdate iProgressUpdate) {
        try {
            String string = file2.getName();
            aBJ aBJ2 = new aBJ(file2);
            aBJ aBJ3 = new aBJ(new File(file, aL0.a(aL0.a(new StringBuilder(), StringInvoker.b(string, 0, StringInvoker.c(string) - StringInvoker.c(ayj_1.s))), ayj_1.r).toString()));
            int n3 = 0;
            int n4 = 0;
            while (true) {
                if (a8_.b(aBJ2, n3, n4) && !a8_.b(aBJ3, n3, n4)) {
                    a8_.a(aBJ2, n3, n4);
                    LoggerInvoker.warn(c, ayj_1.b);
                }
                ++n4;
            }
        }
        catch (IOException iOException) {
            a4E.b(iOException);
            return;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

