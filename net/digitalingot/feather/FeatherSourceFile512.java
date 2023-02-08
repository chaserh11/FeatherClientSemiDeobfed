package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile512 implements FeatherSourceFile826 {
   @NotNull
   private final @NotNull FeatherSourceFile167 xl;
   @NotNull
   private final @NotNull FeatherSourceFile336 ud;
   @NotNull
   private final @NotNull FeatherSourceFile87 pg;

   @Inject
   FeatherSourceFile512(@NotNull @NotNull FeatherSourceFile167 var1, @NotNull @NotNull FeatherSourceFile336 var2, @NotNull @NotNull FeatherSourceFile87 var3) {
      this.xl = var1;
      this.ud = var2;
      this.pg = var3;
   }

   public void lh(UUID var1, String var2) {
      FeatherSourceFile739 var3 = this.ud.wz(var2);
      if (var3 == null) {
         FeatherSourceFile311.Sb.info("received an unknown slug as an incoming emote: {}", new Object[]{var2});
      } else {
         this.xl.lh(var1, var3);
      }
   }

   public void lh(List var1) {
      ArrayList var2 = new ArrayList(var1.size());
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         FeatherSourceFile827 var4 = (FeatherSourceFile827)var3.next();
         ArrayList var5 = new ArrayList(var4.jB().size());
         Iterator var6 = var4.jB().iterator();

         while(var6.hasNext()) {
            String var7 = (String)var6.next();
            FeatherSourceFile165 var8 = this.ud.si(var7);
            if (var8 == null) {
               FeatherSourceFile311.Sb.info("received an unknown slug as an incoming cosmetic: {}", new Object[]{var7});
            } else {
               var5.add(var8);
            }
         }

         var2.add(new FeatherSourceFile$lh120(var4.sd(), var5));
      }

      this.xl.lh(var2);
   }

   public void nc(List var1) {
      this.ud.dz().clear();
      this.ud.hm().clear();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         switch (this.ud.ux(var3)) {
            case COSMETIC:
               FeatherSourceFile165 var4 = this.ud.si(var3);

               assert var4 != null;

               this.ud.dz().put(var3, var4);
               break;
            case EMOTE:
               FeatherSourceFile739 var5 = this.ud.wz(var3);

               assert var5 != null;

               this.ud.hm().put(var3, var5);
               break;
            case NONE:
               FeatherSourceFile311.Sb.info("received an unknown slug as an owned cosmetic: {}", new Object[]{var3});
         }
      }

      this.pg.px();
   }
}
