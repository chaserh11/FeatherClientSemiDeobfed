package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentBuilder;
import org.capnproto.StructBuilder;
import org.capnproto.Text;
import org.capnproto.Data.Builder;
import org.capnproto.Data.Reader;

public final class FeatherSourceFile$oe$lh1 extends StructBuilder {
   FeatherSourceFile$oe$lh1(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$oe$xj kH() {
      return new FeatherSourceFile$oe$xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
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

   public final boolean kI() {
      return !this._pointerFieldIsNull(1);
   }

   public final org.capnproto.Text.Builder kJ() {
      return (org.capnproto.Text.Builder)this._getPointerField(Text.factory, 1, (ByteBuffer)null, 0, 0);
   }

   public final void lh(org.capnproto.Text.Reader var1) {
      this._setPointerField(Text.factory, 1, var1);
   }

   public final void hz(String var1) {
      this._setPointerField(Text.factory, 1, new org.capnproto.Text.Reader(var1));
   }

   public final org.capnproto.Text.Builder tm(int var1) {
      return (org.capnproto.Text.Builder)this._initPointerField(Text.factory, 1, var1);
   }
}
