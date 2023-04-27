/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.IResourcePack;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.DefaultResourcePack;
import net.MZ;
import net.ResourceLocation;
import net.a4E;
import net.a7r_0;
import net.aP2;
import net.aS0;
import net.aWF;
import net.aju_0;
import net.auQ;
import net.avv_0;
import net.azn_2;
import net.fg_0;
import net.ys_2;
import net.zq_2;

/*
 * Renamed from net.sw
 */
public class sw_2 {
    private static String[] a(IResourcePack iResourcePack, String[] stringArray) {
        aP2.b();
        if (stringArray == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        int n = 0;
        if (n < stringArray.length) {
            String string = stringArray[n];
            ResourceLocation resourceLocation = new ResourceLocation(string);
            if (avv_0.b(iResourcePack, resourceLocation)) {
                ListInvoker.add(arrayList, string);
            }
            ++n;
        }
        String[] stringArray2 = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
        return stringArray2;
    }

    private static String[] a(File file, String string, String[] stringArray, String[] stringArray2) {
        new ArrayList();
        aP2.b();
        zq_2.h(file);
        return new String[0];
    }

    public static String[] a(IResourcePack iResourcePack, String[] stringArray, String[] stringArray2, String[] stringArray3) {
        aP2.b();
        if (iResourcePack instanceof DefaultResourcePack) {
            return sw_2.a(iResourcePack, stringArray3);
        }
        if (!(iResourcePack instanceof auQ)) {
            return new String[0];
        }
        auQ auQ2 = (auQ)iResourcePack;
        File file = auQ2.b;
        return file == null ? new String[]{} : (zq_2.r(file) ? sw_2.a(file, fg_0.a, stringArray, stringArray2) : (zq_2.d(file) ? sw_2.a(file, stringArray, stringArray2) : new String[]{}));
    }

    public static String[] a(IResourcePack iResourcePack, String[] stringArray, String[] stringArray2) {
        return sw_2.a(iResourcePack, stringArray, stringArray2, (String[])null);
    }

    public static String[] a(IResourcePack iResourcePack, String string, String string2, String[] stringArray) {
        return sw_2.a(iResourcePack, new String[]{string}, new String[]{string2}, stringArray);
    }

    public static String[] a(String string, String string2) {
        return sw_2.a(new String[]{string}, new String[]{string2});
    }

    public static String[] a(String[] stringArray, String[] stringArray2) {
        aP2.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IResourcePack[] iResourcePackArray = ys_2.d();
        int n = 0;
        if (n < iResourcePackArray.length) {
            IResourcePack iResourcePack = iResourcePackArray[n];
            Object[] objectArray = sw_2.a(iResourcePack, stringArray, stringArray2, (String[])null);
            aS0.a(linkedHashSet, a7r_0.a(objectArray));
            ++n;
        }
        String[] stringArray3 = (String[])aS0.a(linkedHashSet, new String[aS0.d(linkedHashSet)]);
        return stringArray3;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static String[] a(File file, String[] stringArray, String[] stringArray2) {
        String[] stringArray3;
        ZipFile zipFile;
        ArrayList arrayList;
        block6: {
            String string;
            aP2.b();
            arrayList = new ArrayList();
            String string2 = fg_0.d;
            try {
                zipFile = new ZipFile(file);
                Enumeration enumeration = aju_0.b(zipFile);
                if (!azn_2.b(enumeration) || !StringInvoker.e(string = aWF.a((ZipEntry)(stringArray3 = (String[])azn_2.a(enumeration))), string2)) break block6;
            }
            catch (IOException iOException) {
                a4E.b(iOException);
                return new String[0];
            }
            string = StringInvoker.a(string, StringInvoker.c(string2));
            if (!MZ.b(string, stringArray)) break block6;
            if (!MZ.c(string, stringArray2)) break block6;
            ListInvoker.add(arrayList, string);
        }
        aju_0.a(zipFile);
        stringArray3 = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
        return stringArray3;
    }
}

