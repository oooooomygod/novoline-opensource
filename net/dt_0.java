/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import net.DY;
import net.Wu;
import net.aB7;
import net.aL0;
import net.akt_0;
import net.anx_1;
import net.arm_1;
import net.ee_0;
import net.yo_0;

/*
 * Renamed from net.Dt
 */
public class dt_0
extends Thread {
    private MulticastSocket a;
    private InetAddress b;
    private Wu c;

    @Override
    public void run() {
        byte[] byArray = new byte[1024];
        while (!this.isInterrupted()) {
            String string;
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            try {
                aB7.a(this.a, datagramPacket);
                string = new String(anx_1.b(datagramPacket), anx_1.c(datagramPacket), anx_1.a(datagramPacket));
            }
            catch (SocketTimeoutException socketTimeoutException) {
                continue;
            }
            catch (IOException iOException) {
                LoggerInvoker.a(yo_0.a(), DY.c, iOException);
                break;
            }
            LoggerInvoker.b(yo_0.a(), aL0.a(aL0.a(aL0.a(new StringBuilder(), anx_1.d(datagramPacket)), DY.d), string).toString());
            arm_1.a(this.c, string, anx_1.d(datagramPacket));
        }
        try {
            aB7.a(this.a, this.b);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        aB7.a(this.a);
    }

    public dt_0(Wu wu) throws IOException {
        super(aL0.c(aL0.a(new StringBuilder(), DY.b), ee_0.a(yo_0.b())).toString());
        this.c = wu;
        this.setDaemon(true);
        this.a = new MulticastSocket(4445);
        this.b = akt_0.a(DY.a);
        aB7.a(this.a, 5000);
        aB7.b(this.a, this.b);
    }
}

