/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.main;

import net.minecraft.client.main.configuration.DisplayInformation;
import net.minecraft.client.main.configuration.ServerInformation;
import net.minecraft.client.main.configuration.UserInformation;
import net.FolderInformation;
import net.GameInformation;

public class GameConfiguration {
    public FolderInformation a;
    public GameInformation b;
    public UserInformation c;
    public ServerInformation d;
    public DisplayInformation e;

    public GameConfiguration(UserInformation userInformation, DisplayInformation displayInformation, FolderInformation folderInformation, GameInformation gameInformation, ServerInformation serverInformation) {
        this.c = userInformation;
        this.e = displayInformation;
        this.a = folderInformation;
        this.b = gameInformation;
        this.d = serverInformation;
    }
}

