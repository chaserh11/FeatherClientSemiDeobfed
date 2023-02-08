package net.digitalingot.feather;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiResourcePackAvailable;
import net.minecraft.client.gui.GuiResourcePackSelected;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.ResourcePackListEntryDefault;
import net.minecraft.client.resources.ResourcePackListEntryFound;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.resources.ResourcePackRepository.Entry;

public class FeatherSourceFile220 extends GuiScreenResourcePacks implements FeatherSourceFile325, FeatherSourceFile216 {
   private GuiTextField TH;
   private Path TI;
   private final List TJ = Lists.newArrayList();
   private final Predicate TK = (var1x) -> {
      FeatherSourceFile222 var2 = (FeatherSourceFile222)var1x;
      return var2.getOriginFolder() == null || var2.getOriginFolder().equals(this.TI);
   };

   public FeatherSourceFile220(GuiScreen var1) {
      super(var1);
   }

   public final void func_73866_w_() {
   }

   public void initGuiPost() {
      if (this.TI == null) {
         this.TI = FeatherSourceFile224.zP();
      }

      int var1 = this.field_146294_l >= 450 ? 210 : 200;
      int var10005 = this.field_146294_l / 2 - 3 - var1;
      int var10006 = this.field_146295_m - 47;
      this.TH = new GuiTextField(51, Minecraft.func_71410_x().field_71466_p, var10005, var10006, var1 - 2, 18);
      GuiOptionButton var2 = new GuiOptionButton(2, this.field_146294_l / 2 + 3, this.field_146295_m - 48, I18n.func_135052_a("resourcePack.openFolder", new Object[0]));
      var2.func_175211_a(var1 - 50);
      this.field_146292_n.add(var2);
      GuiOptionButton var3 = new GuiOptionButton(1, this.field_146294_l / 2 + var1 - 45, this.field_146295_m - 48, I18n.func_135052_a("gui.done", new Object[0]));
      var3.func_175211_a(48);
      this.field_146292_n.add(var3);
      net.digitalingot.feather.mixin.client.FeatherSourceFile89 var4 = (net.digitalingot.feather.mixin.client.FeatherSourceFile89)this;
      if (!var4.isChanged()) {
         var4.setAvailableResourcePacks(Lists.newArrayList());
         var4.setSelectedResourcePacks(Lists.newArrayList());
         var4.getSelectedResourcePacks().add(new ResourcePackListEntryDefault(this));
         FeatherSourceFile747.oe().nc(() -> {
            ResourcePackRepository var2 = this.field_146297_k.func_110438_M();

            try {
               ((FeatherSourceFile228)var2).feather$updateRepository();
            } catch (IOException var7) {
               throw new RuntimeException(var7);
            }

            ArrayList var3 = Lists.newArrayList(var2.func_110609_b());
            var3.removeAll(var2.func_110613_c());
            Iterator var4x = var3.iterator();

            Entry var5;
            ResourcePackListEntryFound var6;
            while(var4x.hasNext()) {
               var5 = (Entry)var4x.next();
               var6 = new ResourcePackListEntryFound(this, var5);
               ((FeatherSourceFile222)var6).setOriginFolder(((FeatherSourceFile222)var5).getOriginFolder());
               var4.getAvailableResourcePacks().add(var6);
            }

            var4x = var2.func_110613_c().iterator();

            while(var4x.hasNext()) {
               var5 = (Entry)var4x.next();
               var6 = new ResourcePackListEntryFound(this, var5);
               ((FeatherSourceFile222)var6).setOriginFolder(((FeatherSourceFile222)var5).getOriginFolder());
               var4.getSelectedResourcePacks().add(0, var6);
            }

            this.populate(this.TI, true);
         });
      }

      var4.setAvailableResourcePacksList(new GuiResourcePackAvailable(this.field_146297_k, var1, this.field_146295_m, this.TJ));
      var4.getAvailableResourcePacksList().func_148140_g(this.field_146294_l / 2 - 4 - var1);
      var4.getAvailableResourcePacksList().func_148134_d(7, 8);
      var4.setSelectedResourcePacksList(new GuiResourcePackSelected(this.field_146297_k, var1, this.field_146295_m, var4.getSelectedResourcePacks()));
      var4.getSelectedResourcePacksList().func_148140_g(this.field_146294_l / 2 + 4);
      var4.getSelectedResourcePacksList().func_148134_d(7, 8);
   }

   public void func_73876_c() {
      super.func_73876_c();
      this.TH.func_146178_a();
   }

   protected void func_73864_a(int var1, int var2, int var3) {
      super.func_73864_a(var1, var2, var3);
      this.TH.func_146192_a(var1, var2, var3);
   }

   public void func_73863_a(int var1, int var2, float var3) {
      super.func_73863_a(var1, var2, var3);
      this.TH.func_146194_f();
   }

   protected void func_73869_a(char var1, int var2) {
      super.func_73869_a(var1, var2);
      if (this.TH.func_146201_a(var1, var2)) {
         this.refreshList(this.TH.func_146179_b());
      }

   }

   public void func_175288_g() {
      super.func_175288_g();
      this.populate(this.TI, false);
   }

   public void populate(Path var1, boolean var2) {
      if (var1 != null) {
         this.TI = var1;
      }

      net.digitalingot.feather.mixin.client.FeatherSourceFile89 var3 = (net.digitalingot.feather.mixin.client.FeatherSourceFile89)this;
      this.TJ.clear();
      if (!this.TI.equals(FeatherSourceFile224.zP())) {
         this.TJ.add(new FeatherSourceFile258(this, this, this.TI.getParent(), 0, 0));
      }

      try {
         DirectoryStream var4 = Files.newDirectoryStream(this.TI);

         try {
            var4.forEach((var1x) -> {
               if (Files.isDirectory(var1x, new LinkOption[0]) && !Files.exists(var1x.resolve("pack.mcmeta"), new LinkOption[0])) {
                  try {
                     Stream var2 = Files.find(var1x, 1, (var0, var1) -> {
                        return var1.isDirectory() && !Files.exists(var0.resolve("pack.mcmeta"), new LinkOption[0]);
                     }, new FileVisitOption[0]);

                     try {
                        this.TJ.add(new FeatherSourceFile260(this, this, var1x, (int)var2.count(), 0));
                     } catch (Throwable var6) {
                        if (var2 != null) {
                           try {
                              var2.close();
                           } catch (Throwable var5) {
                              var6.addSuppressed(var5);
                           }
                        }

                        throw var6;
                     }

                     if (var2 != null) {
                        var2.close();
                     }
                  } catch (IOException var7) {
                     var7.printStackTrace();
                  }
               }

            });
         } catch (Throwable var8) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if (var4 != null) {
            var4.close();
         }
      } catch (IOException var9) {
         var9.printStackTrace();
      }

      this.TJ.addAll((Collection)var3.getAvailableResourcePacks().stream().filter(this.TK).collect(Collectors.toList()));
   }

   private void refreshList(String var1) {
      if (var1.isEmpty()) {
         this.populate(this.TI, false);
      } else {
         net.digitalingot.feather.mixin.client.FeatherSourceFile89 var2 = (net.digitalingot.feather.mixin.client.FeatherSourceFile89)this;
         this.TJ.clear();
         this.TJ.addAll((Collection)var2.getAvailableResourcePacks().stream().filter((var1x) -> {
            return ((FeatherSourceFile214)var1x).getTitle().toLowerCase().contains(var1.toLowerCase());
         }).collect(Collectors.toList()));
      }

   }
}
