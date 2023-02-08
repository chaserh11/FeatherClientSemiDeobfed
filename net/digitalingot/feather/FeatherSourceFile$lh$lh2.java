package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentBuilder;
import org.capnproto.StructBuilder;
import org.capnproto.Text;
import org.capnproto.Text.Builder;
import org.capnproto.Text.Reader;

public final class FeatherSourceFile$lh$lh2 extends StructBuilder {
   FeatherSourceFile$lh$lh2(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$lh$xj2 vB() {
      return new FeatherSourceFile$lh$xj2(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final boolean vC() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder vD() {
      return (Builder)this._getPointerField(Text.factory, 0, (ByteBuffer)null, 0, 0);
   }

   public final void km(Reader var1) {
      this._setPointerField(Text.factory, 0, var1);
   }

   public final void ud(String var1) {
      this._setPointerField(Text.factory, 0, new Reader(var1));
   }

   public final Builder az(int var1) {
      return (Builder)this._initPointerField(Text.factory, 0, var1);
   }

   public final boolean vE() {
      return !this._pointerFieldIsNull(1);
   }

   public final org.capnproto.Data.Builder vF() {
      return (org.capnproto.Data.Builder)this._getPointerField(Data.factory, 1, (ByteBuffer)null, 0, 0);
   }

   public final void pq(org.capnproto.Data.Reader var1) {
      this._setPointerField(Data.factory, 1, var1);
   }

   public final void wz(byte[] var1) {
      this._setPointerField(Data.factory, 1, new org.capnproto.Data.Reader(var1));
   }

   public final org.capnproto.Data.Builder fo(int var1) {
      return (org.capnproto.Data.Builder)this._initPointerField(Data.factory, 1, var1);
   }
}
