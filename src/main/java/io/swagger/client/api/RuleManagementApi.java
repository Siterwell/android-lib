/**
 * Siterwell API
 * ## Response Structure  ### The Envelope Every response is contained by an envelope. That is, each response has a predictable set of keys with which you can expect to interact: ```json {     \"status\": \"success\",     \"message\": \".....\",     \"results\": {         ...     },     \"pagination\": {         \"next_url\": \"...\",         \"next_max_id\": \"13872296\"     } } ``` #### META The meta key is used to communicate extra information about the response to the developer. If all goes well, you'll only ever see a code key with value. However, sometimes things go wrong, and in that case you might see a   #### RESULTS The data key is the meat of the response. It may be a list or dictionary, but either way this is where you'll find the data you requested.  #### PAGINATION Sometimes you just can't get enough. For this reason, we've provided a convenient way to access more data in any request for sequential data. Simply call the url in the next_url parameter and we'll respond with the next set of data. ```json {     ...     \"pagination\": {         \"next_url\": \"https://api.instagram.com/v1/tags/puppy/media/recent?access_token=fb2e77d.47a0479900504cb3ab4a1f626d174d2d&max_id=13872296\",         \"next_max_id\": \"13872296\"     } } ``` On views where pagination is present, we also support the \"count\" parameter. Simply set this to the number of items you'd like to receive. Note that the default values should be fine for most applications - but if you decide to increase this number there is a maximum value defined on each endpoint. ## Capability and Property The device management API will send controller/device capability and property to commuicate with backend server, and all supported json values are list below.  #### Controller capabilities ```table Name              | JSON_name           | Description ------------------------------------------------------------------------------  ``` #### Controller properties ```table Name          | JSON_name     | JSON_value | Description ------------------------------------------------------------------------------ Battery Level | batteryLevel | 0-100   | The current battery level of the controller in %  Charging      | charging      | 1,0     | 1: charging, 0: not charging ControllerId  | controlerId   | XXXXX   | uuid of the controller Brand         | brand         | siterwell | A type indicator for the brand of controller, ex:siterwell Version       | version       | 1.0.0   | Version of the controller Timezone      | timezone      | GMT+8   | Timezone configured on the tablet Longitude     | longitude     | 25.02   | Longitude of the controller Latitude      | latitude      | 121.38  | Latitude of the controller Mode          | mode          | home/away | Automation mode of the controller, ex:away or home  ``` #### Device capabilities   ```table Name              | JSON_name           | Description ------------------------------------------------------------------------------ Capture Picture   | capturePicture      | The controller can capture a picture  Temperature       | temperature         | The device can change the desired temperature Carbon_monoxide   | carbonMonoxide      | The device can detect carbon monoxide  Access_control    | accessControl       | The device can detect access control  Burglar           | burglar             | The device can detect motion  Smoke             | smoke               | The device can detect smoke  Switch            | switch              | The device can switch on and off    ``` #### Device properties ```table Name          | JSON_name      | JSON_value  | Description ------------------------------------------------------------------------------ Temperature   | temperature   | -100~100    | The current temperature in °C Carbon Monoxide | carbonMonoxide | 0-255   | Carbon Monoxide Smoke         | smoke         | 0-255       | Smoke Burglar       | burglar       | 1,0         | Burglar Switch        | switch        | 1,0         | 1: Light or wall plug is witched on, 0: it's switched off Mode          | mode          | home/away   | Automation mode of the controller, ex:away or home  ``` 
 *
 * OpenAPI spec version: 1.0.37.1
 * Contact: info@siterwell.co.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.client.api;

import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.entity.mime.MultipartEntityBuilder;
import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;
import java.io.ByteArrayOutputStream;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.OperRulesRes;
import io.swagger.client.model.RuleIdList;
import io.swagger.client.model.Rules;
import io.swagger.client.model.GetRulesRes;
import io.swagger.client.model.GetUserRulesRes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class RuleManagementApi {
  String basePath = "https://api.siterwell.co.uk";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setTimeout(int timeout) {
    getInvoker().setConnectionTimeout(timeout);
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Delete a controller&#39;s rules 
  * 
   * @param controllerId controller id
   * @param ruleId rule id
   * @param body 
   * @return OperRulesRes
  */
  public OperRulesRes apiControllerRuleDELETE (String controllerId, String ruleId, RuleIdList body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'controllerId' is set
      if (controllerId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'controllerId' when calling apiControllerRuleDELETE",
      new ApiException(400, "Missing the required parameter 'controllerId' when calling apiControllerRuleDELETE"));
      }
  

  // create path and map variables
  String path = "/api/1/controllers/{controllerId}/rules".replaceAll("\\{format\\}","json").replaceAll("\\{" + "controllerId" + "\\}", apiInvoker.escapeString(controllerId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "ruleId", ruleId));


      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] { "Token" };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (OperRulesRes) ApiInvoker.deserialize(localVarResponse, "", OperRulesRes.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, new String(volleyError.networkResponse.data));
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Delete a controller&#39;s rules 
   * 
   * @param controllerId controller id   * @param ruleId rule id   * @param body 
  */
  public void apiControllerRuleDELETE (String controllerId, String ruleId, RuleIdList body, final Response.Listener<OperRulesRes> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'controllerId' is set
    if (controllerId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'controllerId' when calling apiControllerRuleDELETE",
         new ApiException(400, "Missing the required parameter 'controllerId' when calling apiControllerRuleDELETE"));
    }
    

    // create path and map variables
    String path = "/api/1/controllers/{controllerId}/rules".replaceAll("\\{format\\}","json").replaceAll("\\{" + "controllerId" + "\\}", apiInvoker.escapeString(controllerId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "ruleId", ruleId));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "Token" };

    try {
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OperRulesRes) ApiInvoker.deserialize(localVarResponse,  "", OperRulesRes.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Update a controller&#39;s rules 
  * 
   * @param controllerId controller id
   * @param body 
   * @return OperRulesRes
  */
  public OperRulesRes apiControllerRulePATCH (String controllerId, Rules body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'controllerId' is set
      if (controllerId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'controllerId' when calling apiControllerRulePATCH",
      new ApiException(400, "Missing the required parameter 'controllerId' when calling apiControllerRulePATCH"));
      }
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling apiControllerRulePATCH",
      new ApiException(400, "Missing the required parameter 'body' when calling apiControllerRulePATCH"));
      }
  

  // create path and map variables
  String path = "/api/1/controllers/{controllerId}/rules".replaceAll("\\{format\\}","json").replaceAll("\\{" + "controllerId" + "\\}", apiInvoker.escapeString(controllerId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] { "Token" };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (OperRulesRes) ApiInvoker.deserialize(localVarResponse, "", OperRulesRes.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, new String(volleyError.networkResponse.data));
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Update a controller&#39;s rules 
   * 
   * @param controllerId controller id   * @param body 
  */
  public void apiControllerRulePATCH (String controllerId, Rules body, final Response.Listener<OperRulesRes> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'controllerId' is set
    if (controllerId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'controllerId' when calling apiControllerRulePATCH",
         new ApiException(400, "Missing the required parameter 'controllerId' when calling apiControllerRulePATCH"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling apiControllerRulePATCH",
         new ApiException(400, "Missing the required parameter 'body' when calling apiControllerRulePATCH"));
    }
    

    // create path and map variables
    String path = "/api/1/controllers/{controllerId}/rules".replaceAll("\\{format\\}","json").replaceAll("\\{" + "controllerId" + "\\}", apiInvoker.escapeString(controllerId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "Token" };

    try {
      apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OperRulesRes) ApiInvoker.deserialize(localVarResponse,  "", OperRulesRes.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Add a controller&#39;s rules 
  * 
   * @param controllerId controller id
   * @param body 
   * @return OperRulesRes
  */
  public OperRulesRes apiControllerRulePOST (String controllerId, Rules body) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = body;
  
      // verify the required parameter 'controllerId' is set
      if (controllerId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'controllerId' when calling apiControllerRulePOST",
      new ApiException(400, "Missing the required parameter 'controllerId' when calling apiControllerRulePOST"));
      }
  
      // verify the required parameter 'body' is set
      if (body == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'body' when calling apiControllerRulePOST",
      new ApiException(400, "Missing the required parameter 'body' when calling apiControllerRulePOST"));
      }
  

  // create path and map variables
  String path = "/api/1/controllers/{controllerId}/rules".replaceAll("\\{format\\}","json").replaceAll("\\{" + "controllerId" + "\\}", apiInvoker.escapeString(controllerId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] { "Token" };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (OperRulesRes) ApiInvoker.deserialize(localVarResponse, "", OperRulesRes.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, new String(volleyError.networkResponse.data));
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Add a controller&#39;s rules 
   * 
   * @param controllerId controller id   * @param body 
  */
  public void apiControllerRulePOST (String controllerId, Rules body, final Response.Listener<OperRulesRes> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = body;

  
    // verify the required parameter 'controllerId' is set
    if (controllerId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'controllerId' when calling apiControllerRulePOST",
         new ApiException(400, "Missing the required parameter 'controllerId' when calling apiControllerRulePOST"));
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'body' when calling apiControllerRulePOST",
         new ApiException(400, "Missing the required parameter 'body' when calling apiControllerRulePOST"));
    }
    

    // create path and map variables
    String path = "/api/1/controllers/{controllerId}/rules".replaceAll("\\{format\\}","json").replaceAll("\\{" + "controllerId" + "\\}", apiInvoker.escapeString(controllerId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "Token" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OperRulesRes) ApiInvoker.deserialize(localVarResponse,  "", OperRulesRes.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get a controller&#39;s rules 
  * 
   * @param controllerId controller id
   * @param ruleId rule id
   * @return GetRulesRes
  */
  public GetRulesRes apiControllerRulessGET (String controllerId, String ruleId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'controllerId' is set
      if (controllerId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'controllerId' when calling apiControllerRulessGET",
      new ApiException(400, "Missing the required parameter 'controllerId' when calling apiControllerRulessGET"));
      }
  

  // create path and map variables
  String path = "/api/1/controllers/{controllerId}/rules".replaceAll("\\{format\\}","json").replaceAll("\\{" + "controllerId" + "\\}", apiInvoker.escapeString(controllerId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "ruleId", ruleId));


      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] { "Token" };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (GetRulesRes) ApiInvoker.deserialize(localVarResponse, "", GetRulesRes.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, new String(volleyError.networkResponse.data));
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get a controller&#39;s rules 
   * 
   * @param controllerId controller id   * @param ruleId rule id
  */
  public void apiControllerRulessGET (String controllerId, String ruleId, final Response.Listener<GetRulesRes> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'controllerId' is set
    if (controllerId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'controllerId' when calling apiControllerRulessGET",
         new ApiException(400, "Missing the required parameter 'controllerId' when calling apiControllerRulessGET"));
    }
    

    // create path and map variables
    String path = "/api/1/controllers/{controllerId}/rules".replaceAll("\\{format\\}","json").replaceAll("\\{" + "controllerId" + "\\}", apiInvoker.escapeString(controllerId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "ruleId", ruleId));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "Token" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((GetRulesRes) ApiInvoker.deserialize(localVarResponse,  "", GetRulesRes.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get all rules of all controllers 
  * 
   * @return GetUserRulesRes
  */
  public GetUserRulesRes apiRulesGET () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/api/1/rules/".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] { "Token" };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (GetUserRulesRes) ApiInvoker.deserialize(localVarResponse, "", GetUserRulesRes.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, new String(volleyError.networkResponse.data));
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * Get all rules of all controllers 
   * 

  */
  public void apiRulesGET (final Response.Listener<GetUserRulesRes> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/api/1/rules/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "Token" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((GetUserRulesRes) ApiInvoker.deserialize(localVarResponse,  "", GetUserRulesRes.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}