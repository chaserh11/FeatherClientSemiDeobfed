package net.digitalingot.feather;

import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

enum FeatherSourceFile$xj11 {
   SLOW_DOWN(true, FeatherSourceFile235.ld.slowDown),
   SPEED_UP(true, FeatherSourceFile235.ld.speedUp),
   INC_SCALE(true, FeatherSourceFile235.ld.incScale),
   DEC_SCALE(true, FeatherSourceFile235.ld.decScale),
   RESET_SCALE(true, FeatherSourceFile235.ld.resetScale),
   LEFT(true, false, FeatherSourceFile235.ld.left),
   RIGHT(true, false, FeatherSourceFile235.ld.right),
   UP(false, true, FeatherSourceFile235.ld.up),
   UP_LEFT(true, true, FeatherSourceFile235.ld.upLeft),
   UP_RIGHT(true, true, FeatherSourceFile235.ld.upRight),
   DOWN(false, true, FeatherSourceFile235.ld.down),
   DOWN_LEFT(true, true, FeatherSourceFile235.ld.downLeft),
   DOWN_RIGHT(true, true, FeatherSourceFile235.ld.downRight),
   NEXT_MOD(true, FeatherSourceFile235.ld.nextMod),
   PREV_MOD(true, FeatherSourceFile235.ld.prevMod),
   RESET_POS(true, true, FeatherSourceFile235.ld.resetPos);

   private static final int KEY_HOLD_DELAY = 500;
   private final boolean blockX;
   private final boolean blockY;
   private boolean blockScale;
   private long downSince;
   private int[] ids;
   private Consumer onHold;
   private Runnable onPress;
   private Runnable onRelease;

   private FeatherSourceFile$xj11(boolean var3, int... var4) {
      this.blockX = this.blockY = this.blockScale = var3;
      this.ids = var4;
   }

   private FeatherSourceFile$xj11(boolean var3, boolean var4, int... var5) {
      this.blockX = var3;
      this.blockY = var4;
      this.ids = var5;
   }

   private boolean isPressed() {
      int[] var1 = this.ids;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var1[var3];
         if (FeatherSourceFile60.ck(var4)) {
            return true;
         }
      }

      return false;
   }

   private static void handleKeys(FeatherSourceFile500 var0) {
      long var1 = System.currentTimeMillis();
      FeatherSourceFile$xj11[] var3 = values();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         FeatherSourceFile$xj11 var6 = var3[var5];
         FeatherSourceFile89 var7;
         if (!var6.isPressed()) {
            if (var6.downSince != 0L) {
               if (var6.blockX) {
                  FeatherSourceFile500.lh(var0).remove(var6);
               }

               if (var6.blockY) {
                  FeatherSourceFile500.nc(var0).remove(var6);
               }

               if (var6.blockScale) {
                  FeatherSourceFile500.xj(var0).remove(var6);
               }

               if (!FeatherSourceFile500.oe(var0) && FeatherSourceFile500.qy(var0) != null) {
                  var7 = FeatherSourceFile500.qy(var0).hk();
                  long var8 = var1 - 500L;
                  if (var6.blockX) {
                     setDownSince(FeatherSourceFile500.lh(var0), var8);
                  }

                  if (var6.blockY) {
                     setDownSince(FeatherSourceFile500.nc(var0), var8);
                  }

                  if (var6.blockScale) {
                     setDownSince(FeatherSourceFile500.xj(var0), var8);
                     FeatherSourceFile500.lh(var0, var7.gJ);
                  }
               }

               if (var6.downSince > 0L) {
                  if (var6.onRelease != null) {
                     var6.onRelease.run();
                  }

                  var6.downSince = 0L;
               }
            }
         } else if (var6.downSince == 0L) {
            if (var6.blockX) {
               FeatherSourceFile500.lh(var0).add(var6);
            }

            if (var6.blockY) {
               FeatherSourceFile500.nc(var0).add(var6);
            }

            if (var6.blockScale) {
               FeatherSourceFile500.xj(var0).add(var6);
            }

            if (!FeatherSourceFile500.oe(var0) && FeatherSourceFile500.qy(var0) != null) {
               var7 = FeatherSourceFile500.qy(var0).hk();
               if (var6.blockX) {
               }

               if (var6.blockY) {
               }

               if (var6.blockScale) {
                  FeatherSourceFile500.lh(var0, var7.gJ);
               }
            }

            var6.downSince = var1;
            if (var6.onPress != null) {
               var6.onPress.run();
            }
         } else if (var6.onHold == null) {
            if (var6.blockX) {
               FeatherSourceFile500.lh(var0).remove(var6);
            }

            if (var6.blockY) {
               FeatherSourceFile500.nc(var0).remove(var6);
            }

            if (var6.blockScale) {
               FeatherSourceFile500.xj(var0).remove(var6);
            }
         } else if (var1 - var6.downSince > 500L) {
            if (var6.blockX && FeatherSourceFile500.lh(var0).size() > 1 || var6.blockY && FeatherSourceFile500.nc(var0).size() > 1 || var6.blockScale && FeatherSourceFile500.xj(var0).size() > 1) {
               var6.downSince = var1 - 500L;
               if (!FeatherSourceFile500.oe(var0) && FeatherSourceFile500.qy(var0) != null) {
                  var7 = FeatherSourceFile500.qy(var0).hk();
                  if (var6.blockX) {
                  }

                  if (var6.blockY) {
                  }

                  if (var6.blockScale) {
                     FeatherSourceFile500.lh(var0, var7.gJ);
                  }
               }
            }

            var6.onHold.accept(var1 - var6.downSince - 500L);
         }
      }

   }

   private static void setDownSince(Set var0, long var1) {
      FeatherSourceFile$xj11 var4;
      for(Iterator var3 = var0.iterator(); var3.hasNext(); var4.downSince = var1) {
         var4 = (FeatherSourceFile$xj11)var3.next();
      }

   }

   // $FF: synthetic method
   static void access$000(FeatherSourceFile500 var0) {
      handleKeys(var0);
   }

   // $FF: synthetic method
   static Runnable access$702(FeatherSourceFile$xj11 var0, Runnable var1) {
      return var0.onPress = var1;
   }

   // $FF: synthetic method
   static Consumer access$802(FeatherSourceFile$xj11 var0, Consumer var1) {
      return var0.onHold = var1;
   }

   // $FF: synthetic method
   static Runnable access$902(FeatherSourceFile$xj11 var0, Runnable var1) {
      return var0.onRelease = var1;
   }

   // $FF: synthetic method
   private static FeatherSourceFile$xj11[] $values() {
      return new FeatherSourceFile$xj11[]{SLOW_DOWN, SPEED_UP, INC_SCALE, DEC_SCALE, RESET_SCALE, LEFT, RIGHT, UP, UP_LEFT, UP_RIGHT, DOWN, DOWN_LEFT, DOWN_RIGHT, NEXT_MOD, PREV_MOD, RESET_POS};
   }
}
