package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.Data.Reader;

public final class FeatherSourceFile$km$xj extends StructReader {
   FeatherSourceFile$km$xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public final int hC() {
      return this._getIntField(0);
   }

   public boolean lB() {
      return !this._pointerFieldIsNull(0);
   }

   public Reader lD() {
      return (Reader)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
   }
}
