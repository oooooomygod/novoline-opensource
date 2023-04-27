/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.ITextureObject;
import net.minecraft.util.ReportedException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.Logger;

public class TextureManager
implements aRG,
IResourceManagerReloadListener {
    private Map<ResourceLocation, ITextureObject> d = MapsInvoker.a();
    private static Logger c = LogManagerInvoker.c();
    private Map<String, Integer> e;
    private List<aRG> b = my_0.c();
    private aI_ a;

    public boolean a(ResourceLocation resourceLocation, ITextureObject iTextureObject) {
        boolean bl = true;
        ITextureObject iTextureObject2 = iTextureObject;
        try {
            try {
                u3_0.a(iTextureObject, this.a);
            }
            catch (IOException iOException) {
                LoggerInvoker.b(c, aL0.a(aL0.a(new StringBuilder(), ape_1.d), resourceLocation).toString(), iOException);
                iTextureObject2 = aIZ.d;
                MapInvoker.c(this.d, resourceLocation, iTextureObject2);
                bl = false;
            }
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, ape_1.j);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, ape_1.g);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, ape_1.k, resourceLocation);
            CrashReportCategoryInvoker.a(crashReportCategory, ape_1.c, () -> TextureManager.lambda$loadTexture$0(iTextureObject));
            throw new ReportedException(crashReport);
        }
        MapInvoker.c(this.d, resourceLocation, iTextureObject2);
        return bl;
    }

    public void d(ResourceLocation resourceLocation) {
        ITextureObject iTextureObject = this.a(resourceLocation);
        MapInvoker.a(this.d, resourceLocation);
        aiv_2.a(u3_0.c(iTextureObject));
    }

    public ResourceLocation a(String string, DynamicTexture dynamicTexture) {
        if (string.equals(ape_1.e)) {
            dynamicTexture = ys_2.a(dynamicTexture);
        }
        Integer n = (Integer)MapInvoker.c(this.e, string);
        n = P8.d(1);
        MapInvoker.c(this.e, string, n);
        ResourceLocation resourceLocation = new ResourceLocation(StringInvoker.a(ape_1.f, new Object[]{string, n}));
        this.a(resourceLocation, (ITextureObject)dynamicTexture);
        return resourceLocation;
    }

    public ITextureObject c(ResourceLocation resourceLocation) {
        if (ys_2.t()) {
            resourceLocation = aux__0.a(resourceLocation);
        }
        ITextureObject iTextureObject = (ITextureObject)MapInvoker.c(this.d, resourceLocation);
        iTextureObject = new J4(resourceLocation);
        this.a(resourceLocation, iTextureObject);
        if (ys_2.aC()) {
            ahf_1.a(iTextureObject);
        } else {
            aIZ.b(u3_0.c(iTextureObject));
        }
        return iTextureObject;
    }

    private static String lambda$loadTexture$0(ITextureObject iTextureObject) throws Exception {
        return ara_2.b(iTextureObject.getClass());
    }

    @Override
    public void a() {
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            ((aRG)object).a();
        }
    }

    public TextureManager(aI_ aI_2) {
        this.e = MapsInvoker.a();
        this.a = aI_2;
    }

    public void b() {
        Iterator iterator = aS0.f(MapInvoker.b(this.d));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            ITextureObject iTextureObject = (ITextureObject)FG.a(entry);
            if (!(iTextureObject instanceof JL)) continue;
            this.a((ResourceLocation)FG.b(entry), iTextureObject);
        }
    }

    public void b(ResourceLocation resourceLocation) {
        if (ys_2.t()) {
            resourceLocation = aux__0.a(resourceLocation);
        }
        ITextureObject iTextureObject = (ITextureObject)MapInvoker.c(this.d, resourceLocation);
        iTextureObject = new J4(resourceLocation);
        this.a(resourceLocation, iTextureObject);
        if (ys_2.aC()) {
            ahf_1.a(iTextureObject);
        } else {
            aIZ.b(u3_0.c(iTextureObject));
        }
    }

    private static ReportedException a(ReportedException reportedException) {
        return reportedException;
    }

    public boolean a(ResourceLocation resourceLocation, ITickableTextureObject iTickableTextureObject) {
        if (this.a(resourceLocation, (ITextureObject)iTickableTextureObject)) {
            ListInvoker.add(this.b, iTickableTextureObject);
            return true;
        }
        return false;
    }

    public ITextureObject a(ResourceLocation resourceLocation) {
        return (ITextureObject)MapInvoker.c(this.d, resourceLocation);
    }

    @Override
    public void b(aI_ aI_2) {
        Object object;
        Object object2;
        ys_2.a(ape_1.i);
        ys_2.e(aL0.a(aL0.a(new StringBuilder(), ape_1.b), ys_2.F()).toString());
        Iterator iterator = aS0.f(MapInvoker.c(this.d));
        while (dz_0.c(iterator)) {
            object2 = (ResourceLocation)dz_0.b(iterator);
            object = axw_1.b((ResourceLocation)object2);
            if (!StringInvoker.e((String)object, ape_1.h) && !StringInvoker.e((String)object, ape_1.a)) continue;
            ITextureObject iTextureObject = (ITextureObject)MapInvoker.c(this.d, object2);
            if (iTextureObject instanceof AbstractTexture) {
                AbstractTexture abstractTexture = (AbstractTexture)iTextureObject;
                xz_1.b(abstractTexture);
            }
            dz_0.a(iterator);
        }
        object2 = aS0.f(MapInvoker.b(this.d));
        while (dz_0.c((Iterator)object2)) {
            object = (Map.Entry)dz_0.b((Iterator)object2);
            this.a((ResourceLocation)FG.b((Map.Entry)object), (ITextureObject)FG.a((Map.Entry)object));
        }
    }
}

