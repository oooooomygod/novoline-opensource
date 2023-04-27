/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystem
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 */
package net;

import net.TO;
import net.aXM;
import net.abc_0;
import net.ds_2;
import net.hy_1;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;

/*
 * Renamed from net.asg
 */
class asg_1
extends SoundSystem {
    TO a;

    private asg_1(TO tO) {
        this.a = tO;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean playing(String string) {
        Object object = SoundSystemConfig.THREAD_SYNC;
        synchronized (object) {
            if (this.soundLibrary == null) {
                return false;
            }
            Source source = (Source)ds_2.a(abc_0.a(this.soundLibrary), string);
            if (hy_1.b(source)) return true;
            if (hy_1.a(source)) return true;
            if (!source.preLoad) return false;
            return true;
        }
    }

    asg_1(TO tO, aXM aXM2) {
        this(tO);
    }
}

