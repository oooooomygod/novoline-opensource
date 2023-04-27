/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.rs_1;

public interface ICrafting {
    public void a(Container var1, rs_1 var2);

    public void a(Container var1, int var2, int var3);

    public void a(Container var1, int var2, ItemStack var3);

    public void a(Container var1, List<ItemStack> var2);
}

