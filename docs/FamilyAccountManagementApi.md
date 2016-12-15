# FamilyAccountManagementApi

All URIs are relative to *https://api.siterwell.co.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiPrivilegeDELETE**](FamilyAccountManagementApi.md#apiPrivilegeDELETE) | **DELETE** /api/1/controllers/{controllerId}/privilege | Delete a family privilege 
[**apiPrivilegePATCH**](FamilyAccountManagementApi.md#apiPrivilegePATCH) | **PATCH** /api/1/controllers/{controllerId}/privilege | Update a family privilege 
[**apiPrivilegePOST**](FamilyAccountManagementApi.md#apiPrivilegePOST) | **POST** /api/1/controllers/{controllerId}/privilege | Add a family privilege 
[**apiPrivilegeResendMail**](FamilyAccountManagementApi.md#apiPrivilegeResendMail) | **POST** /api/1/controllers/{controllerId}/privilege/sendMail | resend invite mail 
[**apiPrivilegesGet**](FamilyAccountManagementApi.md#apiPrivilegesGet) | **GET** /api/1/privileges/ | Get defined privileges 


<a name="apiPrivilegeDELETE"></a>
# **apiPrivilegeDELETE**
> SuccessRes apiPrivilegeDELETE(controllerId, email)

Delete a family privilege 

### Example
```java
// Import classes:
//import io.swagger.client.api.FamilyAccountManagementApi;

FamilyAccountManagementApi apiInstance = new FamilyAccountManagementApi();
String controllerId = "controllerId_example"; // String | 
String email = "email_example"; // String | email
try {
    SuccessRes result = apiInstance.apiPrivilegeDELETE(controllerId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FamilyAccountManagementApi#apiPrivilegeDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**|  |
 **email** | **String**| email |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiPrivilegePATCH"></a>
# **apiPrivilegePATCH**
> SuccessRes apiPrivilegePATCH(controllerId, body)

Update a family privilege 

### Example
```java
// Import classes:
//import io.swagger.client.api.FamilyAccountManagementApi;

FamilyAccountManagementApi apiInstance = new FamilyAccountManagementApi();
String controllerId = "controllerId_example"; // String | 
PrivilegeItem body = new PrivilegeItem(); // PrivilegeItem | 
try {
    SuccessRes result = apiInstance.apiPrivilegePATCH(controllerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FamilyAccountManagementApi#apiPrivilegePATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**|  |
 **body** | [**PrivilegeItem**](PrivilegeItem.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiPrivilegePOST"></a>
# **apiPrivilegePOST**
> SuccessRes apiPrivilegePOST(controllerId, body)

Add a family privilege 

### Example
```java
// Import classes:
//import io.swagger.client.api.FamilyAccountManagementApi;

FamilyAccountManagementApi apiInstance = new FamilyAccountManagementApi();
String controllerId = "controllerId_example"; // String | 
PrivilegeItem body = new PrivilegeItem(); // PrivilegeItem | 
try {
    SuccessRes result = apiInstance.apiPrivilegePOST(controllerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FamilyAccountManagementApi#apiPrivilegePOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**|  |
 **body** | [**PrivilegeItem**](PrivilegeItem.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiPrivilegeResendMail"></a>
# **apiPrivilegeResendMail**
> SuccessRes apiPrivilegeResendMail(controllerId, body)

resend invite mail 

### Example
```java
// Import classes:
//import io.swagger.client.api.FamilyAccountManagementApi;

FamilyAccountManagementApi apiInstance = new FamilyAccountManagementApi();
String controllerId = "controllerId_example"; // String | 
PrivilegeItem body = new PrivilegeItem(); // PrivilegeItem | 
try {
    SuccessRes result = apiInstance.apiPrivilegeResendMail(controllerId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FamilyAccountManagementApi#apiPrivilegeResendMail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **controllerId** | **String**|  |
 **body** | [**PrivilegeItem**](PrivilegeItem.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiPrivilegesGet"></a>
# **apiPrivilegesGet**
> DefinedPrivilegesRes apiPrivilegesGet()

Get defined privileges 

### Example
```java
// Import classes:
//import io.swagger.client.api.FamilyAccountManagementApi;

FamilyAccountManagementApi apiInstance = new FamilyAccountManagementApi();
try {
    DefinedPrivilegesRes result = apiInstance.apiPrivilegesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FamilyAccountManagementApi#apiPrivilegesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DefinedPrivilegesRes**](DefinedPrivilegesRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

