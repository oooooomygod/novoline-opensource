/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import net.MZ;
import net.W2;
import net.a0D;
import net.au8;
import net.zq_2;

/*
 * Renamed from net.dz
 */
public class dz_2
implements W2 {
    protected File a;

    @Override
    public void a() {
    }

    public dz_2(String string, File file) {
        this.a = file;
    }

    @Override
    public String b() {
        return this.a.getName();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public InputStream b(String string) {
        File file;
        block3: {
            try {
                String string2 = MZ.c(string, au8.a, au8.b);
                file = new File(this.a, string2);
                if (zq_2.m(file)) break block3;
                return null;
            }
            catch (Exception exception) {
                return null;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        return bufferedInputStream;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public boolean a(String string) {
        a0D.r();
        File file = new File(this.a, StringInvoker.a(string, 1));
        return zq_2.m(file) && zq_2.r(file);
    }
}

