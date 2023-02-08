package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructList.Builder;
import org.capnproto.StructList.Reader;

public final class FeatherSourceFile$xj$lh extends StructBuilder {
   FeatherSourceFile$xj$lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
      super(var1, var2, var3, var4, var5);
   }

   public final FeatherSourceFile$xj$oe kC() {
      return new FeatherSourceFile$xj$oe(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
   }

   public final boolean kD() {
      return !this._pointerFieldIsNull(0);
   }

   public final Builder kE() {
      return (Builder)this._getPointerField(FeatherSourceFile$xj$nc.NS, 0, (SegmentReader)null, 0);
   }

   public final void nc(Reader var1) {
      this._setPointerField(FeatherSourceFile$xj$nc.NS, 0, var1);
   }

   public final Builder zk(int var1) {
      return (Builder)this._initPointerField(FeatherSourceFile$xj$nc.NS, 0, var1);
   }
}
