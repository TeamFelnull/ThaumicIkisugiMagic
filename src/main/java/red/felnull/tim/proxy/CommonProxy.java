package red.felnull.tim.proxy;

import net.minecraft.util.ResourceLocation;
import red.felnull.tim.ThaumicIkisugiMagic;
import thaumcraft.api.research.ResearchCategories;

public class CommonProxy {

    public void preInit() {
    }

    public void init() {

    }

    public void postInit() {
        ResearchCategories.registerCategory("THAUMIC_IKISUGI_MAGIC", new ResourceLocation(ThaumicIkisugiMagic.MODID, "textures/gui/gui_researchbackikisugi.png"), new ResourceLocation(ThaumicIkisugiMagic.MODID, "textures/gui/gui_researchbackikisugi.png"));
          }
          }
