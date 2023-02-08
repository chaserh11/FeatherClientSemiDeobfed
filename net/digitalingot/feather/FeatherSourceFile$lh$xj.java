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

public class FeatherSourceFile$lh$xj {
   public static final StructSize NQ = new StructSize((short)1, (short)2);
   public static final FeatherSourceFile$lh$xj.xj NT = new FeatherSourceFile$lh$xj.xj();
   public static final Factory NS;

   static {
      NS = new Factory(NT);
   }

   public static final class xj extends StructFactory {
      public final FeatherSourceFile$lh$xj.qy xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$lh$xj.qy(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$lh$xj.lh xj(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$lh$xj.lh(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$lh$xj.NQ;
      }

      public final FeatherSourceFile$lh$xj.qy lh(FeatherSourceFile$lh$xj.lh var1) {
         return var1.jF();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$lh$xj.lh)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.xj(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.xj(var1, var2, var3, var4, var5, var6);
      }
   }

   public static class nc {
      public static final StructSize NQ = new StructSize((short)1, (short)2);
      public static final FeatherSourceFile$lh$xj.nc.nc NU = new FeatherSourceFile$lh$xj.nc.nc();
      public static final Factory NS;

      static {
         NS = new Factory(NU);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$lh$xj.nc.xj nc(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$lh$xj.nc.xj(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$lh$xj.nc.lh nc(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$lh$xj.nc.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$lh$xj.nc.NQ;
         }

         public final FeatherSourceFile$lh$xj.nc.xj lh(FeatherSourceFile$lh$xj.nc.lh var1) {
            return var1.jL();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.lh((FeatherSourceFile$lh$xj.nc.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.nc(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.nc(var1, var2, var3, var4, var5, var6);
         }
      }

      public static enum oe {
         FEATHER,
         OTHER,
         _NOT_IN_SCHEMA;

         // $FF: synthetic method
         private static FeatherSourceFile$lh$xj.nc.oe[] $values() {
            return new FeatherSourceFile$lh$xj.nc.oe[]{FEATHER, OTHER, _NOT_IN_SCHEMA};
         }
      }

      public static final class xj extends StructReader {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile836.class.desiredAssertionStatus();

         xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public FeatherSourceFile$lh$xj.nc.oe jK() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$lh$xj.nc.oe.FEATHER;
               case 1:
                  return FeatherSourceFile$lh$xj.nc.oe.OTHER;
               default:
                  return FeatherSourceFile$lh$xj.nc.oe._NOT_IN_SCHEMA;
            }
         }

         public final boolean jM() {
            return this.jK() == FeatherSourceFile$lh$xj.nc.oe.FEATHER;
         }

         public boolean jR() {
            return !this._pointerFieldIsNull(1);
         }

         public FeatherSourceFile$lh$xj.oe.oe jS() {
            if (!nh && this.jK() != FeatherSourceFile$lh$xj.nc.oe.FEATHER) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$lh$xj.oe.oe)this._getPointerField(FeatherSourceFile$lh$xj.oe.NV, 1, (SegmentReader)null, 0);
            }
         }

         public final boolean jP() {
            return this.jK() == FeatherSourceFile$lh$xj.nc.oe.OTHER;
         }

         public final Void jQ() {
            if (!nh && this.jK() != FeatherSourceFile$lh$xj.nc.oe.OTHER) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return Void.VOID;
            }
         }
      }

      public static final class lh extends StructBuilder {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile836.class.desiredAssertionStatus();

         lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public FeatherSourceFile$lh$xj.nc.oe jK() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$lh$xj.nc.oe.FEATHER;
               case 1:
                  return FeatherSourceFile$lh$xj.nc.oe.OTHER;
               default:
                  return FeatherSourceFile$lh$xj.nc.oe._NOT_IN_SCHEMA;
            }
         }

         public final FeatherSourceFile$lh$xj.nc.xj jL() {
            return new FeatherSourceFile$lh$xj.nc.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean jM() {
            return this.jK() == FeatherSourceFile$lh$xj.nc.oe.FEATHER;
         }

         public final FeatherSourceFile$lh$xj.oe.lh jN() {
            if (!nh && this.jK() != FeatherSourceFile$lh$xj.nc.oe.FEATHER) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$lh$xj.oe.lh)this._getPointerField(FeatherSourceFile$lh$xj.oe.NV, 1, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$lh$xj.oe.oe var1) {
            this._setShortField(0, (short)FeatherSourceFile$lh$xj.nc.oe.FEATHER.ordinal());
            this._setPointerField(FeatherSourceFile$lh$xj.oe.NV, 1, var1);
         }

         public final FeatherSourceFile$lh$xj.oe.lh jO() {
            this._setShortField(0, (short)FeatherSourceFile$lh$xj.nc.oe.FEATHER.ordinal());
            return (FeatherSourceFile$lh$xj.oe.lh)this._initPointerField(FeatherSourceFile$lh$xj.oe.NV, 1, 0);
         }

         public final boolean jP() {
            return this.jK() == FeatherSourceFile$lh$xj.nc.oe.OTHER;
         }

         public final Void jQ() {
            if (!nh && this.jK() != FeatherSourceFile$lh$xj.nc.oe.OTHER) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return Void.VOID;
            }
         }

         public final void lh(Void var1) {
            this._setShortField(0, (short)FeatherSourceFile$lh$xj.nc.oe.OTHER.ordinal());
         }
      }
   }

   public static class oe {
      public static final StructSize NQ = new StructSize((short)1, (short)0);
      public static final FeatherSourceFile$lh$xj.oe.nc NV = new FeatherSourceFile$lh$xj.oe.nc();
      public static final Factory NS;

      static {
         NS = new Factory(NV);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$lh$xj.oe.oe oe(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$lh$xj.oe.oe(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$lh$xj.oe.lh oe(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$lh$xj.oe.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$lh$xj.oe.NQ;
         }

         public final FeatherSourceFile$lh$xj.oe.oe lh(FeatherSourceFile$lh$xj.oe.lh var1) {
            return var1.jT();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.lh((FeatherSourceFile$lh$xj.oe.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.oe(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.oe(var1, var2, var3, var4, var5, var6);
         }
      }

      public static enum xj {
         OWNER,
         DEVELOPER,
         ADMIN,
         STAFF,
         PARTNER,
         CREATOR,
         PRO,
         USER,
         _NOT_IN_SCHEMA;

         // $FF: synthetic method
         private static FeatherSourceFile$lh$xj.oe.xj[] $values() {
            return new FeatherSourceFile$lh$xj.oe.xj[]{OWNER, DEVELOPER, ADMIN, STAFF, PARTNER, CREATOR, PRO, USER, _NOT_IN_SCHEMA};
         }
      }

      public static final class oe extends StructReader {
         oe(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$lh$xj.oe.xj jU() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$lh$xj.oe.xj.OWNER;
               case 1:
                  return FeatherSourceFile$lh$xj.oe.xj.DEVELOPER;
               case 2:
                  return FeatherSourceFile$lh$xj.oe.xj.ADMIN;
               case 3:
                  return FeatherSourceFile$lh$xj.oe.xj.STAFF;
               case 4:
                  return FeatherSourceFile$lh$xj.oe.xj.PARTNER;
               case 5:
                  return FeatherSourceFile$lh$xj.oe.xj.CREATOR;
               case 6:
                  return FeatherSourceFile$lh$xj.oe.xj.PRO;
               case 7:
                  return FeatherSourceFile$lh$xj.oe.xj.USER;
               default:
                  return FeatherSourceFile$lh$xj.oe.xj._NOT_IN_SCHEMA;
            }
         }
      }

      public static final class lh extends StructBuilder {
         lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final FeatherSourceFile$lh$xj.oe.oe jT() {
            return new FeatherSourceFile$lh$xj.oe.oe(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final FeatherSourceFile$lh$xj.oe.xj jU() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$lh$xj.oe.xj.OWNER;
               case 1:
                  return FeatherSourceFile$lh$xj.oe.xj.DEVELOPER;
               case 2:
                  return FeatherSourceFile$lh$xj.oe.xj.ADMIN;
               case 3:
                  return FeatherSourceFile$lh$xj.oe.xj.STAFF;
               case 4:
                  return FeatherSourceFile$lh$xj.oe.xj.PARTNER;
               case 5:
                  return FeatherSourceFile$lh$xj.oe.xj.CREATOR;
               case 6:
                  return FeatherSourceFile$lh$xj.oe.xj.PRO;
               case 7:
                  return FeatherSourceFile$lh$xj.oe.xj.USER;
               default:
                  return FeatherSourceFile$lh$xj.oe.xj._NOT_IN_SCHEMA;
            }
         }

         public final void lh(FeatherSourceFile$lh$xj.oe.xj var1) {
            this._setShortField(0, (short)var1.ordinal());
         }
      }
   }

   public static final class qy extends StructReader {
      qy(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public boolean jG() {
         return !this._pointerFieldIsNull(0);
      }

      public Reader jV() {
         return (Reader)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
      }

      public FeatherSourceFile$lh$xj.nc.xj jW() {
         return new FeatherSourceFile$lh$xj.nc.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
      }
   }

   public static final class lh extends StructBuilder {
      lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$lh$xj.qy jF() {
         return new FeatherSourceFile$lh$xj.qy(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final boolean jG() {
         return !this._pointerFieldIsNull(0);
      }

      public final Builder jH() {
         return (Builder)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
      }

      public final void lh(Reader var1) {
         this._setPointerField(Data.factory, 0, var1);
      }

      public final void as(byte[] var1) {
         this._setPointerField(Data.factory, 0, new Reader(var1));
      }

      public final Builder yz(int var1) {
         return (Builder)this._initPointerField(Data.factory, 0, var1);
      }

      public final FeatherSourceFile$lh$xj.nc.lh jI() {
         return new FeatherSourceFile$lh$xj.nc.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }

      public final FeatherSourceFile$lh$xj.nc.lh jJ() {
         this._setShortField(0, (short)0);
         this._clearPointerField(1);
         return new FeatherSourceFile$lh$xj.nc.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }
   }
}
