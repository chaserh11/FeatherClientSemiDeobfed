package net.digitalingot.feather;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.digitalingot.featherserverapi.proto.models.Mod;
import net.digitalingot.vendor.javax.inject.Inject;
import net.digitalingot.vendor.javax.inject.Singleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.resources.ResourcePackRepository.Entry;
import org.capnproto.Text.Reader;
import org.capnproto.TextList.Builder;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

@Singleton
public class FeatherSourceFile366 {
   private boolean xI;
   private final Minecraft minecraft;
   @NotNull
   private final @NotNull FeatherSourceFile849 pv;
   @NotNull
   private final @NotNull FeatherSourceFile434 bh;
   @NotNull
   private final @NotNull FeatherSourceFile665 hb;
   private final boolean xJ;
   private final String mr;

   @Inject
   FeatherSourceFile366(Minecraft var1, @NotNull @NotNull FeatherSourceFile849 var2, @NotNull @NotNull FeatherSourceFile434 var3, @NotNull @NotNull FeatherSourceFile665 var4, @FeatherSourceFile$nc7 boolean var5, @FeatherSourceFile$nc49 String var6) {
      this.minecraft = var1;
      this.pv = var2;
      this.bh = var3;
      this.hb = var4;
      this.xJ = var5;
      this.mr = var6;
   }

   public void fe() {
      FeatherSourceFile400.ws.oe((var1) -> {
         this.R();
      });
      FeatherSourceFile357.ws.oe((var1, var2, var3) -> {
         this.lh(var2, var3);
      });
      FeatherSourceFile725.wi.oe((var1, var2) -> {
         this.T();
      });
   }

   public void R() {
      this.bh.xj(() -> {
         if (this.pv.iU() != null) {
            this.pv.iU().oe(this.S());
         }

      });
   }

   private Consumer S() {
      return (var1) -> {
         this.lh(var1);
         var1.ie(this.minecraft.func_175600_c());
         nc(var1);
         this.xj(var1);
         this.oe(var1);
      };
   }

   private void lh(FeatherSourceFile$ou.qy.lh var1) {
      Runtime var2 = Runtime.getRuntime();
      String var3 = System.getProperty("os.name");
      short var4 = (short)var2.availableProcessors();
      int var5 = qy(var2.maxMemory());
      String var6 = OpenGlHelper.func_183029_j();
      String var7 = GL11.glGetString(7936) + " " + GL11.glGetString(7937);
      FeatherSourceFile$ou.qy.xj.lh var8 = var1.oW();
      var8.fw(var3);
      var8.xj(var4);
      var8.ez(var5);
      var8.mx(var6);
      var8.xl(var7);
   }

   private static void nc(FeatherSourceFile$ou.qy.lh var0) {
      List var1 = (List)FeatherSourceFile316.sm().stream().map(Mod::getName).collect(Collectors.toList());
      Builder var2 = var0.rn(var1.size());

      for(int var3 = 0; var3 < var1.size(); ++var3) {
         String var4 = (String)var1.get(var3);
         var2.set(var3, new Reader(var4));
      }

   }

   private void xj(FeatherSourceFile$ou.qy.lh var1) {
      int var2 = 0;
      List var3 = this.minecraft.func_110438_M().func_110613_c();
      Builder var4 = var1.og(var3.size());

      for(Iterator var5 = var3.iterator(); var5.hasNext(); ++var2) {
         Entry var6 = (Entry)var5.next();
         String var7 = var6.func_110515_d();
         var4.set(var2, new Reader(var7));
      }

   }

   private void oe(FeatherSourceFile$ou.qy.lh var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.hb.dx().iterator();

      while(var3.hasNext()) {
         FeatherSourceFile495 var4 = (FeatherSourceFile495)var3.next();
         if (var4.uj()) {
            var2.add(var4.fg());
         }
      }

      boolean var8 = this.xJ;
      int var9 = var2.size() + 1 + (var8 ? 1 : 0);
      Builder var5 = var1.bw(var9);

      for(int var6 = 0; var6 < var2.size(); ++var6) {
         FeatherSourceFile243 var7 = (FeatherSourceFile243)var2.get(var6);
         var5.set(var6, new Reader(var7.getSlug()));
      }

      if (var8) {
         var5.set(var9 - 1, new Reader("browserHardwareAccel"));
         var5.set(var9 - 2, new Reader("Feather Version: " + this.mr));
      } else {
         var5.set(var9 - 1, new Reader("Feather Version: " + this.mr));
      }

   }

   private static int qy(long var0) {
      return (int)(var0 / 1024L / 1024L);
   }

   private @NotNull void lh(@NotNull String var1, short var2) {
      FeatherSourceFile848 var3 = this.pv.iU();
      if (var3 != null) {
         this.xI = true;
         var3.nc(var1, var2);
      }
   }

   private void T() {
      FeatherSourceFile848 var1 = this.pv.iU();
      if (var1 != null) {
         if (this.xI) {
            var1.iX();
         }
      }
   }
}
