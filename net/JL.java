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
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import net.AbstractTexture;
import net.MapColor;
import net.MathHelper;
import net.ResourceLocation;
import net.YZ;
import net.aI_;
import net.abg_0;
import net.aiv_2;
import net.dw_0;
import net.j6_0;
import net.jj_0;
import net.mo_1;
import net.my_2;
import org.apache.logging.log4j.Logger;

public class JL
extends AbstractTexture {
    private static Logger j = LogManagerInvoker.c();
    private ResourceLocation h;
    private List<YZ> k;
    private List<String> i;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(aI_ aI_2) throws IOException {
        BufferedImage bufferedImage;
        this.b();
        try {
            BufferedImage bufferedImage2 = aiv_2.a(dw_0.b(j6_0.b(aI_2, this.h)));
            int n = jj_0.e(bufferedImage2);
            n = 6;
            bufferedImage = new BufferedImage(jj_0.f(bufferedImage2), jj_0.d(bufferedImage2), n);
            Graphics graphics = jj_0.c(bufferedImage);
            abg_0.a(graphics, bufferedImage2, 0, 0, null);
            for (int i = 0; i < ListInvoker.size(this.i) && i < ListInvoker.size(this.k); ++i) {
                String string = (String)ListInvoker.get(this.i, i);
                MapColor mapColor = my_2.b((YZ)ListInvoker.get(this.k, i));
                InputStream inputStream = dw_0.b(j6_0.b(aI_2, new ResourceLocation(string)));
                BufferedImage bufferedImage3 = aiv_2.a(inputStream);
                if (jj_0.f(bufferedImage3) != jj_0.f(bufferedImage) || jj_0.d(bufferedImage3) != jj_0.d(bufferedImage) || jj_0.e(bufferedImage3) != 6) continue;
                for (int j = 0; j < jj_0.d(bufferedImage3); ++j) {
                    for (int k = 0; k < jj_0.f(bufferedImage3); ++k) {
                        int n2 = jj_0.a(bufferedImage3, k, j);
                        if ((n2 & 0xFF000000) == 0) continue;
                        int n3 = (n2 & 0xFF0000) << 8 & 0xFF000000;
                        int n4 = jj_0.a(bufferedImage2, k, j);
                        int n5 = MathHelper.a(n4, mapColor.g) & 0xFFFFFF;
                        jj_0.a(bufferedImage3, k, j, n3 | n5);
                    }
                }
                abg_0.a(jj_0.c(bufferedImage), bufferedImage3, 0, 0, null);
            }
        }
        catch (IOException iOException) {
            LoggerInvoker.a(j, mo_1.a, iOException);
            return;
        }
        aiv_2.a(this.a(), bufferedImage);
    }

    public JL(ResourceLocation resourceLocation, List<String> list, List<YZ> list2) {
        this.h = resourceLocation;
        this.i = list;
        this.k = list2;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

