/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.HttpEntity
 */
package net;

import java.io.InputStream;
import org.apache.http.HttpEntity;

public class pR {
    public static InputStream a(HttpEntity httpEntity) {
        return httpEntity.getContent();
    }
}

