package net.digitalingot.feather;

import de.jcm.discordgamesdk.Core;
import de.jcm.discordgamesdk.CreateParams;
import de.jcm.discordgamesdk.CreateParams.Flags;
import de.jcm.discordgamesdk.activity.Activity;
import de.jcm.discordgamesdk.activity.ActivityType;
import java.io.File;
import java.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import net.digitalingot.vendor.com.google.inject.Singleton;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.server.integrated.IntegratedServer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@FeatherSourceFile3(
   jj = FeatherSourceFile243.DISCORD,
   kl = @FeatherSourceFile414(
   jc = "feather.modulename.discord",
   jl = "https://assets.feathercdn.net/game/mods/discord.svg",
   od = "feather.moduledescription.discord",
   wr = {}
)
)
public class FeatherSourceFile587 extends FeatherSourceFile495 {
   private final Minecraft minecraft;
   private final FeatherSourceFile428 lI;
   private final Executor lJ = Executors.newSingleThreadExecutor();
   private final Instant lK = Instant.now();
   private CreateParams lL;
   private Core lM;
   private long lN;

   @Inject
   FeatherSourceFile587(Minecraft var1, FeatherSourceFile428 var2) {
      this.minecraft = var1;
      this.lI = var2;
   }

   public void ex() {
      this.eq();
      FeatherSourceFile149.oc.oe((var1) -> {
         if (this.uj()) {
            if (var1 == FeatherSourceFile$xj20.START) {
               this.lJ.execute(() -> {
                  if (this.lM != null) {
                     this.lM.runCallbacks();
                  }

               });
               if (this.nz()) {
                  long var2 = Instant.now().getEpochSecond();
                  if (var2 - this.lN > 1L) {
                     this.lN = var2;
                     this.ub();
                  }
               }

            }
         }
      });
      FeatherSourceFile725.ar.oe((var1, var2) -> {
         this.fl();
      });
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         if (this.uj()) {
            this.pq("Main Menu", (String)null);
         }
      });
   }

   private void eq() {
      this.lJ.execute(() -> {
         String var0 = System.getProperty("java.library.path");
         String[] var1 = var0.split("[;:]");
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            String var4 = var1[var3];
            File var5 = new File(var4, "discord_game_sdk.dll");
            if (var5.exists()) {
               Core.init(var5);
               return;
            }
         }

         FeatherSourceFile311.Sb.error("Couldn't find discord api path! Tried those paths: " + var0);
      });
   }

   public void ml() {
      this.lJ.execute(() -> {
         this.lL = new CreateParams();
         this.lL.setClientID(903733444876582983L);
         this.lL.setFlags(new Flags[]{Flags.NO_REQUIRE_DISCORD});
         this.lM = new Core(this.lL);
         this.fl();
      });
   }

   private void fl() {
      if (this.uj()) {
         if (this.nz()) {
            this.ub();
         } else if (this.minecraft.func_71356_B()) {
            this.pq("Singleplayer", ((FeatherSourceFile$lh57)this.fS).lO ? this.bk() : null);
         } else if (this.minecraft.func_147104_D() != null) {
            String var1;
            if (((FeatherSourceFile$lh57)this.fS).lP) {
               if (!this.minecraft.func_181540_al()) {
                  var1 = this.minecraft.func_147104_D().field_78845_b;
               } else {
                  var1 = "Realms";
               }
            } else {
               var1 = null;
            }

            this.pq("Multiplayer", var1);
         } else {
            this.pq("Main Menu", (String)null);
         }

      }
   }

   private boolean nz() {
      return ((FeatherSourceFile$lh57)this.fS).lQ && this.lI.xK();
   }

   private void ub() {
      FeatherSourceFile$lh18 var1 = FeatherSourceFile723.fx();
      this.pq("Hypixel", var1.getDisplayName());
   }

   private @NotNull @Nullable void pq(@NotNull @NotNull String var1, @Nullable @Nullable String var2) {
      if (this.lM != null) {
         this.lJ.execute(() -> {
            if (this.lM != null) {
               Activity var3 = new Activity();

               try {
                  var3.setType(ActivityType.PLAYING);
                  var3.setState(var1);
                  if (var2 != null) {
                     var3.setDetails(var2);
                  }

                  var3.timestamps().setStart(this.lK);
                  var3.assets().setLargeImage("app_icon");
                  var3.assets().setLargeText("Feather Client");
                  this.lM.activityManager().updateActivity(var3);
               } catch (Throwable var7) {
                  try {
                     var3.close();
                  } catch (Throwable var6) {
                     var7.addSuppressed(var6);
                  }

                  throw var7;
               }

               var3.close();
            }
         });
      }
   }

   private String bk() {
      IntegratedServer var1 = this.minecraft.func_71401_C();
      return var1.func_71221_J();
   }

   public void ze() {
      try {
         if (this.lL != null) {
            this.lL.close();
         }

         if (this.lM != null) {
            this.lM.close();
         }
      } catch (Exception var2) {
         FeatherSourceFile311.Sb.error("Error closing Discord RPC", var2);
      }

   }
}
