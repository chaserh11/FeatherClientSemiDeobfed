package net.digitalingot.feather;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.digitalingot.fwebp.WebPImage;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.entity.player.EntityPlayer;
import org.jetbrains.annotations.NotNull;

@Singleton
public class FeatherSourceFile707 {
   private static final int cj = 2000;
   private static final long gq = 300000L;
   private static FeatherSourceFile707 tk;
   private final FeatherSourceFile336 ut;
   private final FeatherSourceFile434 xj;
   private boolean gx;
   private final Path px;
   private final Map gj = new HashMap();

   @Inject
   FeatherSourceFile707(FeatherSourceFile336 var1, FeatherSourceFile434 var2, @FeatherSourceFile$lh112 Path var3) {
      this.ut = var1;
      this.xj = var2;
      this.px = var3.resolve("assets/game/cosmetics/cloaks");
      tk = this;
   }

   public void fe() {
      FeatherSourceFile149.zp.oe((var1, var2) -> {
         if (var1 == FeatherSourceFile$xj20.END) {
            this.lh(var2);
         }

      });
   }

   private void lh(EntityPlayer var1) {
      String var2 = null;
      FeatherSourceFile165 var3 = this.oe(var1.func_110124_au());
      if (var3 != null) {
         var2 = var3.getSlug();
      }

      long var11 = System.currentTimeMillis();
      Iterator var5 = this.gj.entrySet().iterator();

      while(var5.hasNext()) {
         Entry var6 = (Entry)var5.next();
         String var7 = (String)var6.getKey();
         if (!var7.equals(var2)) {
            FeatherSourceFile284 var8 = (FeatherSourceFile284)var6.getValue();
            long var9 = var11 - var8.zY();
            if (var9 > 300000L) {
               var8.close();
               var5.remove();
               FeatherSourceFile311.Sb.info("[Cosmetics] " + var7 + " was unloaded");
            }
         }
      }

   }

   private @NotNull void lt(@NotNull @NotNull String var1) {
      if (!this.gx) {
         this.gx = true;
         this.xj.oe(() -> {
            try {
               File var2 = this.px.resolve(var1 + ".webp").toFile();
               if (!var2.exists()) {
                  FeatherSourceFile311.Sb.error("[Cloak] Could not locate cloak: " + var1);
                  return;
               }

               FeatherSourceFile437 var3 = FeatherSourceFile815.ux(var2);

               label138: {
                  try {
                     byte[] var4 = var3.wP().wQ();
                     WebPImage var5 = new WebPImage(var4);
                     FeatherSourceFile278 var6 = new FeatherSourceFile278(new FeatherSourceFile276(2000));
                     var6.lh(var5);
                     var6.Ae();
                     var6.Ag();
                     FeatherSourceFile284 var7 = var6.Ah();
                     var7.ux(System.currentTimeMillis());
                     ((FeatherSourceFile276)var7.Ab()).Af();
                     if (var7 != null) {
                        this.gj.put(var1, var7);
                        break label138;
                     }

                     FeatherSourceFile311.Sb.error("[Cloak] Failed to load animation for " + var1);
                  } catch (Throwable var14) {
                     if (var3 != null) {
                        try {
                           var3.close();
                        } catch (Throwable var13) {
                           var14.addSuppressed(var13);
                        }
                     }

                     throw var14;
                  }

                  if (var3 != null) {
                     var3.close();
                  }

                  return;
               }

               if (var3 != null) {
                  var3.close();
               }
            } catch (Exception var15) {
               var15.printStackTrace();
            } finally {
               this.gx = false;
            }

         });
      }
   }

   public static FeatherSourceFile284 nc(UUID var0) {
      FeatherSourceFile707 var1 = vv();
      FeatherSourceFile165 var2 = var1.oe(var0);
      return var2 == null ? null : var1.hb(var2.getSlug());
   }

   public @NotNull FeatherSourceFile284 hb(@NotNull @NotNull String var1) {
      FeatherSourceFile284 var2 = (FeatherSourceFile284)this.gj.get(var1);
      if (var2 == null) {
         this.lt(var1);
      } else {
         var2.ux(System.currentTimeMillis());
      }

      return var2;
   }

   public boolean xj(UUID var1) {
      return this.oe(var1) != null;
   }

   public FeatherSourceFile165 oe(UUID var1) {
      List var2 = (List)this.ut.qp().get(var1);
      if (var2 == null) {
         return null;
      } else {
         Iterator var3 = var2.iterator();

         FeatherSourceFile165 var4;
         do {
            if (!var3.hasNext()) {
               return null;
            }

            var4 = (FeatherSourceFile165)var3.next();
         } while(var4.ud() != FeatherSourceFile$lh62.CAPE);

         return var4;
      }
   }

   public static FeatherSourceFile707 vv() {
      if (tk == null) {
         tk = (FeatherSourceFile707)FeatherSourceFile487.mq().getInstance(FeatherSourceFile707.class);
      }

      return tk;
   }
}
