package red.felnull.tim.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TIMCreativeTabs {
    public static final CreativeTabs tabTIM = new CreativeTabs( "timgroup")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return TIMItems.test;
        }
    };
}
