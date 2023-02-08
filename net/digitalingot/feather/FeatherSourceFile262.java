package net.digitalingot.feather;

import java.nio.file.Path;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreenResourcePacks;
import net.minecraft.util.ResourceLocation;

public abstract class FeatherSourceFile262 extends FeatherSourceFile263 {
   private final GuiScreenResourcePacks TL;
   private final FeatherSourceFile216 TM;
   private final Path TE;
   private final int TN;
   private final int TO;

   public FeatherSourceFile262(GuiScreenResourcePacks var1, FeatherSourceFile216 var2, Path var3, int var4, int var5) {
      super(var1);
      this.TL = var1;
      this.TM = var2;
      this.TE = var3;
      this.TN = var4;
      this.TO = var5;
   }

   public void func_180790_a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      FeatherSourceFile841.vK().xj(var2, var3, var2 + 32, var3 + 32, FeatherSourceFile341.mq(255, 255, 255, 75));
      FeatherSourceFile843.wq();
      FeatherSourceFile843.ly(770, 771);
      this.lh(var2, var3, this.zQ(), this.zR(), this.zS());
      FeatherSourceFile266.nc(var2, var3, var4, var5, var6, var8);
      FeatherSourceFile843.jz();
      FeatherSourceFile841.vL().func_175063_a(this.getName(), (float)(var2 + 32 + 2), (float)(var3 + 1), 16777215);
      FeatherSourceFile841.vL().func_175063_a(this.TN + " folders", (float)(var2 + 32 + 2), (float)(var3 + 12), 8224125);
      FeatherSourceFile841.vL().func_175063_a(this.TO + " packs", (float)(var2 + 32 + 2), (float)(var3 + 23), 8224125);
   }

   protected String getName() {
      return this.TE.getFileName().toString();
   }

   protected void lh(int var1, int var2, ResourceLocation var3, int var4, int var5) {
      FeatherSourceFile843.lh(0, var3);
      Gui.func_146110_a(var1 + (32 - var4) / 2, var2 + (32 - var5) / 2, 0.0F, 0.0F, var4, var5, (float)var4, (float)var5);
   }

   public boolean func_148278_a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 <= ((net.digitalingot.feather.mixin.client.FeatherSourceFile89)this.TL).getAvailableResourcePacksList().func_148139_c()) {
         this.TM.populate(this.TE, false);
         return true;
      } else {
         return false;
      }
   }

   protected abstract ResourceLocation zQ();

   protected abstract int zR();

   protected abstract int zS();
}
