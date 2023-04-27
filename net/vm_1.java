/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.ProfileLookupCallback
 */
package net;

import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;

/*
 * Renamed from net.vm
 */
public class vm_1 {
    public static void a(GameProfileRepository gameProfileRepository, String[] stringArray, Agent agent, ProfileLookupCallback profileLookupCallback) {
        gameProfileRepository.findProfilesByNames(stringArray, agent, profileLookupCallback);
    }
}

