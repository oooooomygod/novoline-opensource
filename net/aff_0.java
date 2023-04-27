/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SaveLoaderInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.IProgressUpdate;
import net.ISaveFormat;
import net.aDT;
import net.awe_2;
import net.dr_1;
import net.dz_0;
import net.my_0;

/*
 * Renamed from net.aFf
 */
public class aff_0 {
    private ISaveFormat a;

    public boolean a(String string) {
        return SaveLoaderInvoker.b(this.a, string);
    }

    public List<aDT> c() throws awe_2 {
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(SaveLoaderInvoker.b(this.a));
        while (dz_0.c(iterator)) {
            dr_1 dr_12 = (dr_1)dz_0.b(iterator);
            ListInvoker.add(arrayList, new aDT(dr_12));
        }
        return arrayList;
    }

    public void a() {
        SaveLoaderInvoker.a(this.a);
    }

    public boolean b(String string) {
        return SaveLoaderInvoker.d(this.a, string);
    }

    public boolean c(String string) {
        return SaveLoaderInvoker.e(this.a, string);
    }

    public void a(String string, String string2) {
        SaveLoaderInvoker.a(this.a, string, string2);
    }

    public boolean d(String string) {
        return SaveLoaderInvoker.c(this.a, string);
    }

    public aff_0(ISaveFormat iSaveFormat) {
        this.a = iSaveFormat;
    }

    public String b() {
        return this.a.a();
    }

    public boolean e(String string) {
        return SaveLoaderInvoker.a(this.a, string);
    }

    public boolean a(String string, IProgressUpdate iProgressUpdate) {
        return SaveLoaderInvoker.a(this.a, string, iProgressUpdate);
    }
}

