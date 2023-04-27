/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.script;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.MCInvoker;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.n5_0;
import net.ne_2;
import net.np_1;
import net.ny_1;
import net.nz_0;
import net.skidunion.annotations;

public class ScriptWorld {
    private static int[] b;
    private Minecraft c = MCInvoker.f();

    @annotations
    public List<EntityPlayer> getPlayerEntities() {
        return this.c.world.e();
    }

    @annotations
    public boolean isAnimal(Entity entity) {
        ScriptWorld.b();
        return entity instanceof n5_0 || entity instanceof nz_0;
    }

    public static int[] b() {
        return b;
    }

    static {
        if (ScriptWorld.b() == null) {
            ScriptWorld.b(new int[3]);
        }
    }

    @annotations
    public String getBlockName(Block block) {
        return BlocksInvoker.o(block);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    @annotations
    public BlockPos getBlockPos(int n, int n2, int n3) {
        return new BlockPos(n, n2, n3);
    }

    @annotations
    public boolean isMob(Entity entity) {
        ScriptWorld.b();
        return entity instanceof ne_2 || entity instanceof ny_1 || entity instanceof np_1;
    }

    @annotations
    public Block getBlockAtBlockPos(BlockPos blockPos) {
        return BlockStateInvoker.getBlock(BlockInvoker.getMaterial(this.c.world, blockPos));
    }

    @annotations
    public void removeEntity(Entity entity) {
        this.c.world.c(entity);
    }

    @annotations
    public boolean isPlayer(Entity entity) {
        return entity instanceof EntityPlayer;
    }

    @annotations
    public List<Entity> getEntityList() {
        return BlockInvoker.e(this.c.world);
    }
}

