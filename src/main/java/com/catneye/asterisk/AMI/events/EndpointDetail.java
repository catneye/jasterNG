/*
 * jasterNG - Java interface for Asterisk
 * Copyright (C) 2026 Kurchenko O.E.
 *
 * This file is part of jasterNG and is distributed under the GNU General Public License, version 2.
 */
package com.catneye.asterisk.AMI.events;

import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;

/** AMI EndpointDetail event containing the endpoint configuration fields. */
public class EndpointDetail extends SystemEvent implements Serializable {

    public EndpointDetail() {
        super.setEvent("EndpointDetail");
        super.setUuid(UUID.randomUUID());
    }

    private String ObjectType;

    public String getObjectType() {
        return ObjectType;
    }

    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    private String ObjectName;

    public String getObjectName() {
        return ObjectName;
    }

    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    private String Context;

    public String getContext() {
        return Context;
    }

    public void setContext(String Context) {
        this.Context = Context;
    }

    private String Allow;

    public String getAllow() {
        return Allow;
    }

    public void setAllow(String Allow) {
        this.Allow = Allow;
    }

    private String DtmfMode;

    public String getDtmfMode() {
        return DtmfMode;
    }

    public void setDtmfMode(String DtmfMode) {
        this.DtmfMode = DtmfMode;
    }

    private String RtpIpv6;

    public String getRtpIpv6() {
        return RtpIpv6;
    }

    public void setRtpIpv6(String RtpIpv6) {
        this.RtpIpv6 = RtpIpv6;
    }

    private String RtpSymmetric;

    public String getRtpSymmetric() {
        return RtpSymmetric;
    }

    public void setRtpSymmetric(String RtpSymmetric) {
        this.RtpSymmetric = RtpSymmetric;
    }

    private String IceSupport;

    public String getIceSupport() {
        return IceSupport;
    }

    public void setIceSupport(String IceSupport) {
        this.IceSupport = IceSupport;
    }

    private String UsePtime;

    public String getUsePtime() {
        return UsePtime;
    }

    public void setUsePtime(String UsePtime) {
        this.UsePtime = UsePtime;
    }

    private String ForceRport;

    public String getForceRport() {
        return ForceRport;
    }

    public void setForceRport(String ForceRport) {
        this.ForceRport = ForceRport;
    }

    private String RewriteContact;

    public String getRewriteContact() {
        return RewriteContact;
    }

    public void setRewriteContact(String RewriteContact) {
        this.RewriteContact = RewriteContact;
    }

    private String Transport;

    public String getTransport() {
        return Transport;
    }

    public void setTransport(String Transport) {
        this.Transport = Transport;
    }

    private String OutboundProxy;

    public String getOutboundProxy() {
        return OutboundProxy;
    }

    public void setOutboundProxy(String OutboundProxy) {
        this.OutboundProxy = OutboundProxy;
    }

    private String MohSuggest;

    public String getMohSuggest() {
        return MohSuggest;
    }

    public void setMohSuggest(String MohSuggest) {
        this.MohSuggest = MohSuggest;
    }

    private String rel100;

    public String getRel100() {
        return rel100;
    }

    public void setRel100(String rel100) {
        this.rel100 = rel100;
    }

    private String Timers;

    public String getTimers() {
        return Timers;
    }

    public void setTimers(String Timers) {
        this.Timers = Timers;
    }

    private String TimersMinSe;

    public String getTimersMinSe() {
        return TimersMinSe;
    }

    public void setTimersMinSe(String TimersMinSe) {
        this.TimersMinSe = TimersMinSe;
    }

    private String TimersSessExpires;

    public String getTimersSessExpires() {
        return TimersSessExpires;
    }

    public void setTimersSessExpires(String TimersSessExpires) {
        this.TimersSessExpires = TimersSessExpires;
    }

    private String Auth;

    public String getAuth() {
        return Auth;
    }

    public void setAuth(String Auth) {
        this.Auth = Auth;
    }

    private String OutboundAuth;

    public String getOutboundAuth() {
        return OutboundAuth;
    }

    public void setOutboundAuth(String OutboundAuth) {
        this.OutboundAuth = OutboundAuth;
    }

    private String Aors;

    public String getAors() {
        return Aors;
    }

    public void setAors(String Aors) {
        this.Aors = Aors;
    }

    private String MediaAddress;

    public String getMediaAddress() {
        return MediaAddress;
    }

    public void setMediaAddress(String MediaAddress) {
        this.MediaAddress = MediaAddress;
    }

    private String IdentifyBy;

    public String getIdentifyBy() {
        return IdentifyBy;
    }

    public void setIdentifyBy(String IdentifyBy) {
        this.IdentifyBy = IdentifyBy;
    }

    private String DirectMedia;

    public String getDirectMedia() {
        return DirectMedia;
    }

    public void setDirectMedia(String DirectMedia) {
        this.DirectMedia = DirectMedia;
    }

    private String DirectMediaMethod;

    public String getDirectMediaMethod() {
        return DirectMediaMethod;
    }

    public void setDirectMediaMethod(String DirectMediaMethod) {
        this.DirectMediaMethod = DirectMediaMethod;
    }

    private String TrustConnectedLine;

    public String getTrustConnectedLine() {
        return TrustConnectedLine;
    }

    public void setTrustConnectedLine(String TrustConnectedLine) {
        this.TrustConnectedLine = TrustConnectedLine;
    }

    private String SendConnectedLine;

    public String getSendConnectedLine() {
        return SendConnectedLine;
    }

    public void setSendConnectedLine(String SendConnectedLine) {
        this.SendConnectedLine = SendConnectedLine;
    }

    private String ConnectedLineMethod;

    public String getConnectedLineMethod() {
        return ConnectedLineMethod;
    }

    public void setConnectedLineMethod(String ConnectedLineMethod) {
        this.ConnectedLineMethod = ConnectedLineMethod;
    }

    private String DirectMediaGlareMitigation;

    public String getDirectMediaGlareMitigation() {
        return DirectMediaGlareMitigation;
    }

    public void setDirectMediaGlareMitigation(String DirectMediaGlareMitigation) {
        this.DirectMediaGlareMitigation = DirectMediaGlareMitigation;
    }

    private String DisableDirectMediaOnNat;

    public String getDisableDirectMediaOnNat() {
        return DisableDirectMediaOnNat;
    }

    public void setDisableDirectMediaOnNat(String DisableDirectMediaOnNat) {
        this.DisableDirectMediaOnNat = DisableDirectMediaOnNat;
    }

    private String Callerid;

    public String getCallerid() {
        return Callerid;
    }

    public void setCallerid(String Callerid) {
        this.Callerid = Callerid;
    }

    private String CalleridPrivacy;

    public String getCalleridPrivacy() {
        return CalleridPrivacy;
    }

    public void setCalleridPrivacy(String CalleridPrivacy) {
        this.CalleridPrivacy = CalleridPrivacy;
    }

    private String CalleridTag;

    public String getCalleridTag() {
        return CalleridTag;
    }

    public void setCalleridTag(String CalleridTag) {
        this.CalleridTag = CalleridTag;
    }

    private String TrustIdInbound;

    public String getTrustIdInbound() {
        return TrustIdInbound;
    }

    public void setTrustIdInbound(String TrustIdInbound) {
        this.TrustIdInbound = TrustIdInbound;
    }

    private String TrustIdOutbound;

    public String getTrustIdOutbound() {
        return TrustIdOutbound;
    }

    public void setTrustIdOutbound(String TrustIdOutbound) {
        this.TrustIdOutbound = TrustIdOutbound;
    }

    private String SendPai;

    public String getSendPai() {
        return SendPai;
    }

    public void setSendPai(String SendPai) {
        this.SendPai = SendPai;
    }

    private String SendRpid;

    public String getSendRpid() {
        return SendRpid;
    }

    public void setSendRpid(String SendRpid) {
        this.SendRpid = SendRpid;
    }

    private String SendDiversion;

    public String getSendDiversion() {
        return SendDiversion;
    }

    public void setSendDiversion(String SendDiversion) {
        this.SendDiversion = SendDiversion;
    }

    private String Mailboxes;

    public String getMailboxes() {
        return Mailboxes;
    }

    public void setMailboxes(String Mailboxes) {
        this.Mailboxes = Mailboxes;
    }

    private String AggregateMwi;

    public String getAggregateMwi() {
        return AggregateMwi;
    }

    public void setAggregateMwi(String AggregateMwi) {
        this.AggregateMwi = AggregateMwi;
    }

    private String MediaEncryption;

    public String getMediaEncryption() {
        return MediaEncryption;
    }

    public void setMediaEncryption(String MediaEncryption) {
        this.MediaEncryption = MediaEncryption;
    }

    private String MediaEncryptionOptimistic;

    public String getMediaEncryptionOptimistic() {
        return MediaEncryptionOptimistic;
    }

    public void setMediaEncryptionOptimistic(String MediaEncryptionOptimistic) {
        this.MediaEncryptionOptimistic = MediaEncryptionOptimistic;
    }

    private String UseAvpf;

    public String getUseAvpf() {
        return UseAvpf;
    }

    public void setUseAvpf(String UseAvpf) {
        this.UseAvpf = UseAvpf;
    }

    private String ForceAvp;

    public String getForceAvp() {
        return ForceAvp;
    }

    public void setForceAvp(String ForceAvp) {
        this.ForceAvp = ForceAvp;
    }

    private String MediaUseReceivedTransport;

    public String getMediaUseReceivedTransport() {
        return MediaUseReceivedTransport;
    }

    public void setMediaUseReceivedTransport(String MediaUseReceivedTransport) {
        this.MediaUseReceivedTransport = MediaUseReceivedTransport;
    }

    private String OneTouchRecording;

    public String getOneTouchRecording() {
        return OneTouchRecording;
    }

    public void setOneTouchRecording(String OneTouchRecording) {
        this.OneTouchRecording = OneTouchRecording;
    }

    private String InbandProgress;

    public String getInbandProgress() {
        return InbandProgress;
    }

    public void setInbandProgress(String InbandProgress) {
        this.InbandProgress = InbandProgress;
    }

    private String CallGroup;

    public String getCallGroup() {
        return CallGroup;
    }

    public void setCallGroup(String CallGroup) {
        this.CallGroup = CallGroup;
    }

    private String PickupGroup;

    public String getPickupGroup() {
        return PickupGroup;
    }

    public void setPickupGroup(String PickupGroup) {
        this.PickupGroup = PickupGroup;
    }

    private String NamedCallGroup;

    public String getNamedCallGroup() {
        return NamedCallGroup;
    }

    public void setNamedCallGroup(String NamedCallGroup) {
        this.NamedCallGroup = NamedCallGroup;
    }

    private String NamedPickupGroup;

    public String getNamedPickupGroup() {
        return NamedPickupGroup;
    }

    public void setNamedPickupGroup(String NamedPickupGroup) {
        this.NamedPickupGroup = NamedPickupGroup;
    }

    private String DeviceStateBusyAt;

    public String getDeviceStateBusyAt() {
        return DeviceStateBusyAt;
    }

    public void setDeviceStateBusyAt(String DeviceStateBusyAt) {
        this.DeviceStateBusyAt = DeviceStateBusyAt;
    }

    private String T38Udptl;

    public String getT38Udptl() {
        return T38Udptl;
    }

    public void setT38Udptl(String T38Udptl) {
        this.T38Udptl = T38Udptl;
    }

    private String T38UdptlEc;

    public String getT38UdptlEc() {
        return T38UdptlEc;
    }

    public void setT38UdptlEc(String T38UdptlEc) {
        this.T38UdptlEc = T38UdptlEc;
    }

    private String T38UdptlMaxdatagram;

    public String getT38UdptlMaxdatagram() {
        return T38UdptlMaxdatagram;
    }

    public void setT38UdptlMaxdatagram(String T38UdptlMaxdatagram) {
        this.T38UdptlMaxdatagram = T38UdptlMaxdatagram;
    }

    private String FaxDetect;

    public String getFaxDetect() {
        return FaxDetect;
    }

    public void setFaxDetect(String FaxDetect) {
        this.FaxDetect = FaxDetect;
    }

    private String T38UdptlNat;

    public String getT38UdptlNat() {
        return T38UdptlNat;
    }

    public void setT38UdptlNat(String T38UdptlNat) {
        this.T38UdptlNat = T38UdptlNat;
    }

    private String T38UdptlIpv6;

    public String getT38UdptlIpv6() {
        return T38UdptlIpv6;
    }

    public void setT38UdptlIpv6(String T38UdptlIpv6) {
        this.T38UdptlIpv6 = T38UdptlIpv6;
    }

    private String T38BindUdptlToMediaAddress;

    public String getT38BindUdptlToMediaAddress() {
        return T38BindUdptlToMediaAddress;
    }

    public void setT38BindUdptlToMediaAddress(String T38BindUdptlToMediaAddress) {
        this.T38BindUdptlToMediaAddress = T38BindUdptlToMediaAddress;
    }

    private String ToneZone;

    public String getToneZone() {
        return ToneZone;
    }

    public void setToneZone(String ToneZone) {
        this.ToneZone = ToneZone;
    }

    private String Language;

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    private String RecordOnFeature;

    public String getRecordOnFeature() {
        return RecordOnFeature;
    }

    public void setRecordOnFeature(String RecordOnFeature) {
        this.RecordOnFeature = RecordOnFeature;
    }

    private String RecordOffFeature;

    public String getRecordOffFeature() {
        return RecordOffFeature;
    }

    public void setRecordOffFeature(String RecordOffFeature) {
        this.RecordOffFeature = RecordOffFeature;
    }

    private String AllowTransfer;

    public String getAllowTransfer() {
        return AllowTransfer;
    }

    public void setAllowTransfer(String AllowTransfer) {
        this.AllowTransfer = AllowTransfer;
    }

    private String UserEqPhone;

    public String getUserEqPhone() {
        return UserEqPhone;
    }

    public void setUserEqPhone(String UserEqPhone) {
        this.UserEqPhone = UserEqPhone;
    }

    private String MohPassthrough;

    public String getMohPassthrough() {
        return MohPassthrough;
    }

    public void setMohPassthrough(String MohPassthrough) {
        this.MohPassthrough = MohPassthrough;
    }

    private String SdpOwner;

    public String getSdpOwner() {
        return SdpOwner;
    }

    public void setSdpOwner(String SdpOwner) {
        this.SdpOwner = SdpOwner;
    }

    private String SdpSession;

    public String getSdpSession() {
        return SdpSession;
    }

    public void setSdpSession(String SdpSession) {
        this.SdpSession = SdpSession;
    }

    private String TosAudio;

    public String getTosAudio() {
        return TosAudio;
    }

    public void setTosAudio(String TosAudio) {
        this.TosAudio = TosAudio;
    }

    private String TosVideo;

    public String getTosVideo() {
        return TosVideo;
    }

    public void setTosVideo(String TosVideo) {
        this.TosVideo = TosVideo;
    }

    private String CosAudio;

    public String getCosAudio() {
        return CosAudio;
    }

    public void setCosAudio(String CosAudio) {
        this.CosAudio = CosAudio;
    }

    private String CosVideo;

    public String getCosVideo() {
        return CosVideo;
    }

    public void setCosVideo(String CosVideo) {
        this.CosVideo = CosVideo;
    }

    private String AllowSubscribe;

    public String getAllowSubscribe() {
        return AllowSubscribe;
    }

    public void setAllowSubscribe(String AllowSubscribe) {
        this.AllowSubscribe = AllowSubscribe;
    }

    private String SubMinExpiry;

    public String getSubMinExpiry() {
        return SubMinExpiry;
    }

    public void setSubMinExpiry(String SubMinExpiry) {
        this.SubMinExpiry = SubMinExpiry;
    }

    private String FromUser;

    public String getFromUser() {
        return FromUser;
    }

    public void setFromUser(String FromUser) {
        this.FromUser = FromUser;
    }

    private String FromDomain;

    public String getFromDomain() {
        return FromDomain;
    }

    public void setFromDomain(String FromDomain) {
        this.FromDomain = FromDomain;
    }

    private String MwiFromUser;

    public String getMwiFromUser() {
        return MwiFromUser;
    }

    public void setMwiFromUser(String MwiFromUser) {
        this.MwiFromUser = MwiFromUser;
    }

    private String RtpEngine;

    public String getRtpEngine() {
        return RtpEngine;
    }

    public void setRtpEngine(String RtpEngine) {
        this.RtpEngine = RtpEngine;
    }

    private String DtlsVerify;

    public String getDtlsVerify() {
        return DtlsVerify;
    }

    public void setDtlsVerify(String DtlsVerify) {
        this.DtlsVerify = DtlsVerify;
    }

    private String DtlsRekey;

    public String getDtlsRekey() {
        return DtlsRekey;
    }

    public void setDtlsRekey(String DtlsRekey) {
        this.DtlsRekey = DtlsRekey;
    }

    private String DtlsCertFile;

    public String getDtlsCertFile() {
        return DtlsCertFile;
    }

    public void setDtlsCertFile(String DtlsCertFile) {
        this.DtlsCertFile = DtlsCertFile;
    }

    private String DtlsPrivateKey;

    public String getDtlsPrivateKey() {
        return DtlsPrivateKey;
    }

    public void setDtlsPrivateKey(String DtlsPrivateKey) {
        this.DtlsPrivateKey = DtlsPrivateKey;
    }

    private String DtlsCipher;

    public String getDtlsCipher() {
        return DtlsCipher;
    }

    public void setDtlsCipher(String DtlsCipher) {
        this.DtlsCipher = DtlsCipher;
    }

    private String DtlsCaFile;

    public String getDtlsCaFile() {
        return DtlsCaFile;
    }

    public void setDtlsCaFile(String DtlsCaFile) {
        this.DtlsCaFile = DtlsCaFile;
    }

    private String DtlsCaPath;

    public String getDtlsCaPath() {
        return DtlsCaPath;
    }

    public void setDtlsCaPath(String DtlsCaPath) {
        this.DtlsCaPath = DtlsCaPath;
    }

    private String DtlsSetup;

    public String getDtlsSetup() {
        return DtlsSetup;
    }

    public void setDtlsSetup(String DtlsSetup) {
        this.DtlsSetup = DtlsSetup;
    }

    private String SrtpTag32;

    public String getSrtpTag32() {
        return SrtpTag32;
    }

    public void setSrtpTag32(String SrtpTag32) {
        this.SrtpTag32 = SrtpTag32;
    }

    private String RedirectMethod;

    public String getRedirectMethod() {
        return RedirectMethod;
    }

    public void setRedirectMethod(String RedirectMethod) {
        this.RedirectMethod = RedirectMethod;
    }

    private String SetVar;

    public String getSetVar() {
        return SetVar;
    }

    public void setSetVar(String SetVar) {
        this.SetVar = SetVar;
    }

    private String MessageContext;

    public String getMessageContext() {
        return MessageContext;
    }

    public void setMessageContext(String MessageContext) {
        this.MessageContext = MessageContext;
    }

    private String Accountcode;

    public String getAccountcode() {
        return Accountcode;
    }

    public void setAccountcode(String Accountcode) {
        this.Accountcode = Accountcode;
    }

    private String PreferredCodecOnly;

    public String getPreferredCodecOnly() {
        return PreferredCodecOnly;
    }

    public void setPreferredCodecOnly(String PreferredCodecOnly) {
        this.PreferredCodecOnly = PreferredCodecOnly;
    }

    private String DeviceState;

    public String getDeviceState() {
        return DeviceState;
    }

    public void setDeviceState(String DeviceState) {
        this.DeviceState = DeviceState;
    }

    private String ActiveChannels;

    public String getActiveChannels() {
        return ActiveChannels;
    }

    public void setActiveChannels(String ActiveChannels) {
        this.ActiveChannels = ActiveChannels;
    }

    private String SubscribeContext;

    public String getSubscribeContext() {
        return SubscribeContext;
    }

    public void setSubscribeContext(String SubscribeContext) {
        this.SubscribeContext = SubscribeContext;
    }

    private String AllowOverlap;

    public String getAllowOverlap() {
        return AllowOverlap;
    }

    public void setAllowOverlap(String AllowOverlap) {
        this.AllowOverlap = AllowOverlap;
    }

    private String OverlapContext;

    public String getOverlapContext() {
        return OverlapContext;
    }

    public void setOverlapContext(String OverlapContext) {
        this.OverlapContext = OverlapContext;
    }

    private String AcceptMultipleSdpAnswers;

    public String getAcceptMultipleSdpAnswers() {
        return AcceptMultipleSdpAnswers;
    }

    public void setAcceptMultipleSdpAnswers(String AcceptMultipleSdpAnswers) {
        this.AcceptMultipleSdpAnswers = AcceptMultipleSdpAnswers;
    }

    private String Acl;

    public String getAcl() {
        return Acl;
    }

    public void setAcl(String Acl) {
        this.Acl = Acl;
    }

    private String AllowUnauthenticatedOptions;

    public String getAllowUnauthenticatedOptions() {
        return AllowUnauthenticatedOptions;
    }

    public void setAllowUnauthenticatedOptions(String AllowUnauthenticatedOptions) {
        this.AllowUnauthenticatedOptions = AllowUnauthenticatedOptions;
    }

    private String AsymmetricRtpCodec;

    public String getAsymmetricRtpCodec() {
        return AsymmetricRtpCodec;
    }

    public void setAsymmetricRtpCodec(String AsymmetricRtpCodec) {
        this.AsymmetricRtpCodec = AsymmetricRtpCodec;
    }

    private String BindRtpToMediaAddress;

    public String getBindRtpToMediaAddress() {
        return BindRtpToMediaAddress;
    }

    public void setBindRtpToMediaAddress(String BindRtpToMediaAddress) {
        this.BindRtpToMediaAddress = BindRtpToMediaAddress;
    }

    private String Bundle;

    public String getBundle() {
        return Bundle;
    }

    public void setBundle(String Bundle) {
        this.Bundle = Bundle;
    }

    private String CodecPrefsIncomingAnswer;

    public String getCodecPrefsIncomingAnswer() {
        return CodecPrefsIncomingAnswer;
    }

    public void setCodecPrefsIncomingAnswer(String CodecPrefsIncomingAnswer) {
        this.CodecPrefsIncomingAnswer = CodecPrefsIncomingAnswer;
    }

    private String CodecPrefsIncomingOffer;

    public String getCodecPrefsIncomingOffer() {
        return CodecPrefsIncomingOffer;
    }

    public void setCodecPrefsIncomingOffer(String CodecPrefsIncomingOffer) {
        this.CodecPrefsIncomingOffer = CodecPrefsIncomingOffer;
    }

    private String CodecPrefsOutgoingAnswer;

    public String getCodecPrefsOutgoingAnswer() {
        return CodecPrefsOutgoingAnswer;
    }

    public void setCodecPrefsOutgoingAnswer(String CodecPrefsOutgoingAnswer) {
        this.CodecPrefsOutgoingAnswer = CodecPrefsOutgoingAnswer;
    }

    private String CodecPrefsOutgoingOffer;

    public String getCodecPrefsOutgoingOffer() {
        return CodecPrefsOutgoingOffer;
    }

    public void setCodecPrefsOutgoingOffer(String CodecPrefsOutgoingOffer) {
        this.CodecPrefsOutgoingOffer = CodecPrefsOutgoingOffer;
    }

    private String ContactAcl;

    public String getContactAcl() {
        return ContactAcl;
    }

    public void setContactAcl(String ContactAcl) {
        this.ContactAcl = ContactAcl;
    }

    private String DtlsAutoGenerateCert;

    public String getDtlsAutoGenerateCert() {
        return DtlsAutoGenerateCert;
    }

    public void setDtlsAutoGenerateCert(String DtlsAutoGenerateCert) {
        this.DtlsAutoGenerateCert = DtlsAutoGenerateCert;
    }

    private String DtlsFingerprint;

    public String getDtlsFingerprint() {
        return DtlsFingerprint;
    }

    public void setDtlsFingerprint(String DtlsFingerprint) {
        this.DtlsFingerprint = DtlsFingerprint;
    }

    private String FaxDetectTimeout;

    public String getFaxDetectTimeout() {
        return FaxDetectTimeout;
    }

    public void setFaxDetectTimeout(String FaxDetectTimeout) {
        this.FaxDetectTimeout = FaxDetectTimeout;
    }

    private String FollowEarlyMediaFork;

    public String getFollowEarlyMediaFork() {
        return FollowEarlyMediaFork;
    }

    public void setFollowEarlyMediaFork(String FollowEarlyMediaFork) {
        this.FollowEarlyMediaFork = FollowEarlyMediaFork;
    }

    private String G726NonStandard;

    public String getG726NonStandard() {
        return G726NonStandard;
    }

    public void setG726NonStandard(String G726NonStandard) {
        this.G726NonStandard = G726NonStandard;
    }

    private String GeolocIncomingCallProfile;

    public String getGeolocIncomingCallProfile() {
        return GeolocIncomingCallProfile;
    }

    public void setGeolocIncomingCallProfile(String GeolocIncomingCallProfile) {
        this.GeolocIncomingCallProfile = GeolocIncomingCallProfile;
    }

    private String GeolocOutgoingCallProfile;

    public String getGeolocOutgoingCallProfile() {
        return GeolocOutgoingCallProfile;
    }

    public void setGeolocOutgoingCallProfile(String GeolocOutgoingCallProfile) {
        this.GeolocOutgoingCallProfile = GeolocOutgoingCallProfile;
    }

    private String Ignore183WithoutSdp;

    public String getIgnore183WithoutSdp() {
        return Ignore183WithoutSdp;
    }

    public void setIgnore183WithoutSdp(String Ignore183WithoutSdp) {
        this.Ignore183WithoutSdp = Ignore183WithoutSdp;
    }

    private String IncomingCallOfferPref;

    public String getIncomingCallOfferPref() {
        return IncomingCallOfferPref;
    }

    public void setIncomingCallOfferPref(String IncomingCallOfferPref) {
        this.IncomingCallOfferPref = IncomingCallOfferPref;
    }

    private String IncomingMwiMailbox;

    public String getIncomingMwiMailbox() {
        return IncomingMwiMailbox;
    }

    public void setIncomingMwiMailbox(String IncomingMwiMailbox) {
        this.IncomingMwiMailbox = IncomingMwiMailbox;
    }

    private String MaxAudioStreams;

    public String getMaxAudioStreams() {
        return MaxAudioStreams;
    }

    public void setMaxAudioStreams(String MaxAudioStreams) {
        this.MaxAudioStreams = MaxAudioStreams;
    }

    private String MaxVideoStreams;

    public String getMaxVideoStreams() {
        return MaxVideoStreams;
    }

    public void setMaxVideoStreams(String MaxVideoStreams) {
        this.MaxVideoStreams = MaxVideoStreams;
    }

    private String MwiSubscribeReplacesUnsolicited;

    public String getMwiSubscribeReplacesUnsolicited() {
        return MwiSubscribeReplacesUnsolicited;
    }

    public void setMwiSubscribeReplacesUnsolicited(String MwiSubscribeReplacesUnsolicited) {
        this.MwiSubscribeReplacesUnsolicited = MwiSubscribeReplacesUnsolicited;
    }

    private String NotifyEarlyInuseRinging;

    public String getNotifyEarlyInuseRinging() {
        return NotifyEarlyInuseRinging;
    }

    public void setNotifyEarlyInuseRinging(String NotifyEarlyInuseRinging) {
        this.NotifyEarlyInuseRinging = NotifyEarlyInuseRinging;
    }

    private String OutgoingCallOfferPref;

    public String getOutgoingCallOfferPref() {
        return OutgoingCallOfferPref;
    }

    public void setOutgoingCallOfferPref(String OutgoingCallOfferPref) {
        this.OutgoingCallOfferPref = OutgoingCallOfferPref;
    }

    private String ReferBlindProgress;

    public String getReferBlindProgress() {
        return ReferBlindProgress;
    }

    public void setReferBlindProgress(String ReferBlindProgress) {
        this.ReferBlindProgress = ReferBlindProgress;
    }

    private String RpidImmediate;

    public String getRpidImmediate() {
        return RpidImmediate;
    }

    public void setRpidImmediate(String RpidImmediate) {
        this.RpidImmediate = RpidImmediate;
    }

    private String RtcpMux;

    public String getRtcpMux() {
        return RtcpMux;
    }

    public void setRtcpMux(String RtcpMux) {
        this.RtcpMux = RtcpMux;
    }

    private String RtpKeepalive;

    public String getRtpKeepalive() {
        return RtpKeepalive;
    }

    public void setRtpKeepalive(String RtpKeepalive) {
        this.RtpKeepalive = RtpKeepalive;
    }

    private String RtpTimeout;

    public String getRtpTimeout() {
        return RtpTimeout;
    }

    public void setRtpTimeout(String RtpTimeout) {
        this.RtpTimeout = RtpTimeout;
    }

    private String RtpTimeoutHold;

    public String getRtpTimeoutHold() {
        return RtpTimeoutHold;
    }

    public void setRtpTimeoutHold(String RtpTimeoutHold) {
        this.RtpTimeoutHold = RtpTimeoutHold;
    }

    private String RtpPortStart;

    public String getRtpPortStart() {
        return RtpPortStart;
    }

    public void setRtpPortStart(String RtpPortStart) {
        this.RtpPortStart = RtpPortStart;
    }

    private String RtpPortEnd;

    public String getRtpPortEnd() {
        return RtpPortEnd;
    }

    public void setRtpPortEnd(String RtpPortEnd) {
        this.RtpPortEnd = RtpPortEnd;
    }

    private String SecurityNegotiation;

    public String getSecurityNegotiation() {
        return SecurityNegotiation;
    }

    public void setSecurityNegotiation(String SecurityNegotiation) {
        this.SecurityNegotiation = SecurityNegotiation;
    }

    private String SendAoc;

    public String getSendAoc() {
        return SendAoc;
    }

    public void setSendAoc(String SendAoc) {
        this.SendAoc = SendAoc;
    }

    private String SendHistoryInfo;

    public String getSendHistoryInfo() {
        return SendHistoryInfo;
    }

    public void setSendHistoryInfo(String SendHistoryInfo) {
        this.SendHistoryInfo = SendHistoryInfo;
    }

    private String StirShaken;

    public String getStirShaken() {
        return StirShaken;
    }

    public void setStirShaken(String StirShaken) {
        this.StirShaken = StirShaken;
    }

    private String StirShakenProfile;

    public String getStirShakenProfile() {
        return StirShakenProfile;
    }

    public void setStirShakenProfile(String StirShakenProfile) {
        this.StirShakenProfile = StirShakenProfile;
    }

    private String SuppressMohOnSendonly;

    public String getSuppressMohOnSendonly() {
        return SuppressMohOnSendonly;
    }

    public void setSuppressMohOnSendonly(String SuppressMohOnSendonly) {
        this.SuppressMohOnSendonly = SuppressMohOnSendonly;
    }

    private String SuppressQ850ReasonHeaders;

    public String getSuppressQ850ReasonHeaders() {
        return SuppressQ850ReasonHeaders;
    }

    public void setSuppressQ850ReasonHeaders(String SuppressQ850ReasonHeaders) {
        this.SuppressQ850ReasonHeaders = SuppressQ850ReasonHeaders;
    }

    private String Tenantid;

    public String getTenantid() {
        return Tenantid;
    }

    public void setTenantid(String Tenantid) {
        this.Tenantid = Tenantid;
    }

    private String VoicemailExtension;

    public String getVoicemailExtension() {
        return VoicemailExtension;
    }

    public void setVoicemailExtension(String VoicemailExtension) {
        this.VoicemailExtension = VoicemailExtension;
    }

    private String Webrtc;

    public String getWebrtc() {
        return Webrtc;
    }

    public void setWebrtc(String Webrtc) {
        this.Webrtc = Webrtc;
    }

}
