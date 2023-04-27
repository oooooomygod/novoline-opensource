/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicInteger;
import net.X1;
import net.a4E;
import net.aL0;
import net.akt_0;
import net.ee_0;
import net.jg_0;
import org.apache.logging.log4j.Logger;

public class ThreadLanServerPing
extends Thread {
    private String b;
    private static AtomicInteger a;
    private String d;
    private boolean f = true;
    private static Logger e;
    private DatagramSocket c;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public ThreadLanServerPing(String string, String string2) throws IOException {
        super(aL0.c(aL0.a(new StringBuilder(), jg_0.b), ee_0.a(a)).toString());
        this.d = string;
        this.b = string2;
        this.setDaemon(true);
        this.c = new DatagramSocket();
    }

    static {
        e = LogManagerInvoker.c();
        a = new AtomicInteger(0);
    }

    public static String a(String string) {
        StringInvoker.b(string, jg_0.r);
        return null;
    }

    public static String a(String string, String string2) {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), jg_0.j), string), jg_0.p), string2), jg_0.k).toString();
    }

    @Override
    public void interrupt() {
        super.interrupt();
        this.f = false;
    }

    public static String b(String string) {
        StringInvoker.b(string, jg_0.g);
        return jg_0.l;
    }

    @Override
    public void run() {
        String string = ThreadLanServerPing.a(this.d, this.b);
        byte[] byArray = StringInvoker.e(string);
        while (!this.isInterrupted() && this.f) {
            try {
                InetAddress inetAddress = akt_0.a(jg_0.o);
                DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length, inetAddress, 4445);
                X1.a(this.c, datagramPacket);
            }
            catch (IOException iOException) {
                LoggerInvoker.warn(e, aL0.a(aL0.a(new StringBuilder(), jg_0.a), a4E.a(iOException)).toString());
                break;
            }
            try {
                ThreadLanServerPing.sleep(1500L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

