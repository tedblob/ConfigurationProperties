package com.tedblob.profiles.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConstructorBinding
@ConfigurationProperties(value = "server")
public class AppProperties {

    private String address;
    private Error error;

    AppProperties(String address, Error error) {
        this.address = address;
        this.error = error;
    }

    public static class Error {
        private String path;

        Error(String path) {
            this.path = path;
        }
        public String getPath() {
            return path;
        }

    }

    public Error getError() {
        return error;
    }

    public String getAddress() {
        return address;
    }
}
/*@ConfigurationProperties(value = "server", ignoreUnknownFields = true)
public class AppProperties {
    private String address;
    private Error error = new Error();

    public class Error {
        private String path;

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
}*/
