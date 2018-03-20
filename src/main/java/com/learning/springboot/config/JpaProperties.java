package com.learning.springboot.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.data.jpa")
public class JpaProperties {

    public static final String DEFAULT_PORT = "1433";
    public static final String DEFAULT_HOST = "localhost";

    public static final String URL_PREFIX="jdbc:sqlserver://";

    private String host;
    private String port;
    private String driverClassName;
    private String url;
    private String userName;
    private String password;
    private String databaseName;

    private String packageToScan;

    private String ddlAuto;
    private String showSql;
    private String hibernateDialect;



    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getDdlAuto() {
        return ddlAuto;
    }

    public void setDdlAuto(String ddlAuto) {
        this.ddlAuto = ddlAuto;
    }

    public String getShowSql() {
        return showSql;
    }

    public void setShowSql(String showSql) {
        this.showSql = showSql;
    }

    public String getHibernateDialect() {
        return hibernateDialect;
    }

    public void setHibernateDialect(String hibernateDialect) {
        this.hibernateDialect = hibernateDialect;
    }

    public String getDriverClassName() {
        return driverClassName;
    }
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getPackageToScan() {
        return packageToScan;
    }

    public void setPackageToScan(String packageToScan) {
        this.packageToScan = packageToScan;
    }

    public String getUrl() {
        return url!=null?url:URL_PREFIX+getHost()+":"+getPort()+";databaseName="+getDatabaseName();

    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host!=null?host:DEFAULT_HOST;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port!=null?port:DEFAULT_PORT;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
