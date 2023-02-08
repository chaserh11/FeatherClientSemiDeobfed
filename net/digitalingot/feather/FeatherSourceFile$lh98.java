package net.digitalingot.feather;

import java.util.Iterator;
import net.minecraft.scoreboard.ScoreObjective;
import org.lwjgl.opengl.GL11;

public class FeatherSourceFile$lh98 extends FeatherSourceFile413 {
   // $FF: synthetic field
   final FeatherSourceFile649 Ev;

   public FeatherSourceFile$lh98(FeatherSourceFile649 var1) {
      this.Ev = var1;
   }

   public void cd() {
      if (this.Ev.uj() && !(FeatherSourceFile649.lh(this.Ev).field_71462_r instanceof FeatherSourceFile788)) {
         float var1 = (float)this.hk().ee();
         GL11.glPushMatrix();
         GL11.glTranslated(this.zm(), this.rq(), 0.0);
         GL11.glScalef(var1, var1, 1.0F);
         this.cl();
         GL11.glPopMatrix();
      }
   }

   public void lh(FeatherSourceFile683 var1) {
      if (var1 == FeatherSourceFile683.MOD_LAYOUT) {
         this.lh(FeatherSourceFile649.nc(this.Ev));
      }

   }

   public void sy() {
      this.lh(FeatherSourceFile649.nc(this.Ev));
   }

   public int rl() {
      return FeatherSourceFile$nc40.xj(FeatherSourceFile649.nc(this.Ev));
   }

   public int fv() {
      return FeatherSourceFile$nc40.oe(FeatherSourceFile649.nc(this.Ev));
   }

   private void cl() {
      if (FeatherSourceFile649.xj(this.Ev)) {
         ScoreObjective var1 = FeatherSourceFile649.oe(this.Ev);
         FeatherSourceFile649.lh(this.Ev, var1 != null ? FeatherSourceFile649.lh(this.Ev, FeatherSourceFile649.oe(this.Ev)) : null);
         FeatherSourceFile649.lh(this.Ev, false);
      }

      if (FeatherSourceFile649.qy(this.Ev) != null) {
         this.lh(FeatherSourceFile649.nc(this.Ev));
      }

   }

   private void lh(FeatherSourceFile$nc40 var1) {
      int var2 = ((FeatherSourceFile$xj13)FeatherSourceFile649.ou(this.Ev)).hQ.lm();
      this.gD.xj(0, 0, FeatherSourceFile$nc40.xj(var1), 9, ((FeatherSourceFile$xj13)FeatherSourceFile649.pq(this.Ev)).ED.getRGB());
      this.gD.xj(0, 9, FeatherSourceFile$nc40.xj(var1), FeatherSourceFile$nc40.oe(var1), ((FeatherSourceFile$xj13)FeatherSourceFile649.as(this.Ev)).hH.getRGB());
      Iterator var3 = FeatherSourceFile$nc40.nc(var1).iterator();

      while(var3.hasNext()) {
         FeatherSourceFile$nc$lh3 var4 = (FeatherSourceFile$nc$lh3)var3.next();
         this.gD.lh(FeatherSourceFile$nc$lh3.nc(var4), 2.0F, FeatherSourceFile$nc$lh3.xj(var4), var2, ((FeatherSourceFile$xj13)FeatherSourceFile649.km(this.Ev)).hR);
         if (((FeatherSourceFile$xj13)FeatherSourceFile649.mq(this.Ev)).EC) {
            this.gD.lh(FeatherSourceFile$nc$lh3.lh(var4), FeatherSourceFile$nc$lh3.oe(var4), FeatherSourceFile$nc$lh3.xj(var4), var2, ((FeatherSourceFile$xj13)FeatherSourceFile649.mr(this.Ev)).hR);
         }
      }

      this.gD.lh(FeatherSourceFile$nc40.qy(var1), FeatherSourceFile$nc40.ou(var1), 1.0F, var2, ((FeatherSourceFile$xj13)FeatherSourceFile649.ux(this.Ev)).hR);
   }

   public FeatherSourceFile89 hk() {
      return ((FeatherSourceFile$xj13)FeatherSourceFile649.si(this.Ev)).yT;
   }
}
