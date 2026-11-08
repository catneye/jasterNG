/* jasterNG; GPL-2.0; Copyright (C) 2026 Kurchenko O.E. */
package com.catneye.asterisk.AMI.events;
import com.catneye.asterisk.AMI.events.base.SystemEvent;
import java.io.Serializable;
import java.util.UUID;
/** AMI TransportDetail event. */
public class TransportDetail extends SystemEvent implements Serializable {
    public TransportDetail() { super.setEvent("TransportDetail"); super.setUuid(UUID.randomUUID()); }
    private String objectType;
    public String getObjectType() { return objectType; }
    public void setObjectType(String objectType) { this.objectType = objectType; }
    private String objectName;
    public String getObjectName() { return objectName; }
    public void setObjectName(String objectName) { this.objectName = objectName; }
    private String protocol;
    public String getProtocol() { return protocol; }
    public void setProtocol(String protocol) { this.protocol = protocol; }
    private String bind;
    public String getBind() { return bind; }
    public void setBind(String bind) { this.bind = bind; }
    private Integer asycOperations;
    public Integer getAsycOperations() { return asycOperations; }
    public void setAsycOperations(Integer asycOperations) { this.asycOperations = asycOperations; }
    private String caListFile;
    public String getCaListFile() { return caListFile; }
    public void setCaListFile(String caListFile) { this.caListFile = caListFile; }
    private String caListPath;
    public String getCaListPath() { return caListPath; }
    public void setCaListPath(String caListPath) { this.caListPath = caListPath; }
    private String certFile;
    public String getCertFile() { return certFile; }
    public void setCertFile(String certFile) { this.certFile = certFile; }
    private String privKeyFile;
    public String getPrivKeyFile() { return privKeyFile; }
    public void setPrivKeyFile(String privKeyFile) { this.privKeyFile = privKeyFile; }
    private String password;
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    private String externalSignalingAddress;
    public String getExternalSignalingAddress() { return externalSignalingAddress; }
    public void setExternalSignalingAddress(String externalSignalingAddress) { this.externalSignalingAddress = externalSignalingAddress; }
    private Integer externalSignalingPort;
    public Integer getExternalSignalingPort() { return externalSignalingPort; }
    public void setExternalSignalingPort(Integer externalSignalingPort) { this.externalSignalingPort = externalSignalingPort; }
    private String externalSignalingHostname;
    public String getExternalSignalingHostname() { return externalSignalingHostname; }
    public void setExternalSignalingHostname(String externalSignalingHostname) { this.externalSignalingHostname = externalSignalingHostname; }
    private String externalMediaAddress;
    public String getExternalMediaAddress() { return externalMediaAddress; }
    public void setExternalMediaAddress(String externalMediaAddress) { this.externalMediaAddress = externalMediaAddress; }
    private String domain;
    public String getDomain() { return domain; }
    public void setDomain(String domain) { this.domain = domain; }
    private Boolean verifyServer;
    public Boolean getVerifyServer() { return verifyServer; }
    public void setVerifyServer(Boolean verifyServer) { this.verifyServer = verifyServer; }
    private Boolean verifyClient;
    public Boolean getVerifyClient() { return verifyClient; }
    public void setVerifyClient(Boolean verifyClient) { this.verifyClient = verifyClient; }
    private Boolean requireClientCert;
    public Boolean getRequireClientCert() { return requireClientCert; }
    public void setRequireClientCert(Boolean requireClientCert) { this.requireClientCert = requireClientCert; }
    private String method;
    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }
    private String cipher;
    public String getCipher() { return cipher; }
    public void setCipher(String cipher) { this.cipher = cipher; }
    private String localNet;
    public String getLocalNet() { return localNet; }
    public void setLocalNet(String localNet) { this.localNet = localNet; }
    private Integer tos;
    public Integer getTos() { return tos; }
    public void setTos(Integer tos) { this.tos = tos; }
    private Integer cos;
    public Integer getCos() { return cos; }
    public void setCos(Integer cos) { this.cos = cos; }
    private Integer websocketWriteTimeout;
    public Integer getWebsocketWriteTimeout() { return websocketWriteTimeout; }
    public void setWebsocketWriteTimeout(Integer websocketWriteTimeout) { this.websocketWriteTimeout = websocketWriteTimeout; }
    private Boolean allowReload;
    public Boolean getAllowReload() { return allowReload; }
    public void setAllowReload(Boolean allowReload) { this.allowReload = allowReload; }
    private Boolean allowWildcardCerts;
    public Boolean getAllowWildcardCerts() { return allowWildcardCerts; }
    public void setAllowWildcardCerts(Boolean allowWildcardCerts) { this.allowWildcardCerts = allowWildcardCerts; }
    private Boolean symmetricTransport;
    public Boolean getSymmetricTransport() { return symmetricTransport; }
    public void setSymmetricTransport(Boolean symmetricTransport) { this.symmetricTransport = symmetricTransport; }
    private Boolean tcpKeepaliveEnable;
    public Boolean getTcpKeepaliveEnable() { return tcpKeepaliveEnable; }
    public void setTcpKeepaliveEnable(Boolean tcpKeepaliveEnable) { this.tcpKeepaliveEnable = tcpKeepaliveEnable; }
    private Integer tcpKeepaliveIdleTime;
    public Integer getTcpKeepaliveIdleTime() { return tcpKeepaliveIdleTime; }
    public void setTcpKeepaliveIdleTime(Integer tcpKeepaliveIdleTime) { this.tcpKeepaliveIdleTime = tcpKeepaliveIdleTime; }
    private Integer tcpKeepaliveIntervalTime;
    public Integer getTcpKeepaliveIntervalTime() { return tcpKeepaliveIntervalTime; }
    public void setTcpKeepaliveIntervalTime(Integer tcpKeepaliveIntervalTime) { this.tcpKeepaliveIntervalTime = tcpKeepaliveIntervalTime; }
    private Integer tcpKeepaliveProbeCount;
    public Integer getTcpKeepaliveProbeCount() { return tcpKeepaliveProbeCount; }
    public void setTcpKeepaliveProbeCount(Integer tcpKeepaliveProbeCount) { this.tcpKeepaliveProbeCount = tcpKeepaliveProbeCount; }
    private String endpointName;
    public String getEndpointName() { return endpointName; }
    public void setEndpointName(String endpointName) { this.endpointName = endpointName; }
}
