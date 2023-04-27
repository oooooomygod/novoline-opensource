/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializer
 */
package net;

import com.google.gson.JsonDeserializer;
import net.IMetadataSection;

public interface DF<T extends IMetadataSection>
extends JsonDeserializer<T> {
    public String a();
}

