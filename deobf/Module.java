/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package deobf;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.visual.ClickGui;

import java.util.Iterator;
import java.util.List;
import net.AX;
import net.DiscordGUI;
import net.FK;
import net.Fu;
import net.G1;
import net.JM;
import net.MathHelper;
import net.a1V;
import net.a7l_0;
import net.aL0;
import net.aMF;
import net.ad4_0;
import net.aen_2;
import net.ahg_0;
import net.alk_2;
import net.ast_0;
import net.auk_2;
import net.aw__0;
import net.dz_0;
import net.ml_0;
import net.wc_1;
import net.we_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class Module {
    private @NonNull AbstractModule b;
    private boolean d;
    private int a;
    private boolean c;

    public int b() {
        return this.a;
    }

    private boolean lambda$mouseReleased$4(Setting setting) {
        ml_0.a();
        return ahg_0.C(setting).equals(this.b) && setting.I();
    }

    protected void a(int n, int n2, int n3) {
        Object object;
        Object object2;
        ml_0.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        if (n2 >= FK.h(discordGUI) + 20 && n2 <= FK.h(discordGUI) + FK.g(discordGUI) && this.b(n, n2) && n3 == 2) {
            object2 = FK.e(NovolineInvoker.u(NovolineInvoker.getInstance()));
            if (object2 == null) {
                return;
            }
            object = ListInvoker.iterator(alk_2.a((Tab)object2));
            if (dz_0.c((Iterator)object)) {
                Module module = (Module)dz_0.b((Iterator)object);
                if (module.d) {
                    module.d = false;
                }
            }
            this.d = true;
        }
        if (this.c && dz_0.c((Iterator)(object2 = ListInvoker.iterator(ManagerInvoker.a())))) {
            object = (Setting)dz_0.b((Iterator)object2);
            if (n2 >= FK.h(discordGUI) + 20 && n2 <= FK.h(discordGUI) + FK.g(discordGUI) && this.b.equals(ahg_0.C((Setting)object)) && ahg_0.a((Setting)object, n, n2, n3)) {
                return;
            }
        }
    }

    public boolean c() {
        return this.d;
    }

    public @NonNull AbstractModule d() {
        return this.b;
    }

    public void c(int n, int n2) {
        block8: {
            int n3;
            int n4;
            DiscordGUI discordGUI;
            block9: {
                ml_0.a();
                discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
                ClickGui cfr_ignored_0 = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
                n4 = FK.a(discordGUI);
                n3 = FK.h(discordGUI);
                if (this.b(n, n2) || this.c) {
                    a1V.c(n4 + 45, n3 + this.a - 4, n4 + 45 + 110, n3 + this.a + a7l_0.a(we_2.a) + 4 > n3 + FK.g(discordGUI) ? MathHelper.b(n3 + this.a + a7l_0.a(we_2.a) + 4, n3 + this.a - 4, n3 + FK.g(discordGUI)) : (float)(n3 + this.a + a7l_0.a(we_2.a) + 4), -13223618);
                }
                a7l_0.a(ad4_0.a, (CharSequence)Fu.d, n4 + 50, n3 + this.a - 2, -10461856);
                if (wc_1.g(this.b)) {
                    a7l_0.a(we_2.a, (CharSequence)wc_1.a(this.b), n4 + 63, n3 + this.a, -1843229);
                }
                a7l_0.a(we_2.a, (CharSequence)wc_1.a(this.b), n4 + 63, n3 + this.a, -7961722);
                Tab tab = FK.e(discordGUI);
                if (!this.b(n, n2)) break block8;
                if (tab == null) break block9;
                if (!aMF.a(ListInvoker.stream(alk_2.a(tab)), Module::c)) break block8;
            }
            if (!aw__0.e(wc_1.b(this.d()))) break block8;
            String string = wc_1.b(this.d());
            try {
                a7l_0.b(G1.a, string, n4 + 147 + FK.b(discordGUI) - a7l_0.a(G1.a, string), n3 - 6, 0xFFFFFF, true);
            }
            catch (NullPointerException nullPointerException) {
                // empty catch block
            }
        }
    }

    public void b(int n, int n2, int n3) {
        if (this.c) {
            aMF.a(aMF.b(ListInvoker.stream(ManagerInvoker.a()), this::lambda$mouseReleased$4), arg_0 -> Module.lambda$mouseReleased$5(n, n2, n3, arg_0));
        }
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public boolean e() {
        return this.c;
    }

    private static void lambda$mouseReleased$5(int n, int n2, int n3, Setting setting) {
        setting.b(n, n2, n3);
    }

    public boolean b(int n, int n2) {
        ml_0.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        int n3 = FK.a(discordGUI);
        int n4 = FK.h(discordGUI);
        return n >= n3 + 45 && n <= n3 + 45 + 110 && n2 >= n4 + this.a - 4 && n2 <= n4 + this.a + a7l_0.a(we_2.a) + 4;
    }

    void a(int n, int n2) {
        Object object;
        Object object2;
        ml_0.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        List list = ManagerInvoker.a(this.b);
        if (this.c) {
            object2 = FK.c();
            if (list != null && !ListInvoker.isEmpty(list)) {
                switch (object2) {
                    case DOWN: {
                        Setting setting;
                        if (((Setting)ListInvoker.get(list, ListInvoker.size(list) - 1)).L() <= FK.h(discordGUI) + FK.g(discordGUI) - 14) break;
                        object = ListInvoker.iterator(list);
                        if (dz_0.c((Iterator)object)) {
                            setting = (Setting)dz_0.b((Iterator)object);
                            ahg_0.b(setting, ahg_0.b(setting) - 5);
                        }
                    }
                    case UP: {
                        if (((Setting)ListInvoker.get(list, 0)).L() >= FK.h(discordGUI) + 30 || !dz_0.c((Iterator)(object = ListInvoker.iterator(list)))) break;
                        Setting setting = (Setting)dz_0.b((Iterator)object);
                        ahg_0.b(setting, ahg_0.b(setting) + 5);
                    }
                }
            }
        }
        if (this.c) {
            a7l_0.a(we_2.a, (CharSequence)aL0.a(aL0.a(new StringBuilder(), wc_1.a(this.b)), Fu.e).toString(), FK.a(discordGUI) + 165, FK.h(discordGUI) + 6, -1);
            if (list == null || ListInvoker.isEmpty(list)) {
                object2 = Fu.b;
                object = MCInvoker.f().fontRendererObj;
                FontRendererInvoker.drawStringWithShadow((FontRenderer)object, Fu.c, (float)(FK.a(discordGUI) + 150) + (float)(FK.b(discordGUI) - FontRendererInvoker.a((FontRenderer)object, Fu.a)) / 2.0f, (float)FK.h(discordGUI) + (float)(FK.g(discordGUI) - FontRendererInvoker.d((FontRenderer)object)) / 2.0f, -9801351);
            }
        }
        GL11.glPushMatrix();
        GL11.glScissor((int)0, (int)(FK.c(discordGUI) - FK.h(discordGUI) * 2 - FK.g(discordGUI) * 2), (int)1920, (int)(FK.g(discordGUI) * 2 - 42));
        GL11.glEnable((int)3089);
        aMF.a(aMF.a(aMF.b(aMF.b(ListInvoker.stream(ManagerInvoker.a()), Module::lambda$drawScreen2$0), this::lambda$drawScreen2$1), Module::lambda$drawScreen2$2), arg_0 -> Module.lambda$drawScreen2$3(n, n2, arg_0));
        GL11.glDisable((int)3089);
        GL11.glPopMatrix();
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public Module(@NonNull AbstractModule abstractModule, int n) {
        this.b = abstractModule;
        this.a = n;
    }

    private static void lambda$drawScreen2$3(int n, int n2, Setting setting) {
        ahg_0.d(setting);
        setting.a(n, n2);
    }

    public void a(int n) {
        this.a = n;
    }

    protected void a(char c, int n) {
        Setting setting;
        Iterator iterator;
        ml_0.a();
        NovolineInvoker.u(NovolineInvoker.getInstance());
        if (this.d) {
            if (n != 1) {
                wc_1.a(this.b, ast_0.a(n));
                AX.b(aen_2.a(NovolineInvoker.l(wc_1.m(this.b))));
            }
            this.d = false;
        }
        if (this.c && dz_0.c(iterator = ListInvoker.iterator(ManagerInvoker.a())) && this.b.equals(ahg_0.C(setting = (Setting)dz_0.b(iterator)))) {
            setting.a(c, n);
        }
    }

    private boolean lambda$drawScreen2$1(Setting setting) {
        ml_0.b();
        return ahg_0.C(setting).equals(this.b) && this.c;
    }

    private static boolean lambda$drawScreen2$0(Setting setting) {
        ml_0.b();
        return ahg_0.B(setting) != null ? auk_2.a((Boolean)JM.a(ahg_0.B(setting))) : true;
    }

    private static int lambda$drawScreen2$2(Setting setting, Setting setting2) {
        return auk_2.a(ahg_0.m(setting), ahg_0.m(setting2));
    }

    public boolean a() {
        ml_0.a();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        int n = FK.h(discordGUI);
        return n + this.a <= n + FK.g(discordGUI) - 9 && n + this.a >= n + 23;
    }
}

