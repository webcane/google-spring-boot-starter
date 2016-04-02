package org.springframework.boot.autoconfigure.social;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.social.google")
public class GoogleProperties {
	/**
	 * Application id.
	 */
	private String appId;

	/**
	 * Application secret.
	 */
	private String appSecret;

	/**
	 * Google OAuth 2.0 scope in short form. Example: for scope
	 * <code>https://www.googleapis.com/auth/plus.login</code> use
	 * <code>plus.login</code>.
	 */
	private String appScope;

	public String getAppId() {
		return this.appId;
	}

	public String getAppSecret() {
		return this.appSecret;
	}

	public String getAppScope() {
		return appScope;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	public void setAppScope(String appScope) {
		this.appScope = appScope;
	}
}
