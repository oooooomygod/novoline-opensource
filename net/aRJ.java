/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.ResourceLocation;
import net.aL0;
import net.aef_2;
import net.aw__0;

public class aRJ
extends ResourceLocation {
    private String c;

    @Override
    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), super.toString()), '#'), this.c).toString();
    }

    protected static String[] b(String string) {
        String[] stringArray = new String[]{null, string, null};
        int n = StringInvoker.d(string, 35);
        String string2 = string;
        stringArray[2] = StringInvoker.b(string, n + 1, StringInvoker.c(string));
        if (n > 1) {
            string2 = StringInvoker.b(string, 0, n);
        }
        SystemInvoker.a(ResourceLocation.a(string2), 0, stringArray, 0, 2);
        return stringArray;
    }

    public aRJ(String string) {
        this(0, aRJ.b(string));
    }

    protected aRJ(int n, String ... stringArray) {
        super(0, stringArray[0], stringArray[1]);
        this.c = aw__0.b((CharSequence)stringArray[2]) ? aef_2.b : StringInvoker.i(stringArray[2]);
    }

    public String c() {
        return this.c;
    }

    public aRJ(String string, String string2) {
        this(0, aRJ.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), '#'), aef_2.a).toString()));
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.c.hashCode();
    }

    public aRJ(ResourceLocation resourceLocation, String string) {
        this(resourceLocation.toString(), string);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof aRJ && super.equals(object)) {
            aRJ aRJ2 = (aRJ)object;
            return this.c.equals(aRJ2.c);
        }
        return false;
    }
}

