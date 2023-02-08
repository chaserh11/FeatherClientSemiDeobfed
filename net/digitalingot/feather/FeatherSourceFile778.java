package net.digitalingot.feather;

import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Provider;
import net.digitalingot.vendor.javax.inject.Singleton;
import org.apache.commons.lang3.StringUtils;

@Singleton
public class FeatherSourceFile778 {
   private final FeatherSourceFile693 pl;
   private final FeatherSourceFile249 sX;
   private final Provider ii;

   private void eC() {
      if (((FeatherSourceFile$lh25)((FeatherSourceFile200)this.ii.get()).pr()).JE) {
         FeatherSourceFile395.lh("random.orb", (float)((FeatherSourceFile$lh25)((FeatherSourceFile200)this.ii.get()).pr()).JF / 100.0F);
      }
   }

   @Inject
   FeatherSourceFile778(FeatherSourceFile693 var1, FeatherSourceFile249 var2, Provider var3) {
      this.pl = var1;
      this.sX = var2;
      this.ii = var3;
   }

   public void lh(FeatherSourceFile72 var1) {
      if (this.pl.tm() != FeatherSourceFile33.BUSY && ((FeatherSourceFile$lh25)((FeatherSourceFile200)this.ii.get()).pr()).JD) {
         this.eC();
         FeatherSourceFile24 var2 = (new FeatherSourceFile24(var1.hz(), StringUtils.abbreviate(var1.op(), 30))).nc(3000L);
         this.sX.lh(var2);
      }
   }

   public void lh(FeatherSourceFile582 var1) {
      if (this.pl.tm() != FeatherSourceFile33.BUSY && ((FeatherSourceFile$lh25)((FeatherSourceFile200)this.ii.get()).pr()).JC && var1.bo() != null) {
         String var2 = String.format(FeatherSourceFile37.nc("feather.notifications.friendPlaying"), var1.hz(), var1.bo());
         FeatherSourceFile24 var3 = (new FeatherSourceFile24(var1.hz(), var2)).nc(3000L);
         this.sX.lh(var3);
      }
   }

   public void lh(FeatherSourceFile79 var1) {
      if (this.pl.tm() != FeatherSourceFile33.BUSY && ((FeatherSourceFile$lh25)((FeatherSourceFile200)this.ii.get()).pr()).JB) {
         if (var1.tm() == FeatherSourceFile33.ONLINE) {
            String var2 = String.format(FeatherSourceFile37.nc("feather.notifications.friendOnline"), var1.hz());
            FeatherSourceFile24 var3 = (new FeatherSourceFile24(var1.hz(), var2)).nc(3000L);
            this.sX.lh(var3);
         }
      }
   }
}
