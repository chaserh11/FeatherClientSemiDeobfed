package net.digitalingot.feather.mixin.client;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.digitalingot.feather.FeatherSourceFile363;
import net.minecraft.client.renderer.block.model.BlockFaceUV;
import net.minecraft.client.renderer.block.model.BlockPart;
import net.minecraft.client.renderer.block.model.BlockPartFace;
import net.minecraft.client.renderer.block.model.BlockPartRotation;
import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.EnumFacing;
import org.lwjgl.util.vector.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({ItemModelGenerator.class})
public abstract class FeatherSourceFile94 {
   @Shadow
   protected abstract List getBlockParts(TextureAtlasSprite var1, String var2, int var3);

   @Inject(
      method = {"Lnet/minecraft/client/renderer/block/model/ItemModelGenerator;func_178394_a(ILjava/lang/String;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)Ljava/util/List;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void lh(int var1, String var2, TextureAtlasSprite var3, CallbackInfoReturnable var4) {
      HashMap var5 = Maps.newHashMap();
      float var6 = (float)var3.func_94211_a() / (var3.func_94212_f() - var3.func_94209_e());
      float var7 = (float)var3.func_94216_b() / (var3.func_94210_h() - var3.func_94206_g());
      float var8 = Math.max(var7, var6);
      float var9 = 4.0F / var8;
      var5.put(EnumFacing.SOUTH, new BlockPartFace((EnumFacing)null, var1, var2, new BlockFaceUV(FeatherSourceFile363.lh(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, var9), 0)));
      var5.put(EnumFacing.NORTH, new BlockPartFace((EnumFacing)null, var1, var2, new BlockFaceUV(FeatherSourceFile363.lh(new float[]{16.0F, 0.0F, 0.0F, 16.0F}, var9), 0)));
      ArrayList var10 = Lists.newArrayList();
      var10.add(new BlockPart(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), var5, (BlockPartRotation)null, true));
      var10.addAll(this.getBlockParts(var3, var2, var1));
      var4.setReturnValue(var10);
   }
}
