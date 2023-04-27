/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ThreadInvoker;
import deobf.ISaveHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import net.IProgressUpdate;
import net.ISaveFormat;
import net.NBTTagCompound;
import net.SY;
import net.WorldInfo;
import net.aL0;
import net.aR8;
import net.awe_2;
import net.ch_2;
import net.dr_1;
import net.my_0;
import net.qp_2;
import net.tn_0;
import net.uv_2;
import net.zq_2;
import org.apache.logging.log4j.Logger;

public class SaveFormatOld
implements ISaveFormat {
    private static Logger a = LogManagerInvoker.c();
    protected File b;

    @Override
    public boolean b(String string) {
        File file = new File(this.b, string);
        return zq_2.r(file);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void c() {
    }

    @Override
    public WorldInfo f(String string) {
        File file = new File(this.b, string);
        if (!zq_2.m(file)) {
            return null;
        }
        File file2 = new File(file, qp_2.r);
        if (zq_2.m(file2)) {
            try {
                NBTTagCompound nBTTagCompound = aR8.a(new FileInputStream(file2));
                NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, qp_2.i);
                return new WorldInfo(nBTTagCompound2);
            }
            catch (Exception exception) {
                LoggerInvoker.a(a, aL0.a(aL0.a(new StringBuilder(), qp_2.e), file2).toString(), exception);
            }
        }
        if (zq_2.m(file2 = new File(file, qp_2.h))) {
            try {
                NBTTagCompound nBTTagCompound = aR8.a(new FileInputStream(file2));
                NBTTagCompound nBTTagCompound3 = tn_0.d(nBTTagCompound, qp_2.q);
                return new WorldInfo(nBTTagCompound3);
            }
            catch (Exception exception) {
                LoggerInvoker.a(a, aL0.a(aL0.a(new StringBuilder(), qp_2.b), file2).toString(), exception);
            }
        }
        return null;
    }

    @Override
    public boolean a(String string) {
        return false;
    }

    @Override
    public boolean a(String string, IProgressUpdate iProgressUpdate) {
        return false;
    }

    @Override
    public boolean e(String string) {
        return false;
    }

    public SaveFormatOld(File file) {
        if (!zq_2.m(file)) {
            zq_2.a(file);
        }
        this.b = file;
    }

    @Override
    public boolean c(String string) {
        File file = new File(this.b, string);
        if (!zq_2.m(file)) {
            return true;
        }
        LoggerInvoker.info(a, aL0.a(aL0.a(new StringBuilder(), qp_2.p), string).toString());
        int n = 1;
        while (true) {
            LoggerInvoker.info(a, aL0.a(aL0.c(aL0.a(new StringBuilder(), qp_2.m), n), qp_2.g).toString());
            if (SaveFormatOld.a(zq_2.h(file))) {
                return zq_2.f(file);
            }
            LoggerInvoker.warn(a, qp_2.s);
            try {
                ThreadInvoker.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
            ++n;
        }
    }

    @Override
    public boolean d(String string) {
        File file = new File(this.b, string);
        if (zq_2.m(file)) {
            return false;
        }
        try {
            zq_2.p(file);
            zq_2.f(file);
            return true;
        }
        catch (Throwable throwable) {
            LoggerInvoker.b(a, qp_2.j, throwable);
            return false;
        }
    }

    @Override
    public ISaveHandler a(String string, boolean bl) {
        return new SY(this.b, string, bl);
    }

    @Override
    public String a() {
        return qp_2.a;
    }

    protected static boolean a(File[] fileArray) {
        for (File file : fileArray) {
            LoggerInvoker.b(a, aL0.a(aL0.a(new StringBuilder(), qp_2.f), file).toString());
            if (zq_2.r(file) && !SaveFormatOld.a(zq_2.h(file))) {
                LoggerInvoker.warn(a, aL0.a(aL0.a(new StringBuilder(), qp_2.t), file).toString());
                return false;
            }
            if (zq_2.f(file)) continue;
            LoggerInvoker.warn(a, aL0.a(aL0.a(new StringBuilder(), qp_2.o), file).toString());
            return false;
        }
        return true;
    }

    @Override
    public void a(String string, String string2) {
        File file;
        File file2 = new File(this.b, string);
        if (zq_2.m(file2) && zq_2.m(file = new File(file2, qp_2.n))) {
            try {
                NBTTagCompound nBTTagCompound = aR8.a(new FileInputStream(file));
                NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, qp_2.k);
                tn_0.a(nBTTagCompound2, qp_2.d, string2);
                aR8.a(nBTTagCompound, new FileOutputStream(file));
            }
            catch (Exception exception) {
                ch_2.a(exception);
            }
        }
    }

    @Override
    public List<dr_1> b() throws awe_2 {
        ArrayList arrayList = my_0.c();
        int n = 0;
        while (true) {
            String string = aL0.c(aL0.a(new StringBuilder(), qp_2.l), n + 1).toString();
            WorldInfo worldInfo = this.f(string);
            ListInvoker.add(arrayList, new dr_1(string, qp_2.c, uv_2.p(worldInfo), uv_2.e(worldInfo), uv_2.C(worldInfo), false, uv_2.t(worldInfo), uv_2.g(worldInfo)));
            ++n;
        }
    }
}

