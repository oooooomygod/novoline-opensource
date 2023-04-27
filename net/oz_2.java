/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import net.JJ;
import net.a2D;
import net.aFH;
import net.aL0;
import net.ara_2;
import net.ea_1;
import net.sl_1;
import net.td_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.oz
 */
public class oz_2
implements td_0 {
    private static boolean b;
    private Clip a;

    @Override
    public void c() {
        JJ.a(this.a);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    @Override
    public void a() {
        JJ.a(this.a, 0);
        oz_2.b();
        JJ.a(this.a, 0L);
        this.a.stop();
        if (ListInvoker.b() != null) {
            oz_2.b(false);
        }
    }

    @Override
    public void a(String string) throws Throwable {
        ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), sl_1.b), string).toString());
        oz_2.b();
        AudioInputStream audioInputStream = a2D.a(ara_2.b(this.getClass(), aL0.a(aL0.a(new StringBuilder(), sl_1.a), string).toString()));
        this.a = a2D.a();
        JJ.a(this.a, audioInputStream);
        FloatControl floatControl = (FloatControl)JJ.a(this.a, FloatControl.Type.MASTER_GAIN);
        aFH.a(floatControl, -15.0f);
        ListInvoker.b(new ListInvoker[2]);
    }

    static {
        if (oz_2.b()) {
            oz_2.b(true);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static boolean c() {
        oz_2.b();
        return true;
    }

    @Override
    public void b() {
        JJ.a(this.a, 1337);
        this.c();
    }

    public static boolean b() {
        return b;
    }
}

