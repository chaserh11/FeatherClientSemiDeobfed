package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructList.Builder;
import org.capnproto.StructList.Reader;

public final class FeatherSourceFile$lh$lh4 extends StructBuilder {
   FeatherSourceFile$lh$lh4(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$lh$oe jC() {
      return new FeatherSourceFile$lh$oe(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final boolean jD() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder jE() {
      return (Builder)this._getPointerField(FeatherSourceFile$lh$xj.NS, 0, (SegmentReader)null, 0);
   }

   public final void lh(Reader var1) {
      this._setPointerField(FeatherSourceFile$lh$xj.NS, 0, var1);
   }

   public final Builder ch(int var1) {
      return (Builder)this._initPointerField(FeatherSourceFile$lh$xj.NS, 0, var1);
   }
}
