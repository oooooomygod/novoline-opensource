/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.filefilter.DirectoryFileFilter
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import net.aS0;
import net.auQ;
import net.axe_2;
import net.w3_0;
import net.zq_2;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

/*
 * Renamed from net.aug
 */
public class aug_1
extends auQ {
    public aug_1(File file) {
        super(file);
    }

    @Override
    public Set<String> c() {
        HashSet hashSet = axe_2.a();
        File file = new File(this.b, w3_0.a);
        if (zq_2.r(file)) {
            for (File file2 : zq_2.a(file, (FileFilter)DirectoryFileFilter.DIRECTORY)) {
                String string = aug_1.a(file, file2);
                if (!string.equals(StringInvoker.i(string))) {
                    this.b(string);
                    continue;
                }
                aS0.b((Set)hashSet, StringInvoker.b(string, 0, StringInvoker.c(string) - 1));
            }
        }
        return hashSet;
    }

    @Override
    protected boolean a(String string) {
        return zq_2.d(new File(this.b, string));
    }

    @Override
    protected InputStream c(String string) throws IOException {
        return new BufferedInputStream(new FileInputStream(new File(this.b, string)));
    }
}

