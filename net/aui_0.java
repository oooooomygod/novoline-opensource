/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Splitter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.aG5;
import net.aS0;
import net.aWF;
import net.aju_0;
import net.amx_2;
import net.asg_0;
import net.auQ;
import net.axe_2;
import net.azn_2;
import net.my_0;
import net.zo_1;

/*
 * Renamed from net.auI
 */
public class aui_0
extends auQ
implements Closeable {
    private ZipFile c;
    public static Splitter d = amx_2.a(amx_2.a(amx_2.a('/')), 3);

    public aui_0(File file) {
        super(file);
    }

    @Override
    public boolean a(String string) {
        try {
            return aju_0.a(this.a(), string) != null;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    @Override
    public void close() throws IOException {
        if (this.c != null) {
            this.c.close();
            this.c = null;
        }
    }

    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }

    private ZipFile a() throws IOException {
        if (this.c == null) {
            this.c = new ZipFile(this.b);
        }
        return this.c;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public Set<String> c() {
        ZipFile zipFile;
        try {
            zipFile = this.a();
        }
        catch (IOException iOException) {
            return asg_0.d();
        }
        Enumeration enumeration = aju_0.b(zipFile);
        HashSet hashSet = axe_2.a();
        while (azn_2.b(enumeration)) {
            ArrayList arrayList;
            ZipEntry zipEntry = (ZipEntry)azn_2.a(enumeration);
            String string = aWF.a(zipEntry);
            if (!StringInvoker.e(string, aG5.a) || ListInvoker.size(arrayList = my_0.a(amx_2.b(d, string))) <= 1) continue;
            String string2 = (String)ListInvoker.get(arrayList, 1);
            if (!string2.equals(StringInvoker.i(string2))) {
                this.b(string2);
                continue;
            }
            aS0.b((Set)hashSet, string2);
        }
        return hashSet;
    }

    @Override
    protected InputStream c(String string) throws IOException {
        ZipFile zipFile = this.a();
        aju_0.a(zipFile, string);
        throw new zo_1(this.b, string);
    }
}

