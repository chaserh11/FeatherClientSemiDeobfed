package net.digitalingot.feather;

import org.capnproto.DataList;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.DataList.Reader;

public final class FeatherSourceFile$lh$xj1 extends StructReader {
   FeatherSourceFile$lh$xj1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public final boolean oB() {
      return !this._pointerFieldIsNull(0);
   }

   public final Reader oD() {
      return (Reader)this._getPointerField(DataList.factory, 0, (SegmentReader)null, 0);
   }
}
