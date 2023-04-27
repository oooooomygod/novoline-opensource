/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import net.AbstractTexture;
import net.ResourceLocation;
import net.aI_;
import net.abg_0;
import net.aiv_2;
import net.api_1;
import net.dw_0;
import net.dz_0;
import net.j6_0;
import net.jj_0;
import net.my_0;
import org.apache.logging.log4j.Logger;

public class JU
extends AbstractTexture {
    public List<String> h;
    private static Logger i = LogManagerInvoker.c();

    public JU(String ... stringArray) {
        this.h = my_0.a(stringArray);
    }

    @Override
    public void a(aI_ aI_2) {
        this.b();
        BufferedImage bufferedImage = null;
        try {
            Iterator iterator = ListInvoker.iterator(this.h);
            while (dz_0.c(iterator)) {
                String string = (String)dz_0.b(iterator);
                InputStream inputStream = dw_0.b(j6_0.b(aI_2, new ResourceLocation(string)));
                BufferedImage bufferedImage2 = aiv_2.a(inputStream);
                bufferedImage = new BufferedImage(jj_0.f(bufferedImage2), jj_0.d(bufferedImage2), 2);
                abg_0.a(jj_0.c(bufferedImage), bufferedImage2, 0, 0, null);
            }
        }
        catch (IOException iOException) {
            LoggerInvoker.a(i, api_1.a, iOException);
            return;
        }
        aiv_2.a(this.a(), bufferedImage);
    }
}

