/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 *  tv.twitch.ErrorCode
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.GuiScreen;
import deobf.IChatComponent;
import deobf.MCInvoker;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import tv.twitch.ErrorCode;

/*
 * Renamed from net.Sy
 */
public class sy_0
extends GuiScreen {
    private Pd y;
    private List<String> A;
    private static Logger w = LogManagerInvoker.c();
    private List<aoz_1> v;
    private GuiScreen x;
    private IChatComponent z = new aoz_1(ts_1.g, new Object[0]);

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        int n3 = MathInvoker.max((int)((double)this.f * 0.85 / 2.0 - (double)((float)(ListInvoker.size(this.A) * FontRendererInvoker.d(this.q)) / 2.0f)), 50);
        this.b(this.q, aBO.a(this.z), this.n / 2, n3 - FontRendererInvoker.d(this.q) * 2, 0xFFFFFF);
        Iterator iterator = ListInvoker.iterator(this.A);
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            this.b(this.q, string, this.n / 2, n3, 0xA0A0A0);
            n3 += FontRendererInvoker.d(this.q);
        }
        super.a(n, n2, f);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 1) {
                switch (this.y) {
                    case ACCOUNT_NOT_BOUND: 
                    case FAILED_TWITCH_AUTH: {
                        this.a(ts_1.j);
                        break;
                    }
                    case ACCOUNT_NOT_MIGRATED: {
                        this.a(ts_1.c);
                        break;
                    }
                    case UNSUPPORTED_OS_MAC: {
                        this.a(ts_1.d);
                        break;
                    }
                    case UNKNOWN: 
                    case LIBRARY_FAILURE: 
                    case INITIALIZATION_FAILURE: {
                        this.a(ts_1.i);
                    }
                }
            }
            MCInvoker.displayGuiScreen(this.t, this.x);
        }
    }

    private void a(String string) {
        try {
            Class clazz = ara_2.a(ts_1.e);
            Object object = VT.a(ara_2.a(clazz, ts_1.k, new Class[0]), null, new Object[0]);
            VT.a(ara_2.a(clazz, ts_1.h, new Class[]{URI.class}), object, new Object[]{new URI(string)});
        }
        catch (Throwable throwable) {
            LoggerInvoker.a(w, ts_1.r, throwable);
        }
    }

    public static void a(GuiScreen guiScreen) {
        Minecraft minecraft = MCInvoker.f();
        a5f_0 a5f_02 = MCInvoker.a(minecraft);
        if (!apl_1.r) {
            ArrayList arrayList = my_0.c();
            ListInvoker.add(arrayList, new aoz_1(ts_1.q, GL11.glGetString((int)7938)));
            ListInvoker.add(arrayList, new aoz_1(ts_1.n, auk_2.b(aXQ.a().GL_EXT_blend_func_separate)));
            ListInvoker.add(arrayList, new aoz_1(ts_1.a, auk_2.b(aXQ.a().GL_ARB_framebuffer_object)));
            ListInvoker.add(arrayList, new aoz_1(ts_1.p, auk_2.b(aXQ.a().GL_EXT_framebuffer_object)));
            MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.NO_FBO, arrayList));
        } else if (a5f_02 instanceof agl_0) {
            if (StringInvoker.a(aWR.d(aok_1.a((agl_0)a5f_02)), (CharSequence)ts_1.m)) {
                MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.LIBRARY_ARCH_MISMATCH));
            } else {
                MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.LIBRARY_FAILURE));
            }
        } else if (!IStreamInvoker.k(a5f_02) && IStreamInvoker.o(a5f_02) == ErrorCode.TTV_EC_OS_TOO_OLD) {
            switch (Util.a()) {
                case WINDOWS: {
                    MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.UNSUPPORTED_OS_WINDOWS));
                    break;
                }
                case OSX: {
                    MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.UNSUPPORTED_OS_MAC));
                    break;
                }
                default: {
                    MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.UNSUPPORTED_OS_OTHER));
                    break;
                }
            }
        } else if (!ayw_0.a(MCInvoker.F(minecraft), ts_1.o)) {
            if (SessionInvoker.b(MCInvoker.y(minecraft)) == Type.LEGACY) {
                MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.ACCOUNT_NOT_MIGRATED));
            } else {
                MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.ACCOUNT_NOT_BOUND));
            }
        } else if (!IStreamInvoker.x(a5f_02)) {
            switch (IStreamInvoker.f(a5f_02)) {
                case INVALID_TOKEN: {
                    MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.FAILED_TWITCH_AUTH));
                    break;
                }
                default: {
                    MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.FAILED_TWITCH_AUTH_ERROR));
                    break;
                }
            }
        } else if (IStreamInvoker.o(a5f_02) != null) {
            List list = a7r_0.a(new aoz_1[]{new aoz_1(ts_1.f, lf_2.b(IStreamInvoker.o(a5f_02)))});
            MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.INITIALIZATION_FAILURE, list));
        } else {
            MCInvoker.displayGuiScreen(minecraft, new sy_0(guiScreen, Pd.UNKNOWN));
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void i() {
    }

    public sy_0(GuiScreen guiScreen, Pd pd, List<aoz_1> list) {
        this.A = my_0.c();
        this.x = guiScreen;
        this.y = pd;
        this.v = list;
    }

    @Override
    public void l() {
        if (ListInvoker.isEmpty(this.A)) {
            ListInvoker.addAll(this.A, FontRendererInvoker.b(this.q, aBO.a(a05.a(this.y)), (int)((float)this.n * 0.75f)));
            if (this.v != null) {
                ListInvoker.add(this.A, ts_1.s);
                Iterator iterator = ListInvoker.iterator(this.v);
                while (dz_0.c(iterator)) {
                    aoz_1 aoz_12 = (aoz_1)dz_0.b(iterator);
                    ListInvoker.add(this.A, aIW.b(aoz_12));
                }
            }
        }
        if (a05.b(this.y) != null) {
            ListInvoker.add(this.l, new QG(0, this.n / 2 - 155, this.f - 50, 150, 20, I18n.format(ts_1.b, new Object[0])));
            ListInvoker.add(this.l, new QG(1, this.n / 2 - 155 + 160, this.f - 50, 150, 20, I18n.format(aBO.a(a05.b(this.y)), new Object[0])));
        } else {
            ListInvoker.add(this.l, new QG(0, this.n / 2 - 75, this.f - 50, 150, 20, I18n.format(ts_1.l, new Object[0])));
        }
    }

    public sy_0(GuiScreen guiScreen, Pd pd) {
        this(guiScreen, pd, null);
    }
}

