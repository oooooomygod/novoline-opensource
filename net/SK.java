/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.File;
import net.NBTTagCompound;
import net.SY;
import net.WorldInfo;
import net.XB;
import net.a91;
import net.a9K;
import net.a9T;
import net.aW8;
import net.afp_0;
import net.aue_2;
import net.azq_0;
import net.ku_1;
import net.uv_2;
import net.zq_2;

public class SK
extends SY {
    @Override
    public void d() {
        try {
            XB.a(XB.a());
        }
        catch (InterruptedException interruptedException) {
            azq_0.a(interruptedException);
        }
        aW8.a();
    }

    @Override
    public void a(WorldInfo worldInfo, NBTTagCompound nBTTagCompound) {
        uv_2.e(worldInfo, 19133);
        super.a(worldInfo, nBTTagCompound);
    }

    public SK(File file, String string, boolean bl) {
        super(file, string, bl);
    }

    @Override
    public ku_1 a(a9K a9K2) {
        File file = this.a();
        if (a9K2 instanceof a9T) {
            File file2 = new File(file, afp_0.b);
            zq_2.a(file2);
            return new aue_2(file2);
        }
        if (a9K2 instanceof a91) {
            File file3 = new File(file, afp_0.a);
            zq_2.a(file3);
            return new aue_2(file3);
        }
        return new aue_2(file);
    }
}

