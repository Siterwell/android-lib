# LogManagementApi

All URIs are relative to *https://api.siterwell.co.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**api1LogsGet**](LogManagementApi.md#api1LogsGet) | **GET** /api/1/logs | 
[**apiControllerHwLogs**](LogManagementApi.md#apiControllerHwLogs) | **POST** /api/1/controllers/{controllerId}/hwLogs | upload hardware logs 
[**apiControllerLogsGET**](LogManagementApi.md#apiControllerLogsGET) | **GET** /api/1/controllers/{controllerId}/logs | Get a controller&#39;s logs 
[**apiDeviceLogsGET**](LogManagementApi.md#apiDeviceLogsGET) | **GET** /api/1/controllers/{controllerId}/Devices/{devId}/logs | Get a device&#39;s logs 
[**apiSyncLogs**](LogManagementApi.md#apiSyncLogs) | **POST** /api/1/logs/sync | sysc logs 


<a name="api1LogsGet"></a>
# **api1LogsGet**
> GetLogsRes api1LogsGet(limit, offset, logType, startTime, endTime)



### Example
```java
// Import classes:
//import io.swagger.client.api.LogManagementApi;

LogManagementApi apiInstance = new LogManagementApi();
BigDecimal limit = new BigDecimal(); // BigDecimal | number of logs returned
BigDecimal offset = new BigDecimal(); // BigDecimal | returns the specified record start position
String logType = "logType_example"; // String | Specify filter conditions
String startTime = "startTime_example"; // String | Specify filter conditions
String endTime = "endTime_example"; // String | Specify filter conditions
try {
    GetLogsRes result = apiInstance.api1LogsGet(limit, offset, logType, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogManagementApi#api1LogsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **BigDecimal**| number of logs returned | [optional]
 **offset** | **BigDecimal**| returns the specified record start position | [optional]
 **logType** | **String**| Specify filter conditions | [optional] [enum: message, activity]
 **startTime** | **String**| Specify filter conditions | [optional]
 **endTime** | **String**| Specify filter conditions | [optional]

### Return type

[**GetLogsRes**](GetLogsRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerHwLogs"></a>
# **apiControllerHwLogs**
> apiControllerHwLogs(controllerId, body)

upload hardware logs 

### Example
```java
// Import classes:
//import io.swagger.client.api.LogManagementApi;

LogManagementApi apiInstance = new LogManagementApi();
String controllerId = "controllerId_example"; // String | 
HwLogItem body = new HwLogItem(); // HwLogItem | 
try {
    apiInstance.apiControllerHwLogs(controllerId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LogManagementApi#apiControllerHwLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**|  |
 **body** | [**HwLogItem**](HwLogItem.md)|  |

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerLogsGET"></a>
# **apiControllerLogsGET**
> GetLogsRes apiControllerLogsGET(controllerId, limit, offset, logType, startTime, endTime)

Get a controller&#39;s logs 

### Example
```java
// Import classes:
//import io.swagger.client.api.LogManagementApi;

LogManagementApi apiInstance = new LogManagementApi();
String controllerId = "controllerId_example"; // String | 
BigDecimal limit = new BigDecimal(); // BigDecimal | number of logs returned
BigDecimal offset = new BigDecimal(); // BigDecimal | returns the specified record start position
String logType = "logType_example"; // String | Specify filter conditions
String startTime = "startTime_example"; // String | Specify filter conditions
String endTime = "endTime_example"; // String | Specify filter conditions
try {
    GetLogsRes result = apiInstance.apiControllerLogsGET(controllerId, limit, offset, logType, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogManagementApi#apiControllerLogsGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**|  |
 **limit** | **BigDecimal**| number of logs returned | [optional]
 **offset** | **BigDecimal**| returns the specified record start position | [optional]
 **logType** | **String**| Specify filter conditions | [optional] [enum: message, activity]
 **startTime** | **String**| Specify filter conditions | [optional]
 **endTime** | **String**| Specify filter conditions | [optional]

### Return type

[**GetLogsRes**](GetLogsRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiDeviceLogsGET"></a>
# **apiDeviceLogsGET**
> GetLogsRes apiDeviceLogsGET(controllerId, devId, limit, offset, logType, startTime, endTime)

Get a device&#39;s logs 

### Example
```java
// Import classes:
//import io.swagger.client.api.LogManagementApi;

LogManagementApi apiInstance = new LogManagementApi();
String controllerId = "controllerId_example"; // String | 
String devId = "devId_example"; // String | 
BigDecimal limit = new BigDecimal(); // BigDecimal | number of logs returned
BigDecimal offset = new BigDecimal(); // BigDecimal | returns the specified record start position
String logType = "logType_example"; // String | Specify filter conditions
String startTime = "startTime_example"; // String | Specify filter conditions
String endTime = "endTime_example"; // String | Specify filter conditions
try {
    GetLogsRes result = apiInstance.apiDeviceLogsGET(controllerId, devId, limit, offset, logType, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogManagementApi#apiDeviceLogsGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**|  |
 **devId** | **String**|  |
 **limit** | **BigDecimal**| number of logs returned | [optional]
 **offset** | **BigDecimal**| returns the specified record start position | [optional]
 **logType** | **String**| Specify filter conditions | [optional] [enum: message, activity]
 **startTime** | **String**| Specify filter conditions | [optional]
 **endTime** | **String**| Specify filter conditions | [optional]

### Return type

[**GetLogsRes**](GetLogsRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiSyncLogs"></a>
# **apiSyncLogs**
> GetLogsRes apiSyncLogs(body)

sysc logs 

### Example
```java
// Import classes:
//import io.swagger.client.api.LogManagementApi;

LogManagementApi apiInstance = new LogManagementApi();
List<LogItem> body = Arrays.asList(new LogItem()); // List<LogItem> | 
try {
    GetLogsRes result = apiInstance.apiSyncLogs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogManagementApi#apiSyncLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;LogItem&gt;**](LogItem.md)|  |

### Return type

[**GetLogsRes**](GetLogsRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

