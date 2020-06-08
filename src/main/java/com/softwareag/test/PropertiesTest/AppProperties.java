package com.softwareag.test.PropertiesTest;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.convert.DurationUnit;

public class AppProperties {
    private String name;
    private String description;
    private String uploadDir;
    private Duration connectTimeout = Duration.ofMillis(1000);
    @DurationUnit(ChronoUnit.SECONDS)
    private Duration readTimeout = Duration.ofSeconds(30);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUploadDir() {
		return uploadDir;
	}
	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}
	public Duration getConnectTimeout() {
		return connectTimeout;
	}
	public void setConnectTimeout(Duration connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	public Duration getReadTimeout() {
		return readTimeout;
	}
	public void setReadTimeout(Duration readTimeout) {
		this.readTimeout = readTimeout;
	}

}
