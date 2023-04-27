/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.DisplayMode
 */
package net;

import java.util.Comparator;
import net.aP2;
import net.aSN;
import org.lwjgl.opengl.DisplayMode;

/*
 * Renamed from net.ka
 */
public class ka_2
implements Comparator {
    public int compare(Object object, Object object2) {
        aP2.b();
        DisplayMode displayMode = (DisplayMode)object;
        DisplayMode displayMode2 = (DisplayMode)object2;
        return aSN.c(displayMode) != aSN.c(displayMode2) ? aSN.c(displayMode) - aSN.c(displayMode2) : (aSN.b(displayMode) != aSN.b(displayMode2) ? aSN.b(displayMode) - aSN.b(displayMode2) : (aSN.a(displayMode) != aSN.a(displayMode2) ? aSN.a(displayMode) - aSN.a(displayMode2) : (aSN.d(displayMode) != aSN.d(displayMode2) ? aSN.d(displayMode) - aSN.d(displayMode2) : 0)));
    }
}

