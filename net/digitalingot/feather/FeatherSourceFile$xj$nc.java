package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.TextList;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$xj$nc {
   public static final StructSize NQ = new StructSize((short)0, (short)2);
   public static final FeatherSourceFile$xj$nc.nc NY = new FeatherSourceFile$xj$nc.nc();
   public static final Factory NS;

   static {
      NS = new Factory(NY);
   }

   public static final class nc extends StructFactory {
      public final FeatherSourceFile$xj$nc.xj ou(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$xj$nc.xj(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$xj$nc.lh ou(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$xj$nc.lh(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$xj$nc.NQ;
      }

      public final FeatherSourceFile$xj$nc.xj lh(FeatherSourceFile$xj$nc.lh var1) {
         return var1.kF();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$xj$nc.lh)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.ou(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.ou(var1, var2, var3, var4, var5, var6);
      }
   }

   public static final class xj extends StructReader {
      xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public boolean jG() {
         return !this._pointerFieldIsNull(0);
      }

      public Reader jV() {
         return (Reader)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
      }

      public final boolean jZ() {
         return !this._pointerFieldIsNull(1);
      }

      public final org.capnproto.TextList.Reader kB() {
         return (org.capnproto.TextList.Reader)this._getPointerField(TextList.factory, 1, (SegmentReader)null, 0);
      }
   }

   public static final class lh extends StructBuilder {
      lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$xj$nc.xj kF() {
         return new FeatherSourceFile$xj$nc.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

      public final boolean jZ() {
         return !this._pointerFieldIsNull(1);
      }

      public final org.capnproto.TextList.Builder kA() {
         return (org.capnproto.TextList.Builder)this._getPointerField(TextList.factory, 1, (SegmentReader)null, 0);
      }

      public final void lh(org.capnproto.TextList.Reader var1) {
         this._setPointerField(TextList.factory, 1, var1);
      }

      public final org.capnproto.TextList.Builder ii(int var1) {
         return (org.capnproto.TextList.Builder)this._initPointerField(TextList.factory, 1, var1);
      }
   }
}
