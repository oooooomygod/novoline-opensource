/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import deobf.MCInvoker;
import javax.script.ScriptEngine;
import net.a9B;
import net.skidunion.annotations;

public class ScriptConnection {
    private ScriptEngine a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @annotations
    public void sendPacket(String string, Object ... objectArray) {
        MCInvoker.f();
        ScriptWorld.b();
        String string2 = string;
        int n = -1;
        switch (string2.hashCode()) {
            case 1546828: {
                if (!string2.equals(a9B.b)) return;
                n = 0;
            }
            case 1546846: {
                if (!string2.equals(a9B.w)) return;
                n = 1;
            }
            case 1546830: {
                if (!string2.equals(a9B.r)) return;
                n = 2;
            }
            case 1546829: {
                if (!string2.equals(a9B.A)) return;
                n = 3;
            }
            case 1546827: {
                if (!string2.equals(a9B.m)) return;
                n = 4;
            }
            case 1546826: {
                if (!string2.equals(a9B.t)) return;
                n = 5;
            }
            case 1546825: {
                if (!string2.equals(a9B.G)) return;
                n = 6;
            }
            case 1546832: {
                if (!string2.equals(a9B.E)) return;
                n = 7;
            }
            case 1546831: {
                if (!string2.equals(a9B.s)) return;
                n = 8;
            }
            case 1546833: {
                if (!string2.equals(a9B.c)) return;
                n = 9;
            }
            case 1546841: {
                if (!string2.equals(a9B.F)) return;
                n = 10;
            }
            case 1546842: {
                if (!string2.equals(a9B.j)) return;
                n = 11;
            }
            case 1546824: {
                if (!string2.equals(a9B.k)) return;
                n = 12;
            }
            case 1546844: {
                if (!string2.equals(a9B.H)) return;
                n = 13;
            }
            case 47951626: {
                if (!string2.equals(a9B.y)) return;
                n = 14;
            }
            case 1546843: {
                if (!string2.equals(a9B.n)) return;
                n = 15;
            }
            case 1546845: {
                if (!string2.equals(a9B.p)) return;
                n = 16;
            }
            case 1546863: {
                if (!string2.equals(a9B.I)) return;
                return;
            }
        }
    }

    public ScriptConnection(ScriptEngine scriptEngine) {
        this.a = scriptEngine;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @annotations
    public void sendPacketNoEvent(String string, Object ... objectArray) {
        ScriptWorld.b();
        MCInvoker.f();
        String string2 = string;
        int n = -1;
        switch (string2.hashCode()) {
            case 1546828: {
                if (!string2.equals(a9B.o)) return;
                n = 0;
            }
            case 1546846: {
                if (!string2.equals(a9B.g)) return;
                n = 1;
            }
            case 1546830: {
                if (!string2.equals(a9B.e)) return;
                n = 2;
            }
            case 1546829: {
                if (!string2.equals(a9B.z)) return;
                n = 3;
            }
            case 1546827: {
                if (!string2.equals(a9B.i)) return;
                n = 4;
            }
            case 1546826: {
                if (!string2.equals(a9B.h)) return;
                n = 5;
            }
            case 1546825: {
                if (!string2.equals(a9B.v)) return;
                n = 6;
            }
            case 1546832: {
                if (!string2.equals(a9B.u)) return;
                n = 7;
            }
            case 1546831: {
                if (!string2.equals(a9B.x)) return;
                n = 8;
            }
            case 1546833: {
                if (!string2.equals(a9B.f)) return;
                n = 9;
            }
            case 1546841: {
                if (!string2.equals(a9B.l)) return;
                n = 10;
            }
            case 1546842: {
                if (!string2.equals(a9B.a)) return;
                n = 11;
            }
            case 1546824: {
                if (!string2.equals(a9B.d)) return;
                n = 12;
            }
            case 1546844: {
                if (!string2.equals(a9B.C)) return;
                n = 13;
            }
            case 47951626: {
                if (!string2.equals(a9B.q)) return;
                n = 14;
            }
            case 1546843: {
                if (!string2.equals(a9B.J)) return;
                n = 15;
            }
            case 1546845: {
                if (!string2.equals(a9B.D)) return;
                n = 16;
            }
            case 1546863: {
                if (!string2.equals(a9B.B)) return;
                return;
            }
        }
    }
}

