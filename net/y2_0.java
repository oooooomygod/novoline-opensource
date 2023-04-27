/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.lang.reflect.Constructor;
import net.aio_0;
import net.ap6_0;
import net.ara_2;
import net.yo_2;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.y2
 */
public class y2_0
extends yo_2 {
    private static Logger p = LogManagerInvoker.c();
    private GuiScreen o;

    public void a(GuiScreen guiScreen) {
        this.o = guiScreen;
        try {
            Class clazz = ara_2.a(aio_0.b);
            Constructor constructor = ara_2.a(clazz, new Class[]{yo_2.class});
            ap6_0.a(constructor, true);
            Object object = ap6_0.a(constructor, new Object[]{this});
            MCInvoker.displayGuiScreen(MCInvoker.f(), ((yo_2)object).k());
        }
        catch (Exception exception) {
            LoggerInvoker.a(p, aio_0.a, exception);
        }
    }

    @Override
    public void e() {
        MCInvoker.displayGuiScreen(MCInvoker.f(), this.o);
    }
}

