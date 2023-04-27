/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 */
package net;

import joptsimple.OptionSet;
import joptsimple.OptionSpec;

public class aKB {
    private static String b;

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    public static Object a(OptionSpec optionSpec, OptionSet optionSet) {
        return optionSpec.value(optionSet);
    }

    static {
        if (aKB.b() != null) {
            aKB.b("nn1Mnc");
        }
    }
}

