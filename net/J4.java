/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import net.AbstractTexture;
import net.PP;
import net.ResourceLocation;
import net.aI_;
import net.aL0;
import net.aZ6;
import net.abh_2;
import net.ahf_1;
import net.aiv_2;
import net.amp_1;
import net.avm_0;
import net.dw_0;
import net.j6_0;
import net.ys_2;
import org.apache.logging.log4j.Logger;

public class J4
extends AbstractTexture {
    private static Logger h = LogManagerInvoker.c();
    protected ResourceLocation i;

    public J4(ResourceLocation resourceLocation) {
        this.i = resourceLocation;
    }

    @Override
    public void a(aI_ aI_2) throws IOException {
        InputStream inputStream;
        block7: {
            boolean bl;
            boolean bl2;
            BufferedImage bufferedImage;
            block6: {
                this.b();
                inputStream = null;
                try {
                    abh_2 abh_22 = j6_0.b(aI_2, this.i);
                    inputStream = dw_0.b(abh_22);
                    bufferedImage = aiv_2.a(inputStream);
                    bl2 = false;
                    bl = false;
                    if (dw_0.d(abh_22)) {
                        try {
                            avm_0 avm_02 = (avm_0)dw_0.a(abh_22, PP.a);
                            bl2 = amp_1.b(avm_02);
                            bl = amp_1.c(avm_02);
                        }
                        catch (RuntimeException runtimeException) {
                            LoggerInvoker.b(h, aL0.a(aL0.a(new StringBuilder(), PP.b), this.i).toString(), runtimeException);
                        }
                    }
                    if (!ys_2.aC()) break block6;
                    ahf_1.a(this.a(), bufferedImage, bl2, bl, aI_2, this.i, this.b());
                    break block7;
                }
                catch (Throwable throwable) {
                    aZ6.b(inputStream);
                    throw throwable;
                }
            }
            aiv_2.a(this.a(), bufferedImage, bl2, bl);
        }
        aZ6.b(inputStream);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

