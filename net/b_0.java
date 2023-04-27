/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemArmor;

/*
 * Renamed from net.b
 */
public enum b_0 {
    ALL,
    ARMOR,
    ARMOR_FEET,
    ARMOR_LEGS,
    ARMOR_TORSO,
    ARMOR_HEAD,
    WEAPON,
    DIGGER,
    FISHING_ROD,
    BREAKABLE,
    BOW;


    public boolean a(Item item) {
        if (this == ALL) {
            return true;
        }
        if (this == BREAKABLE && px_0.i(item)) {
            return true;
        }
        if (item instanceof ItemArmor) {
            if (this == ARMOR) {
                return true;
            }
            ItemArmor itemArmor = (ItemArmor)item;
            return itemArmor.n == 0 ? this == ARMOR_HEAD : (itemArmor.n == 2 ? this == ARMOR_LEGS : (itemArmor.n == 1 ? this == ARMOR_TORSO : itemArmor.n == 3 && this == ARMOR_FEET));
        }
        return item instanceof LC ? this == WEAPON : (item instanceof lw_0 ? this == DIGGER : (item instanceof ItemBow ? this == BOW : item instanceof ItemFishingRod && this == FISHING_ROD));
    }
}

