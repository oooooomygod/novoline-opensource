/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.World;
import net.a5_0;
import net.aV8;
import net.em_1;
import net.xb_1;

/*
 * Renamed from net.ajf
 */
public class ajf_0 {
    protected Random a = new Random();
    protected int c = 8;
    protected World b;

    protected void a(World world, int n, int n2, int n3, int n4, xb_1 xb_12) {
    }

    public void a(em_1 em_12, World world, int n, int n2, xb_1 xb_12) {
        int n3 = this.c;
        this.b = world;
        a5_0.a(this.a, aV8.w(world));
        long l4 = a5_0.b(this.a);
        long l5 = a5_0.b(this.a);
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                long l6 = (long)i * l4;
                long l7 = (long)j * l5;
                a5_0.a(this.a, l6 ^ l7 ^ aV8.w(world));
                this.a(world, i, j, n, n2, xb_12);
            }
        }
    }
}

