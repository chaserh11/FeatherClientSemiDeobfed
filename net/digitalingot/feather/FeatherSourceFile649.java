package net.digitalingot.feather;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import org.jetbrains.annotations.NotNull;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.SCOREBOARD,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.scoreboard",
   jl = "https://assets.feathercdn.net/game/mods/scoreboard.svg",
   od = "feather.moduledescription.scoreboard",
   wr = {FeatherSourceFile$lh3.HUD}
)
)
@FeatherSourceFile629(
   jt = {@FeatherSourceFile503(
   al = FeatherSourceFile$lh98.class
)}
)
public class FeatherSourceFile649 extends FeatherSourceFile360 {
   private static final String Ek = "§eFeather";
   private static final int El = 5;
   private static final int Em = 15;
   private static final ScoreObjective En = bY();
   private static final String Eo = "    ";
   private static final int Ep = 9;
   private static final String Eq = "#";
   private static final String Er = ": ";
   private final Minecraft minecraft;
   private FeatherSourceFile$nc40 Es = null;
   private FeatherSourceFile$nc40 Et = null;
   private boolean Eu = false;

   @Inject
   FeatherSourceFile649(Minecraft var1) {
      this.minecraft = var1;
   }

   public @NotNull void lh(@NotNull @NotNull FeatherSourceFile$xj13 var1) {
      super.lh(var1);
      this.bV();
   }

   private void bV() {
      this.Es = this.lh(En);
   }

   public void ex() {
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         this.Et = null;
      });
   }

   public void pu() {
      this.Es = this.lh(En);
      this.Eu = true;
   }

   @NotNull
   private @NotNull FeatherSourceFile$nc40 bW() {
      return this.Et != null ? this.Et : this.Es;
   }

   private @NotNull FeatherSourceFile$nc40 lh(@NotNull @NotNull ScoreObjective var1) {
      List var2 = nc(var1);
      if (var2.isEmpty()) {
         return null;
      } else {
         ArrayList var3 = new ArrayList(var2.size());
         int var4 = FeatherSourceFile843.fo(var1.func_96678_d());
         int var5 = var4;
         int var6 = FeatherSourceFile843.fo(": ");
         Iterator var7 = var2.iterator();

         while(var7.hasNext()) {
            Score var8 = (Score)var7.next();
            String var9 = var8.func_96653_e();
            ScorePlayerTeam var10 = var1.func_96682_a().func_96509_i(var9);
            String var11 = ScorePlayerTeam.func_96667_a(var10, var9);
            var3.add(new SimpleEntry(var8, var11));
            int var12 = FeatherSourceFile843.fo(var11);
            if (((FeatherSourceFile$xj13)this.fS).EC) {
               var12 += var6;
               var12 += FeatherSourceFile843.fo(String.valueOf(var8.func_96652_c()));
            }

            if (var12 > var5) {
               var5 = var12;
            }
         }

         int var13 = (var2.size() + 1) * 9 + 1;
         int var14 = var5 + 4;
         FeatherSourceFile$nc40 var15 = new FeatherSourceFile$nc40();
         FeatherSourceFile$nc40.lh(var15, var14);
         FeatherSourceFile$nc40.nc(var15, var13);
         FeatherSourceFile$nc40.lh(var15, var1.func_96678_d());
         FeatherSourceFile$nc40.lh(var15, (float)var14 / 2.0F - (float)var4 / 2.0F);
         FeatherSourceFile$nc40.lh(var15, (List)(new ArrayList(var2.size())));

         for(int var16 = 0; var16 < var3.size(); ++var16) {
            Entry var17 = (Entry)var3.get(var16);
            FeatherSourceFile$nc$lh3 var18 = new FeatherSourceFile$nc$lh3();
            FeatherSourceFile$nc$lh3.lh(var18, (String)var17.getValue());
            FeatherSourceFile$nc$lh3.lh(var18, (float)(var13 - (var16 + 1) * 9));
            if (((FeatherSourceFile$xj13)this.fS).EC) {
               FeatherSourceFile$nc$lh3.nc(var18, FeatherSourceFile313.RED.toString() + ((Score)var17.getKey()).func_96652_c());
               FeatherSourceFile$nc$lh3.nc(var18, (float)(var14 - FeatherSourceFile843.fo(FeatherSourceFile$nc$lh3.lh(var18))));
            }

            FeatherSourceFile$nc40.nc(var15).add(var18);
         }

         return var15;
      }
   }

   private static @NotNull List nc(@NotNull @NotNull ScoreObjective var0) {
      Collection var1 = var0.func_96682_a().func_96534_i(var0);
      List var2 = (List)var1.stream().filter((var0x) -> {
         return var0x.func_96653_e() != null && !var0x.func_96653_e().startsWith("#");
      }).collect(Collectors.toList());
      return (List)(var2.size() > 15 ? Lists.newArrayList(Iterables.skip(var2, var1.size() - 15)) : var2);
   }

   private ScoreObjective bX() {
      if (this.minecraft.field_71439_g == null) {
         return null;
      } else {
         String var1 = this.minecraft.field_71439_g.func_70005_c_();
         Scoreboard var2 = this.minecraft.field_71441_e.func_96441_U();
         ScorePlayerTeam var3 = var2.func_96509_i(var1);
         ScoreObjective var4 = null;
         if (var3 != null) {
            int var5 = var3.func_178775_l().func_175746_b();
            if (var5 >= 0) {
               var4 = var2.func_96539_a(3 + var5);
            }
         }

         return var4 != null ? var4 : var2.func_96539_a(1);
      }
   }

   private static ScoreObjective bY() {
      Scoreboard var0 = new Scoreboard();
      ScoreObjective var1 = var0.func_96535_a("dummy", IScoreObjectiveCriteria.field_96641_b);
      var1.func_96681_a("§eFeather");
      StringBuilder var2 = new StringBuilder("    ");

      for(int var3 = 5; var3 > 0; --var3) {
         var0.func_96529_a(var2.toString(), var1).func_96647_c(var3);
         var2.append(' ');
      }

      return var1;
   }

   public void bZ() {
      this.Eu = true;
   }

   // $FF: synthetic method
   static Minecraft lh(FeatherSourceFile649 var0) {
      return var0.minecraft;
   }

   // $FF: synthetic method
   static FeatherSourceFile$nc40 nc(FeatherSourceFile649 var0) {
      return var0.bW();
   }

   // $FF: synthetic method
   static boolean xj(FeatherSourceFile649 var0) {
      return var0.Eu;
   }

   // $FF: synthetic method
   static ScoreObjective oe(FeatherSourceFile649 var0) {
      return var0.bX();
   }

   // $FF: synthetic method
   static FeatherSourceFile$nc40 lh(FeatherSourceFile649 var0, FeatherSourceFile$nc40 var1) {
      return var0.Et = var1;
   }

   // $FF: synthetic method
   static FeatherSourceFile$nc40 lh(FeatherSourceFile649 var0, ScoreObjective var1) {
      return var0.lh(var1);
   }

   // $FF: synthetic method
   static boolean lh(FeatherSourceFile649 var0, boolean var1) {
      return var0.Eu = var1;
   }

   // $FF: synthetic method
   static FeatherSourceFile$nc40 qy(FeatherSourceFile649 var0) {
      return var0.Et;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ou(FeatherSourceFile649 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 pq(FeatherSourceFile649 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 as(FeatherSourceFile649 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 km(FeatherSourceFile649 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mq(FeatherSourceFile649 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 mr(FeatherSourceFile649 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 ux(FeatherSourceFile649 var0) {
      return var0.fS;
   }

   // $FF: synthetic method
   static FeatherSourceFile136 si(FeatherSourceFile649 var0) {
      return var0.fS;
   }
}
