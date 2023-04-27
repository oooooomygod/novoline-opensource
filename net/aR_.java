/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.HashFunction
 */
package net;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;

public class aR_ {
    public static HashCode a(HashFunction hashFunction, byte[] byArray) {
        return hashFunction.hashBytes(byArray);
    }
}

