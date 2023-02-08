package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$mq {
   public static final StructSize NQ = new StructSize((short)0, (short)1);
   public static final FeatherSourceFile$mq.nc1 OQ = new FeatherSourceFile$mq.nc1();
   public static final Factory NS;

   static {
      NS = new Factory(OQ);
   }

   public static final class nc1 extends StructFactory {
      public final FeatherSourceFile$mq.xj1 et(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$mq.xj1(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$mq.lh1 et(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$mq.lh1(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$mq.NQ;
      }

      public final FeatherSourceFile$mq.xj1 lh(FeatherSourceFile$mq.lh1 var1) {
         return var1.qT();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$mq.lh1)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.et(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.et(var1, var2, var3, var4, var5, var6);
      }
   }

   public static final class xj1 extends StructReader {
      xj1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public boolean qP() {
         return !this._pointerFieldIsNull(0);
      }

      public Reader qR() {
         return (Reader)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
      }
   }

   public static final class lh1 extends StructBuilder {
      lh1(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$mq.xj1 qT() {
         return new FeatherSourceFile$mq.xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final boolean qP() {
         return !this._pointerFieldIsNull(0);
      }

      public final Builder qQ() {
         return (Builder)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
      }

      public final void ou(Reader var1) {
         this._setPointerField(Data.factory, 0, var1);
      }

      public final void si(byte[] var1) {
         this._setPointerField(Data.factory, 0, new Reader(var1));
      }

      public final Builder xg(int var1) {
         return (Builder)this._initPointerField(Data.factory, 0, var1);
      }
   }
}
