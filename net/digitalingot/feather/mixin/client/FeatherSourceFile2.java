package net.digitalingot.feather.mixin.client;

import com.google.common.collect.Lists;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.digitalingot.feather.FeatherSourceFile222;
import net.digitalingot.feather.FeatherSourceFile228;
import net.digitalingot.feather.FeatherSourceFile248;
import net.digitalingot.feather.FeatherSourceFile311;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(
   value = {ResourcePackRepository.class},
   priority = 999
)
public abstract class FeatherSourceFile2 implements FeatherSourceFile228 {
   @Shadow
   @Final
   private File field_110618_d;
   @Shadow
   private List field_110619_e;
   @Unique
   private Constructor VR;

   private List Ao() {
      if (this.field_110618_d.isDirectory()) {
         long var1 = System.currentTimeMillis();
         ArrayList var3 = Lists.newArrayList();
         Path var4 = this.field_110618_d.toPath();
         Files.walkFileTree(var4, new FeatherSourceFile248(var4, var3));
         FeatherSourceFile311.Sb.info("Found " + var3.size() + " resource packs in {}ms", new Object[]{System.currentTimeMillis() - var1});
         return var3;
      } else {
         return Collections.emptyList();
      }
   }

   public void feather$updateRepository() {
      ArrayList var1 = Lists.newArrayList();
      HashMap var2 = new HashMap();
      Iterator var3 = this.field_110619_e.iterator();

      Entry var4;
      while(var3.hasNext()) {
         var4 = (Entry)var3.next();
         var2.put(((FeatherSourceFile222)var4).getOriginFolder(), var4);
      }

      var3 = this.Ao().iterator();

      while(var3.hasNext()) {
         Path var8 = (Path)var3.next();
         Entry var5 = this.mq(var8);
         if (var2.containsKey(var8)) {
            var1.add(var5);
         } else {
            try {
               var5.func_110516_a();
               ((FeatherSourceFile222)var5).setOriginFolder(var8.getParent());
               var1.add(var5);
            } catch (Exception var7) {
               var1.remove(var5);
               var7.printStackTrace();
            }
         }
      }

      this.field_110619_e.removeAll(var1);
      var3 = this.field_110619_e.iterator();

      while(var3.hasNext()) {
         var4 = (Entry)var3.next();
         var4.func_110517_b();
      }

      this.field_110619_e = var1;
   }

   @Inject(
      method = {"updateRepositoryEntriesAll"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void as(CallbackInfo var1) {
      var1.cancel();
      this.feather$updateRepository();
   }

   private Entry mq(Path var1) {
      try {
         if (this.VR == null) {
            this.VR = Entry.class.getDeclaredConstructor(ResourcePackRepository.class, File.class);
            this.VR.setAccessible(true);
         }

         return (Entry)this.VR.newInstance(this, var1.toFile());
      } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException var3) {
         throw new RuntimeException(var3);
      }
   }
}
