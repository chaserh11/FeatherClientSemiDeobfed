package net.digitalingot.feather;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(
   modid = "feather",
   name = "Feather Client",
   version = "1.0.0-SNAPSHOT",
   clientSideOnly = true,
   acceptedMinecraftVersions = "[1.8.9]"
)
public class FeatherSourceFile457 {
   @EventHandler
   public void lh(FMLInitializationEvent var1) {
      if (var1.getSide() == Side.CLIENT) {
         FeatherSourceFile487.km();
      }
   }

   @EventHandler
   public void lh(FMLPostInitializationEvent var1) {
      if (var1.getSide() == Side.CLIENT) {
         ((FeatherSourceFile653)FeatherSourceFile653.ws.sx()).registerCommands((Void)null);
      }
   }
}
