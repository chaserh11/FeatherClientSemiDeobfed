package net.digitalingot.feather;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Text;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.jetbrains.annotations.Nullable;

@SideOnly(Side.CLIENT)
public class FeatherSourceFile611 implements FeatherSourceFile189 {
   @SubscribeEvent
   public void lh(Pre var1) {
      ElementType var2 = var1.type;
      FeatherSourceFile$xj19 var3 = this.lh(var2);
      if (var3 != null) {
         FeatherSourceFile133 var4 = ((FeatherSourceFile$nc3)FeatherSourceFile364.vi.sx()).render((Void)null, var3);
         if (var4 == FeatherSourceFile133.FAIL) {
            var1.setCanceled(true);
         }

      }
   }

   @SubscribeEvent
   public void lh(Post var1) {
      ElementType var2 = var1.type;
      FeatherSourceFile$xj19 var3 = this.lh(var2);
      if (var3 != null) {
         ((FeatherSourceFile$lh13)FeatherSourceFile364.ya.sx()).render((Void)null, var3);
      }
   }

   @SubscribeEvent
   public void lh(Text var1) {
      ((FeatherSourceFile564)FeatherSourceFile564.ym.sx()).render((Void)null);
      GlStateManager.func_179120_a(770, 771, 1, 0);
   }

   @Nullable
   private @Nullable FeatherSourceFile$xj19 lh(ElementType var1) {
      switch (var1) {
         case ALL:
            return FeatherSourceFile$xj19.ALL;
         case CROSSHAIRS:
            return FeatherSourceFile$xj19.CROSSHAIRS;
         case FOOD:
            return FeatherSourceFile$xj19.FOOD;
         default:
            return null;
      }
   }
}
