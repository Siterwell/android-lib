# EventHandleApi

All URIs are relative to *https://api.siterwell.co.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCallEmergency**](EventHandleApi.md#apiCallEmergency) | **POST** /api/1/event/callEmergency | event trigger 
[**apiEventDefGET**](EventHandleApi.md#apiEventDefGET) | **GET** /api/1/event/def/ | event trigger 
[**apiEventHandle**](EventHandleApi.md#apiEventHandle) | **POST** /api/1/event/handle | event trigger 


<a name="apiCallEmergency"></a>
# **apiCallEmergency**
> SuccessRes apiCallEmergency(body)

event trigger 

### Example
```java
// Import classes:
//import io.swagger.client.api.EventHandleApi;

EventHandleApi apiInstance = new EventHandleApi();
EventItem body = new EventItem(); // EventItem | 
try {
    SuccessRes result = apiInstance.apiCallEmergency(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventHandleApi#apiCallEmergency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventItem**](EventItem.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiEventDefGET"></a>
# **apiEventDefGET**
> DefinedEventsRes apiEventDefGET()

event trigger 

### Example
```java
// Import classes:
//import io.swagger.client.api.EventHandleApi;

EventHandleApi apiInstance = new EventHandleApi();
try {
    DefinedEventsRes result = apiInstance.apiEventDefGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventHandleApi#apiEventDefGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DefinedEventsRes**](DefinedEventsRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiEventHandle"></a>
# **apiEventHandle**
> MessageRes apiEventHandle(body)

event trigger 

### Example
```java
// Import classes:
//import io.swagger.client.api.EventHandleApi;

EventHandleApi apiInstance = new EventHandleApi();
EventItem body = new EventItem(); // EventItem | 
try {
    MessageRes result = apiInstance.apiEventHandle(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventHandleApi#apiEventHandle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventItem**](EventItem.md)|  |

### Return type

[**MessageRes**](MessageRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

