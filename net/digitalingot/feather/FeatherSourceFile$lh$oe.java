package net.digitalingot.feather;

import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.StructList.Reader;

public final class FeatherSourceFile$lh$oe extends StructReader {
   FeatherSourceFile$lh$oe(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public final boolean jD() {
      return !this._pointerFieldIsNull(0);
   }

   public final Reader jX() {
      return (Reader)this._getPointerField(FeatherSourceFile$lh$xj.NS, 0, (SegmentReader)null, 0);
   }
}
