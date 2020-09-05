package red.felnull.tim.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.WeightedRandom;
import red.felnull.tim.ThaumicIkisugiMagic;

public class TIMItems {
    public static final Item test=new Item().setUnlocalizedName("test").setCreativeTab(TIMCreativeTabs.tabTIM).setTextureName(ThaumicIkisugiMagic.MODID+":"+"test");
public static void init(){
    GameRegistry.registerItem(test,"test");

}
}

