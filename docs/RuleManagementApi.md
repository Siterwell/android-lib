# RuleManagementApi

All URIs are relative to *https://api.siterwell.co.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiControllerRuleDELETE**](RuleManagementApi.md#apiControllerRuleDELETE) | **DELETE** /api/1/controllers/{controllerId}/rules | Delete a controller&#39;s rules 
[**apiControllerRulePATCH**](RuleManagementApi.md#apiControllerRulePATCH) | **PATCH** /api/1/controllers/{controllerId}/rules | Update a controller&#39;s rules 
[**apiControllerRulePOST**](RuleManagementApi.md#apiControllerRulePOST) | **POST** /api/1/controllers/{controllerId}/rules | Add a controller&#39;s rules 
[**apiControllerRulessGET**](RuleManagementApi.md#apiControllerRulessGET) | **GET** /api/1/controllers/{controllerId}/rules | Get a controller&#39;s rules 
[**apiRulesGET**](RuleManagementApi.md#apiRulesGET) | **GET** /api/1/rules/ | Get all rules of all controllers 


<a name="apiControllerRuleDELETE"></a>
# **apiControllerRuleDELETE**
> OperRulesRes apiControllerRuleDELETE(controllerId, ruleId, body)

Delete a controller&#39;s rules 

### Example
```java
// Import classes:
//import io.swagger.client.api.RuleManagementApi;

RuleManagementApi apiInstance = new RuleManagementApi();
String controllerId = "controllerId_example"; // String | controller id
String ruleId = "ruleId_example"; // String | rule id
RuleIdList body = new RuleIdList(); // RuleIdList | 
try {
    OperRulesRes result = apiInstance.apiControllerRuleDELETE(controllerId, ruleId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleManagementApi#apiControllerRuleDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |
 **ruleId** | **String**| rule id | [optional]
 **body** | [**RuleIdList**](RuleIdList.md)|  | [optional]

### Return type

[**OperRulesRes**](OperRulesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerRulePATCH"></a>
# **apiControllerRulePATCH**
> OperRulesRes apiControllerRulePATCH(controllerId, body)

Update a controller&#39;s rules 

### Example
```java
// Import classes:
//import io.swagger.client.api.RuleManagementApi;

RuleManagementApi apiInstance = new RuleManagementApi();
String controllerId = "controllerId_example"; // String | controller id
Rules body = new Rules(); // Rules | 
try {
    OperRulesRes result = apiInstance.apiControllerRulePATCH(controllerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleManagementApi#apiControllerRulePATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |
 **body** | [**Rules**](Rules.md)|  |

### Return type

[**OperRulesRes**](OperRulesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerRulePOST"></a>
# **apiControllerRulePOST**
> OperRulesRes apiControllerRulePOST(controllerId, body)

Add a controller&#39;s rules 

### Example
```java
// Import classes:
//import io.swagger.client.api.RuleManagementApi;

RuleManagementApi apiInstance = new RuleManagementApi();
String controllerId = "controllerId_example"; // String | controller id
Rules body = new Rules(); // Rules | 
try {
    OperRulesRes result = apiInstance.apiControllerRulePOST(controllerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleManagementApi#apiControllerRulePOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |
 **body** | [**Rules**](Rules.md)|  |

### Return type

[**OperRulesRes**](OperRulesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiControllerRulessGET"></a>
# **apiControllerRulessGET**
> GetRulesRes apiControllerRulessGET(controllerId, ruleId)

Get a controller&#39;s rules 

### Example
```java
// Import classes:
//import io.swagger.client.api.RuleManagementApi;

RuleManagementApi apiInstance = new RuleManagementApi();
String controllerId = "controllerId_example"; // String | controller id
String ruleId = "ruleId_example"; // String | rule id
try {
    GetRulesRes result = apiInstance.apiControllerRulessGET(controllerId, ruleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleManagementApi#apiControllerRulessGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**| controller id |
 **ruleId** | **String**| rule id | [optional]

### Return type

[**GetRulesRes**](GetRulesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiRulesGET"></a>
# **apiRulesGET**
> GetUserRulesRes apiRulesGET()

Get all rules of all controllers 

### Example
```java
// Import classes:
//import io.swagger.client.api.RuleManagementApi;

RuleManagementApi apiInstance = new RuleManagementApi();
try {
    GetUserRulesRes result = apiInstance.apiRulesGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RuleManagementApi#apiRulesGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetUserRulesRes**](GetUserRulesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

