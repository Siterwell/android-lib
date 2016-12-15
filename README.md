# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.AccountManagementApi;

public class AccountManagementApiExample {

    public static void main(String[] args) {
        AccountManagementApi apiInstance = new AccountManagementApi();
        ForgotPasswordReq body = new ForgotPasswordReq(); // ForgotPasswordReq | 
        try {
            SuccessRes result = apiInstance.apiForgotPasswordPOST(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountManagementApi#apiForgotPasswordPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.siterwell.co.uk*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountManagementApi* | [**apiForgotPasswordPOST**](docs/AccountManagementApi.md#apiForgotPasswordPOST) | **POST** /api/1/forgotPassword/ | User forgot password 
*AccountManagementApi* | [**apiLoginPOST**](docs/AccountManagementApi.md#apiLoginPOST) | **POST** /api/1/login/ | User login 
*AccountManagementApi* | [**apiLogoutPOST**](docs/AccountManagementApi.md#apiLogoutPOST) | **POST** /api/1/logout/ | User logout 
*AccountManagementApi* | [**apiRegisterPOST**](docs/AccountManagementApi.md#apiRegisterPOST) | **POST** /api/1/register/ | User signup 
*AccountManagementApi* | [**apiResendEmailPOST**](docs/AccountManagementApi.md#apiResendEmailPOST) | **POST** /api/1/resendEmail/ | Resend verification email 
*AccountManagementApi* | [**apiResetPasswordPOST**](docs/AccountManagementApi.md#apiResetPasswordPOST) | **POST** /api/1/resetPassword/{tokenId} | Reset password 
*AccountManagementApi* | [**apiUserDataPOST**](docs/AccountManagementApi.md#apiUserDataPOST) | **POST** /api/1/userData/ | Update user data 
*AccountManagementApi* | [**apiVerifyEmailPOST**](docs/AccountManagementApi.md#apiVerifyEmailPOST) | **POST** /api/1/verifyEmail/{tokenId} | Verify email address 
*DeviceManagementApi* | [**apiControllerCtrlPOST**](docs/DeviceManagementApi.md#apiControllerCtrlPOST) | **POST** /api/1/controllers/{controllerId}/ctrl/ | Control a controller 
*DeviceManagementApi* | [**apiControllerDELETE**](docs/DeviceManagementApi.md#apiControllerDELETE) | **DELETE** /api/1/controllers | Delete a controller 
*DeviceManagementApi* | [**apiControllerGET**](docs/DeviceManagementApi.md#apiControllerGET) | **GET** /api/1/controllers | Get controller info 
*DeviceManagementApi* | [**apiControllerPATCH**](docs/DeviceManagementApi.md#apiControllerPATCH) | **PATCH** /api/1/controllers | Update a controller 
*DeviceManagementApi* | [**apiControllerPOST**](docs/DeviceManagementApi.md#apiControllerPOST) | **POST** /api/1/controllers | Add a controller 
*DeviceManagementApi* | [**apiControllerPUT**](docs/DeviceManagementApi.md#apiControllerPUT) | **PUT** /api/1/controllers | Put a controller 
*DeviceManagementApi* | [**apiDeviceCtrlPOST**](docs/DeviceManagementApi.md#apiDeviceCtrlPOST) | **POST** /api/1/controllers/{controllerId}/Devices/{devId}/ctrl/ | Control a device property 
*DeviceManagementApi* | [**apiDevicesDELETE**](docs/DeviceManagementApi.md#apiDevicesDELETE) | **DELETE** /api/1/controllers/{controllerId}/devices | Delete a controller&#39;s devices 
*DeviceManagementApi* | [**apiDevicesGet**](docs/DeviceManagementApi.md#apiDevicesGet) | **GET** /api/1/controllers/{controllerId}/devices | Get devices info 
*DeviceManagementApi* | [**apiDevicesPATCH**](docs/DeviceManagementApi.md#apiDevicesPATCH) | **PATCH** /api/1/controllers/{controllerId}/devices | Update a controller&#39;s devices 
*DeviceManagementApi* | [**apiDevicesPOST**](docs/DeviceManagementApi.md#apiDevicesPOST) | **POST** /api/1/controllers/{controllerId}/devices | Add a controller&#39;s devices 
*DeviceManagementApi* | [**apiDevicesPUT**](docs/DeviceManagementApi.md#apiDevicesPUT) | **PUT** /api/1/controllers/{controllerId}/devices | Put a controller&#39;s devices 
*EventHandleApi* | [**apiCallEmergency**](docs/EventHandleApi.md#apiCallEmergency) | **POST** /api/1/event/callEmergency | event trigger 
*EventHandleApi* | [**apiEventDefGET**](docs/EventHandleApi.md#apiEventDefGET) | **GET** /api/1/event/def/ | event trigger 
*EventHandleApi* | [**apiEventHandle**](docs/EventHandleApi.md#apiEventHandle) | **POST** /api/1/event/handle | event trigger 
*FamilyAccountManagementApi* | [**apiPrivilegeDELETE**](docs/FamilyAccountManagementApi.md#apiPrivilegeDELETE) | **DELETE** /api/1/controllers/{controllerId}/privilege | Delete a family privilege 
*FamilyAccountManagementApi* | [**apiPrivilegePATCH**](docs/FamilyAccountManagementApi.md#apiPrivilegePATCH) | **PATCH** /api/1/controllers/{controllerId}/privilege | Update a family privilege 
*FamilyAccountManagementApi* | [**apiPrivilegePOST**](docs/FamilyAccountManagementApi.md#apiPrivilegePOST) | **POST** /api/1/controllers/{controllerId}/privilege | Add a family privilege 
*FamilyAccountManagementApi* | [**apiPrivilegeResendMail**](docs/FamilyAccountManagementApi.md#apiPrivilegeResendMail) | **POST** /api/1/controllers/{controllerId}/privilege/sendMail | resend invite mail 
*FamilyAccountManagementApi* | [**apiPrivilegesGet**](docs/FamilyAccountManagementApi.md#apiPrivilegesGet) | **GET** /api/1/privileges/ | Get defined privileges 
*LogManagementApi* | [**api1LogsGet**](docs/LogManagementApi.md#api1LogsGet) | **GET** /api/1/logs | 
*LogManagementApi* | [**apiControllerHwLogs**](docs/LogManagementApi.md#apiControllerHwLogs) | **POST** /api/1/controllers/{controllerId}/hwLogs | upload hardware logs 
*LogManagementApi* | [**apiControllerLogsGET**](docs/LogManagementApi.md#apiControllerLogsGET) | **GET** /api/1/controllers/{controllerId}/logs | Get a controller&#39;s logs 
*LogManagementApi* | [**apiDeviceLogsGET**](docs/LogManagementApi.md#apiDeviceLogsGET) | **GET** /api/1/controllers/{controllerId}/Devices/{devId}/logs | Get a device&#39;s logs 
*LogManagementApi* | [**apiSyncLogs**](docs/LogManagementApi.md#apiSyncLogs) | **POST** /api/1/logs/sync | sysc logs 
*ReportManagementApi* | [**apiBrandReportGET**](docs/ReportManagementApi.md#apiBrandReportGET) | **GET** /api/1/brands/{brandName}/reports | Get reports depends on brand name 
*ReportManagementApi* | [**apiBrandTypeReportGET**](docs/ReportManagementApi.md#apiBrandTypeReportGET) | **GET** /api/1/brands/{brandName}/types/{typeEnum}/reports | Get reports depends on brand name and periodical type 
*ReportManagementApi* | [**apiReportGET**](docs/ReportManagementApi.md#apiReportGET) | **GET** /api/1/reports | Get reports 
*ReportManagementApi* | [**apiReportSupportFieldsGET**](docs/ReportManagementApi.md#apiReportSupportFieldsGET) | **GET** /api/1/reports/supportFields | Get support fields of report 
*RuleManagementApi* | [**apiControllerRuleDELETE**](docs/RuleManagementApi.md#apiControllerRuleDELETE) | **DELETE** /api/1/controllers/{controllerId}/rules | Delete a controller&#39;s rules 
*RuleManagementApi* | [**apiControllerRulePATCH**](docs/RuleManagementApi.md#apiControllerRulePATCH) | **PATCH** /api/1/controllers/{controllerId}/rules | Update a controller&#39;s rules 
*RuleManagementApi* | [**apiControllerRulePOST**](docs/RuleManagementApi.md#apiControllerRulePOST) | **POST** /api/1/controllers/{controllerId}/rules | Add a controller&#39;s rules 
*RuleManagementApi* | [**apiControllerRulessGET**](docs/RuleManagementApi.md#apiControllerRulessGET) | **GET** /api/1/controllers/{controllerId}/rules | Get a controller&#39;s rules 
*RuleManagementApi* | [**apiRulesGET**](docs/RuleManagementApi.md#apiRulesGET) | **GET** /api/1/rules/ | Get all rules of all controllers 
*UtilityApi* | [**apiGeoIpGet**](docs/UtilityApi.md#apiGeoIpGet) | **GET** /api/1/geoIp/ | Get geographic information from IP address 
*UtilityApi* | [**apiGeoIpPost**](docs/UtilityApi.md#apiGeoIpPost) | **POST** /api/1/geoIp/ | Add geographic information from mobile app 
*UtilityApi* | [**apiGetVersion**](docs/UtilityApi.md#apiGetVersion) | **GET** /api/1/version/ | Get server related version info 
*UtilityApi* | [**apiPushNotificationDelete**](docs/UtilityApi.md#apiPushNotificationDelete) | **DELETE** /api/1/pushNotification/ | Delete mobile android/iOS push notification id 
*UtilityApi* | [**apiPushNotificationPost**](docs/UtilityApi.md#apiPushNotificationPost) | **POST** /api/1/pushNotification/ | Add mobile android/iOS push notification id 


## Documentation for Models

 - [ActionItem](docs/ActionItem.md)
 - [CapsGroupItem](docs/CapsGroupItem.md)
 - [ConditionItem](docs/ConditionItem.md)
 - [ControllerCtrlReq](docs/ControllerCtrlReq.md)
 - [ControllerCtrlReqParams](docs/ControllerCtrlReqParams.md)
 - [ControllerItem](docs/ControllerItem.md)
 - [ControllerItemRes](docs/ControllerItemRes.md)
 - [DefinedEventItem](docs/DefinedEventItem.md)
 - [DefinedEventsRes](docs/DefinedEventsRes.md)
 - [DefinedEventsResResults](docs/DefinedEventsResResults.md)
 - [DefinedPrivilegesItem](docs/DefinedPrivilegesItem.md)
 - [DefinedPrivilegesRes](docs/DefinedPrivilegesRes.md)
 - [DefinedPrivilegesResResults](docs/DefinedPrivilegesResResults.md)
 - [DeviceItem](docs/DeviceItem.md)
 - [DeviceItemRes](docs/DeviceItemRes.md)
 - [ErrorRes](docs/ErrorRes.md)
 - [EventItem](docs/EventItem.md)
 - [ForgotPasswordReq](docs/ForgotPasswordReq.md)
 - [GeoItem](docs/GeoItem.md)
 - [GetControllersRes](docs/GetControllersRes.md)
 - [GetControllersResResults](docs/GetControllersResResults.md)
 - [GetDevicesRes](docs/GetDevicesRes.md)
 - [GetDevicesResResults](docs/GetDevicesResResults.md)
 - [GetGeoIpRes](docs/GetGeoIpRes.md)
 - [GetGeoIpResResults](docs/GetGeoIpResResults.md)
 - [GetLogsRes](docs/GetLogsRes.md)
 - [GetRulesRes](docs/GetRulesRes.md)
 - [GetRulesResResults](docs/GetRulesResResults.md)
 - [GetUserRulesRes](docs/GetUserRulesRes.md)
 - [GetUserRulesResResults](docs/GetUserRulesResResults.md)
 - [GetUsersRulesItem](docs/GetUsersRulesItem.md)
 - [GetVersionRes](docs/GetVersionRes.md)
 - [GetVersionResResults](docs/GetVersionResResults.md)
 - [GroupItem](docs/GroupItem.md)
 - [HwLogItem](docs/HwLogItem.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [LogItem](docs/LogItem.md)
 - [LogItemContent](docs/LogItemContent.md)
 - [LoginReq](docs/LoginReq.md)
 - [MessageRes](docs/MessageRes.md)
 - [ModeItem](docs/ModeItem.md)
 - [OperDevItemRes](docs/OperDevItemRes.md)
 - [OperDevicesRes](docs/OperDevicesRes.md)
 - [OperDevicesResResults](docs/OperDevicesResResults.md)
 - [OperRuleItemRes](docs/OperRuleItemRes.md)
 - [OperRulesRes](docs/OperRulesRes.md)
 - [OperRulesResResults](docs/OperRulesResResults.md)
 - [ParmItem](docs/ParmItem.md)
 - [ParmItemArray](docs/ParmItemArray.md)
 - [ParmItemArrayInner](docs/ParmItemArrayInner.md)
 - [PlaceItem](docs/PlaceItem.md)
 - [PrivilegeItem](docs/PrivilegeItem.md)
 - [PrivilegeItemIn](docs/PrivilegeItemIn.md)
 - [PrivilegeItemPrivGroup](docs/PrivilegeItemPrivGroup.md)
 - [PropertyItem](docs/PropertyItem.md)
 - [PushNotificationItem](docs/PushNotificationItem.md)
 - [RegisterReq](docs/RegisterReq.md)
 - [ReportItem](docs/ReportItem.md)
 - [ReportRes](docs/ReportRes.md)
 - [ReportSupportFieldsRes](docs/ReportSupportFieldsRes.md)
 - [ResetPasswordReq](docs/ResetPasswordReq.md)
 - [RuleIdList](docs/RuleIdList.md)
 - [RuleIdListInner](docs/RuleIdListInner.md)
 - [RuleItem](docs/RuleItem.md)
 - [Rules](docs/Rules.md)
 - [StatusItem](docs/StatusItem.md)
 - [SuccessRes](docs/SuccessRes.md)
 - [UserDataItem](docs/UserDataItem.md)
 - [UserDataReq](docs/UserDataReq.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Token

- **Type**: API key
- **API key parameter name**: Bearer
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@siterwell.co.uk

