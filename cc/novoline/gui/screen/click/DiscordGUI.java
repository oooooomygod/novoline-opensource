/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package cc.novoline.gui.screen.click;

import cc.novoline.Novoline;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.EnumModuleType;
import deobf.FontRenderer;
import deobf.GuiScreen;
import deobf.MCInvoker;
import deobf.Module;
import deobf.SettingType;
import deobf.Tab;
import deobf.TimerUtil;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class DiscordGUI
extends GuiScreen {
    private int y = 63;
    private int z;
    private List<Tab> I;
    private int L;
    private int G;
    private int J;
    private int D;
    private int B = 100;
    private int E;
    private boolean A;
    private Novoline C;
    private int x;
    private boolean H;
    private int w;
    private boolean K;
    private static TimerUtil v = new TimerUtil();
    private List<GuiConfig> F;

    public void k() {
        List list;
        Object object;
        ml_0.a();
        ListInvoker.clear(this.F);
        try {
            object = aHE.c();
            list = (List)aMF.a(aMF.b(aMF.b(aev_1.a(aHE.b(aen_2.b(NovolineInvoker.l(this.C))), new FileVisitOption[0]), DiscordGUI::lambda$initConfigs$3), arg_0 -> DiscordGUI.lambda$initConfigs$4((String)object, arg_0)), aB0.a(ObjectArrayList::new));
        }
        catch (IOException iOException) {
            LoggerInvoker.a(NovolineInvoker.getLogger(), Tr.j, iOException);
            return;
        }
        try {
            object = ListInvoker.iterator(list);
            if (dz_0.c((Iterator)object)) {
                Path path = (Path)dz_0.b((Iterator)object);
                ListInvoker.add(this.F, to_2.a(path));
            }
        }
        catch (Throwable throwable) {
            aWR.c(throwable);
        }
    }

    public int c() {
        return this.E;
    }

    private boolean a(int n, int n2) {
        ml_0.a();
        return n >= this.B && n <= this.B + 45 + 105 + this.G && n2 >= this.L - 7 && n2 <= this.L + 20;
    }

    private static void lambda$mouseReleased$1(int n, int n2, int n3, Tab tab) {
        tab.a(n, n2, n3);
    }

    private static boolean lambda$initConfigs$4(String string, Path path) {
        return StringInvoker.c(ah__0.c(path).toString(), string);
    }

    private static void lambda$drawScreen$0(int n, int n2, Tab tab) {
        alk_2.a(tab, n, n2);
    }

    @Override
    protected void a(char c, int n) {
        block5: {
            Tab tab;
            block4: {
                ml_0.a();
                tab = this.l();
                if (n != 1 || tab != null && !aMF.a(ListInvoker.stream(alk_2.a(tab)), Module::c) || !aMF.a(ListInvoker.stream(ManagerInvoker.a()), DiscordGUI::lambda$keyTyped$2)) break block4;
                if (avw_1.a) break block5;
                MCInvoker.displayGuiScreen(this.t, null);
                if (this.t.currentScreen != null) break block5;
                MCInvoker.r(this.t);
            }
            if (tab != null) {
                tab.a(c, n);
            }
            avw_1.a(c, n);
        }
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        Tab tab;
        ml_0.b();
        Object object = ListInvoker.iterator(this.I);
        if (dz_0.c((Iterator)object) && (tab = (Tab)dz_0.b((Iterator)object)).a(n, n2)) {
            Iterator iterator = ListInvoker.iterator(this.I);
            if (dz_0.c(iterator)) {
                Tab tab2 = (Tab)dz_0.b(iterator);
                alk_2.a(tab2, false);
            }
            alk_2.a(tab, true);
            this.A = false;
        }
        if (this.a(n, n2)) {
            this.w = this.B - n;
            this.D = this.L - n2;
            this.K = true;
        }
        if (this.b(n, n2)) {
            this.x = this.G - n;
            this.J = this.E - n2;
            this.H = true;
        }
        if (avw_1.a(n, n2)) {
            if (!this.A) {
                this.k();
            }
            if (dz_0.c((Iterator)(object = ListInvoker.iterator(this.I)))) {
                tab = (Tab)dz_0.b((Iterator)object);
                alk_2.a(tab, false);
            }
            this.A = true;
        }
        if ((object = this.l()) != null) {
            ((Tab)object).b(n, n2, n3);
        }
        if (this.c(n, n2)) {
            try {
                als_2.a(als_2.a(), Tr.n);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (this.A) {
            avw_1.a(n, n2, n3);
        }
        super.b(n, n2, n3);
    }

    public int d() {
        return this.f * 2;
    }

    @Override
    public void a(int n, int n2, float f) {
        ml_0.b();
        if (this.K) {
            this.B = this.w + n;
            this.L = this.D + n2;
        }
        if (this.H) {
            if (this.x + n > 190) {
                this.G = this.x + n;
            }
            if (this.J + n2 > 300) {
                this.E = this.J + n2;
            }
        }
        boolean bl = false;
        a1V.a((float)this.B, (float)(this.L - 10), (float)(150 + this.G), (float)(this.L + 5), 8.0f, -14671323);
        a1V.a((float)this.B, (float)this.L, 49.0f, (float)this.E, 9.0f, -14671323);
        ListInvoker.b(new ListInvoker[2]);
        this.a(this.B, this.L, this.B + 10, this.L + 4, -14671323);
        a1V.a((float)(this.B + 45 + 105), (float)this.L, (float)this.G, (float)this.E, 4.0f, -13223618);
        a1V.a((float)(this.B + 7), (float)(this.L + 40), 31.0f, 3.0f, 0.0f, -13684426);
        this.a(this.B + 44, this.L, this.B + 45 + 110, this.L + this.E, -13684426);
        this.a(this.B + 44, this.L + 20, this.B + 45 + 105 + this.G, this.L + 21, -14671323);
        if (!this.b() && !this.A) {
            FontRenderer fontRenderer = this.t.fontRendererObj;
            FontRendererInvoker.drawStringWithShadow(fontRenderer, Tr.a, this.B + 59, this.L + 65, -9801351);
            FontRendererInvoker.drawStringWithShadow(fontRenderer, Tr.p, this.B + 67, this.L + 75, -9801351);
            FontRendererInvoker.drawStringWithShadow(fontRenderer, Tr.g, this.B + 85, this.L + 85, -9801351);
            FontRendererInvoker.drawStringWithShadow(fontRenderer, Tr.q, this.B + 59, this.L + 95, -9801351);
            FontRendererInvoker.drawStringWithShadow(fontRenderer, Tr.c, this.B + 54, this.L + 105, -9801351);
            FontRendererInvoker.drawStringWithShadow(fontRenderer, Tr.l, this.B + 70, this.L + 117, -9801351);
            FontRendererInvoker.drawStringWithShadow(fontRenderer, Tr.e, this.B + 64, this.L + 7, -9801351);
            FontRendererInvoker.drawStringWithShadow(fontRenderer, aL0.a(aL0.a(new StringBuilder(), Tr.f), NovolineInvoker.getVersion(this.C)).toString(), (float)(this.B + 45 + 105) + ((float)this.G / 2.0f - (float)FontRendererInvoker.a(fontRenderer, Tr.i) / 2.0f), this.L + 7, -9801351);
        }
        ListInvoker.forEach(this.I, arg_0 -> DiscordGUI.lambda$drawScreen$0(n, n2, arg_0));
        ars_2.a(n, n2);
        a1V.a(this.B + 22, this.L + 20, 15.0f, -13223617);
        a7l_0.a(aSl.a, (CharSequence)Tr.o, this.B + 14, this.L + 14, -1);
        if (this.c(n, n2)) {
            a1V.a((float)(this.B - a7l_0.a(aPc.a, Tr.d) - 12), (float)(this.L + 14), (float)(a7l_0.a(aPc.a, Tr.k) + 7), 10.0f, 5.0f, -13684945);
            a7l_0.a(aPc.a, (CharSequence)Tr.r, this.B - a7l_0.a(aPc.a, Tr.b) - 10, this.L + 16, -1);
        }
        super.a(n, n2, f);
    }

    public int f() {
        return this.G;
    }

    public int a() {
        return this.B;
    }

    private boolean b() {
        return aMF.c(ListInvoker.stream(this.I), Tab::b);
    }

    public DiscordGUI(@NotNull Novoline novoline) {
        ml_0.a();
        this.L = 100;
        this.G = 190;
        this.E = 300;
        this.I = new ObjectArrayList();
        this.F = new CopyOnWriteArrayList<GuiConfig>();
        this.C = novoline;
        EnumModuleType[] enumModuleTypeArray = EnumModuleType.values();
        int n = enumModuleTypeArray.length;
        int n2 = 0;
        if (n2 < n) {
            EnumModuleType enumModuleType = enumModuleTypeArray[n2];
            ListInvoker.add(this.I, new Tab(this.C, enumModuleType, this.y));
            this.y += 35;
            ++n2;
        }
    }

    private static boolean lambda$initConfigs$3(Path path) {
        return aev_1.a(path, new LinkOption[0]);
    }

    @Override
    public void i() {
        ml_0.b();
        Iterator iterator = ListInvoker.iterator(ManagerInvoker.a());
        if (dz_0.c(iterator)) {
            Setting setting = (Setting)dz_0.b(iterator);
            switch (a78.a[ahg_0.v(setting).ordinal()]) {
                case 1: {
                    ahg_0.a(setting, false);
                }
                case 2: 
                case 3: {
                    ahg_0.b(setting, false);
                }
                case 4: {
                    ahg_0.c(setting, false);
                }
            }
        }
    }

    @Override
    public void a(int n, int n2, int n3) {
        ml_0.a();
        this.K = false;
        this.H = false;
        oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.I), Tab::b)), arg_0 -> DiscordGUI.lambda$mouseReleased$1(n, n2, n3, arg_0));
    }

    @Override
    public void l() {
        super.l();
    }

    private boolean c(int n, int n2) {
        ml_0.a();
        return n >= this.B + 7 && n <= this.B + 37 && n2 >= this.L + 5 && n2 <= this.L + 35;
    }

    private boolean b(int n, int n2) {
        ml_0.a();
        return n >= this.B + 45 + 105 + this.G - 5 && n <= this.B + 45 + 105 + this.G && n2 >= this.L + this.E - 5 && n2 <= this.L + this.E;
    }

    @Nullable
    public static ml_0 i() {
        ml_0.a();
        int n = MouseInvoker.m();
        if (n > 0) {
            return ml_0.UP;
        }
        if (n < 0) {
            return ml_0.DOWN;
        }
        return null;
    }

    public int j() {
        return this.n * 2;
    }

    public boolean h() {
        return this.A;
    }

    public int e() {
        return this.L;
    }

    @Nullable
    public Tab l() {
        return (Tab)oc_1.a(aMF.d(aMF.b(ListInvoker.stream(this.I), Tab::b)), null);
    }

    @NotNull
    public List<GuiConfig> g() {
        return this.F;
    }

    private static boolean lambda$keyTyped$2(Setting setting) {
        ml_0.a();
        return (ahg_0.v(setting) == SettingType.SELECTBOX || ahg_0.v(setting) == SettingType.COMBOBOX) && ahg_0.m(setting) || ahg_0.v(setting) == SettingType.TEXTBOX && ahg_0.e(setting);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

