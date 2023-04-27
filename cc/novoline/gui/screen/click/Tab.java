/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  org.jetbrains.annotations.NotNull
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.gui.screen.click;

import cc.novoline.Novoline;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.visual.ClickGui;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.D4;
import net.DiscordGUI;
import net.FK;
import net.a1V;
import net.a4V;
import net.a7l_0;
import net.aL0;
import net.aMF;
import net.aPc;
import net.aSl;
import net.aap_0;
import net.aen_2;
import net.ahg_0;
import net.akk_0;
import net.auk_2;
import net.dz_0;
import net.ml_0;
import net.uw_0;
import net.wc_1;
import net.we_2;
import net.z4_0;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

public class Tab {
    private EnumModuleType a;
    private boolean f;
    private Novoline c;
    private List<Module> d;
    private int b;
    private int e;

    public boolean b() {
        return this.f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NotNull
    private String a() {
        ml_0.b();
        String string = this.a.name();
        int n = -1;
        switch (string.hashCode()) {
            case 1993470708: {
                if (!string.equals(aap_0.m)) return aap_0.j;
                n = 0;
            }
            case 678949039: {
                if (!string.equals(aap_0.e)) return aap_0.j;
                n = 1;
            }
            case -1932423455: {
                if (!string.equals(aap_0.l)) return aap_0.j;
                n = 2;
            }
            case 1185082643: {
                if (!string.equals(aap_0.h)) return aap_0.j;
                n = 3;
            }
            case 2366700: {
                if (!string.equals(aap_0.b)) return aap_0.j;
                n = 4;
            }
            case -1146279864: {
                if (!string.equals(aap_0.c)) return aap_0.j;
                return aap_0.j;
            }
        }
        return aap_0.j;
    }

    public void a(int n, int n2, int n3) {
        ListInvoker.forEach(this.d, arg_0 -> Tab.lambda$mouseReleased$2(n, n2, n3, arg_0));
    }

    public boolean a(int n, int n2) {
        ml_0.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        return n >= FK.a(discordGUI) + 8 && n <= FK.a(discordGUI) + 35 && n2 >= FK.h(discordGUI) + this.e - 15 && n2 <= FK.h(discordGUI) + this.e + 15;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double[] c() {
        ml_0.a();
        String string = this.a.name();
        int n = -1;
        switch (string.hashCode()) {
            case 1993470708: {
                if (!string.equals(aap_0.p)) return new double[]{(double)FK.a(NovolineInvoker.u(NovolineInvoker.getInstance())) + 22.0, FK.h(NovolineInvoker.u(NovolineInvoker.getInstance())) + this.e - 5};
                n = 0;
            }
            case 678949039: {
                if (!string.equals(aap_0.k)) return new double[]{(double)FK.a(NovolineInvoker.u(NovolineInvoker.getInstance())) + 22.0, FK.h(NovolineInvoker.u(NovolineInvoker.getInstance())) + this.e - 5};
                n = 1;
            }
            case -1932423455: {
                if (!string.equals(aap_0.f)) return new double[]{(double)FK.a(NovolineInvoker.u(NovolineInvoker.getInstance())) + 22.0, FK.h(NovolineInvoker.u(NovolineInvoker.getInstance())) + this.e - 5};
                n = 2;
            }
            case 1185082643: {
                if (!string.equals(aap_0.r)) return new double[]{(double)FK.a(NovolineInvoker.u(NovolineInvoker.getInstance())) + 22.0, FK.h(NovolineInvoker.u(NovolineInvoker.getInstance())) + this.e - 5};
                n = 3;
            }
            case -1146279864: {
                if (!string.equals(aap_0.g)) return new double[]{(double)FK.a(NovolineInvoker.u(NovolineInvoker.getInstance())) + 22.0, FK.h(NovolineInvoker.u(NovolineInvoker.getInstance())) + this.e - 5};
                n = 4;
            }
            case 2366700: {
                if (!string.equals(aap_0.n)) return new double[]{(double)FK.a(NovolineInvoker.u(NovolineInvoker.getInstance())) + 22.0, FK.h(NovolineInvoker.u(NovolineInvoker.getInstance())) + this.e - 5};
                n = 5;
            }
        }
        return new double[]{(double)FK.a(NovolineInvoker.u(NovolineInvoker.getInstance())) + 22.0, FK.h(NovolineInvoker.u(NovolineInvoker.getInstance())) + this.e - 5};
    }

    public void b(int n, int n2) {
        Object object;
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        int n3 = ml_0.b();
        if (this.f && this.c(n, n2)) {
            ml_0 ml_02 = FK.c();
            switch (ml_02) {
                case DOWN: {
                    if (ListInvoker.isEmpty(this.d) || D4.b((Module)ListInvoker.get(this.d, ListInvoker.size(this.d) - 1)) <= FK.g(discordGUI) - 14) break;
                    Iterator iterator = ListInvoker.iterator(this.d);
                    if (dz_0.c(iterator)) {
                        object = (Module)dz_0.b(iterator);
                        D4.a((Module)object, D4.b((Module)object) - 7);
                    }
                }
                case UP: {
                    Iterator iterator;
                    if (D4.b((Module)ListInvoker.get(this.d, 0)) >= 30 || !dz_0.c(iterator = ListInvoker.iterator(this.d))) break;
                    object = (Module)dz_0.b(iterator);
                    D4.a((Module)object, D4.b((Module)object) + 7);
                }
            }
        }
        int n4 = FK.a(discordGUI);
        int n5 = FK.h(discordGUI);
        object = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        int n6 = z4_0.p((ClickGui)object);
        if (this.a(n, n2)) {
            if (this.f) {
                a1V.c(n4, n5 + this.e - this.b, n4 + 2, n5 + this.e + this.b, -1);
            }
            a1V.c(n4, n5 + this.e - 5, n4 + 2, n5 + this.e + 5, -1);
            a1V.a((float)(n4 - a7l_0.a(aPc.a, aL0.a(aL0.a(new StringBuilder(), StringInvoker.a(StringInvoker.b(this.a.name(), 0, 1))), StringInvoker.i(StringInvoker.a(this.a.name(), 1))).toString()) - 12), (float)(n5 + this.e - 6), (float)(a7l_0.a(aPc.a, aL0.a(aL0.a(new StringBuilder(), StringInvoker.a(StringInvoker.b(this.a.name(), 0, 1))), StringInvoker.i(StringInvoker.a(this.a.name(), 1))).toString()) + 7), 11.0f, 5.0f, -13684945);
            a7l_0.a(aPc.a, (CharSequence)aL0.a(aL0.a(new StringBuilder(), StringInvoker.a(StringInvoker.b(this.a.name(), 0, 1))), StringInvoker.i(StringInvoker.a(this.a.name(), 1))).toString(), n4 - a7l_0.a(aPc.a, aL0.a(aL0.a(new StringBuilder(), StringInvoker.a(StringInvoker.b(this.a.name(), 0, 1))), StringInvoker.i(StringInvoker.a(this.a.name(), 1))).toString()) - 9, n5 + this.e - 3, -1);
        }
        if (this.f) {
            a1V.c(n4, n5 + this.e - this.b, n4 + 2, n5 + this.e + this.b, -1);
        }
        if (this.f && this.b <= 10) {
            ++this.b;
        }
        if (!this.f) {
            this.b = 5;
        }
        a1V.a(n4 + 22, n5 + this.e, 15.0f, -13223617);
        a7l_0.a(aSl.a, (CharSequence)this.a(), (float)this.c()[0], (float)this.c()[1], this.a(n, n2) ? n6 : -1, false);
        if (this.f) {
            a7l_0.a(a4V.a, (CharSequence)this.a(), n4 + (this.a().equals(aap_0.d) ? 49 : 50), n5 + 7, -1025);
            a7l_0.a(we_2.a, (CharSequence)aL0.a(aL0.a(new StringBuilder(), StringInvoker.a(StringInvoker.b(this.a.name(), 0, 1))), StringInvoker.i(StringInvoker.a(this.a.name(), 1))).toString(), n4 + 63, n5 + 7, -1025);
            GL11.glPushMatrix();
            GL11.glScissor((int)0, (int)(FK.c(discordGUI) - FK.h(discordGUI) * 2 - FK.g(discordGUI) * 2), (int)1920, (int)(FK.g(discordGUI) * 2 - 42));
            GL11.glEnable((int)3089);
            aMF.a(aMF.a(ListInvoker.stream(this.d), Tab::lambda$drawScreen$0), arg_0 -> Tab.lambda$drawScreen$1(n, n2, arg_0));
            Iterator iterator = ListInvoker.iterator(this.d);
            if (dz_0.c(iterator)) {
                Module module = (Module)dz_0.b(iterator);
                module.a(n, n2);
            }
            GL11.glDisable((int)3089);
            GL11.glPopMatrix();
        }
        if (ListInvoker.b() != null) {
            ml_0.b(++n3);
        }
    }

    private static int lambda$drawScreen$0(Module module, Module module2) {
        return auk_2.a(module.e(), module2.e());
    }

    private static void lambda$drawScreen$1(int n, int n2, Module module) {
        module.c(n, n2);
    }

    private boolean d() {
        return aMF.c(ListInvoker.stream(this.d), Module::e);
    }

    private static void lambda$mouseReleased$2(int n, int n2, int n3, Module module) {
        module.b(n, n2, n3);
    }

    public void a(boolean bl) {
        Iterator iterator;
        ml_0.b();
        this.f = bl;
        if (!this.f && dz_0.c(iterator = ListInvoker.iterator(ManagerInvoker.a()))) {
            Setting setting = (Setting)dz_0.b(iterator);
            switch (ahg_0.v(setting)) {
                case COMBOBOX: 
                case SELECTBOX: {
                    ahg_0.b(setting, false);
                }
                case TEXTBOX: {
                    ahg_0.c(setting, false);
                }
            }
        }
    }

    protected void a(char c, int n) {
        ml_0.a();
        Iterator iterator = ListInvoker.iterator(this.d);
        if (dz_0.c(iterator)) {
            Module module = (Module)dz_0.b(iterator);
            module.a(c, n);
        }
    }

    public List<Module> e() {
        return this.d;
    }

    public Tab(@NotNull Novoline novoline, @NotNull EnumModuleType enumModuleType, int n) {
        ModuleHolder moduleHolder;
        AbstractModule abstractModule;
        ml_0.a();
        this.d = new CopyOnWriteArrayList<Module>();
        this.b = 5;
        this.c = novoline;
        this.a = enumModuleType;
        this.e = n;
        int n2 = 30;
        ObjectIterator objectIterator = uw_0.b(aen_2.c(NovolineInvoker.l(this.c)).values());
        if (dz_0.c((Iterator)objectIterator) && wc_1.d(abstractModule = akk_0.b(moduleHolder = (ModuleHolder)dz_0.b((Iterator)objectIterator))).equals((Object)this.a)) {
            ListInvoker.add(this.d, new Module(abstractModule, n2));
            n2 += 18;
        }
    }

    private boolean c(int n, int n2) {
        ml_0.a();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        return n >= FK.a(discordGUI) + 45 && n <= FK.a(discordGUI) + 45 + 110 && n2 >= FK.h(discordGUI) + 22 && n2 <= FK.h(discordGUI) + 300;
    }

    protected void b(int n, int n2, int n3) {
        Module module;
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        ml_0.b();
        Iterator iterator = ListInvoker.iterator(this.d);
        if (dz_0.c(iterator)) {
            module = (Module)dz_0.b(iterator);
            module.a(n, n2, n3);
        }
        switch (n3) {
            case 0: {
                iterator = ListInvoker.iterator(this.d);
                if (dz_0.c(iterator) && (module = (Module)dz_0.b(iterator)).b(n, n2) && n2 >= FK.h(discordGUI) + 20 && n2 <= FK.h(discordGUI) + FK.g(discordGUI)) {
                    wc_1.k(D4.a(module));
                }
            }
            case 1: {
                Module module2;
                iterator = ListInvoker.iterator(this.d);
                if (!dz_0.c(iterator) || !(module = (Module)dz_0.b(iterator)).b(n, n2) || n2 < FK.h(discordGUI) + 20 || n2 > FK.h(discordGUI) + FK.g(discordGUI)) break;
                Iterator iterator2 = ListInvoker.iterator(this.d);
                if (dz_0.c(iterator2) && !(module2 = (Module)dz_0.b(iterator2)).equals(module)) {
                    module2.a(false);
                }
                module.a(!module.e());
            }
        }
    }
}

