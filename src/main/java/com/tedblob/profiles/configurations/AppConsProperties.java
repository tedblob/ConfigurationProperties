package com.tedblob.profiles.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConstructorBinding
@ConfigurationProperties(value = "server")
public class AppConsProperties {
    private String address;

    private Error error;

    AppConsProperties(String address, Error error) {
        this.address = address;
        this.error = error;
    }

    public class Error {
        private String path;

        Error(String path) {
            this.path = path;
        }
        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
