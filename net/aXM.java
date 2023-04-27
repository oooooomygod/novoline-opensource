/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystemLogger
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import net.TO;
import net.aL0;
import net.amq_2;
import paulscode.sound.SoundSystemLogger;

class aXM
extends SoundSystemLogger {
    TO a;

    public void message(String string, int n) {
        if (!StringInvoker.g(string)) {
            LoggerInvoker.info(TO.h(), string);
        }
    }

    aXM(TO tO) {
        this.a = tO;
    }

    public void errorMessage(String string, String string2, int n) {
        if (!StringInvoker.g(string2)) {
            LoggerInvoker.f(TO.h(), aL0.a(aL0.a(aL0.a(new StringBuilder(), amq_2.a), string), amq_2.b).toString());
            LoggerInvoker.f(TO.h(), string2);
        }
    }

    public void importantMessage(String string, int n) {
        if (!StringInvoker.g(string)) {
            LoggerInvoker.warn(TO.h(), string);
        }
    }
}

