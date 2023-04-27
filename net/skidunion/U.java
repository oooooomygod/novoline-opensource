/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import java.util.Map;
import java.util.function.Predicate;
import kotlin.Metadata;
import net.FG;
import net.alh_1;
import net.skidunion.Y;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=3, d1={"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n\u00a2\u0006\u0002\b\u0006"}, d2={"<anonymous>", "", "entry", "", "", "Lnet/net.skidunion/Y;", "test"})
class U<T>
implements Predicate<Map.Entry<String, Y>> {
    String a;

    U(String string) {
        this.a = string;
    }

    public boolean a(@NotNull Map.Entry<String, Y> entry) {
        zx_2.b(entry, alh_1.a);
        return zx_2.a((Object)this.a, (Object)((String)FG.b(entry)));
    }
}

