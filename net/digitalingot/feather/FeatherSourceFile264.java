package net.digitalingot.feather;

import java.io.Closeable;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.FloatControl.Type;
import net.digitalingot.vendor.javax.inject.Inject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.NotNull;

public class FeatherSourceFile264 extends Thread implements Closeable {
   private final Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile676 xA;
   @NotNull
   private final @NotNull FeatherSourceFile786 Lk;
   @NotNull
   private final @NotNull FeatherSourceFile70 JT;
   @NotNull
   private final @NotNull FeatherSourceFile698 Ll;
   private UUID Lm;
   private String name;
   @NotNull
   private final @NotNull BlockingQueue Ln = new LinkedBlockingQueue();
   @NotNull
   private final @NotNull FloatControl Lo;
   @NotNull
   private final @NotNull FeatherSourceFile129 Lp;
   private SourceDataLine Lq;
   private long Lr;

   @Inject
   FeatherSourceFile264(Minecraft var1, @NotNull @NotNull FeatherSourceFile676 var2, @NotNull @NotNull FeatherSourceFile786 var3, @NotNull @NotNull FeatherSourceFile70 var4, @NotNull @NotNull FeatherSourceFile698 var5) {
      this.minecraft = var1;
      this.xA = var2;
      this.Lk = var3;
      this.JT = var4;
      this.Ll = var5;
      this.Lq = this.Ll.fP();
      this.Lo = (FloatControl)this.Lq.getControl(Type.MASTER_GAIN);
      this.Lp = new FeatherSourceFile129();
      this.Lo.setValue(var3.fB() * 40.0F / 100.0F - 35.0F);
      this.setDaemon(true);
   }

   public static @NotNull FeatherSourceFile264 ug(@NotNull @NotNull UUID var0) {
      FeatherSourceFile264 var1 = (FeatherSourceFile264)FeatherSourceFile487.mq().getInstance(FeatherSourceFile264.class);
      var1.Lm = var0;
      var1.setName("feature-playback-" + var0);
      var1.name = var1.hv(var0);
      return var1;
   }

   public void run() {
      try {
         this.fS();
      } catch (InterruptedException var5) {
      } finally {
         if (this.Lq != null) {
            this.Lq.close();
         }

         this.JT.lt(this.Lm);
      }

   }

   private void fS() {
      Thread.sleep(200L);

      FeatherSourceFile526 var1;
      while((var1 = (FeatherSourceFile526)this.Ln.poll(5L, TimeUnit.SECONDS)) != null) {
         byte[] var2;
         if (this.Lq.getBufferSize() - this.Lq.available() <= 0) {
            var2 = new byte[Math.min(2880, this.Lq.getBufferSize() - 960)];
            this.Lq.write(var2, 0, var2.length);
         }

         this.Lr = System.currentTimeMillis();

         try {
            var2 = this.Lp.ou(var1.fN());
         } catch (IllegalStateException var4) {
            FeatherSourceFile311.Sb.info("Failed to decode incoming audio from " + this.Lm);
            continue;
         }

         if (var2.length != 0) {
            byte[] var3 = this.lh(var2, var1.fM());
            if (var3 != null) {
               this.lh(this.Lq, var3);
            }
         }
      }

   }

   private @NotNull void lh(@NotNull @NotNull SourceDataLine var1, byte[] var2) {
      var1.write(var2, 0, var2.length);
      var1.start();
   }

   private byte @NotNull [] lh(byte[] var1, @NotNull FeatherSourceFile$nc var2) {
      boolean var3 = false;
      if (var2 == FeatherSourceFile$nc.PROXIMITY) {
         var3 = true;
      } else {
         FeatherSourceFile628 var4 = this.xA.hB();
         if (var4 == null) {
            return null;
         }

         if (var4.gZ() == FeatherSourceFile$nc10.PROXIMITY) {
            var3 = true;
         }
      }

      FeatherSourceFile401 var11 = null;
      FeatherSourceFile$lh4 var5 = null;
      Object var6;
      if (var3) {
         var11 = this.Lk.qr(this.Lm);
         if (var11 == null) {
            return null;
         }

         var5 = this.Lk.fG();
         if (var5 == null) {
            return null;
         }

         var6 = FeatherSourceFile217.lh(var11, var5);
      } else {
         var6 = ImmutablePair.of(1.0F, 1.0F);
      }

      float var7 = (Float)((Pair)var6).getLeft();
      float var8 = (Float)((Pair)var6).getRight();
      var7 *= this.Lk.fA();
      var8 *= this.Lk.fA();
      if (var3) {
         float var9 = FeatherSourceFile401.nc(var11, var5.fH(), (FeatherSourceFile401)null).zJ();
         if ((double)var9 > 16.0) {
            float var10 = (float)(1.0 - Math.min(((double)var9 - 16.0) / 16.0, 1.0));
            var7 *= var10;
            var8 *= var10;
         }
      }

      var1 = FeatherSourceFile651.lh(var1, var7, var8);
      return var1;
   }

   public boolean fT() {
      return System.currentTimeMillis() - this.Lr < 1000L;
   }

   public void fU() {
      this.Lq.close();
      this.Lq = this.Ll.fP();
   }

   public void close() {
      if (this.Lq != null) {
         this.Lq.close();
      }

      this.interrupt();
   }

   @NotNull
   public @NotNull BlockingQueue fV() {
      return this.Ln;
   }

   @NotNull
   public @NotNull FloatControl fW() {
      return this.Lo;
   }

   @NotNull
   public @NotNull UUID fX() {
      return this.Lm;
   }

   @NotNull
   public @NotNull String me() {
      return this.name;
   }

   @NotNull
   private @NotNull String hv(UUID var1) {
      WorldClient var2 = this.minecraft.field_71441_e;
      if (var2 == null) {
         return "n/a";
      } else {
         EntityPlayer var3 = var2.func_152378_a(var1);
         return var3 == null ? "n/a" : var3.func_70005_c_();
      }
   }
}
