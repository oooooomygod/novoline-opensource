/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 *  org.jetbrains.annotations.NotNull
 */
package deobf;

import cc.novoline.modules.AbstractModule;
import com.google.common.reflect.TypeToken;
import net.aL0;
import net.ake_0;
import net.azd_1;
import org.jetbrains.annotations.NotNull;

public abstract class ModuleHolder<Module extends AbstractModule>
implements Cloneable {
    private static int b;
    protected String c;
    protected TypeToken<Module> d;
    protected Module e;

    public static int a() {
        ModuleHolder.e();
        return 87;
    }

    public static void b(int n) {
        b = n;
    }

    @NotNull
    public TypeToken<Module> d() {
        ModuleHolder.a();
        return this.d != null ? this.d : (this.d = ake_0.a(this.e.getClass()));
    }

    static {
        if (ModuleHolder.a() == 0) {
            ModuleHolder.b(118);
        }
    }

    public static int e() {
        return b;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), azd_1.b), this.c), '\''), azd_1.a), this.e), '}').toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @NotNull
    public String b() {
        return this.c;
    }

    @NotNull
    public Module c() {
        return this.e;
    }

    public ModuleHolder(@NotNull String string, @NotNull Module Module2) {
        this.c = string;
        this.e = Module2;
    }
}

