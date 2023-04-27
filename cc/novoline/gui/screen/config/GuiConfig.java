/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package cc.novoline.gui.screen.config;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import java.nio.file.Path;
import net.DiscordGUI;
import net.FK;
import net.a1V;
import net.a7l_0;
import net.aFD;
import net.aHE;
import net.aNY;
import net.ah__0;
import net.asl_0;
import net.avw_1;
import org.jetbrains.annotations.NotNull;

public class GuiConfig {
    private String c;
    private int d = 0;
    private boolean b;
    private int a = 30;

    public void a(boolean bl) {
        this.b = bl;
    }

    public String f() {
        return this.c;
    }

    public void a() {
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        this.d = FK.h(discordGUI) + this.a + ListInvoker.indexOf(FK.f(discordGUI), this) * 20;
    }

    public boolean d() {
        return this.b;
    }

    public void a(int n, int n2) {
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        int n3 = FK.a(discordGUI);
        avw_1.b();
        int n4 = FK.b(discordGUI);
        if (this.b(n, n2)) {
            a1V.c(n3 + 45 + 110, this.d - 6, n3 + 45 + 105 + n4, this.d + a7l_0.a(aFD.a) + 5, -13684426);
        }
        a7l_0.a(aFD.a, (CharSequence)StringInvoker.a(this.c, (CharSequence)aNY.d, (CharSequence)aNY.a), (float)(n3 + 45 + 110) + (float)n4 / 2.0f, this.d, this.b ? -1 : -7961722, false);
        if (ListInvoker.b() != null) {
            avw_1.b(new ListInvoker[5]);
        }
    }

    public boolean c() {
        avw_1.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        int n = FK.h(discordGUI);
        int n2 = n + FK.g(discordGUI);
        return this.d < n + 30 || this.d > n2 - 9;
    }

    @NotNull
    public static GuiConfig a(@NotNull Path path) {
        asl_0.a(path, aNY.c);
        asl_0.a(StringInvoker.c(path.toString(), aHE.c()), aNY.b);
        String string = ah__0.c(path).toString();
        String string2 = StringInvoker.b(string, 0, StringInvoker.c(string) - StringInvoker.c(aHE.c()));
        return new GuiConfig(string2);
    }

    public int e() {
        return this.a;
    }

    public boolean b(int n, int n2) {
        avw_1.b();
        DiscordGUI discordGUI = NovolineInvoker.u(NovolineInvoker.getInstance());
        int n3 = FK.a(discordGUI);
        int n4 = FK.b(discordGUI);
        return n >= n3 + 45 + 110 && n <= n3 + 45 + 110 + n4 && n2 >= this.d - 6 && n2 <= this.d + a7l_0.a(aFD.a) + 5;
    }

    private GuiConfig(@NotNull String string) {
        this.c = string;
    }

    public int b() {
        return this.d;
    }

    public void a(int n) {
        this.a = n;
    }
}

