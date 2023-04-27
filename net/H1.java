/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IMetadataSerializer;
import net.DF;
import net.IMetadataSection;
import net.amp_0;

class H1<T extends IMetadataSection> {
    Class<T> c;
    DF<T> b;
    IMetadataSerializer a;

    H1(IMetadataSerializer iMetadataSerializer, DF dF, Class clazz, amp_0 amp_02) {
        this(iMetadataSerializer, dF, clazz);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    private H1(IMetadataSerializer iMetadataSerializer, DF dF, Class clazz) {
        this.a = iMetadataSerializer;
        this.b = dF;
        this.c = clazz;
    }
}

