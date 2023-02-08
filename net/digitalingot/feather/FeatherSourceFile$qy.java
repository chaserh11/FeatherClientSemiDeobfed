package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Text;
import org.capnproto.StructList.Factory;
import org.capnproto.Text.Builder;
import org.capnproto.Text.Reader;

public class FeatherSourceFile$qy {
   public static final StructSize NQ = new StructSize((short)0, (short)1);
   public static final FeatherSourceFile$qy.nc1 OH = new FeatherSourceFile$qy.nc1();
   public static final Factory NS;

   static {
      NS = new Factory(OH);
   }

   public static final class nc1 extends StructFactory {
      public final FeatherSourceFile$qy.xj1 sm(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$qy.xj1(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$qy.lh1 sm(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$qy.lh1(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$qy.NQ;
      }

      public final FeatherSourceFile$qy.xj1 lh(FeatherSourceFile$qy.lh1 var1) {
         return var1.oH();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$qy.lh1)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.sm(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.sm(var1, var2, var3, var4, var5, var6);
      }
   }

   public static final class xj1 extends StructReader {
      xj1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public boolean oI() {
         return !this._pointerFieldIsNull(0);
      }

      public Reader oK() {
         return (Reader)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
      }
   }

   public static final class lh1 extends StructBuilder {
      lh1(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$qy.xj1 oH() {
         return new FeatherSourceFile$qy.xj1(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final boolean oI() {
         return !this._pointerFieldIsNull(0);
      }

      public final Builder oJ() {
         return (Builder)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
      }

      public final void xj(Reader var1) {
         this._setPointerField(Text.factory, 0, var1);
      }

      public final void bx(String var1) {
         this._setPointerField(Text.factory, 0, new Reader(var1));
      }

      public final Builder cf(int var1) {
         return (Builder)this._initPointerField(Text.factory, 0, var1);
      }
   }
}
