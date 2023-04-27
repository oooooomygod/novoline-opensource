/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 */
package net;

import java.util.List;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

/*
 * Renamed from net.uC
 */
public class uc_1 {
    public static boolean a(OptionSet optionSet, OptionSpec optionSpec) {
        return optionSet.has(optionSpec);
    }

    public static Object c(OptionSet optionSet, OptionSpec optionSpec) {
        return optionSet.valueOf(optionSpec);
    }

    public static boolean a(OptionSet optionSet, String string) {
        return optionSet.has(string);
    }

    public static List b(OptionSet optionSet, OptionSpec optionSpec) {
        return optionSet.valuesOf(optionSpec);
    }
}

