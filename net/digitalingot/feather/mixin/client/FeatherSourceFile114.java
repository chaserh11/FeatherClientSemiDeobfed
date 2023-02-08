package net.digitalingot.feather.mixin.client;

import java.util.Random;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({FontRenderer.class})
public interface FeatherSourceFile114 {
   @Accessor("locationFontTexture")
   ResourceLocation getLocationFontTexture();

   @Accessor("fontRandom")
   Random getFontRandom();

   @Accessor("posX")
   float getPosX();

   @Accessor("posX")
   void setPosX(float var1);

   @Accessor("posY")
   float getPosY();

   @Accessor("posY")
   void setPosY(float var1);

   @Accessor("FONT_HEIGHT")
   int getFontHeight();

   @Accessor("unicodeFlag")
   boolean isUnicodeFlag();

   @Accessor("colorCode")
   int[] getColorCode();

   @Accessor("glyphWidth")
   byte[] getGlyphWidth();

   @Accessor("red")
   float getRed();

   @Accessor("green")
   float getBlue();

   @Accessor("blue")
   float getGreen();

   @Accessor("alpha")
   float getAlpha();

   @Accessor("randomStyle")
   boolean isRandomStyle();

   @Accessor("randomStyle")
   void setRandomStyle(boolean var1);

   @Accessor("boldStyle")
   boolean isBoldStyle();

   @Accessor("boldStyle")
   void setBoldStyle(boolean var1);

   @Accessor("strikethroughStyle")
   boolean isStrikethroughStyle();

   @Accessor("strikethroughStyle")
   void setStrikethroughStyle(boolean var1);

   @Accessor("underlineStyle")
   boolean isUnderlineStyle();

   @Accessor("underlineStyle")
   void setUnderlineStyle(boolean var1);

   @Accessor("italicStyle")
   boolean isItalicStyle();

   @Accessor("italicStyle")
   void setItalicStyle(boolean var1);
}
