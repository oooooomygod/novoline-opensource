/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import deobf.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ReportedException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class a96 {
    private boolean c;
    private ReadWriteLock b;
    private boolean e = true;
    private Map<Integer, apd_1> a = MapsInvoker.a();
    private Entity f;
    private static Map<Class<?>, Integer> d = MapsInvoker.a();

    public void b(PacketBuffer packetBuffer) throws IOException {
        xl_2.a(OW.b(this.b));
        Iterator iterator = ms_0.a(this.a.values());
        while (dz_0.c(iterator)) {
            apd_1 apd_12 = (apd_1)dz_0.b(iterator);
            a96.a(packetBuffer, apd_12);
        }
        xl_2.b(OW.b(this.b));
        PacketBufferInvoker.c(packetBuffer, 127);
    }

    public String f(int n) {
        return (String)W1.c(this.e(n));
    }

    public void a(int n) {
        apd_1.a(this.e(n), true);
        this.c = true;
    }

    public <T> void a(int n, T t) {
        Integer cfr_ignored_0 = (Integer)MapInvoker.c(d, t.getClass());
        throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), xw_0.i), t.getClass()).toString());
    }

    public int h(int n) {
        return P8.b((Integer)W1.c(this.e(n)));
    }

    public a96(Entity entity) {
        this.b = new ReentrantReadWriteLock();
        this.f = entity;
    }

    public anl_0 d(int n) {
        return (anl_0)W1.c(this.e(n));
    }

    public List<apd_1> a() {
        ArrayList arrayList = null;
        xl_2.a(OW.b(this.b));
        Iterator iterator = ms_0.a(this.a.values());
        while (dz_0.c(iterator)) {
            apd_1 apd_12 = (apd_1)dz_0.b(iterator);
            arrayList = my_0.c();
            ListInvoker.add(arrayList, apd_12);
        }
        xl_2.b(OW.b(this.b));
        return arrayList;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static void a(List<apd_1> list, PacketBuffer packetBuffer) throws IOException {
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            apd_1 apd_12 = (apd_1)dz_0.b(iterator);
            a96.a(packetBuffer, apd_12);
        }
        PacketBufferInvoker.c(packetBuffer, 127);
    }

    public static List<apd_1> a(PacketBuffer packetBuffer) throws IOException {
        ArrayList arrayList = null;
        byte by = PacketBufferInvoker.l(packetBuffer);
        while (by != 127) {
            arrayList = my_0.c();
            int n = (by & 0xE0) >> 5;
            int n2 = by & 0x1F;
            apd_1 apd_12 = null;
            switch (n) {
                case 0: {
                    apd_12 = new apd_1(n, n2, axt_2.a(PacketBufferInvoker.l(packetBuffer)));
                    break;
                }
                case 1: {
                    apd_12 = new apd_1(n, n2, aWT.b(PacketBufferInvoker.k(packetBuffer)));
                    break;
                }
                case 2: {
                    apd_12 = new apd_1(n, n2, P8.d(PacketBufferInvoker.p(packetBuffer)));
                    break;
                }
                case 3: {
                    apd_12 = new apd_1(n, n2, axx_1.a(PacketBufferInvoker.m(packetBuffer)));
                    break;
                }
                case 4: {
                    apd_12 = new apd_1(n, n2, PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE));
                    break;
                }
                case 5: {
                    apd_12 = new apd_1(n, n2, PacketBufferInvoker.g(packetBuffer));
                    break;
                }
                case 6: {
                    int n3 = PacketBufferInvoker.p(packetBuffer);
                    int n4 = PacketBufferInvoker.p(packetBuffer);
                    int n5 = PacketBufferInvoker.p(packetBuffer);
                    apd_12 = new apd_1(n, n2, new BlockPos(n3, n4, n5));
                    break;
                }
                case 7: {
                    float f = PacketBufferInvoker.m(packetBuffer);
                    float f2 = PacketBufferInvoker.m(packetBuffer);
                    float f3 = PacketBufferInvoker.m(packetBuffer);
                    apd_12 = new apd_1(n, n2, new anl_0(f, f2, f3));
                }
            }
            ListInvoker.add(arrayList, apd_12);
            by = PacketBufferInvoker.l(packetBuffer);
        }
        return arrayList;
    }

    public void c() {
        this.c = false;
    }

    public short c(int n) {
        return aWT.a((Short)W1.c(this.e(n)));
    }

    public boolean e() {
        return this.c;
    }

    public void a(int n, int n2) {
        apd_1 apd_12 = new apd_1(n2, n, null);
        xl_2.a(OW.a(this.b));
        MapInvoker.c(this.a, P8.d(n), apd_12);
        xl_2.b(OW.a(this.b));
        this.e = false;
    }

    private apd_1 e(int n) {
        apd_1 apd_12;
        xl_2.a(OW.b(this.b));
        try {
            apd_12 = (apd_1)MapInvoker.c(this.a, P8.d(n));
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, xw_0.e);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, xw_0.c);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, xw_0.f, P8.d(n));
            throw new ReportedException(crashReport);
        }
        xl_2.b(OW.b(this.b));
        return apd_12;
    }

    public float i(int n) {
        return axx_1.a((Float)W1.c(this.e(n)));
    }

    private static void a(PacketBuffer packetBuffer, apd_1 apd_12) throws IOException {
        int n = (W1.d(apd_12) << 5 | W1.a(apd_12) & 0x1F) & 0xFF;
        PacketBufferInvoker.c(packetBuffer, n);
        switch (W1.d(apd_12)) {
            case 0: {
                PacketBufferInvoker.c(packetBuffer, axt_2.a((Byte)W1.c(apd_12)));
                break;
            }
            case 1: {
                PacketBufferInvoker.g(packetBuffer, aWT.a((Short)W1.c(apd_12)));
                break;
            }
            case 2: {
                PacketBufferInvoker.e(packetBuffer, P8.b((Integer)W1.c(apd_12)));
                break;
            }
            case 3: {
                PacketBufferInvoker.writeFloat(packetBuffer, axx_1.a((Float)W1.c(apd_12)));
                break;
            }
            case 4: {
                PacketBufferInvoker.a(packetBuffer, (String)W1.c(apd_12));
                break;
            }
            case 5: {
                ItemStack itemStack = (ItemStack)W1.c(apd_12);
                PacketBufferInvoker.a(packetBuffer, itemStack);
                break;
            }
            case 6: {
                BlockPos blockPos = (BlockPos)W1.c(apd_12);
                PacketBufferInvoker.e(packetBuffer, amv_2.j(blockPos));
                PacketBufferInvoker.e(packetBuffer, amv_2.h(blockPos));
                PacketBufferInvoker.e(packetBuffer, amv_2.i(blockPos));
                break;
            }
            case 7: {
                anl_0 anl_02 = (anl_0)W1.c(apd_12);
                PacketBufferInvoker.writeFloat(packetBuffer, C3.a(anl_02));
                PacketBufferInvoker.writeFloat(packetBuffer, C3.d(anl_02));
                PacketBufferInvoker.writeFloat(packetBuffer, C3.b(anl_02));
            }
        }
    }

    public List<apd_1> b() {
        ArrayList arrayList = null;
        if (this.c) {
            xl_2.a(OW.b(this.b));
            Iterator iterator = ms_0.a(this.a.values());
            while (dz_0.c(iterator)) {
                apd_1 apd_12 = (apd_1)dz_0.b(iterator);
                if (!W1.b(apd_12)) continue;
                W1.a(apd_12, false);
                arrayList = my_0.c();
                ListInvoker.add(arrayList, apd_12);
            }
            xl_2.b(OW.b(this.b));
        }
        this.c = false;
        return arrayList;
    }

    public boolean d() {
        return this.e;
    }

    public void a(List<apd_1> list) {
        xl_2.a(OW.a(this.b));
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            apd_1 apd_12 = (apd_1)dz_0.b(iterator);
            apd_1 apd_13 = (apd_1)MapInvoker.c(this.a, P8.d(W1.a(apd_12)));
            W1.a(apd_13, W1.c(apd_12));
            ayj_0.a(this.f, W1.a(apd_12));
        }
        xl_2.b(OW.a(this.b));
        this.c = true;
    }

    static {
        MapInvoker.c(d, Byte.class, P8.d(0));
        MapInvoker.c(d, Short.class, P8.d(1));
        MapInvoker.c(d, Integer.class, P8.d(2));
        MapInvoker.c(d, Float.class, P8.d(3));
        MapInvoker.c(d, String.class, P8.d(4));
        MapInvoker.c(d, ItemStack.class, P8.d(5));
        MapInvoker.c(d, BlockPos.class, P8.d(6));
        MapInvoker.c(d, anl_0.class, P8.d(7));
    }

    public ItemStack g(int n) {
        return (ItemStack)W1.c(this.e(n));
    }

    public byte b(int n) {
        return axt_2.a((Byte)W1.c(this.e(n)));
    }

    public <T> void b(int n, T t) {
        apd_1 apd_12 = this.e(n);
        if (afe_1.a(t, W1.c(apd_12))) {
            W1.a(apd_12, t);
            ayj_0.a(this.f, n);
            W1.a(apd_12, true);
            this.c = true;
        }
    }
}

