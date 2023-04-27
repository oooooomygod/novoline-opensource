/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.aL0;
import net.ag4_0;
import net.agv_0;
import net.aw__0;

public class ResourceLocation {
    protected String b;
    protected String a;

    protected ResourceLocation(int n, String ... stringArray) {
        this.a = aw__0.b((CharSequence)stringArray[0]) ? agv_0.a : StringInvoker.i(stringArray[0]);
        this.b = stringArray[1];
        ag4_0.a(this.b);
    }

    public ResourceLocation(String string) {
        this(0, ResourceLocation.a(string));
    }

    protected static String[] a(String string) {
        String[] stringArray = new String[]{null, string};
        int n = StringInvoker.d(string, 58);
        stringArray[1] = StringInvoker.a(string, n + 1);
        if (n > 1) {
            stringArray[0] = StringInvoker.b(string, 0, n);
        }
        return stringArray;
    }

    public ResourceLocation(String string, String string2) {
        this(0, string, string2);
    }

    public String b() {
        return this.a;
    }

    public String a() {
        return this.b;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ResourceLocation)) {
            return false;
        }
        ResourceLocation resourceLocation = (ResourceLocation)object;
        return this.a.equals(resourceLocation.a) && this.b.equals(resourceLocation.b);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), this.a), ':'), this.b).toString();
    }
}

