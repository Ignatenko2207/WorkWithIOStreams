package org.itstep.entity;

public class ConnectionEntity {

	private Long time;
	private Integer sessionId;
	private String ip;
	
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public Integer getSessionId() {
		return sessionId;
	}
	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public ConnectionEntity(Long time, Integer sessionId, String ip) {
		this.time = time;
		this.sessionId = sessionId;
		this.ip = ip;
	}

	public ConnectionEntity() {
	}
	
	@Override
	public String toString() {
		return time + " " + sessionId + " " + ip;
	}
}
