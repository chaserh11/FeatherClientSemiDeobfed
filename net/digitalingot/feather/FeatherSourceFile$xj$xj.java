package net.digitalingot.feather;

import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.TextList;
import org.capnproto.TextList.Reader;

public final class FeatherSourceFile$xj$xj extends StructReader {
   FeatherSourceFile$xj$xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public final boolean jZ() {
      return !this._pointerFieldIsNull(0);
   }

   public final Reader kB() {
      return (Reader)this._getPointerField(TextList.factory, 0, (SegmentReader)null, 0);
   }
}
