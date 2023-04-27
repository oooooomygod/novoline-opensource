/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.aL0;
import net.ajl_0;
import net.anw_0;
import net.ao5_0;
import net.aou_1;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aoa
 */
public class aoa_1
extends ao5_0 {
    @NotNull
    private String h;
    @NotNull
    private String g;

    static String a(aoa_1 aoa_12) {
        return aoa_12.g;
    }

    private aoa_1(@NotNull String string, @NotNull String string2) {
        aou_1.c();
        super(ajl_0.c, anw_0.GRAY);
        this.g = string;
        this.h = string2;
        this.a(this.g, anw_0.GREEN);
        this.a(ajl_0.a, anw_0.GRAY);
        this.a(aL0.a(aL0.a(new StringBuilder(), this.h), StringInvoker.c(this.h, ajl_0.b) ? ajl_0.e : ajl_0.d).toString(), anw_0.RESET);
    }

    @Override
    @NotNull
    public aoa_1 a(@NotNull String string) {
        return new aoa_1(string, this.h);
    }

    @NotNull
    public static aoa_1 a(@NotNull String string, @NotNull String string2) {
        return new aoa_1(string, string2);
    }
}

