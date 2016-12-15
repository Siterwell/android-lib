# ReportManagementApi

All URIs are relative to *https://api.siterwell.co.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiBrandReportGET**](ReportManagementApi.md#apiBrandReportGET) | **GET** /api/1/brands/{brandName}/reports | Get reports depends on brand name 
[**apiBrandTypeReportGET**](ReportManagementApi.md#apiBrandTypeReportGET) | **GET** /api/1/brands/{brandName}/types/{typeEnum}/reports | Get reports depends on brand name and periodical type 
[**apiReportGET**](ReportManagementApi.md#apiReportGET) | **GET** /api/1/reports | Get reports 
[**apiReportSupportFieldsGET**](ReportManagementApi.md#apiReportSupportFieldsGET) | **GET** /api/1/reports/supportFields | Get support fields of report 


<a name="apiBrandReportGET"></a>
# **apiBrandReportGET**
> ReportRes apiBrandReportGET(brandName, startDate, endDate, fields)

Get reports depends on brand name 

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportManagementApi;

ReportManagementApi apiInstance = new ReportManagementApi();
String brandName = "brandName_example"; // String | Specify which brand's report to return
String startDate = "startDate_example"; // String | Specify when the returned reports start from. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime)
String endDate = "endDate_example"; // String | Specify when the returned reports end. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime)
String fields = "fields_example"; // String | Specify which supported field of reports to return. Concatenate with comma for mutiple requirement. e.g. controller,activeController
try {
    ReportRes result = apiInstance.apiBrandReportGET(brandName, startDate, endDate, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportManagementApi#apiBrandReportGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandName** | **String**| Specify which brand&#39;s report to return |
 **startDate** | **String**| Specify when the returned reports start from. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime) | [optional]
 **endDate** | **String**| Specify when the returned reports end. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime) | [optional]
 **fields** | **String**| Specify which supported field of reports to return. Concatenate with comma for mutiple requirement. e.g. controller,activeController | [optional]

### Return type

[**ReportRes**](ReportRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiBrandTypeReportGET"></a>
# **apiBrandTypeReportGET**
> ReportRes apiBrandTypeReportGET(brandName, typeEnum, startDate, endDate, fields)

Get reports depends on brand name and periodical type 

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportManagementApi;

ReportManagementApi apiInstance = new ReportManagementApi();
String brandName = "brandName_example"; // String | Specify which brand's report to return
String typeEnum = "typeEnum_example"; // String | Specify which periodical type to return. e.g. daily, weekly, monthly...
String startDate = "startDate_example"; // String | Specify when the returned reports start from. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime)
String endDate = "endDate_example"; // String | Specify when the returned reports end. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime)
String fields = "fields_example"; // String | Specify which supported field of reports to return. Concatenate with comma for mutiple requirement. e.g. controller,activeController
try {
    ReportRes result = apiInstance.apiBrandTypeReportGET(brandName, typeEnum, startDate, endDate, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportManagementApi#apiBrandTypeReportGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandName** | **String**| Specify which brand&#39;s report to return |
 **typeEnum** | **String**| Specify which periodical type to return. e.g. daily, weekly, monthly... |
 **startDate** | **String**| Specify when the returned reports start from. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime) | [optional]
 **endDate** | **String**| Specify when the returned reports end. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime) | [optional]
 **fields** | **String**| Specify which supported field of reports to return. Concatenate with comma for mutiple requirement. e.g. controller,activeController | [optional]

### Return type

[**ReportRes**](ReportRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiReportGET"></a>
# **apiReportGET**
> ReportRes apiReportGET(startDate, endDate, fields)

Get reports 

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportManagementApi;

ReportManagementApi apiInstance = new ReportManagementApi();
String startDate = "startDate_example"; // String | Specify when the returned reports start from. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime)
String endDate = "endDate_example"; // String | Specify when the returned reports end. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime)
String fields = "fields_example"; // String | Specify which supported field of reports to return. Concatenate with comma for mutiple requirement. e.g. controller,activeController
try {
    ReportRes result = apiInstance.apiReportGET(startDate, endDate, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportManagementApi#apiReportGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **String**| Specify when the returned reports start from. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime) | [optional]
 **endDate** | **String**| Specify when the returned reports end. e.g. YYYY-MM-DDThh:mm:ssTZD(https://www.w3.org/TR/NOTE-datetime) | [optional]
 **fields** | **String**| Specify which supported field of reports to return. Concatenate with comma for mutiple requirement. e.g. controller,activeController | [optional]

### Return type

[**ReportRes**](ReportRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiReportSupportFieldsGET"></a>
# **apiReportSupportFieldsGET**
> ReportSupportFieldsRes apiReportSupportFieldsGET()

Get support fields of report 

### Example
```java
// Import classes:
//import io.swagger.client.api.ReportManagementApi;

ReportManagementApi apiInstance = new ReportManagementApi();
try {
    ReportSupportFieldsRes result = apiInstance.apiReportSupportFieldsGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportManagementApi#apiReportSupportFieldsGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportSupportFieldsRes**](ReportSupportFieldsRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

