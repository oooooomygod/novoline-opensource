/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;
import net.MZ;
import net.W2;
import net.a0D;
import net.aju_0;
import net.qo_0;

/*
 * Renamed from net.aQu
 */
public class aqu_0
implements W2 {
    protected ZipFile a;
    protected File b;

    @Override
    public void a() {
        a0D.r();
        if (this.a != null) {
            try {
                this.a.close();
            }
            catch (Exception exception) {}
            this.a = null;
        }
    }

    public aqu_0(String string, File file) {
        this.b = file;
        this.a = null;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String b() {
        return this.b.getName();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean a(String var1_1) {
        a0D.r();
        if (this.a != null) ** GOTO lbl6
        try {
            this.a = new ZipFile(this.b);
lbl6:
            // 2 sources

            var3_2 = MZ.a(var1_1, qo_0.b);
            aju_0.a(this.a, var3_2);
            return true;
        }
        catch (IOException var3_3) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream b(String string) {
        a0D.k();
        try {
            if (this.a == null) {
                this.a = new ZipFile(this.b);
            }
            String string2 = MZ.a(string, qo_0.a);
            aju_0.a(this.a, string2);
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

