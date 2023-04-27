/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import java.io.File;
import net.NBTTagCompound;
import net.WorldInfo;
import net.a9K;
import net.ajV;
import net.cd_1;
import net.ku_1;

public interface ISaveHandler {
    public ku_1 a(a9K var1);

    public File a();

    public String e();

    public void b() throws cd_1;

    public WorldInfo f();

    public void d();

    public File a(String var1);

    public void a(WorldInfo var1);

    public ajV c();

    public void a(WorldInfo var1, NBTTagCompound var2);
}

