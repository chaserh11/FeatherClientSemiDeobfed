package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$ep {
   public static final StructSize NQ = new StructSize((short)1, (short)1);
   public static final FeatherSourceFile$ep.nc Pz = new FeatherSourceFile$ep.nc();
   public static final Factory NS;

   static {
      NS = new Factory(Pz);
   }

   public static final class nc extends StructFactory {
      public final FeatherSourceFile$ep.oe vt(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$ep.oe(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$ep.lh vt(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$ep.lh(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$ep.NQ;
      }

      public final FeatherSourceFile$ep.oe lh(FeatherSourceFile$ep.lh var1) {
         return var1.sJ();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$ep.lh)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.vt(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.vt(var1, var2, var3, var4, var5, var6);
      }
   }

   public static class xj {
      public static final StructSize NQ = new StructSize((short)1, (short)1);
      public static final FeatherSourceFile$ep.xj.nc PA = new FeatherSourceFile$ep.xj.nc();
      public static final Factory NS;

      static {
         NS = new Factory(PA);
      }

      public static final class nc extends StructFactory {
         public final FeatherSourceFile$ep.xj.xj ck(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return new FeatherSourceFile$ep.xj.xj(var1, var2, var3, var4, var5, var6);
         }

         public final FeatherSourceFile$ep.xj.lh ck(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return new FeatherSourceFile$ep.xj.lh(var1, var2, var3, var4, var5);
         }

         public final StructSize structSize() {
            return FeatherSourceFile$ep.xj.NQ;
         }

         public final FeatherSourceFile$ep.xj.xj lh(FeatherSourceFile$ep.xj.lh var1) {
            return var1.sN();
         }

         // $FF: synthetic method
         public StructReader asReader(Object var1) {
            return this.lh((FeatherSourceFile$ep.xj.lh)var1);
         }

         // $FF: synthetic method
         public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            return this.ck(var1, var2, var3, var4, var5);
         }

         // $FF: synthetic method
         public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            return this.ck(var1, var2, var3, var4, var5, var6);
         }
      }

      public static enum oe {
         HANDSHAKE,
         METRICS,
         TRACKING_UPDATE,
         BULK_OPTION_REQUEST,
         COSMETIC_REQUEST,
         COSMETIC_SET,
         EMOTE_EXECUTE,
         PARTY_CREATE,
         PARTY_SET_OWNER,
         PARTY_INVITE,
         PARTY_INVITE_RESPONSE,
         PARTY_LEAVE,
         PARTY_SETTINGS,
         P2P_JOIN_REQUEST,
         P2P_JOIN_ACCEPTED,
         _NOT_IN_SCHEMA;

         // $FF: synthetic method
         private static FeatherSourceFile$ep.xj.oe[] $values() {
            return new FeatherSourceFile$ep.xj.oe[]{HANDSHAKE, METRICS, TRACKING_UPDATE, BULK_OPTION_REQUEST, COSMETIC_REQUEST, COSMETIC_SET, EMOTE_EXECUTE, PARTY_CREATE, PARTY_SET_OWNER, PARTY_INVITE, PARTY_INVITE_RESPONSE, PARTY_LEAVE, PARTY_SETTINGS, P2P_JOIN_REQUEST, P2P_JOIN_ACCEPTED, _NOT_IN_SCHEMA};
         }
      }

      public static final class xj extends StructReader {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile835.class.desiredAssertionStatus();

         xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
            super(var1, var2, var3, var4, var5, var6);
         }

         public FeatherSourceFile$ep.xj.oe sM() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$ep.xj.oe.HANDSHAKE;
               case 1:
                  return FeatherSourceFile$ep.xj.oe.METRICS;
               case 2:
                  return FeatherSourceFile$ep.xj.oe.TRACKING_UPDATE;
               case 3:
                  return FeatherSourceFile$ep.xj.oe.BULK_OPTION_REQUEST;
               case 4:
                  return FeatherSourceFile$ep.xj.oe.COSMETIC_REQUEST;
               case 5:
                  return FeatherSourceFile$ep.xj.oe.COSMETIC_SET;
               case 6:
                  return FeatherSourceFile$ep.xj.oe.EMOTE_EXECUTE;
               case 7:
                  return FeatherSourceFile$ep.xj.oe.PARTY_CREATE;
               case 8:
                  return FeatherSourceFile$ep.xj.oe.PARTY_SET_OWNER;
               case 9:
                  return FeatherSourceFile$ep.xj.oe.PARTY_INVITE;
               case 10:
                  return FeatherSourceFile$ep.xj.oe.PARTY_INVITE_RESPONSE;
               case 11:
                  return FeatherSourceFile$ep.xj.oe.PARTY_LEAVE;
               case 12:
                  return FeatherSourceFile$ep.xj.oe.PARTY_SETTINGS;
               case 13:
                  return FeatherSourceFile$ep.xj.oe.P2P_JOIN_REQUEST;
               case 14:
                  return FeatherSourceFile$ep.xj.oe.P2P_JOIN_ACCEPTED;
               default:
                  return FeatherSourceFile$ep.xj.oe._NOT_IN_SCHEMA;
            }
         }

         public final boolean sO() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.HANDSHAKE;
         }

         public boolean uB() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$qy.xj1 uC() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.HANDSHAKE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$qy.xj1)this._getPointerField(FeatherSourceFile$qy.OH, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean sR() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.METRICS;
         }

         public boolean uD() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$ou.xj1 uE() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.METRICS) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$ou.xj1)this._getPointerField(FeatherSourceFile$ou.OI, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean sU() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.TRACKING_UPDATE;
         }

         public boolean uF() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$hb.oe uG() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.TRACKING_UPDATE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$hb.oe)this._getPointerField(FeatherSourceFile$hb.Pw, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean sX() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.BULK_OPTION_REQUEST;
         }

         public boolean uH() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$lh$xj1 uI() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.BULK_OPTION_REQUEST) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$lh$xj1)this._getPointerField(FeatherSourceFile$lh82.OD, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean tv() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.COSMETIC_REQUEST;
         }

         public boolean uJ() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$nc$xj uK() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.COSMETIC_REQUEST) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$nc$xj)this._getPointerField(FeatherSourceFile$nc30.OE, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean mD() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.COSMETIC_SET;
         }

         public boolean nJ() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$xj$xj uL() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.COSMETIC_SET) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$xj$xj)this._getPointerField(FeatherSourceFile$xj6.OF, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean tE() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.EMOTE_EXECUTE;
         }

         public boolean uM() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$oe$xj1 uN() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.EMOTE_EXECUTE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$oe$xj1)this._getPointerField(FeatherSourceFile$oe2.OG, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean tH() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_CREATE;
         }

         public boolean uO() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$km.xj1 uP() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_CREATE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$km.xj1)this._getPointerField(FeatherSourceFile$km.OP, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean tK() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_SET_OWNER;
         }

         public boolean uQ() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$si.xj uR() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_SET_OWNER) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$si.xj)this._getPointerField(FeatherSourceFile$si.OU, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean mM() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_INVITE;
         }

         public boolean nP() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$mq.xj1 uS() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_INVITE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$mq.xj1)this._getPointerField(FeatherSourceFile$mq.OQ, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean tP() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_INVITE_RESPONSE;
         }

         public boolean uT() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$mr.xj uU() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_INVITE_RESPONSE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$mr.xj)this._getPointerField(FeatherSourceFile$mr.OR, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean mS() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_LEAVE;
         }

         public boolean nT() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$ux.xj uV() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_LEAVE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$ux.xj)this._getPointerField(FeatherSourceFile$ux.OS, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean tU() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_SETTINGS;
         }

         public boolean uW() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$wz.xj1 uX() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_SETTINGS) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$wz.xj1)this._getPointerField(FeatherSourceFile$wz.OV, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean mV() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.P2P_JOIN_REQUEST;
         }

         public boolean nV() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$as.xj uY() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.P2P_JOIN_REQUEST) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$as.xj)this._getPointerField(FeatherSourceFile$as.OO, 0, (SegmentReader)null, 0);
            }
         }

         public final boolean mY() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.P2P_JOIN_ACCEPTED;
         }

         public boolean nX() {
            return !this._pointerFieldIsNull(0);
         }

         public FeatherSourceFile$pq.xj uZ() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.P2P_JOIN_ACCEPTED) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$pq.xj)this._getPointerField(FeatherSourceFile$pq.ON, 0, (SegmentReader)null, 0);
            }
         }
      }

      public static final class lh extends StructBuilder {
         // $FF: synthetic field
         static final boolean nh = !FeatherSourceFile835.class.desiredAssertionStatus();

         lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
            super(var1, var2, var3, var4, var5);
         }

         public FeatherSourceFile$ep.xj.oe sM() {
            switch (this._getShortField(0)) {
               case 0:
                  return FeatherSourceFile$ep.xj.oe.HANDSHAKE;
               case 1:
                  return FeatherSourceFile$ep.xj.oe.METRICS;
               case 2:
                  return FeatherSourceFile$ep.xj.oe.TRACKING_UPDATE;
               case 3:
                  return FeatherSourceFile$ep.xj.oe.BULK_OPTION_REQUEST;
               case 4:
                  return FeatherSourceFile$ep.xj.oe.COSMETIC_REQUEST;
               case 5:
                  return FeatherSourceFile$ep.xj.oe.COSMETIC_SET;
               case 6:
                  return FeatherSourceFile$ep.xj.oe.EMOTE_EXECUTE;
               case 7:
                  return FeatherSourceFile$ep.xj.oe.PARTY_CREATE;
               case 8:
                  return FeatherSourceFile$ep.xj.oe.PARTY_SET_OWNER;
               case 9:
                  return FeatherSourceFile$ep.xj.oe.PARTY_INVITE;
               case 10:
                  return FeatherSourceFile$ep.xj.oe.PARTY_INVITE_RESPONSE;
               case 11:
                  return FeatherSourceFile$ep.xj.oe.PARTY_LEAVE;
               case 12:
                  return FeatherSourceFile$ep.xj.oe.PARTY_SETTINGS;
               case 13:
                  return FeatherSourceFile$ep.xj.oe.P2P_JOIN_REQUEST;
               case 14:
                  return FeatherSourceFile$ep.xj.oe.P2P_JOIN_ACCEPTED;
               default:
                  return FeatherSourceFile$ep.xj.oe._NOT_IN_SCHEMA;
            }
         }

         public final FeatherSourceFile$ep.xj.xj sN() {
            return new FeatherSourceFile$ep.xj.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
         }

         public final boolean sO() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.HANDSHAKE;
         }

         public final FeatherSourceFile$qy.lh1 sP() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.HANDSHAKE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$qy.lh1)this._getPointerField(FeatherSourceFile$qy.OH, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$qy.xj1 var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.HANDSHAKE.ordinal());
            this._setPointerField(FeatherSourceFile$qy.OH, 0, var1);
         }

         public final FeatherSourceFile$qy.lh1 sQ() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.HANDSHAKE.ordinal());
            return (FeatherSourceFile$qy.lh1)this._initPointerField(FeatherSourceFile$qy.OH, 0, 0);
         }

         public final boolean sR() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.METRICS;
         }

         public final FeatherSourceFile$ou.lh1 sS() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.METRICS) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$ou.lh1)this._getPointerField(FeatherSourceFile$ou.OI, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$ou.xj1 var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.METRICS.ordinal());
            this._setPointerField(FeatherSourceFile$ou.OI, 0, var1);
         }

         public final FeatherSourceFile$ou.lh1 sT() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.METRICS.ordinal());
            return (FeatherSourceFile$ou.lh1)this._initPointerField(FeatherSourceFile$ou.OI, 0, 0);
         }

         public final boolean sU() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.TRACKING_UPDATE;
         }

         public final FeatherSourceFile$hb.lh sV() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.TRACKING_UPDATE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$hb.lh)this._getPointerField(FeatherSourceFile$hb.Pw, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$hb.oe var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.TRACKING_UPDATE.ordinal());
            this._setPointerField(FeatherSourceFile$hb.Pw, 0, var1);
         }

         public final FeatherSourceFile$hb.lh sW() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.TRACKING_UPDATE.ordinal());
            return (FeatherSourceFile$hb.lh)this._initPointerField(FeatherSourceFile$hb.Pw, 0, 0);
         }

         public final boolean sX() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.BULK_OPTION_REQUEST;
         }

         public final FeatherSourceFile$lh$lh11 sY() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.BULK_OPTION_REQUEST) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$lh$lh11)this._getPointerField(FeatherSourceFile$lh82.OD, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$lh$xj1 var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.BULK_OPTION_REQUEST.ordinal());
            this._setPointerField(FeatherSourceFile$lh82.OD, 0, var1);
         }

         public final FeatherSourceFile$lh$lh11 sZ() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.BULK_OPTION_REQUEST.ordinal());
            return (FeatherSourceFile$lh$lh11)this._initPointerField(FeatherSourceFile$lh82.OD, 0, 0);
         }

         public final boolean tv() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.COSMETIC_REQUEST;
         }

         public final FeatherSourceFile$nc$lh5 tA() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.COSMETIC_REQUEST) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$nc$lh5)this._getPointerField(FeatherSourceFile$nc30.OE, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$nc$xj var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.COSMETIC_REQUEST.ordinal());
            this._setPointerField(FeatherSourceFile$nc30.OE, 0, var1);
         }

         public final FeatherSourceFile$nc$lh5 tB() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.COSMETIC_REQUEST.ordinal());
            return (FeatherSourceFile$nc$lh5)this._initPointerField(FeatherSourceFile$nc30.OE, 0, 0);
         }

         public final boolean mD() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.COSMETIC_SET;
         }

         public final FeatherSourceFile$xj$lh1 tC() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.COSMETIC_SET) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$xj$lh1)this._getPointerField(FeatherSourceFile$xj6.OF, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$xj$xj var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.COSMETIC_SET.ordinal());
            this._setPointerField(FeatherSourceFile$xj6.OF, 0, var1);
         }

         public final FeatherSourceFile$xj$lh1 tD() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.COSMETIC_SET.ordinal());
            return (FeatherSourceFile$xj$lh1)this._initPointerField(FeatherSourceFile$xj6.OF, 0, 0);
         }

         public final boolean tE() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.EMOTE_EXECUTE;
         }

         public final FeatherSourceFile$oe$lh2 tF() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.EMOTE_EXECUTE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$oe$lh2)this._getPointerField(FeatherSourceFile$oe2.OG, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$oe$xj1 var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.EMOTE_EXECUTE.ordinal());
            this._setPointerField(FeatherSourceFile$oe2.OG, 0, var1);
         }

         public final FeatherSourceFile$oe$lh2 tG() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.EMOTE_EXECUTE.ordinal());
            return (FeatherSourceFile$oe$lh2)this._initPointerField(FeatherSourceFile$oe2.OG, 0, 0);
         }

         public final boolean tH() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_CREATE;
         }

         public final FeatherSourceFile$km.lh1 tI() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_CREATE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$km.lh1)this._getPointerField(FeatherSourceFile$km.OP, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$km.xj1 var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_CREATE.ordinal());
            this._setPointerField(FeatherSourceFile$km.OP, 0, var1);
         }

         public final FeatherSourceFile$km.lh1 tJ() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_CREATE.ordinal());
            return (FeatherSourceFile$km.lh1)this._initPointerField(FeatherSourceFile$km.OP, 0, 0);
         }

         public final boolean tK() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_SET_OWNER;
         }

         public final FeatherSourceFile$si.lh1 tL() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_SET_OWNER) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$si.lh1)this._getPointerField(FeatherSourceFile$si.OU, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$si.xj var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_SET_OWNER.ordinal());
            this._setPointerField(FeatherSourceFile$si.OU, 0, var1);
         }

         public final FeatherSourceFile$si.lh1 tM() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_SET_OWNER.ordinal());
            return (FeatherSourceFile$si.lh1)this._initPointerField(FeatherSourceFile$si.OU, 0, 0);
         }

         public final boolean mM() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_INVITE;
         }

         public final FeatherSourceFile$mq.lh1 tN() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_INVITE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$mq.lh1)this._getPointerField(FeatherSourceFile$mq.OQ, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$mq.xj1 var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_INVITE.ordinal());
            this._setPointerField(FeatherSourceFile$mq.OQ, 0, var1);
         }

         public final FeatherSourceFile$mq.lh1 tO() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_INVITE.ordinal());
            return (FeatherSourceFile$mq.lh1)this._initPointerField(FeatherSourceFile$mq.OQ, 0, 0);
         }

         public final boolean tP() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_INVITE_RESPONSE;
         }

         public final FeatherSourceFile$mr.lh1 tQ() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_INVITE_RESPONSE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$mr.lh1)this._getPointerField(FeatherSourceFile$mr.OR, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$mr.xj var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_INVITE_RESPONSE.ordinal());
            this._setPointerField(FeatherSourceFile$mr.OR, 0, var1);
         }

         public final FeatherSourceFile$mr.lh1 tR() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_INVITE_RESPONSE.ordinal());
            return (FeatherSourceFile$mr.lh1)this._initPointerField(FeatherSourceFile$mr.OR, 0, 0);
         }

         public final boolean mS() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_LEAVE;
         }

         public final FeatherSourceFile$ux.lh tS() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_LEAVE) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$ux.lh)this._getPointerField(FeatherSourceFile$ux.OS, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$ux.xj var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_LEAVE.ordinal());
            this._setPointerField(FeatherSourceFile$ux.OS, 0, var1);
         }

         public final FeatherSourceFile$ux.lh tT() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_LEAVE.ordinal());
            return (FeatherSourceFile$ux.lh)this._initPointerField(FeatherSourceFile$ux.OS, 0, 0);
         }

         public final boolean tU() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.PARTY_SETTINGS;
         }

         public final FeatherSourceFile$wz.lh tV() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.PARTY_SETTINGS) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$wz.lh)this._getPointerField(FeatherSourceFile$wz.OV, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$wz.xj1 var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_SETTINGS.ordinal());
            this._setPointerField(FeatherSourceFile$wz.OV, 0, var1);
         }

         public final FeatherSourceFile$wz.lh tW() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.PARTY_SETTINGS.ordinal());
            return (FeatherSourceFile$wz.lh)this._initPointerField(FeatherSourceFile$wz.OV, 0, 0);
         }

         public final boolean mV() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.P2P_JOIN_REQUEST;
         }

         public final FeatherSourceFile$as.lh tX() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.P2P_JOIN_REQUEST) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$as.lh)this._getPointerField(FeatherSourceFile$as.OO, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$as.xj var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.P2P_JOIN_REQUEST.ordinal());
            this._setPointerField(FeatherSourceFile$as.OO, 0, var1);
         }

         public final FeatherSourceFile$as.lh tY() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.P2P_JOIN_REQUEST.ordinal());
            return (FeatherSourceFile$as.lh)this._initPointerField(FeatherSourceFile$as.OO, 0, 0);
         }

         public final boolean mY() {
            return this.sM() == FeatherSourceFile$ep.xj.oe.P2P_JOIN_ACCEPTED;
         }

         public final FeatherSourceFile$pq.lh tZ() {
            if (!nh && this.sM() != FeatherSourceFile$ep.xj.oe.P2P_JOIN_ACCEPTED) {
               throw new AssertionError("Must check which() before get()ing a union member.");
            } else {
               return (FeatherSourceFile$pq.lh)this._getPointerField(FeatherSourceFile$pq.ON, 0, (SegmentReader)null, 0);
            }
         }

         public final void lh(FeatherSourceFile$pq.xj var1) {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.P2P_JOIN_ACCEPTED.ordinal());
            this._setPointerField(FeatherSourceFile$pq.ON, 0, var1);
         }

         public final FeatherSourceFile$pq.lh uA() {
            this._setShortField(0, (short)FeatherSourceFile$ep.xj.oe.P2P_JOIN_ACCEPTED.ordinal());
            return (FeatherSourceFile$pq.lh)this._initPointerField(FeatherSourceFile$pq.ON, 0, 0);
         }
      }
   }

   public static final class oe extends StructReader {
      oe(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public FeatherSourceFile$ep.xj.xj vA() {
         return new FeatherSourceFile$ep.xj.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, this.nestingLimit);
      }
   }

   public static final class lh extends StructBuilder {
      lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public final FeatherSourceFile$ep.oe sJ() {
         return new FeatherSourceFile$ep.oe(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final FeatherSourceFile$ep.xj.lh sK() {
         return new FeatherSourceFile$ep.xj.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }

      public final FeatherSourceFile$ep.xj.lh sL() {
         this._setShortField(0, (short)0);
         this._clearPointerField(0);
         return new FeatherSourceFile$ep.xj.lh(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount);
      }
   }
}
