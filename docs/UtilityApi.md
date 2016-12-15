# UtilityApi

All URIs are relative to *https://api.siterwell.co.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiGeoIpGet**](UtilityApi.md#apiGeoIpGet) | **GET** /api/1/geoIp/ | Get geographic information from IP address 
[**apiGeoIpPost**](UtilityApi.md#apiGeoIpPost) | **POST** /api/1/geoIp/ | Add geographic information from mobile app 
[**apiGetVersion**](UtilityApi.md#apiGetVersion) | **GET** /api/1/version/ | Get server related version info 
[**apiPushNotificationDelete**](UtilityApi.md#apiPushNotificationDelete) | **DELETE** /api/1/pushNotification/ | Delete mobile android/iOS push notification id 
[**apiPushNotificationPost**](UtilityApi.md#apiPushNotificationPost) | **POST** /api/1/pushNotification/ | Add mobile android/iOS push notification id 


<a name="apiGeoIpGet"></a>
# **apiGeoIpGet**
> GetGeoIpRes apiGeoIpGet(controllerId)

Get geographic information from IP address 

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilityApi;

UtilityApi apiInstance = new UtilityApi();
String controllerId = "controllerId_example"; // String | Update controller's location if its ID was assgined.
try {
    GetGeoIpRes result = apiInstance.apiGeoIpGet(controllerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilityApi#apiGeoIpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| Update controller&#39;s location if its ID was assgined. | [optional]

### Return type

[**GetGeoIpRes**](GetGeoIpRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiGeoIpPost"></a>
# **apiGeoIpPost**
> SuccessRes apiGeoIpPost(body)

Add geographic information from mobile app 

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilityApi;

UtilityApi apiInstance = new UtilityApi();
GeoItem body = new GeoItem(); // GeoItem | 
try {
    SuccessRes result = apiInstance.apiGeoIpPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilityApi#apiGeoIpPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeoItem**](GeoItem.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiGetVersion"></a>
# **apiGetVersion**
> GetVersionRes apiGetVersion()

Get server related version info 

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilityApi;

UtilityApi apiInstance = new UtilityApi();
try {
    GetVersionRes result = apiInstance.apiGetVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilityApi#apiGetVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetVersionRes**](GetVersionRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiPushNotificationDelete"></a>
# **apiPushNotificationDelete**
> SuccessRes apiPushNotificationDelete(senderId)

Delete mobile android/iOS push notification id 

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilityApi;

UtilityApi apiInstance = new UtilityApi();
String senderId = "senderId_example"; // String | 
try {
    SuccessRes result = apiInstance.apiPushNotificationDelete(senderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilityApi#apiPushNotificationDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **senderId** | **String**|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiPushNotificationPost"></a>
# **apiPushNotificationPost**
> SuccessRes apiPushNotificationPost(body)

Add mobile android/iOS push notification id 

### Example
```java
// Import classes:
//import io.swagger.client.api.UtilityApi;

UtilityApi apiInstance = new UtilityApi();
PushNotificationItem body = new PushNotificationItem(); // PushNotificationItem | 
try {
    SuccessRes result = apiInstance.apiPushNotificationPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilityApi#apiPushNotificationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushNotificationItem**](PushNotificationItem.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

