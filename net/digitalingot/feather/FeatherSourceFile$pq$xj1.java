package net.digitalingot.feather;

import java.nio.ByteBuffer;
import org.capnproto.Data;
import org.capnproto.SegmentReader;
import org.capnproto.StructReader;
import org.capnproto.Data.Reader;

public final class FeatherSourceFile$pq$xj1 extends StructReader {
   FeatherSourceFile$pq$xj1(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public boolean kN() {
      return !this._pointerFieldIsNull(0);
   }

   public Reader kR() {
      return (Reader)this._getPointerField(Data.factory, 0, (ByteBuffer)null, 0, 0);
   }

   public boolean kS() {
      return !this._pointerFieldIsNull(1);
   }

   public FeatherSourceFile$lh$xj2 kT() {
      return (FeatherSourceFile$lh$xj2)this._getPointerField(FeatherSourceFile$lh44.PB, 1, (SegmentReader)null, 0);
   }
}
