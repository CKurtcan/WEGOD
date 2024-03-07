package com.CK.constant;

public class RestApiUrls {
    private static final String VERSION = "/v1";
    private static final String API = "/api";
    private static final String TEST = "/test";
    private static final String DEV = "/dev";
    private static final String PROD = "/prod";

    private static final String ROOT = DEV + VERSION;

    public static final String USER= ROOT + "/user";

    public static final String CREATE_USER = "/createUser";
    public static final String UPDATE_USER = "/updateUser";
}
