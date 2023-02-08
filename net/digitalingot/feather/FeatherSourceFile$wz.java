package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Void;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$wz {
   public static final StructSize NQ = new StructSize((short)1, (short)0);
   public static final FeatherSourceFile$wz.nc1 OV = new FeatherSourceFile$wz.nc1();
   public static final Factory NS;

   static {
      NS = new Factory(OV);
   }

   public static final class nc1 extends StructFactory {
      public final FeatherSourceFile$wz.xj1 er(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$wz.xj1(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$wz.lh er(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$wz.lh(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$wz.NQ;
      }

      public final FeatherSourceFile$wz.xj1 lh(FeatherSourceFile$wz.lh var1) {
         return var1.rG();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$wz.lh)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.er(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.er(var1, var2, var3, var4, var5, var6);
      }
   }

   public static class oe {
      public static final StructSize NQ = new StructSize((short)1, (short)0);
      public static final FeatherSourceFile$wz.oe.nc OW = new FeatherSourceFile$wz.oe.nc();
      public static final Factory NS;

      static {
         NS = new Factory(OW);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$wz.oe.xj zd(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$wz.oe.xj(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$wz.oe.lh zd(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$wz.oe.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$wz.oe.NQ;
         }

         public final FeatherSourceFile$wz.oe.xj lh(FeatherSourceFile$wz.oe.lh var1) {
            return var1.rL();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.lh((FeatherSourceFile$wz.oe.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.zd(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.zd(var1, var2, var3, var4, var5, var6);
         }
      }

      public static enum oe {
         SPEECH_MODE,
         PLACEHOLDER,
         _NOT_IN_SCHEMA;

         // $FF: synthetic method
         private static FeatherSourceFile$wz.oe.oe[] $values() {
            return new FeatherSourceFile$wz.oe.oe[]{SPEECH_MODE, PLACEHOLDER, _NOT_IN_SCHEMA};
         }
      }

      public static final class xj extends StructReader {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile835.class.desiredAssertionStatus();

         xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public FeatherSourceFile$wz.oe.oe rK() {
            switch (this._getShortField(1)) {
               case 0:
                  return FeatherSourceFile$wz.oe.oe.SPEECH_MODE;
               case 1:
                  return FeatherSourceFile$wz.oe.oe.PLACEHOLDER;
               default:
                  return FeatherSourceFile$wz.oe.oe._NOT_IN_SCHEMA;
            }
         }

         public final boolean rM() {
            return this.rK() == FeatherSourceFile$wz.oe.oe.SPEECH_MODE;
         }

         public final FeatherSourceFile$nc10 gZ() {
            if (!nh && this.rK() != FeatherSourceFile$wz.oe.oe.SPEECH_MODE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               switch (this._getShortField(0)) {
                  case 0:
                     return FeatherSourceFile$nc10.EVERYONE;
                  case 1:
                     return FeatherSourceFile$nc10.PROXIMITY;
                  default:
                     return FeatherSourceFile$nc10._NOT_IN_SCHEMA;
               }
            }
         }

         public final boolean rN() {
            return this.rK() == FeatherSourceFile$wz.oe.oe.PLACEHOLDER;
         }

         public final Void rO() {
            if (!nh && this.rK() != FeatherSourceFile$wz.oe.oe.PLACEHOLDER) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return Void.VOID;
            }
         }
      }

      public static final class lh extends StructBuilder {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile835.class.desiredAssertionStatus();

         lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public FeatherSourceFile$wz.oe.oe rK() {
            switch (this._getShortField(1)) {
               case 0:
                  return FeatherSourceFile$wz.oe.oe.SPEECH_MODE;
               case 1:
                  return FeatherSourceFile$wz.oe.oe.PLACEHOLDER;
               default:
                  return FeatherSourceFile$wz.oe.oe._NOT_IN_SCHEMA;
            }
         }

         public final FeatherSourceFile$wz.oe.xj rL() {
            return new FeatherSourceFile$wz.oe.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean rM() {
            return this.rK() == FeatherSourceFile$wz.oe.oe.SPEECH_MODE;
         }

         public final FeatherSourceFile$nc10 gZ() {
            if (!nh && this.rK() != FeatherSourceFile$wz.oe.oe.SPEECH_MODE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               switch (this._getShortField(0)) {
                  case 0:
                     return FeatherSourceFile$nc10.EVERYONE;
                  case 1:
                     return FeatherSourceFile$nc10.PROXIMITY;
                  default:
                     return FeatherSourceFile$nc10._NOT_IN_SCHEMA;
               }
            }
         }

         public final void lh(FeatherSourceFile$nc10 var1) {
            this._setShortField(1, (short)FeatherSourceFile$wz.oe.oe.SPEECH_MODE.ordinal());
            this._setShortField(0, (short)var1.ordinal());
         }

         public final boolean rN() {
            return this.rK() == FeatherSourceFile$wz.oe.oe.PLACEHOLDER;
         }

         public final Void rO() {
            if (!nh && this.rK() != FeatherSourceFile$wz.oe.oe.PLACEHOLDER) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return Void.VOID;
            }
         }

         public final void qy(Void var1) {
            this._setShortField(1, (short)FeatherSourceFile$wz.oe.oe.PLACEHOLDER.ordinal());
         }
      }
   }

   public static final class xj1 extends StructReader {
      xj1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public FeatherSourceFile$wz.oe.xj rJ() {
         return new FeatherSourceFile$wz.oe.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
      }
   }

   public static final class lh extends StructBuilder {
      lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$wz.xj1 rG() {
         return new FeatherSourceFile$wz.xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final FeatherSourceFile$wz.oe.lh rH() {
         return new FeatherSourceFile$wz.oe.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }

      public final FeatherSourceFile$wz.oe.lh rI() {
         this._setShortField(0, (short)0);
         this._setShortField(1, (short)0);
         return new FeatherSourceFile$wz.oe.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }
   }
}
