/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.gerrygames.viarewind.api.ViaRewindConfig
 *  de.gerrygames.viarewind.api.ViaRewindConfigImpl
 *  de.gerrygames.viarewind.api.ViaRewindPlatform
 */
package net;

import cc.novoline.invoke.ListInvoker;
import de.gerrygames.viarewind.api.ViaRewindConfig;
import de.gerrygames.viarewind.api.ViaRewindConfigImpl;
import de.gerrygames.viarewind.api.ViaRewindPlatform;
import java.io.File;
import java.util.logging.Logger;
import net.a6S;
import net.ag_1;
import net.ah__0;
import net.te_1;
import net.y8_0;
import net.zq_2;

/*
 * Renamed from net.arY
 */
public class ary_1
implements ViaRewindPlatform {
    public ary_1(File file) {
        ViaRewindConfigImpl viaRewindConfigImpl = new ViaRewindConfigImpl(ah__0.d(ah__0.a(ah__0.a(zq_2.g(file), ag_1.a), ag_1.b)));
        a6S.b();
        y8_0.a(viaRewindConfigImpl);
        this.init((ViaRewindConfig)viaRewindConfigImpl);
        ListInvoker.b(new ListInvoker[2]);
    }

    public Logger getLogger() {
        return te_1.c().getLogger();
    }
}

