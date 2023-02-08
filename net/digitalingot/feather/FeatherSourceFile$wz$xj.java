package net.digitalingot.feather;

import org.capnproto.SegmentBuilder;
import org.capnproto.SegmentReader;
import org.capnproto.StructBuilder;
import org.capnproto.StructFactory;
import org.capnproto.StructReader;
import org.capnproto.StructSize;
import org.capnproto.Void;
import org.capnproto.StructList.Factory;

public class FeatherSourceFile$wz$xj {
   public static final StructSize NQ = new StructSize((short)1, (short)1);
   public static final FeatherSourceFile$wz$xj.nc OC = new FeatherSourceFile$wz$xj.nc();
   public static final Factory NS;

   static {
      NS = new Factory(OC);
   }

   public static final class nc extends StructFactory {
      public final FeatherSourceFile$wz$xj.xj qr(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return new FeatherSourceFile$wz$xj.xj(var1, var2, var3, var4, var5, var6);
      }

      public final FeatherSourceFile$wz$xj.lh qr(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return new FeatherSourceFile$wz$xj.lh(var1, var2, var3, var4, var5);
      }

      public final StructSize structSize() {
         return FeatherSourceFile$wz$xj.NQ;
      }

      public final FeatherSourceFile$wz$xj.xj lh(FeatherSourceFile$wz$xj.lh var1) {
         return var1.lO();
      }

      // $FF: synthetic method
      public StructReader asReader(Object var1) {
         return this.lh((FeatherSourceFile$wz$xj.lh)var1);
      }

      // $FF: synthetic method
      public Object constructBuilder(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         return this.qr(var1, var2, var3, var4, var5);
      }

      // $FF: synthetic method
      public Object constructReader(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         return this.qr(var1, var2, var3, var4, var5, var6);
      }
   }

   public static enum oe {
      AUTHENTICATION_SUCCESS,
      SOFT_ERROR,
      EMOTE_UPDATE,
      OPTION_REFRESH_PROMPT,
      BULK_OPTION_RESPONSE,
      COSMETIC_SET,
      COSMETIC_OWNED,
      PARTY_INFO,
      PARTY_INVITE,
      PARTY_INVITE_DENIED,
      PARTY_LEAVE,
      P2P_JOIN_REQUEST,
      P2P_JOIN_ACCEPTED,
      _NOT_IN_SCHEMA;

      // $FF: synthetic method
      private static FeatherSourceFile$wz$xj.oe[] $values() {
         return new FeatherSourceFile$wz$xj.oe[]{AUTHENTICATION_SUCCESS, SOFT_ERROR, EMOTE_UPDATE, OPTION_REFRESH_PROMPT, BULK_OPTION_RESPONSE, COSMETIC_SET, COSMETIC_OWNED, PARTY_INFO, PARTY_INVITE, PARTY_INVITE_DENIED, PARTY_LEAVE, P2P_JOIN_REQUEST, P2P_JOIN_ACCEPTED, _NOT_IN_SCHEMA};
      }
   }

   public static final class xj extends StructReader {
      // $FF: synthetic field
      static final boolean nh = !FeatherSourceFile836.class.desiredAssertionStatus();

      xj(SegmentReader var1, int var2, int var3, int var4, short var5, int var6) {
         super(var1, var2, var3, var4, var5, var6);
      }

      public FeatherSourceFile$wz$xj.oe lN() {
         switch (this._getShortField(0)) {
            case 0:
               return FeatherSourceFile$wz$xj.oe.AUTHENTICATION_SUCCESS;
            case 1:
               return FeatherSourceFile$wz$xj.oe.SOFT_ERROR;
            case 2:
               return FeatherSourceFile$wz$xj.oe.EMOTE_UPDATE;
            case 3:
               return FeatherSourceFile$wz$xj.oe.OPTION_REFRESH_PROMPT;
            case 4:
               return FeatherSourceFile$wz$xj.oe.BULK_OPTION_RESPONSE;
            case 5:
               return FeatherSourceFile$wz$xj.oe.COSMETIC_SET;
            case 6:
               return FeatherSourceFile$wz$xj.oe.COSMETIC_OWNED;
            case 7:
               return FeatherSourceFile$wz$xj.oe.PARTY_INFO;
            case 8:
               return FeatherSourceFile$wz$xj.oe.PARTY_INVITE;
            case 9:
               return FeatherSourceFile$wz$xj.oe.PARTY_INVITE_DENIED;
            case 10:
               return FeatherSourceFile$wz$xj.oe.PARTY_LEAVE;
            case 11:
               return FeatherSourceFile$wz$xj.oe.P2P_JOIN_REQUEST;
            case 12:
               return FeatherSourceFile$wz$xj.oe.P2P_JOIN_ACCEPTED;
            default:
               return FeatherSourceFile$wz$xj.oe._NOT_IN_SCHEMA;
         }
      }

      public final boolean lP() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.AUTHENTICATION_SUCCESS;
      }

      public final Void lQ() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.AUTHENTICATION_SUCCESS) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return Void.VOID;
         }
      }

      public final boolean lR() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.SOFT_ERROR;
      }

      public boolean nB() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$si$xj1 nC() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.SOFT_ERROR) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$si$xj1)this._getPointerField(FeatherSourceFile$si1.OA, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean lU() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.EMOTE_UPDATE;
      }

      public boolean nD() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$oe$xj nE() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.EMOTE_UPDATE) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$oe$xj)this._getPointerField(FeatherSourceFile$oe9.NZ, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean lX() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.OPTION_REFRESH_PROMPT;
      }

      public boolean nF() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$qy$xj nG() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.OPTION_REFRESH_PROMPT) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$qy$xj)this._getPointerField(FeatherSourceFile$qy5.Oa, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean mA() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.BULK_OPTION_RESPONSE;
      }

      public boolean nH() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$lh$oe nI() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.BULK_OPTION_RESPONSE) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$lh$oe)this._getPointerField(FeatherSourceFile$lh115.NR, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean mD() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.COSMETIC_SET;
      }

      public boolean nJ() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$xj$oe nK() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.COSMETIC_SET) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$xj$oe)this._getPointerField(FeatherSourceFile$xj12.NX, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean mG() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.COSMETIC_OWNED;
      }

      public boolean nL() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$nc$xj1 nM() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.COSMETIC_OWNED) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$nc$xj1)this._getPointerField(FeatherSourceFile$nc47.NW, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean mJ() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.PARTY_INFO;
      }

      public boolean nN() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$as$xj1 nO() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.PARTY_INFO) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$as$xj1)this._getPointerField(FeatherSourceFile$as1.Od, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean mM() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.PARTY_INVITE;
      }

      public boolean nP() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$km$xj nQ() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.PARTY_INVITE) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$km$xj)this._getPointerField(FeatherSourceFile$km1.Oe, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean mP() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.PARTY_INVITE_DENIED;
      }

      public boolean nR() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$mq$xj nS() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.PARTY_INVITE_DENIED) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$mq$xj)this._getPointerField(FeatherSourceFile$mq1.Of, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean mS() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.PARTY_LEAVE;
      }

      public boolean nT() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$mr$xj1 nU() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.PARTY_LEAVE) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$mr$xj1)this._getPointerField(FeatherSourceFile$mr1.Og, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean mV() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.P2P_JOIN_REQUEST;
      }

      public boolean nV() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$pq$xj1 nW() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.P2P_JOIN_REQUEST) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$pq$xj1)this._getPointerField(FeatherSourceFile$pq2.Oc, 0, (SegmentReader)null, 0);
         }
      }

      public final boolean mY() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.P2P_JOIN_ACCEPTED;
      }

      public boolean nX() {
         return !this._pointerFieldIsNull(0);
      }

      public FeatherSourceFile$ou$xj nY() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.P2P_JOIN_ACCEPTED) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$ou$xj)this._getPointerField(FeatherSourceFile$ou3.Ob, 0, (SegmentReader)null, 0);
         }
      }
   }

   public static final class lh extends StructBuilder {
      // $FF: synthetic field
      static final boolean nh = !FeatherSourceFile836.class.desiredAssertionStatus();

      lh(SegmentBuilder var1, int var2, int var3, int var4, short var5) {
         super(var1, var2, var3, var4, var5);
      }

      public FeatherSourceFile$wz$xj.oe lN() {
         switch (this._getShortField(0)) {
            case 0:
               return FeatherSourceFile$wz$xj.oe.AUTHENTICATION_SUCCESS;
            case 1:
               return FeatherSourceFile$wz$xj.oe.SOFT_ERROR;
            case 2:
               return FeatherSourceFile$wz$xj.oe.EMOTE_UPDATE;
            case 3:
               return FeatherSourceFile$wz$xj.oe.OPTION_REFRESH_PROMPT;
            case 4:
               return FeatherSourceFile$wz$xj.oe.BULK_OPTION_RESPONSE;
            case 5:
               return FeatherSourceFile$wz$xj.oe.COSMETIC_SET;
            case 6:
               return FeatherSourceFile$wz$xj.oe.COSMETIC_OWNED;
            case 7:
               return FeatherSourceFile$wz$xj.oe.PARTY_INFO;
            case 8:
               return FeatherSourceFile$wz$xj.oe.PARTY_INVITE;
            case 9:
               return FeatherSourceFile$wz$xj.oe.PARTY_INVITE_DENIED;
            case 10:
               return FeatherSourceFile$wz$xj.oe.PARTY_LEAVE;
            case 11:
               return FeatherSourceFile$wz$xj.oe.P2P_JOIN_REQUEST;
            case 12:
               return FeatherSourceFile$wz$xj.oe.P2P_JOIN_ACCEPTED;
            default:
               return FeatherSourceFile$wz$xj.oe._NOT_IN_SCHEMA;
         }
      }

      public final FeatherSourceFile$wz$xj.xj lO() {
         return new FeatherSourceFile$wz$xj.xj(this.segment, this.data, this.pointers, this.dataSize, this.pointerCount, Integer.MAX_VALUE);
      }

      public final boolean lP() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.AUTHENTICATION_SUCCESS;
      }

      public final Void lQ() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.AUTHENTICATION_SUCCESS) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return Void.VOID;
         }
      }

      public final void nc(Void var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.AUTHENTICATION_SUCCESS.ordinal());
      }

      public final boolean lR() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.SOFT_ERROR;
      }

      public final FeatherSourceFile$si$lh lS() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.SOFT_ERROR) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$si$lh)this._getPointerField(FeatherSourceFile$si1.OA, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$si$xj1 var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.SOFT_ERROR.ordinal());
         this._setPointerField(FeatherSourceFile$si1.OA, 0, var1);
      }

      public final FeatherSourceFile$si$lh lT() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.SOFT_ERROR.ordinal());
         return (FeatherSourceFile$si$lh)this._initPointerField(FeatherSourceFile$si1.OA, 0, 0);
      }

      public final boolean lU() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.EMOTE_UPDATE;
      }

      public final FeatherSourceFile$oe$lh1 lV() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.EMOTE_UPDATE) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$oe$lh1)this._getPointerField(FeatherSourceFile$oe9.NZ, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$oe$xj var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.EMOTE_UPDATE.ordinal());
         this._setPointerField(FeatherSourceFile$oe9.NZ, 0, var1);
      }

      public final FeatherSourceFile$oe$lh1 lW() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.EMOTE_UPDATE.ordinal());
         return (FeatherSourceFile$oe$lh1)this._initPointerField(FeatherSourceFile$oe9.NZ, 0, 0);
      }

      public final boolean lX() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.OPTION_REFRESH_PROMPT;
      }

      public final FeatherSourceFile$qy$lh lY() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.OPTION_REFRESH_PROMPT) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$qy$lh)this._getPointerField(FeatherSourceFile$qy5.Oa, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$qy$xj var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.OPTION_REFRESH_PROMPT.ordinal());
         this._setPointerField(FeatherSourceFile$qy5.Oa, 0, var1);
      }

      public final FeatherSourceFile$qy$lh lZ() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.OPTION_REFRESH_PROMPT.ordinal());
         return (FeatherSourceFile$qy$lh)this._initPointerField(FeatherSourceFile$qy5.Oa, 0, 0);
      }

      public final boolean mA() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.BULK_OPTION_RESPONSE;
      }

      public final FeatherSourceFile$lh$lh4 mB() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.BULK_OPTION_RESPONSE) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$lh$lh4)this._getPointerField(FeatherSourceFile$lh115.NR, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$lh$oe var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.BULK_OPTION_RESPONSE.ordinal());
         this._setPointerField(FeatherSourceFile$lh115.NR, 0, var1);
      }

      public final FeatherSourceFile$lh$lh4 mC() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.BULK_OPTION_RESPONSE.ordinal());
         return (FeatherSourceFile$lh$lh4)this._initPointerField(FeatherSourceFile$lh115.NR, 0, 0);
      }

      public final boolean mD() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.COSMETIC_SET;
      }

      public final FeatherSourceFile$xj$lh mE() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.COSMETIC_SET) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$xj$lh)this._getPointerField(FeatherSourceFile$xj12.NX, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$xj$oe var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.COSMETIC_SET.ordinal());
         this._setPointerField(FeatherSourceFile$xj12.NX, 0, var1);
      }

      public final FeatherSourceFile$xj$lh mF() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.COSMETIC_SET.ordinal());
         return (FeatherSourceFile$xj$lh)this._initPointerField(FeatherSourceFile$xj12.NX, 0, 0);
      }

      public final boolean mG() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.COSMETIC_OWNED;
      }

      public final FeatherSourceFile$nc$lh4 mH() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.COSMETIC_OWNED) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$nc$lh4)this._getPointerField(FeatherSourceFile$nc47.NW, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$nc$xj1 var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.COSMETIC_OWNED.ordinal());
         this._setPointerField(FeatherSourceFile$nc47.NW, 0, var1);
      }

      public final FeatherSourceFile$nc$lh4 mI() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.COSMETIC_OWNED.ordinal());
         return (FeatherSourceFile$nc$lh4)this._initPointerField(FeatherSourceFile$nc47.NW, 0, 0);
      }

      public final boolean mJ() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.PARTY_INFO;
      }

      public final FeatherSourceFile$as$lh1 mK() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.PARTY_INFO) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$as$lh1)this._getPointerField(FeatherSourceFile$as1.Od, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$as$xj1 var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.PARTY_INFO.ordinal());
         this._setPointerField(FeatherSourceFile$as1.Od, 0, var1);
      }

      public final FeatherSourceFile$as$lh1 mL() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.PARTY_INFO.ordinal());
         return (FeatherSourceFile$as$lh1)this._initPointerField(FeatherSourceFile$as1.Od, 0, 0);
      }

      public final boolean mM() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.PARTY_INVITE;
      }

      public final FeatherSourceFile$km$lh mN() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.PARTY_INVITE) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$km$lh)this._getPointerField(FeatherSourceFile$km1.Oe, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$km$xj var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.PARTY_INVITE.ordinal());
         this._setPointerField(FeatherSourceFile$km1.Oe, 0, var1);
      }

      public final FeatherSourceFile$km$lh mO() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.PARTY_INVITE.ordinal());
         return (FeatherSourceFile$km$lh)this._initPointerField(FeatherSourceFile$km1.Oe, 0, 0);
      }

      public final boolean mP() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.PARTY_INVITE_DENIED;
      }

      public final FeatherSourceFile$mq$lh mQ() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.PARTY_INVITE_DENIED) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$mq$lh)this._getPointerField(FeatherSourceFile$mq1.Of, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$mq$xj var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.PARTY_INVITE_DENIED.ordinal());
         this._setPointerField(FeatherSourceFile$mq1.Of, 0, var1);
      }

      public final FeatherSourceFile$mq$lh mR() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.PARTY_INVITE_DENIED.ordinal());
         return (FeatherSourceFile$mq$lh)this._initPointerField(FeatherSourceFile$mq1.Of, 0, 0);
      }

      public final boolean mS() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.PARTY_LEAVE;
      }

      public final FeatherSourceFile$mr$lh mT() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.PARTY_LEAVE) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$mr$lh)this._getPointerField(FeatherSourceFile$mr1.Og, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$mr$xj1 var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.PARTY_LEAVE.ordinal());
         this._setPointerField(FeatherSourceFile$mr1.Og, 0, var1);
      }

      public final FeatherSourceFile$mr$lh mU() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.PARTY_LEAVE.ordinal());
         return (FeatherSourceFile$mr$lh)this._initPointerField(FeatherSourceFile$mr1.Og, 0, 0);
      }

      public final boolean mV() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.P2P_JOIN_REQUEST;
      }

      public final FeatherSourceFile$pq$lh1 mW() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.P2P_JOIN_REQUEST) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$pq$lh1)this._getPointerField(FeatherSourceFile$pq2.Oc, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$pq$xj1 var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.P2P_JOIN_REQUEST.ordinal());
         this._setPointerField(FeatherSourceFile$pq2.Oc, 0, var1);
      }

      public final FeatherSourceFile$pq$lh1 mX() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.P2P_JOIN_REQUEST.ordinal());
         return (FeatherSourceFile$pq$lh1)this._initPointerField(FeatherSourceFile$pq2.Oc, 0, 0);
      }

      public final boolean mY() {
         return this.lN() == FeatherSourceFile$wz$xj.oe.P2P_JOIN_ACCEPTED;
      }

      public final FeatherSourceFile$ou$lh mZ() {
         if (!nh && this.lN() != FeatherSourceFile$wz$xj.oe.P2P_JOIN_ACCEPTED) {
            throw new AssertionError("Must check which() before get()ing a union member.");
         } else {
            return (FeatherSourceFile$ou$lh)this._getPointerField(FeatherSourceFile$ou3.Ob, 0, (SegmentReader)null, 0);
         }
      }

      public final void lh(FeatherSourceFile$ou$xj var1) {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.P2P_JOIN_ACCEPTED.ordinal());
         this._setPointerField(FeatherSourceFile$ou3.Ob, 0, var1);
      }

      public final FeatherSourceFile$ou$lh nA() {
         this._setShortField(0, (short)FeatherSourceFile$wz$xj.oe.P2P_JOIN_ACCEPTED.ordinal());
         return (FeatherSourceFile$ou$lh)this._initPointerField(FeatherSourceFile$ou3.Ob, 0, 0);
      }
   }
}
