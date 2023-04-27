/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.ISaveHandler;
import java.util.List;
import net.IProgressUpdate;
import net.WorldInfo;
import net.awe_2;
import net.dr_1;

public interface ISaveFormat {
    public List<dr_1> b() throws awe_2;

    public boolean c(String var1);

    public boolean d(String var1);

    public void c();

    public WorldInfo f(String var1);

    public boolean a(String var1, IProgressUpdate var2);

    public boolean e(String var1);

    public boolean b(String var1);

    public void a(String var1, String var2);

    public String a();

    public boolean a(String var1);

    public ISaveHandler a(String var1, boolean var2);
}

