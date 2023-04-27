/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.SaveHandlerInvoker;
import deobf.ISaveHandler;
import deobf.NBTBase;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.HC;
import net.NBTTagCompound;
import net.a2u_0;
import net.aDA;
import net.aL0;
import net.aML;
import net.aR8;
import net.aS0;
import net.aWT;
import net.aik_2;
import net.ap6_0;
import net.ara_2;
import net.atI;
import net.ayk_0;
import net.ch_2;
import net.dz_0;
import net.my_0;
import net.tn_0;
import net.tx_1;
import net.wo_0;
import net.zq_2;

/*
 * Renamed from net.adS
 */
public class ads_1 {
    private List<wo_0> d;
    protected Map<String, wo_0> b = MapsInvoker.a();
    private Map<String, Short> c;
    private ISaveHandler a;

    public void a(String string, wo_0 wo_02) {
        if (MapInvoker.b(this.b, string)) {
            ListInvoker.remove(this.d, MapInvoker.a(this.b, string));
        }
        MapInvoker.c(this.b, string, wo_02);
        ListInvoker.add(this.d, wo_02);
    }

    private void a(wo_0 wo_02) {
        if (this.a != null) {
            try {
                File file = SaveHandlerInvoker.a(this.a, wo_02.b);
                NBTTagCompound nBTTagCompound = new NBTTagCompound();
                aik_2.b(wo_02, nBTTagCompound);
                NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
                tn_0.a(nBTTagCompound2, atI.e, (NBTBase)nBTTagCompound);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                aR8.a(nBTTagCompound2, fileOutputStream);
                a2u_0.a(fileOutputStream);
            }
            catch (Exception exception) {
                ch_2.a(exception);
            }
        }
    }

    public int a(String string) {
        Short s = (Short)MapInvoker.c(this.c, string);
        s = aWT.b((short)0);
        MapInvoker.c(this.c, string, s);
        if (this.a != null) {
            try {
                File file = SaveHandlerInvoker.a(this.a, atI.b);
                NBTTagCompound nBTTagCompound = new NBTTagCompound();
                Object object = aS0.f(MapInvoker.c(this.c));
                while (dz_0.c((Iterator)object)) {
                    String string2 = (String)dz_0.b((Iterator)object);
                    short s3 = aWT.a((Short)MapInvoker.c(this.c, string2));
                    tn_0.a(nBTTagCompound, string2, s3);
                }
                object = new DataOutputStream(new FileOutputStream(file));
                aR8.a(nBTTagCompound, (DataOutput)object);
                HC.a((DataOutputStream)object);
            }
            catch (Exception exception) {
                ch_2.a(exception);
            }
        }
        return aWT.a(s);
    }

    public void a() {
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            wo_0 wo_02 = (wo_0)dz_0.b(iterator);
            wo_0 wo_03 = wo_02;
            if (!aik_2.a(wo_03)) continue;
            this.a(wo_03);
            aik_2.a(wo_03, false);
        }
    }

    public ads_1(ISaveHandler iSaveHandler) {
        this.d = my_0.c();
        this.c = MapsInvoker.a();
        this.a = iSaveHandler;
        this.b();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public wo_0 a(Class<? extends wo_0> clazz, String string) {
        wo_0 wo_02;
        block6: {
            wo_02 = (wo_0)MapInvoker.c(this.b, string);
            if (this.a != null) {
                File file = SaveHandlerInvoker.a(this.a, string);
                if (!zq_2.m(file)) break block6;
                try {
                    try {
                        wo_02 = (wo_0)ap6_0.a(ara_2.b(clazz, new Class[]{String.class}), new Object[]{string});
                    }
                    catch (Exception exception) {
                        throw new RuntimeException(aL0.a(aL0.a(new StringBuilder(), atI.a), clazz.toString()).toString(), exception);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    NBTTagCompound nBTTagCompound = aR8.a(fileInputStream);
                    aML.a(fileInputStream);
                    aik_2.a(wo_02, tn_0.d(nBTTagCompound, atI.c));
                }
                catch (Exception exception) {
                    ch_2.a(exception);
                }
            }
        }
        MapInvoker.c(this.b, string, wo_02);
        ListInvoker.add(this.d, wo_02);
        return wo_02;
    }

    private void b() {
        block6: {
            block5: {
                MapInvoker.d(this.c);
                if (this.a != null) break block5;
                return;
            }
            File file = SaveHandlerInvoker.a(this.a, atI.d);
            if (!zq_2.m(file)) break block6;
            try {
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                NBTTagCompound nBTTagCompound = aR8.a(dataInputStream);
                ayk_0.b(dataInputStream);
                Iterator iterator = aS0.f(tn_0.c(nBTTagCompound));
                while (dz_0.c(iterator)) {
                    String string = (String)dz_0.b(iterator);
                    NBTBase nBTBase = tn_0.h(nBTTagCompound, string);
                    if (!(nBTBase instanceof aDA)) continue;
                    aDA aDA2 = (aDA)nBTBase;
                    short s = tx_1.a(aDA2);
                    MapInvoker.c(this.c, string, aWT.b(s));
                }
            }
            catch (Exception exception) {
                ch_2.a(exception);
            }
        }
    }
}

