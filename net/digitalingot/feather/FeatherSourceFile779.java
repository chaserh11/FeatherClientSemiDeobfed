package net.digitalingot.feather;

import com.google.common.reflect.TypeToken;
import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.AUTO_TEXT,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.autotext",
   jl = "https://assets.feathercdn.net/game/mods/autotext.svg",
   od = "feather.moduledescription.autotext",
   wr = {},
   tp = {"Macro"}
)
)
public class FeatherSourceFile779 extends FeatherSourceFile495 {
   private final Minecraft minecraft;
   private final FeatherSourceFile55 kQ;
   private final FeatherSourceFile663 rC;
   private final FeatherSourceFile679 rD;
   private final FeatherSourceFile143 lk;
   private final File rE;
   @NotNull
   private final @NotNull Set cJ = new LinkedHashSet();

   @Inject
   FeatherSourceFile779(Minecraft var1, FeatherSourceFile55 var2, FeatherSourceFile663 var3, FeatherSourceFile679 var4, @FeatherSourceFile$xj15 Path var5, FeatherSourceFile143 var6) {
      this.minecraft = var1;
      this.kQ = var2;
      this.rC = var3;
      this.rD = var4;
      this.rE = var5.resolve("autotext.json").toFile();
      this.lk = var6;
   }

   public void ex() {
      this.rC.lh(new FeatherSourceFile269(this));
      this.rC.lh(new FeatherSourceFile76(this));
      FeatherSourceFile609.cm.oe((var1, var2, var3, var4) -> {
         if (var3 == 1) {
            this.jr(var1);
         }
      });
      FeatherSourceFile609.xw.oe((var1, var2, var3) -> {
         if (var2 == 1) {
            this.jr(var1 + 100001);
         }
      });
      this.kQ.lh(() -> {
         return ((FeatherSourceFile$lh106)this.fS).rG;
      }, () -> {
         if (this.uj()) {
            if (this.minecraft.field_71441_e != null) {
               if (this.minecraft.field_71415_G) {
                  if (((FeatherSourceFile$lh106)this.fS).rG.eb()) {
                     this.minecraft.func_147108_a(this.lk);
                     this.rD.is();
                  }

               }
            }
         }
      });
      FeatherSourceFile461.ws.oe((var1) -> {
         if (var1.equals("autoText")) {
            this.minecraft.func_147108_a(this.lk);
            this.rD.is();
         }

      });
   }

   private void jr(int var1) {
      if (this.uj()) {
         if (this.minecraft.field_71441_e != null) {
            if (this.minecraft.field_71415_G) {
               Iterator var2 = this.cJ.iterator();

               while(var2.hasNext()) {
                  FeatherSourceFile340 var3 = (FeatherSourceFile340)var2.next();
                  if (Arrays.stream(var3.ay().va()).anyMatch((var1x) -> {
                     return var1x == var1;
                  }) && var3.ay().eb()) {
                     var3.zr();
                  }
               }

            }
         }
      }
   }

   public void ml() {
      if (this.rE.exists()) {
         Set var1 = (Set)FeatherSourceFile815.ux(this.rE).lh((new TypeToken() {
         }).getType());
         this.cJ.addAll(var1);
      }

      this.rD.lh(this.cJ);
   }

   public void ze() {
      this.cJ.clear();
   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile340 var1) {
      this.cJ.remove(var1);
      this.cJ.add(var1);
      this.rp();
   }

   public @NotNull void nc(@NotNull @NotNull FeatherSourceFile340 var1) {
      this.cJ.remove(var1);
      this.rp();
   }

   public void rp() {
      this.rE.getParentFile().mkdirs();
      FeatherSourceFile815.ux(this.rE).wU().wz(this.cJ);
   }

   @NotNull
   public @NotNull Set ip() {
      return this.cJ;
   }
}
