package com.CK.constant;

public class RestApiUrls {
    private static final String VERSION = "/v1";
    private static final String API = "/api";
    private static final String TEST = "/test";
    private static final String DEV = "/dev";
    private static final String PROD = "/prod";

    private static final String ROOT = DEV + VERSION;

    public static final String VEHICLE = ROOT + "/vehicle";

    public static final String ADD_VEHICLE = "/createVehicle";
    public static final String FIND_NEARBY_VEHICLE = "/findNearbyVehicle";
    public static final String RENT_CAR = "/rentCar";
}
