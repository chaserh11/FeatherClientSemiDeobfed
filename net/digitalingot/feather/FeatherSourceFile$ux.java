package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Void;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$ux {
   public static final StructSize NQ = new StructSize((short)1, (short)1);
   public static final FeatherSourceFile$ux.nc OS = new FeatherSourceFile$ux.nc();
   public static final Factory NS;

   static {
      NS = new Factory(OS);
   }

   public static final class nc extends StructFactory {
      public final FeatherSourceFile$ux.xj ai(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$ux.xj(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$ux.lh ai(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$ux.lh(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$ux.NQ;
      }

      public final FeatherSourceFile$ux.xj lh(FeatherSourceFile$ux.lh var1) {
         return var1.qW();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$ux.lh)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.ai(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.ai(var1, var2, var3, var4, var5, var6);
      }
   }

   public static class oe {
      public static final StructSize NQ = new StructSize((short)1, (short)1);
      public static final FeatherSourceFile$ux.oe.nc OT = new FeatherSourceFile$ux.oe.nc();
      public static final Factory NS;

      static {
         NS = new Factory(OT);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$ux.oe.xj ja(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$ux.oe.xj(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$ux.oe.lh ja(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$ux.oe.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$ux.oe.NQ;
         }

         public final FeatherSourceFile$ux.oe.xj lh(FeatherSourceFile$ux.oe.lh var1) {
            return var1.rB();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.lh((FeatherSourceFile$ux.oe.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.ja(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.ja(var1, var2, var3, var4, var5, var6);
         }
      }

      public static enum oe {
         ME,
         TARGET,
         _NOT_IN_SCHEMA;

         // $FF: synthetic method
         private static FeatherSourceFile$ux.oe.oe[] $values() {
            return new FeatherSourceFile$ux.oe.oe[]{ME, TARGET, _NOT_IN_SCHEMA};
         }
      }

      public static final class xj extends StructReader {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile835.class.desiredAssertionStatus();

         xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public FeatherSourceFile$ux.oe.oe rA() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$ux.oe.oe.ME;
               case 1:
                  return FeatherSourceFile$ux.oe.oe.TARGET;
               default:
                  return FeatherSourceFile$ux.oe.oe._NOT_IN_SCHEMA;
            }
         }

         public final boolean rC() {
            return this.rA() == FeatherSourceFile$ux.oe.oe.ME;
         }

         public final Void rD() {
            if (!nh && this.rA() != FeatherSourceFile$ux.oe.oe.ME) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return Void.VOID;
            }
         }

         public final boolean rE() {
            return this.rA() == FeatherSourceFile$ux.oe.oe.TARGET;
         }

         public boolean qP() {
            if (this.rA() != FeatherSourceFile$ux.oe.oe.TARGET) {
               return false;
            } else {
               return !this._pointerFieldIsNull(0);
            }
         }

         public Reader qR() {
            return (Reader)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
         }
      }

      public static final class lh extends StructBuilder {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile835.class.desiredAssertionStatus();

         lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public FeatherSourceFile$ux.oe.oe rA() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$ux.oe.oe.ME;
               case 1:
                  return FeatherSourceFile$ux.oe.oe.TARGET;
               default:
                  return FeatherSourceFile$ux.oe.oe._NOT_IN_SCHEMA;
            }
         }

         public final FeatherSourceFile$ux.oe.xj rB() {
            return new FeatherSourceFile$ux.oe.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean rC() {
            return this.rA() == FeatherSourceFile$ux.oe.oe.ME;
         }

         public final Void rD() {
            if (!nh && this.rA() != FeatherSourceFile$ux.oe.oe.ME) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return Void.VOID;
            }
         }

         public final void oe(Void var1) {
            this._setShortField(0, (short)FeatherSourceFile$ux.oe.oe.ME.ordinal());
         }

         public final boolean rE() {
            return this.rA() == FeatherSourceFile$ux.oe.oe.TARGET;
         }

         public final boolean qP() {
            if (this.rA() != FeatherSourceFile$ux.oe.oe.TARGET) {
               return false;
            } else {
               return !this._pointerFieldIsNull(0);
            }
         }

         public final Builder qQ() {
            return (Builder)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
         }

         public final void ou(Reader var1) {
            this._setShortField(0, (short)FeatherSourceFile$ux.oe.oe.TARGET.ordinal());
            this._setPointerField(Data.factory, 0, var1);
         }

         public final void si(byte[] var1) {
            this._setShortField(0, (short)FeatherSourceFile$ux.oe.oe.TARGET.ordinal());
            this._setPointerField(Data.factory, 0, new Reader(var1));
         }

         public final Builder xg(int var1) {
            return (Builder)this._initPointerField(Data.factory, 0, var1);
         }
      }
   }

   public static final class xj extends StructReader {
      xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public FeatherSourceFile$ux.oe.xj qZ() {
         return new FeatherSourceFile$ux.oe.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
      }
   }

   public static final class lh extends StructBuilder {
      lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$ux.xj qW() {
         return new FeatherSourceFile$ux.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final FeatherSourceFile$ux.oe.lh qX() {
         return new FeatherSourceFile$ux.oe.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }

      public final FeatherSourceFile$ux.oe.lh qY() {
         this._setShortField(0, (short)0);
         this._clearPointerField(0);
         return new FeatherSourceFile$ux.oe.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }
   }
}
