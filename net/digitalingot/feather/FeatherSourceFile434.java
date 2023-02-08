package net.digitalingot.feather;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;

@Singleton
public class FeatherSourceFile434 {
   private final Minecraft minecraft;
   private final List QZ = Collections.synchronizedList(new ArrayList(128));
   private final ExecutorService Ra = Executors.newCachedThreadPool((new ThreadFactoryBuilder()).setNameFormat("feather-scheduler-%d").build());

   @Inject
   FeatherSourceFile434(Minecraft var1) {
      this.minecraft = var1;
   }

   public void fe() {
      FeatherSourceFile149.oc.oe((var1) -> {
         if (var1 == FeatherSourceFile$xj20.START) {
            this.wY();
         }

      });
   }

   public void nc(Runnable var1) {
      this.Ra.execute(var1);
   }

   public void xj(Runnable var1) {
      this.minecraft.func_152344_a(var1);
   }

   public void oe(Runnable var1) {
      this.Ra.submit(var1);
   }

   public Future lh(Supplier var1) {
      CompletableFuture var2 = new CompletableFuture();
      this.minecraft.func_152343_a(() -> {
         return var2.complete(var1.get());
      });
      return var2;
   }

   public FeatherSourceFile433 lh(Runnable var1, long var2, long var4) {
      FeatherSourceFile433 var6 = new FeatherSourceFile433(var1, true, var2, var4);
      this.QZ.add(var6);
      return var6;
   }

   public FeatherSourceFile433 nc(Runnable var1, long var2, long var4) {
      FeatherSourceFile433 var6 = new FeatherSourceFile433(var1, false, var2, var4);
      this.QZ.add(var6);
      return var6;
   }

   public void lh(Runnable var1, long var2) {
      FeatherSourceFile432 var4 = new FeatherSourceFile432(var1, true, var2);
      this.QZ.add(var4);
   }

   public void nc(Runnable var1, long var2) {
      FeatherSourceFile432 var4 = new FeatherSourceFile432(var1, false, var2);
      this.QZ.add(var4);
   }

   private void wY() {
      synchronized(this.QZ) {
         Iterator var2 = this.QZ.iterator();

         while(var2.hasNext()) {
            FeatherSourceFile432 var3 = (FeatherSourceFile432)var2.next();
            if (var3.xB()) {
               if (var3 instanceof FeatherSourceFile433) {
                  FeatherSourceFile433 var4 = (FeatherSourceFile433)var3;
                  if (var4.xA()) {
                     var2.remove();
                  } else {
                     var4.km(var4.wZ());
                     this.lh((FeatherSourceFile432)var4);
                  }
               } else {
                  var2.remove();
                  this.lh(var3);
               }
            }
         }

      }
   }

   private void lh(FeatherSourceFile432 var1) {
      if (var1.xD()) {
         var1.xC().run();
      } else {
         this.Ra.execute(var1.xC());
      }

   }
}
