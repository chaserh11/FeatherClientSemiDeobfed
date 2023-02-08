package net.digitalingot.feather;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;

public class FeatherSourceFile93 {
   private static final FeatherSourceFile93 oy = new FeatherSourceFile93(Minecraft.func_71410_x());
   private final GameSettings ug;
   private final FeatherSourceFile$xj7 hv;
   private final FeatherSourceFile$nc31 sm;
   private final FeatherSourceFile$xj7 ly;
   private final FeatherSourceFile$xj7 rp;
   private final FeatherSourceFile$oe5 tx;
   private final FeatherSourceFile$nc31 wn;
   private final FeatherSourceFile$nc31 jh;
   private final FeatherSourceFile$xj7 gr;
   private final FeatherSourceFile$xj7 oh;
   private final FeatherSourceFile$xj7 hg;
   private final FeatherSourceFile$xj7 et;

   public static FeatherSourceFile93 ly() {
      return oy;
   }

   FeatherSourceFile93(Minecraft var1) {
      this.ug = var1.field_71474_y;
      this.hv = new FeatherSourceFile$xj7((var1x) -> {
         this.ug.field_74357_r = (float)var1x;
      }, () -> {
         return (double)this.ug.field_74357_r;
      });
      this.ly = new FeatherSourceFile$xj7((var1x) -> {
         this.ug.field_74334_X = (float)var1x;
      }, () -> {
         return (double)this.ug.field_74334_X;
      });
      this.rp = new FeatherSourceFile$xj7((var1x) -> {
         this.ug.field_74341_c = (float)var1x;
      }, () -> {
         return (double)this.ug.field_74341_c;
      });
      this.sm = new FeatherSourceFile$nc31((var1x) -> {
         this.ug.field_85185_A = var1x;
      }, () -> {
         return this.ug.field_85185_A;
      });
      this.tx = new FeatherSourceFile$oe5((var1x) -> {
         this.ug.field_151451_c = var1x;
      }, () -> {
         return this.ug.field_151451_c;
      });
      this.wn = new FeatherSourceFile$nc31((var1x) -> {
         this.ug.field_74353_u = var1x;
      }, () -> {
         return this.ug.field_74353_u;
      });
      this.jh = new FeatherSourceFile$nc31((var1x) -> {
         this.ug.field_74352_v = var1x;
      }, () -> {
         return this.ug.field_74352_v;
      });
      this.gr = new FeatherSourceFile$xj7((var0) -> {
         throw new UnsupportedOperationException();
      }, () -> {
         return 0.0;
      });
      this.oh = new FeatherSourceFile$xj7((var2) -> {
         this.ug.field_96692_F = (float)var2;
         var1.field_71456_v.func_146158_b().func_146245_b();
      }, () -> {
         return (double)this.ug.field_96692_F;
      });
      this.hg = new FeatherSourceFile$xj7((var2) -> {
         this.ug.field_96693_G = (float)var2;
         var1.field_71456_v.func_146158_b().func_146245_b();
      }, () -> {
         return (double)this.ug.field_96693_G;
      });
      this.et = new FeatherSourceFile$xj7((var1x) -> {
         this.ug.field_96691_E = (float)var1x;
      }, () -> {
         return (double)this.ug.field_96691_E;
      });
   }

   public void rp() {
      this.ug.func_74303_b();
   }

   public FeatherSourceFile$nc31 tx() {
      return this.sm;
   }

   public FeatherSourceFile$xj7 wn() {
      return this.hv;
   }

   public FeatherSourceFile$xj7 jh() {
      return this.ly;
   }

   public FeatherSourceFile$xj7 gr() {
      return this.rp;
   }

   public FeatherSourceFile$oe5 oh() {
      return this.tx;
   }

   public FeatherSourceFile$nc31 hg() {
      return this.wn;
   }

   public FeatherSourceFile$nc31 et() {
      return this.jh;
   }

   public FeatherSourceFile$xj7 yl() {
      return this.gr;
   }

   public FeatherSourceFile$xj7 ai() {
      return this.oh;
   }

   public FeatherSourceFile$xj7 ja() {
      return this.hg;
   }

   public FeatherSourceFile$xj7 qn() {
      return this.et;
   }

   public boolean er() {
      return this.ug.field_74319_N;
   }

   public boolean zd() {
      return this.ug.field_74330_P;
   }

   public KeyBinding[] ps() {
      return this.ug.field_74324_K;
   }

   public KeyBinding xm() {
      return this.ug.field_151444_V;
   }

   public KeyBinding ku() {
      return this.ug.field_74311_E;
   }

   public void xj(boolean var1) {
      this.ug.field_74326_T = var1;
   }

   public boolean vt() {
      return this.ug.field_74326_T;
   }
}
