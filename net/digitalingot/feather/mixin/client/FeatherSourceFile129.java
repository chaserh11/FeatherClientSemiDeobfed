package net.digitalingot.feather.mixin.client;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.digitalingot.feather.FeatherSourceFile214;
import net.digitalingot.feather.FeatherSourceFile216;
import net.digitalingot.feather.FeatherSourceFile222;
import net.digitalingot.feather.FeatherSourceFile224;
import net.digitalingot.feather.FeatherSourceFile226;
import net.digitalingot.feather.FeatherSourceFile256;
import net.digitalingot.feather.FeatherSourceFile258;
import net.digitalingot.feather.FeatherSourceFile260;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.client.gui.GuiResourcePackAvailable;
import net.minecraft.client.gui.GuiResourcePackSelected;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.resources.ResourcePackListEntry;
import net.minecraft.client.resources.ResourcePackListEntryFound;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GuiScreenResourcePacks.class})
public abstract class FeatherSourceFile129 extends GuiScreen implements FeatherSourceFile216, FeatherSourceFile256 {
   @Shadow
   private List field_146966_g;
   @Shadow
   private GuiResourcePackAvailable field_146970_i;
   @Shadow
   private GuiResourcePackSelected field_146967_r;
   @Unique
   private final Map VL = Maps.newHashMap();
   @Unique
   private Path VM;
   @Unique
   private GuiTextField VN;
   @Unique
   private List VO;
   @Unique
   private List VP;

   @Shadow
   public abstract void func_73866_w_();

   @Redirect(
      method = {"initGui"},
      at = @At(
   value = "NEW",
   target = "Lnet/minecraft/client/gui/GuiResourcePackAvailable;"
)
   )
   private GuiResourcePackAvailable lh(Minecraft var1, int var2, int var3, List var4) {
      this.VO = Lists.newArrayList();
      this.populate(FeatherSourceFile224.zP(), true);
      return new GuiResourcePackAvailable(var1, var2, var3, this.VO);
   }

   @Redirect(
      method = {"initGui"},
      slice = @Slice(
   to = @At(
   value = "INVOKE",
   target = "Ljava/util/List;add(Ljava/lang/Object;)Z",
   ordinal = 1
)
),
      at = @At(
   value = "INVOKE",
   target = "Ljava/util/List;add(Ljava/lang/Object;)Z"
)
   )
   private boolean lh(List var1, Object var2) {
      GuiOptionButton var3 = (GuiOptionButton)var2;
      var3.field_146128_h += 157;
      if (var3.field_146127_k == 1) {
         var3.field_146128_h -= 5;
         var3.func_175211_a(48);
      }

      return var1.add(var3);
   }

   @Inject(
      method = {"initGui"},
      at = {@At("TAIL")}
   )
   private void ou(CallbackInfo var1) {
      int var10005 = this.field_146294_l / 2 - 4 - 199;
      int var10006 = this.field_146295_m - 47;
      this.VN = new GuiTextField(51, Minecraft.func_71410_x().field_71466_p, var10005, var10006, 198, 18);
      int var2 = this.field_146294_l >= 450 ? 210 : 200;
      this.field_146970_i.func_148122_a(var2, this.field_146295_m, 32, this.field_146295_m - 55 + 4);
      this.field_146970_i.func_148140_g(this.field_146294_l / 2 - 4 - var2);
      this.field_146967_r.func_148122_a(var2, this.field_146295_m, 32, this.field_146295_m - 55 + 4);
      this.field_146967_r.func_148140_g(this.field_146294_l / 2 + 4);
   }

   public void func_73876_c() {
      super.func_73876_c();
      this.VN.func_146178_a();
   }

   @Inject(
      method = {"mouseClicked"},
      at = {@At("TAIL")}
   )
   private void lh(int var1, int var2, int var3, CallbackInfo var4) {
      this.VN.func_146192_a(var1, var2, var3);
   }

   protected void func_73869_a(char var1, int var2) {
      super.func_73869_a(var1, var2);
      if (this.VN.func_146201_a(var1, var2)) {
         this.refreshList(this.VN.func_146179_b());
      }

   }

   @Inject(
      method = {"drawScreen"},
      at = {@At("TAIL")}
   )
   private void nc(int var1, int var2, float var3, CallbackInfo var4) {
      this.VN.func_146194_f();
   }

   @Redirect(
      method = {"initGui"},
      at = @At(
   value = "NEW",
   target = "Lnet/minecraft/client/resources/ResourcePackListEntryFound;"
)
   )
   private ResourcePackListEntryFound lh(GuiScreenResourcePacks var1, Entry var2) {
      ResourcePackListEntryFound var3 = new ResourcePackListEntryFound(var1, var2);
      ((FeatherSourceFile222)var3).setOriginFolder(((FeatherSourceFile222)var2).getOriginFolder());
      return var3;
   }

   public void populate(Path var1, boolean var2) {
      this.An();
      if (var1 != null) {
         this.VM = var1;
      }

      this.VO.clear();
      if (!FeatherSourceFile226.pq(this.VM)) {
         this.VO.add(new FeatherSourceFile258((GuiScreenResourcePacks)this, this, this.VM.getParent(), 0, 0));
      }

      Iterator var3 = this.VL.entrySet().iterator();

      while(var3.hasNext()) {
         java.util.Map.Entry var4 = (java.util.Map.Entry)var3.next();
         if (FeatherSourceFile226.lh(this.VM, (Path)var4.getKey())) {
            this.VO.add(new FeatherSourceFile260(this, (GuiScreenResourcePacks)this, (Path)var4.getKey(), (int)this.VL.keySet().stream().filter((var1x) -> {
               return FeatherSourceFile226.lh((Path)var4.getKey(), var1x);
            }).count(), ((List)var4.getValue()).size()));
         }
      }

      this.VO.addAll((Collection)this.field_146966_g.stream().filter((var1x) -> {
         if (!(var1x instanceof FeatherSourceFile222)) {
            return false;
         } else {
            FeatherSourceFile222 var2 = (FeatherSourceFile222)var1x;
            return var2.getOriginFolder() != null && this.VM.equals(var2.getOriginFolder());
         }
      }).collect(Collectors.toList()));
      this.VP = ImmutableList.copyOf(this.VO);
   }

   private void refreshList(String var1) {
      this.VO.clear();
      if (var1.isEmpty()) {
         this.VO.addAll(this.VP);
      } else {
         Iterator var2 = this.VP.iterator();

         while(var2.hasNext()) {
            ResourcePackListEntry var3 = (ResourcePackListEntry)var2.next();
            if (((FeatherSourceFile214)var3).getTitle().toLowerCase().contains(var1.toLowerCase())) {
               this.VO.add(var3);
            }
         }
      }

   }

   @Inject(
      method = {"markChanged"},
      at = {@At("TAIL")}
   )
   private void pq(CallbackInfo var1) {
      this.populate(this.VM, false);
   }

   public Path getSourceFolder() {
      return this.VM;
   }

   private void An() {
      this.VL.clear();
      this.field_146966_g.forEach((var1) -> {
         FeatherSourceFile222 var2 = (FeatherSourceFile222)var1;
         if (var2.getOriginFolder() != null) {
            Path var3 = var2.getOriginFolder();
            if (this.VL.containsKey(var3)) {
               ((List)this.VL.get(var3)).add(var1);
            } else {
               this.VL.put(var3, Lists.newArrayList(new ResourcePackListEntry[]{var1}));
            }
         }

      });
   }
}
