# DeviceManagementApi

All URIs are relative to *https://api.siterwell.co.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiControllerCtrlPOST**](DeviceManagementApi.md#apiControllerCtrlPOST) | **POST** /api/1/controllers/{controllerId}/ctrl/ | Control a controller 
[**apiControllerDELETE**](DeviceManagementApi.md#apiControllerDELETE) | **DELETE** /api/1/controllers | Delete a controller 
[**apiControllerGET**](DeviceManagementApi.md#apiControllerGET) | **GET** /api/1/controllers | Get controller info 
[**apiControllerPATCH**](DeviceManagementApi.md#apiControllerPATCH) | **PATCH** /api/1/controllers | Update a controller 
[**apiControllerPOST**](DeviceManagementApi.md#apiControllerPOST) | **POST** /api/1/controllers | Add a controller 
[**apiControllerPUT**](DeviceManagementApi.md#apiControllerPUT) | **PUT** /api/1/controllers | Put a controller 
[**apiDeviceCtrlPOST**](DeviceManagementApi.md#apiDeviceCtrlPOST) | **POST** /api/1/controllers/{controllerId}/Devices/{devId}/ctrl/ | Control a device property 
[**apiDevicesDELETE**](DeviceManagementApi.md#apiDevicesDELETE) | **DELETE** /api/1/controllers/{controllerId}/devices | Delete a controller&#39;s devices 
[**apiDevicesGet**](DeviceManagementApi.md#apiDevicesGet) | **GET** /api/1/controllers/{controllerId}/devices | Get devices info 
[**apiDevicesPATCH**](DeviceManagementApi.md#apiDevicesPATCH) | **PATCH** /api/1/controllers/{controllerId}/devices | Update a controller&#39;s devices 
[**apiDevicesPOST**](DeviceManagementApi.md#apiDevicesPOST) | **POST** /api/1/controllers/{controllerId}/devices | Add a controller&#39;s devices 
[**apiDevicesPUT**](DeviceManagementApi.md#apiDevicesPUT) | **PUT** /api/1/controllers/{controllerId}/devices | Put a controller&#39;s devices 


<a name="apiControllerCtrlPOST"></a>
# **apiControllerCtrlPOST**
> SuccessRes apiControllerCtrlPOST(controllerId, body)

Control a controller 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
String controllerId = "controllerId_example"; // String | 
ControllerCtrlReq body = new ControllerCtrlReq(); // ControllerCtrlReq | 
try {
    SuccessRes result = apiInstance.apiControllerCtrlPOST(controllerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiControllerCtrlPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**|  |
 **body** | [**ControllerCtrlReq**](ControllerCtrlReq.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerDELETE"></a>
# **apiControllerDELETE**
> SuccessRes apiControllerDELETE(controllerId)

Delete a controller 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
String controllerId = "controllerId_example"; // String | controller id
try {
    SuccessRes result = apiInstance.apiControllerDELETE(controllerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiControllerDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerGET"></a>
# **apiControllerGET**
> GetControllersRes apiControllerGET(controllerId)

Get controller info 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
String controllerId = "controllerId_example"; // String | controller id
try {
    GetControllersRes result = apiInstance.apiControllerGET(controllerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiControllerGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id | [optional]

### Return type

[**GetControllersRes**](GetControllersRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerPATCH"></a>
# **apiControllerPATCH**
> SuccessRes apiControllerPATCH(body, time)

Update a controller 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
ControllerItem body = new ControllerItem(); // ControllerItem | 
String time = "time_example"; // String | client time
try {
    SuccessRes result = apiInstance.apiControllerPATCH(body, time);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiControllerPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerItem**](ControllerItem.md)|  |
 **time** | **String**| client time | [optional]

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerPOST"></a>
# **apiControllerPOST**
> SuccessRes apiControllerPOST(body, time)

Add a controller 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
ControllerItem body = new ControllerItem(); // ControllerItem | 
String time = "time_example"; // String | client time
try {
    SuccessRes result = apiInstance.apiControllerPOST(body, time);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiControllerPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerItem**](ControllerItem.md)|  |
 **time** | **String**| client time | [optional]

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerPUT"></a>
# **apiControllerPUT**
> SuccessRes apiControllerPUT(body, time)

Put a controller 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
ControllerItem body = new ControllerItem(); // ControllerItem | 
String time = "time_example"; // String | client time
try {
    SuccessRes result = apiInstance.apiControllerPUT(body, time);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiControllerPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerItem**](ControllerItem.md)|  |
 **time** | **String**| client time | [optional]

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiDeviceCtrlPOST"></a>
# **apiDeviceCtrlPOST**
> SuccessRes apiDeviceCtrlPOST(controllerId, devId, body)

Control a device property 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
String controllerId = "controllerId_example"; // String | 
String devId = "devId_example"; // String | 
PropertyItem body = new PropertyItem(); // PropertyItem | 
try {
    SuccessRes result = apiInstance.apiDeviceCtrlPOST(controllerId, devId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiDeviceCtrlPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**|  |
 **devId** | **String**|  |
 **body** | [**PropertyItem**](PropertyItem.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiDevicesDELETE"></a>
# **apiDevicesDELETE**
> SuccessRes apiDevicesDELETE(controllerId, devId)

Delete a controller&#39;s devices 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
String controllerId = "controllerId_example"; // String | controller id
String devId = "devId_example"; // String | device id
try {
    SuccessRes result = apiInstance.apiDevicesDELETE(controllerId, devId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiDevicesDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |
 **devId** | **String**| device id | [optional]

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiDevicesGet"></a>
# **apiDevicesGet**
> GetDevicesRes apiDevicesGet(controllerId, devId)

Get devices info 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
String controllerId = "controllerId_example"; // String | controller id
String devId = "devId_example"; // String | device id
try {
    GetDevicesRes result = apiInstance.apiDevicesGet(controllerId, devId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiDevicesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |
 **devId** | **String**| device id | [optional]

### Return type

[**GetDevicesRes**](GetDevicesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiDevicesPATCH"></a>
# **apiDevicesPATCH**
> OperDevicesRes apiDevicesPATCH(controllerId, body, time)

Update a controller&#39;s devices 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
String controllerId = "controllerId_example"; // String | controller id
List<DeviceItem> body = Arrays.asList(new DeviceItem()); // List<DeviceItem> | 
String time = "time_example"; // String | client time
try {
    OperDevicesRes result = apiInstance.apiDevicesPATCH(controllerId, body, time);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiDevicesPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |
 **body** | [**List&lt;DeviceItem&gt;**](DeviceItem.md)|  |
 **time** | **String**| client time | [optional]

### Return type

[**OperDevicesRes**](OperDevicesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiDevicesPOST"></a>
# **apiDevicesPOST**
> OperDevicesRes apiDevicesPOST(controllerId, body, time)

Add a controller&#39;s devices 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
String controllerId = "controllerId_example"; // String | controller id
List<DeviceItem> body = Arrays.asList(new DeviceItem()); // List<DeviceItem> | 
String time = "time_example"; // String | client time
try {
    OperDevicesRes result = apiInstance.apiDevicesPOST(controllerId, body, time);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiDevicesPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |
 **body** | [**List&lt;DeviceItem&gt;**](DeviceItem.md)|  |
 **time** | **String**| client time | [optional]

### Return type

[**OperDevicesRes**](OperDevicesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiDevicesPUT"></a>
# **apiDevicesPUT**
> OperDevicesRes apiDevicesPUT(controllerId, body, time)

Put a controller&#39;s devices 

### Example
```java
// Import classes:
//import io.swagger.client.api.DeviceManagementApi;

DeviceManagementApi apiInstance = new DeviceManagementApi();
String controllerId = "controllerId_example"; // String | controller id
List<DeviceItem> body = Arrays.asList(new DeviceItem()); // List<DeviceItem> | 
String time = "time_example"; // String | client time
try {
    OperDevicesRes result = apiInstance.apiDevicesPUT(controllerId, body, time);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceManagementApi#apiDevicesPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |
 **body** | [**List&lt;DeviceItem&gt;**](DeviceItem.md)|  |
 **time** | **String**| client time | [optional]

### Return type

[**OperDevicesRes**](OperDevicesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

