/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.text.Charsets
 *  org.jetbrains.annotations.NotNull
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.text.Charsets;
import net.anu_2;
import net.apn_1;
import net.po_0;
import net.skidunion.S;
import net.zx_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.net.skidunion.l
 */
@Metadata(mv={1, 1, 16}, bv={1, 0, 3}, k=2, d1={"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"}, d2={"a", "Ljava/util/Base64$Decoder;", "a", "", "client"})
public class l_0 {
    private static Base64.Decoder a;

    static {
        Base64.Decoder decoder = anu_2.a();
        zx_2.a((Object)decoder, po_0.b);
        a = decoder;
    }

    @NotNull
    public static String a(@NotNull String string) {
        S.b();
        zx_2.b(string, po_0.c);
        byte[] byArray = apn_1.a(a, string);
        zx_2.a((Object)byArray, po_0.a);
        byte[] byArray2 = byArray;
        String string2 = new String(byArray2, Charsets.UTF_8);
        ListInvoker.b(new ListInvoker[2]);
        return string2;
    }
}

