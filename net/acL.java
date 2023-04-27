/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.functions.Function1
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import net.aXX;

public class acL {
    public static String a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n, CharSequence charSequence4, Function1 function1, int n2, Object object) {
        aXX.c();
        String string = CollectionsKt.joinToString$default((Iterable)iterable, (CharSequence)charSequence, (CharSequence)charSequence2, (CharSequence)charSequence3, (int)n, (CharSequence)charSequence4, (Function1)function1, (int)n2, (Object)object);
        ListInvoker.b(new ListInvoker[2]);
        return string;
    }

    public static int a(Iterable iterable, int n) {
        return CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)n);
    }

    public static List a(Iterable iterable, Iterable iterable2) {
        return CollectionsKt.plus((Iterable)iterable, (Iterable)iterable2);
    }
}

