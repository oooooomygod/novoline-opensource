/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.gui.screen;

import cc.novoline.Novoline;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.IOUtilsInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.modules.visual.ClickGui;
import cc.novoline.modules.EnumModuleType;
import deobf.GuiScreen;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.SettingType;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.Ba;
import net.I_;
import net.JF;
import net.ME;
import net.ScaledResolution;
import net._j_0;
import net.a13;
import net.a1u;
import net.a4E;
import net.a7l_0;
import net.aB0;
import net.aBM;
import net.aL0;
import net.aMF;
import net.aN_;
import net.aWR;
import net.aYO;
import net.aZR;
import net.acf_2;
import net.ada_2;
import net.aev_1;
import net.ah__0;
import net.ahg_0;
import net.aq3_0;
import net.aq7_0;
import net.aqx_2;
import net.arn_1;
import net.asx_1;
import net.auk_2;
import net.ax4_0;
import net.cx_0;
import net.da_0;
import net.db_0;
import net.dz_0;
import net.hb_2;
import net.l2;
import net.m5_0;
import net.my_0;
import net.r_0;
import net.ua_2;
import net.wc_1;
import net.z4_0;
import org.json.JSONObject;
import org.lwjgl.opengl.GL11;

public class ClickGUI
extends GuiScreen {
    public int[] D;
    public int[] E;
    public int[] G;
    public int[] C;
    public int[] F;
    private ax4_0 v;
    public int[] z;
    private aqx_2 y;
    private Novoline x;
    private aq7_0 H;
    private List<aq3_0> B;
    public int[] w;
    public int[] A;

    public Novoline c() {
        return this.x;
    }

    public void a(AbstractModule abstractModule) {
        MathInvoker.b();
        Iterator iterator = ListInvoker.iterator(this.B);
        if (dz_0.c(iterator)) {
            aq3_0 aq3_02 = (aq3_0)dz_0.b(iterator);
            ListInvoker.removeIf(a13.h(aq3_02), arg_0 -> ClickGUI.lambda$removeModule$0(abstractModule, arg_0));
        }
    }

    public List<aq3_0> b() {
        return this.B;
    }

    private void lambda$drawScreen$2(ClickGui clickGui, int n, int n2, float f) {
        this.a(clickGui, n, n2, f);
    }

    @Override
    public void e() {
        MathInvoker.c();
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        if (auk_2.a((Boolean)Ba.b(z4_0.s(clickGui)))) {
            double d = ua_2.a(true);
            ScaledResolution scaledResolution = new ScaledResolution(this.t);
            double d2 = ScaledResolutionInvoker.f(scaledResolution);
            double d3 = ScaledResolutionInvoker.c(scaledResolution);
            if (StringPropertyInvoker.isMode(z4_0.e(clickGui), aBM.w)) {
                arn_1.d(0.0, 0.0, d2, d3, hb_2.a(asx_1.BLACK));
            }
            _j_0.a(this.v, d2 / 2.0, d3 / 2.0, StringPropertyInvoker.isMode(z4_0.e(clickGui), aBM.c) ? 0.0 : 0.05, () -> ClickGUI.lambda$onBlur$1(d2, d3), 200L);
            ua_2.a(d);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void a(int n, int n2, float f) {
        MathInvoker.b();
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        double d = z4_0.q(clickGui);
        if (_j_0.b(this.v) && _j_0.a(this.v) < 0.4) {
            MCInvoker.displayGuiScreen(this.t, null);
        }
        double d2 = ua_2.a(false) * d;
        GL11.glScaled((double)d2, (double)d2, (double)d2);
        n = ua_2.b(n, d);
        n2 = ua_2.a(n2, d);
        ScaledResolution scaledResolution = new ScaledResolution(this.t);
        double d3 = ScaledResolutionInvoker.f(scaledResolution) / 2.0;
        double d4 = ScaledResolutionInvoker.c(scaledResolution) / 2.0;
        if (StringPropertyInvoker.isMode(z4_0.e(clickGui), aBM.d)) {
            this.a(clickGui, n, n2, f);
            ListInvoker.b(new ListInvoker[5]);
        }
        int n3 = n;
        int n4 = n2;
        _j_0.a(this.v, d3, d4, StringPropertyInvoker.isMode(z4_0.e(clickGui), aBM.q) ? 0.0 : 0.05, () -> this.lambda$drawScreen$2(clickGui, n3, n4, f), 200L);
        ua_2.a(d2);
    }

    public ax4_0 d() {
        return this.v;
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        block4: {
            aq3_0 aq3_02;
            block5: {
                JF jF;
                block6: {
                    r_0 r_02;
                    Iterator iterator;
                    MathInvoker.b();
                    ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
                    double d = z4_0.q(clickGui);
                    n = ua_2.b(n, d);
                    n2 = ua_2.a(n2, d);
                    Iterator iterator2 = ListInvoker.iterator(this.B);
                    if (!dz_0.c(iterator2)) break block4;
                    aq3_02 = (aq3_0)dz_0.b(iterator2);
                    Iterator iterator3 = ListInvoker.iterator(a13.h(aq3_02));
                    if (!dz_0.c(iterator3) || !dz_0.c(iterator = ListInvoker.iterator(ME.a(r_02 = (r_0)dz_0.b(iterator3))))) break block5;
                    jF = (JF)dz_0.b(iterator);
                    if (ahg_0.v(m5_0.a(jF)) != SettingType.TEXTBOX) break block6;
                    if (!m5_0.b(jF)) break block5;
                    m5_0.b(jF, false);
                }
                if (ahg_0.v(m5_0.a(jF)) == SettingType.BINDABLE && m5_0.d(jF)) {
                    m5_0.a(jF, false);
                }
            }
            aq3_02.a(n, n2, n3);
        }
        this.H.a(n, n2, n3);
        this.y.a(n, n2, n3);
        super.b(n, n2, n3);
    }

    private static void lambda$onBlur$1(double d, double d2) {
        arn_1.d(0.0, 0.0, d, d2, hb_2.a(asx_1.BLACK));
    }

    public void a(FontRenderer fontRenderer, String string, double d, double d2, int n, boolean bl) {
        MathInvoker.c();
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        double d3 = z4_0.q(clickGui);
        a7l_0.a(fontRenderer, (CharSequence)string, d - (double)(a7l_0.a(fontRenderer, string) / 2), d2, n, bl, d3 != 1.0);
    }

    @Override
    protected void a(int n, int n2, int n3) {
        MathInvoker.c();
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        double d = z4_0.q(clickGui);
        n = ua_2.b(n, d);
        n2 = ua_2.a(n2, d);
        Iterator iterator = ListInvoker.iterator(this.B);
        if (dz_0.c(iterator)) {
            aq3_0 aq3_02 = (aq3_0)dz_0.b(iterator);
            aq3_02.b(n, n2, n3);
        }
        this.y.b(n, n2, n3);
        this.H.b(n, n2, n3);
        super.a(n, n2, n3);
    }

    private static void lambda$keyTyped$4(char c, int n, aq3_0 aq3_02) {
        aq3_02.a(c, n);
    }

    @Override
    protected void a(char c, int n) throws IOException {
        Setting setting;
        JF jF;
        r_0 r_02;
        Iterator iterator;
        aq3_0 aq3_02;
        Iterator iterator2;
        MathInvoker.c();
        Iterator iterator3 = ListInvoker.iterator(this.B);
        if (!dz_0.c(iterator3) || !dz_0.c(iterator2 = ListInvoker.iterator(a13.h(aq3_02 = (aq3_0)dz_0.b(iterator3)))) || !dz_0.c(iterator = ListInvoker.iterator(ME.a(r_02 = (r_0)dz_0.b(iterator2)))) || m5_0.b(jF = (JF)dz_0.b(iterator)) || m5_0.d(jF)) {
            // empty if block
        }
        aMF.a(aMF.b(ListInvoker.stream(this.B), aq3_0::k), arg_0 -> ClickGUI.lambda$keyTyped$4(c, n, arg_0));
        this.y.a(c, n);
        iterator3 = ListInvoker.iterator(this.B);
        if (dz_0.c(iterator3) && dz_0.c(iterator2 = ListInvoker.iterator(a13.h(aq3_02 = (aq3_0)dz_0.b(iterator3)))) && dz_0.c(iterator = ListInvoker.iterator(ME.a(r_02 = (r_0)dz_0.b(iterator2)))) && ahg_0.v(setting = m5_0.a(jF = (JF)dz_0.b(iterator))) == SettingType.BINDABLE && jF.q) {
            jF.q = false;
            return;
        }
        if (StringPropertyInvoker.isMode(z4_0.e((ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI)), aBM.p)) {
            super.a(c, n);
        }
        if (n == 1 && !_j_0.b(this.v)) {
            _j_0.c(this.v);
            aYO.a(this.t.mouseHelper);
            this.t.ay = true;
        }
        if (ListInvoker.b() != null) {
            MathInvoker.b(false);
        }
    }

    public aq7_0 k() {
        return this.H;
    }

    private void a(ClickGui clickGui, int n, int n2, float f) {
        MathInvoker.c();
        ArrayList arrayList = my_0.a(new aq3_0[]{(aq3_0)ListInvoker.get(this.B, 0), (aq3_0)ListInvoker.get(this.B, 1), (aq3_0)ListInvoker.get(this.B, 2), (aq3_0)ListInvoker.get(this.B, 3), (aq3_0)ListInvoker.get(this.B, 4), (aq3_0)ListInvoker.get(this.B, 5), this.y, this.H});
        int n3 = 0;
        Iterator iterator = ListInvoker.iterator((List)aMF.a(aMF.a(ListInvoker.stream(arrayList), aN_.a(ClickGUI::lambda$drawGui$3)), aB0.a()));
        if (dz_0.c(iterator)) {
            aq3_0 aq3_02 = (aq3_0)dz_0.b(iterator);
            a13.a(aq3_02, clickGui, n, n2, f, hb_2.a((long)n3));
            n3 -= 180;
        }
    }

    public aqx_2 a() {
        return this.y;
    }

    public void b(FontRenderer fontRenderer, String string, double d, double d2, int n, boolean bl) {
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        MathInvoker.b();
        double d3 = z4_0.q(clickGui);
        a7l_0.a(fontRenderer, (CharSequence)string, d, d2, n, bl, d3 != 1.0);
    }

    public void j() {
        MathInvoker.c();
        Iterator iterator = ListInvoker.iterator(this.B);
        if (dz_0.c(iterator)) {
            aq3_0 aq3_02 = (aq3_0)dz_0.b(iterator);
            Iterator iterator2 = ListInvoker.iterator(cx_0.a(NovolineInvoker.r(NovolineInvoker.getInstance())));
            if (dz_0.c(iterator2)) {
                AbstractModule abstractModule = (AbstractModule)dz_0.b(iterator2);
                if (a13.b(aq3_02) == wc_1.d(abstractModule) && !a13.a(aq3_02, abstractModule)) {
                    ListInvoker.add(a13.h(aq3_02), new r_0(aq3_02, abstractModule));
                }
            }
        }
    }

    public ClickGUI(Novoline novoline) {
        String[] stringArray;
        MathInvoker.c();
        this.B = new CopyOnWriteArrayList<aq3_0>();
        this.D = new int[]{75, 105};
        this.w = new int[]{339, 105};
        this.G = new int[]{75, 331};
        this.E = new int[]{207, 331};
        this.A = new int[]{339, 331};
        this.C = new int[]{207, 105};
        this.z = new int[]{471, 75};
        this.F = new int[]{603, 85};
        this.v = new ax4_0();
        this.x = novoline;
        Object object = EnumModuleType.values();
        int n = ((EnumModuleType[])object).length;
        int n2 = 0;
        if (n2 < n) {
            stringArray = object[n2];
            switch (a1u.a[stringArray.ordinal()]) {
                case 1: {
                    ListInvoker.add(this.B, new aq3_0(this, (EnumModuleType)stringArray, this.D[0], this.D[1]));
                }
                case 2: {
                    ListInvoker.add(this.B, new aq3_0(this, (EnumModuleType)stringArray, this.w[0], this.w[1]));
                }
                case 3: {
                    ListInvoker.add(this.B, new aq3_0(this, (EnumModuleType)stringArray, this.G[0], this.G[1]));
                }
                case 4: {
                    ListInvoker.add(this.B, new aq3_0(this, (EnumModuleType)stringArray, this.E[0], this.E[1]));
                }
                case 5: {
                    ListInvoker.add(this.B, new aq3_0(this, (EnumModuleType)stringArray, this.A[0], this.A[1]));
                }
                case 6: {
                    ListInvoker.add(this.B, new aq3_0(this, (EnumModuleType)stringArray, this.C[0], this.C[1]));
                }
            }
            ++n2;
        }
        this.y = new aqx_2(this, this.z[0], this.z[1]);
        this.H = new aq7_0(this, this.F[0], this.F[1]);
        object = ListInvoker.iterator(this.B);
        if (dz_0.c((Iterator)object)) {
            aq3_0 aq3_02 = (aq3_0)dz_0.b((Iterator)object);
            a13.a(aq3_02, true);
        }
        acf_2.a(this.H, true);
        I_.a(this.y, true);
        if (aev_1.b(da_0.a(aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), aBM.k).toString(), new String[0]), new LinkOption[0])) {
            String[] stringArray2;
            Object object2;
            block14: {
                object = new JSONObject(IOUtilsInvoker.a(new FileReader(aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), aBM.s).toString())));
                object2 = ListInvoker.iterator(this.B);
                if (!dz_0.c((Iterator)object2)) break block14;
                aq3_0 aq3_03 = (aq3_0)dz_0.b((Iterator)object2);
                stringArray = a13.b(aq3_03).name();
                stringArray2 = (String[])aZR.e(object, (String)stringArray);
                String[] stringArray3 = StringInvoker.g((String)stringArray2, aBM.a);
                a13.c(aq3_03, db_0.c(stringArray3[0]));
                a13.b(aq3_03, db_0.c(stringArray3[1]));
                a13.a(aq3_03, db_0.c(stringArray3[2]));
                a13.a(aq3_03, auk_2.b(stringArray3[3]));
            }
            try {
                object2 = (String)aZR.e(object, aBM.b);
                String string = (String)aZR.e(object, aBM.v);
                stringArray = StringInvoker.g((String)object2, aBM.l);
                stringArray2 = StringInvoker.g(string, aBM.g);
                I_.c(this.y, db_0.c(stringArray[0]));
                I_.b(this.y, db_0.c(stringArray[1]));
                I_.a(this.y, db_0.c(stringArray[2]));
                I_.a(this.y, auk_2.b(stringArray[3]));
                acf_2.c(this.H, db_0.c(stringArray2[0]));
                acf_2.a(this.H, db_0.c(stringArray2[1]));
                acf_2.b(this.H, db_0.c(stringArray2[2]));
                acf_2.a(this.H, auk_2.b(stringArray2[3]));
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
        acf_2.c(this.H);
    }

    private static int lambda$drawGui$3(aq3_0 aq3_02) {
        return (int)a13.g(aq3_02);
    }

    @Override
    public void l() {
        this.j();
        _j_0.a(this.v, 0.4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void i() {
        Object object;
        MathInvoker.b();
        if (this.t.entityRenderer.an != null) {
            ada_2.a(this.t.entityRenderer.an);
            this.t.entityRenderer.an = null;
        }
        JSONObject jSONObject = new JSONObject();
        Object object2 = ListInvoker.iterator(this.B);
        if (dz_0.c((Iterator)object2)) {
            object = (aq3_0)dz_0.b((Iterator)object2);
            aZR.a(jSONObject, a13.b((aq3_0)object).name(), aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), a13.a((aq3_0)object)), aBM.u), a13.g((aq3_0)object)), aBM.m), a13.e((aq3_0)object)), aBM.h), a13.c((aq3_0)object)).toString());
        }
        aZR.a(jSONObject, aBM.f, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), I_.d(this.y)), aBM.j), I_.a(this.y)), aBM.e), I_.b(this.y)), aBM.x), I_.c(this.y)).toString());
        aZR.a(jSONObject, aBM.i, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), acf_2.b(this.H)), aBM.o), acf_2.e(this.H)), aBM.r), acf_2.d(this.H)), aBM.n), acf_2.a(this.H)).toString());
        try {
            object2 = new FileWriter(ah__0.d(da_0.a(aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), aBM.t).toString(), new String[0])));
            object = null;
            try {
                l2.a((FileWriter)object2, (CharSequence)jSONObject.toString());
                return;
            }
            catch (Throwable throwable) {
                object = throwable;
                throw throwable;
            }
            finally {
                try {
                    l2.a((FileWriter)object2);
                }
                catch (Throwable throwable) {
                    aWR.a((Throwable)object, throwable);
                    l2.a((FileWriter)object2);
                }
            }
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
    }

    private static boolean lambda$removeModule$0(AbstractModule abstractModule, r_0 r_02) {
        MathInvoker.c();
        return r_02 != null && ME.c(r_02) == abstractModule;
    }
}

