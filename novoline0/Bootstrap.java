/*
 * Decompiled with CFR 0.152.
 */
package novoline0;

import net.Main;
import novoline0.NativeLoader;

public class Bootstrap {
    public static native void registerNativesForClass(int var0);

    public static void main(String[] stringArray) {
        NativeLoader.loadLibraryFromJar("/natives/novo-native.dll");
        Main.main(stringArray);
    }
}

