/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Map;
import net.minecraft.block.Block;

/*
 * Renamed from net.aWa
 */
public class awa_0 {
    private static String[] b;

    static {
        if (awa_0.b() != null) {
            awa_0.b(new String[1]);
        }
    }

    public static Map a(df_0 df_02) {
        return df_02.a();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }

    public static void a(df_0 df_02, Block block, acf_0 acf_02) {
        df_02.a(block, acf_02);
    }
}

