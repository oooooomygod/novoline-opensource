/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events;

import cc.novoline.invoke.ListInvoker;
import net.jc_0;

public class State
extends Enum<State> {
    public static /* enum */ State INCOMING = new State();
    private static ListInvoker[] b;
    private static State[] c;
    public static /* enum */ State OUTGOING;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static State valueOf(String string) {
        return (State)jc_0.a(State.class, string);
    }

    public static State[] values() {
        return (State[])c.clone();
    }

    static {
        State.b(new ListInvoker[1]);
        OUTGOING = new State();
        c = new State[]{INCOMING, OUTGOING};
    }
}

