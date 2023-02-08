package net.digitalingot.feather;

import org.capnproto.DataList;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Void;
import org.capnproto.DataList.Builder;
import org.capnproto.DataList.Reader;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$hb {
   public static final StructSize NQ = new StructSize((short)1, (short)1);
   public static final FeatherSourceFile$hb.nc Pw = new FeatherSourceFile$hb.nc();
   public static final Factory NS;

   static {
      NS = new Factory(Pw);
   }

   public static final class nc extends StructFactory {
      public final FeatherSourceFile$hb.oe ps(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$hb.oe(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$hb.lh ps(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$hb.lh(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$hb.NQ;
      }

      public final FeatherSourceFile$hb.oe lh(FeatherSourceFile$hb.lh var1) {
         return var1.rP();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$hb.lh)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.ps(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.ps(var1, var2, var3, var4, var5, var6);
      }
   }

   public static class qy {
      public static final StructSize NQ = new StructSize((short)1, (short)1);
      public static final FeatherSourceFile$hb.qy.nc Py = new FeatherSourceFile$hb.qy.nc();
      public static final Factory NS;

      static {
         NS = new Factory(Py);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$hb.qy.xj ku(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$hb.qy.xj(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$hb.qy.lh ku(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$hb.qy.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$hb.qy.NQ;
         }

         public final FeatherSourceFile$hb.qy.xj lh(FeatherSourceFile$hb.qy.lh var1) {
            return var1.sB();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.lh((FeatherSourceFile$hb.qy.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.ku(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.ku(var1, var2, var3, var4, var5, var6);
         }
      }

      public static enum oe {
         LIST_UPDATE,
         REMOVE_ALL,
         _NOT_IN_SCHEMA;

         // $FF: synthetic method
         private static FeatherSourceFile$hb.qy.oe[] $values() {
            return new FeatherSourceFile$hb.qy.oe[]{LIST_UPDATE, REMOVE_ALL, _NOT_IN_SCHEMA};
         }
      }

      public static final class xj extends StructReader {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile835.class.desiredAssertionStatus();

         xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public FeatherSourceFile$hb.qy.oe sA() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$hb.qy.oe.LIST_UPDATE;
               case 1:
                  return FeatherSourceFile$hb.qy.oe.REMOVE_ALL;
               default:
                  return FeatherSourceFile$hb.qy.oe._NOT_IN_SCHEMA;
            }
         }

         public final boolean sC() {
            return this.sA() == FeatherSourceFile$hb.qy.oe.LIST_UPDATE;
         }

         public boolean sH() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$hb.xj.xj sI() {
            if (!nh && this.sA() != FeatherSourceFile$hb.qy.oe.LIST_UPDATE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$hb.xj.xj)this._getPointerField(FeatherSourceFile$hb.xj.Px, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean sF() {
            return this.sA() == FeatherSourceFile$hb.qy.oe.REMOVE_ALL;
         }

         public final Void sG() {
            if (!nh && this.sA() != FeatherSourceFile$hb.qy.oe.REMOVE_ALL) {
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

         public FeatherSourceFile$hb.qy.oe sA() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$hb.qy.oe.LIST_UPDATE;
               case 1:
                  return FeatherSourceFile$hb.qy.oe.REMOVE_ALL;
               default:
                  return FeatherSourceFile$hb.qy.oe._NOT_IN_SCHEMA;
            }
         }

         public final FeatherSourceFile$hb.qy.xj sB() {
            return new FeatherSourceFile$hb.qy.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean sC() {
            return this.sA() == FeatherSourceFile$hb.qy.oe.LIST_UPDATE;
         }

         public final FeatherSourceFile$hb.xj.lh sD() {
            if (!nh && this.sA() != FeatherSourceFile$hb.qy.oe.LIST_UPDATE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$hb.xj.lh)this._getPointerField(FeatherSourceFile$hb.xj.Px, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$hb.xj.xj var1) {
            this._setShortField(0, (short)FeatherSourceFile$hb.qy.oe.LIST_UPDATE.ordinal());
            this._setPointerField(FeatherSourceFile$hb.xj.Px, 0, var1);
         }

         public final FeatherSourceFile$hb.xj.lh sE() {
            this._setShortField(0, (short)FeatherSourceFile$hb.qy.oe.LIST_UPDATE.ordinal());
            return (FeatherSourceFile$hb.xj.lh)this._initPointerField(FeatherSourceFile$hb.xj.Px, 0, 0);
         }

         public final boolean sF() {
            return this.sA() == FeatherSourceFile$hb.qy.oe.REMOVE_ALL;
         }

         public final Void sG() {
            if (!nh && this.sA() != FeatherSourceFile$hb.qy.oe.REMOVE_ALL) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return Void.VOID;
            }
         }

         public final void ou(Void var1) {
            this._setShortField(0, (short)FeatherSourceFile$hb.qy.oe.REMOVE_ALL.ordinal());
         }
      }
   }

   public static class xj {
      public static final StructSize NQ = new StructSize((short)0, (short)2);
      public static final FeatherSourceFile$hb.xj.nc Px = new FeatherSourceFile$hb.xj.nc();
      public static final Factory NS;

      static {
         NS = new Factory(Px);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$hb.xj.xj xm(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$hb.xj.xj(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$hb.xj.lh xm(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$hb.xj.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$hb.xj.NQ;
         }

         public final FeatherSourceFile$hb.xj.xj lh(FeatherSourceFile$hb.xj.lh var1) {
            return var1.rS();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.lh((FeatherSourceFile$hb.xj.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.xm(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.xm(var1, var2, var3, var4, var5, var6);
         }
      }

      public static final class xj extends StructReader {
         xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public final boolean rT() {
            return !this._pointerFieldIsNull(0);
         }

         public final Reader rX() {
            return (Reader)this._getPointerField(DataList.factory, 0, (SegmentReader)null, 0);
         }

         public final boolean rV() {
            return !this._pointerFieldIsNull(1);
         }

         public final Reader rY() {
            return (Reader)this._getPointerField(DataList.factory, 1, (SegmentReader)null, 0);
         }
      }

      public static final class lh extends StructBuilder {
         lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public final FeatherSourceFile$hb.xj.xj rS() {
            return new FeatherSourceFile$hb.xj.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean rT() {
            return !this._pointerFieldIsNull(0);
         }

         public final Builder rU() {
            return (Builder)this._getPointerField(DataList.factory, 0, (SegmentReader)null, 0);
         }

         public final void xj(Reader var1) {
            this._setPointerField(DataList.factory, 0, var1);
         }

         public final Builder hy(int var1) {
            return (Builder)this._initPointerField(DataList.factory, 0, var1);
         }

         public final boolean rV() {
            return !this._pointerFieldIsNull(1);
         }

         public final Builder rW() {
            return (Builder)this._getPointerField(DataList.factory, 1, (SegmentReader)null, 0);
         }

         public final void oe(Reader var1) {
            this._setPointerField(DataList.factory, 1, var1);
         }

         public final Builder ue(int var1) {
            return (Builder)this._initPointerField(DataList.factory, 1, var1);
         }
      }
   }

   public static final class oe extends StructReader {
      oe(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public FeatherSourceFile$hb.qy.xj rZ() {
         return new FeatherSourceFile$hb.qy.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
      }
   }

   public static final class lh extends StructBuilder {
      lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$hb.oe rP() {
         return new FeatherSourceFile$hb.oe(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final FeatherSourceFile$hb.qy.lh rQ() {
         return new FeatherSourceFile$hb.qy.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }

      public final FeatherSourceFile$hb.qy.lh rR() {
         this._setShortField(0, (short)0);
         this._clearPointerField(0);
         return new FeatherSourceFile$hb.qy.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }
   }
}
