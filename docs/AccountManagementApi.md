# AccountManagementApi

All URIs are relative to *https://api.siterwell.co.uk*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiForgotPasswordPOST**](AccountManagementApi.md#apiForgotPasswordPOST) | **POST** /api/1/forgotPassword/ | User forgot password 
[**apiLoginPOST**](AccountManagementApi.md#apiLoginPOST) | **POST** /api/1/login/ | User login 
[**apiLogoutPOST**](AccountManagementApi.md#apiLogoutPOST) | **POST** /api/1/logout/ | User logout 
[**apiRegisterPOST**](AccountManagementApi.md#apiRegisterPOST) | **POST** /api/1/register/ | User signup 
[**apiResendEmailPOST**](AccountManagementApi.md#apiResendEmailPOST) | **POST** /api/1/resendEmail/ | Resend verification email 
[**apiResetPasswordPOST**](AccountManagementApi.md#apiResetPasswordPOST) | **POST** /api/1/resetPassword/{tokenId} | Reset password 
[**apiUserDataPOST**](AccountManagementApi.md#apiUserDataPOST) | **POST** /api/1/userData/ | Update user data 
[**apiVerifyEmailPOST**](AccountManagementApi.md#apiVerifyEmailPOST) | **POST** /api/1/verifyEmail/{tokenId} | Verify email address 


<a name="apiForgotPasswordPOST"></a>
# **apiForgotPasswordPOST**
> SuccessRes apiForgotPasswordPOST(body)

User forgot password 

### Example
```java
// Import classes:
//import io.swagger.client.api.AccountManagementApi;

AccountManagementApi apiInstance = new AccountManagementApi();
ForgotPasswordReq body = new ForgotPasswordReq(); // ForgotPasswordReq | 
try {
    SuccessRes result = apiInstance.apiForgotPasswordPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#apiForgotPasswordPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ForgotPasswordReq**](ForgotPasswordReq.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiLoginPOST"></a>
# **apiLoginPOST**
> InlineResponse200 apiLoginPOST(body)

User login 

### Example
```java
// Import classes:
//import io.swagger.client.api.AccountManagementApi;

AccountManagementApi apiInstance = new AccountManagementApi();
LoginReq body = new LoginReq(); // LoginReq | 
try {
    InlineResponse200 result = apiInstance.apiLoginPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#apiLoginPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginReq**](LoginReq.md)|  |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiLogoutPOST"></a>
# **apiLogoutPOST**
> SuccessRes apiLogoutPOST()

User logout 

### Example
```java
// Import classes:
//import io.swagger.client.api.AccountManagementApi;

AccountManagementApi apiInstance = new AccountManagementApi();
try {
    SuccessRes result = apiInstance.apiLogoutPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#apiLogoutPOST");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiRegisterPOST"></a>
# **apiRegisterPOST**
> SuccessRes apiRegisterPOST(body)

User signup 

### Example
```java
// Import classes:
//import io.swagger.client.api.AccountManagementApi;

AccountManagementApi apiInstance = new AccountManagementApi();
RegisterReq body = new RegisterReq(); // RegisterReq | 
try {
    SuccessRes result = apiInstance.apiRegisterPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#apiRegisterPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegisterReq**](RegisterReq.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiResendEmailPOST"></a>
# **apiResendEmailPOST**
> SuccessRes apiResendEmailPOST(body)

Resend verification email 

### Example
```java
// Import classes:
//import io.swagger.client.api.AccountManagementApi;

AccountManagementApi apiInstance = new AccountManagementApi();
ForgotPasswordReq body = new ForgotPasswordReq(); // ForgotPasswordReq | 
try {
    SuccessRes result = apiInstance.apiResendEmailPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#apiResendEmailPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ForgotPasswordReq**](ForgotPasswordReq.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiResetPasswordPOST"></a>
# **apiResetPasswordPOST**
> SuccessRes apiResetPasswordPOST(tokenId, body)

Reset password 

### Example
```java
// Import classes:
//import io.swagger.client.api.AccountManagementApi;

AccountManagementApi apiInstance = new AccountManagementApi();
String tokenId = "tokenId_example"; // String | token id
ResetPasswordReq body = new ResetPasswordReq(); // ResetPasswordReq | 
try {
    SuccessRes result = apiInstance.apiResetPasswordPOST(tokenId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#apiResetPasswordPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | **String**| token id |
 **body** | [**ResetPasswordReq**](ResetPasswordReq.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiUserDataPOST"></a>
# **apiUserDataPOST**
> SuccessRes apiUserDataPOST(body)

Update user data 

### Example
```java
// Import classes:
//import io.swagger.client.api.AccountManagementApi;

AccountManagementApi apiInstance = new AccountManagementApi();
UserDataReq body = new UserDataReq(); // UserDataReq | 
try {
    SuccessRes result = apiInstance.apiUserDataPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#apiUserDataPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserDataReq**](UserDataReq.md)|  |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiVerifyEmailPOST"></a>
# **apiVerifyEmailPOST**
> SuccessRes apiVerifyEmailPOST(tokenId)

Verify email address 

### Example
```java
// Import classes:
//import io.swagger.client.api.AccountManagementApi;

AccountManagementApi apiInstance = new AccountManagementApi();
String tokenId = "tokenId_example"; // String | token id
try {
    SuccessRes result = apiInstance.apiVerifyEmailPOST(tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountManagementApi#apiVerifyEmailPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenId** | **String**| token id |

### Return type

[**SuccessRes**](SuccessRes.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

