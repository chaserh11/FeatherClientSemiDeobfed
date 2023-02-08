package net.digitalingot.feather;

import java.io.Closeable;
import java.io.IOException;
import java.util.Set;
import javax.sound.sampled.TargetDataLine;
import net.digitalingot.vendor.javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile177 extends Thread implements Closeable {
   @NotNull
   private final @NotNull FeatherSourceFile786 Lk;
   @NotNull
   private final @NotNull FeatherSourceFile20 LX;
   private final TargetDataLine LY;
   private final FeatherSourceFile717 KL;
   private final FeatherSourceFile736 Ku;
   private boolean LZ;

   @Inject
   FeatherSourceFile177(@NotNull @NotNull FeatherSourceFile698 var1, @NotNull @NotNull FeatherSourceFile786 var2, @NotNull @NotNull FeatherSourceFile20 var3, @NotNull @NotNull FeatherSourceFile717 var4, @NotNull @NotNull FeatherSourceFile736 var5) {
      this.Lk = var2;
      this.LX = var3;
      this.LY = var1.fO();
      this.KL = var4;
      this.Ku = var5;
      this.setDaemon(true);
      this.setName("feather-recording");
   }

   public void run() {
      try {
         this.fY();
      } catch (InterruptedException var2) {
      }

   }

   private void fY() {
      while(true) {
         if (this.Lk.fE()) {
            this.gC();
         } else {
            this.gB();
         }
      }
   }

   private void gB() {
      Thread.sleep(10L);
      FeatherSourceFile$nc[] var1 = this.Lk.fF();
      if (var1 != null && this.LY != null) {
         try {
            this.LZ = true;

            do {
               byte[] var2 = this.lh(this.LY);
               this.lh(var1, var2);
            } while((var1 = this.Lk.fF()) != null);

            this.LZ = false;
         } finally {
            this.LY.stop();
            this.LY.flush();
         }
      }
   }

   private void gC() {
      byte[] var1 = this.lh(this.LY);
      FeatherSourceFile$nc[] var2 = this.Lk.xj(var1);
      if (var2 == null) {
         this.LZ = false;
      } else {
         this.LZ = true;
         this.lh(var2, var1);
      }
   }

   private byte @NotNull [] lh(@NotNull @NotNull TargetDataLine var1) {
      var1.start();

      while(var1.available() < 960) {
         Thread.sleep(2L);
      }

      byte[] var2 = new byte[960];
      var1.read(var2, 0, 960);
      return var2;
   }

   private void lh(FeatherSourceFile$nc[] var1, byte[] var2) {
      FeatherSourceFile651.lh(var2, this.Lk.eZ());
      byte[] var3 = this.LX.pq(var2);
      Set var4 = this.Ku.F();
      if (var4.size() != 0) {
         this.KL.lh((FeatherSourceFile305)(new FeatherSourceFile38(var4, var3)));
      }
   }

   public void close() {
      try {
         this.LX.close();
      } catch (IOException var2) {
      }

      if (this.LY != null) {
         this.LY.close();
      }

      this.interrupt();
   }

   public boolean gA() {
      return this.LZ;
   }
}
