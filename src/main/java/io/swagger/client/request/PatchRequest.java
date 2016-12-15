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

package io.swagger.client.request;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;

import cz.msebera.android.httpclient.HttpEntity;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PatchRequest extends Request<String> {

    HttpEntity entity;

    private final Response.Listener<String> mListener;

    String contentType;
    Map<String, String> apiHeaders;
    public PatchRequest(String url, Map<String, String> apiHeaders, String contentType, HttpEntity entity, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.PATCH, url, errorListener);
        mListener = listener;
        this.entity = entity;
        this.contentType = contentType;
        this.apiHeaders = apiHeaders;
    }

    @Override
    public String getBodyContentType() {
        if(entity == null) {
            return null;
        }
        return entity.getContentType().getValue();
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        if(entity == null) {
            return null;
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            entity.writeTo(bos);
        }
        catch (IOException e) {
            VolleyLog.e("IOException writing to ByteArrayOutputStream");
        }
        return bos.toByteArray();
    }

    @Override
    protected Response<String> parseNetworkResponse(NetworkResponse response) {
      String parsed;
        try {
          parsed = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
        } catch (UnsupportedEncodingException e) {
          parsed = new String(response.data);
        }
      return Response.success(parsed, HttpHeaderParser.parseCacheHeaders(response));
    }

    @Override
    protected void deliverResponse(String response) {
        mListener.onResponse(response);
    }

    /* (non-Javadoc)
     * @see com.android.volley.Request#getHeaders()
     */
    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> headers = super.getHeaders();
        if (headers == null || headers.equals(Collections.emptyMap())) {
            headers = new HashMap<String, String>();
        }
        if (apiHeaders != null && !apiHeaders.equals(Collections.emptyMap())) {
            headers.putAll(apiHeaders);
        }
        if(contentType != null) {
            headers.put("Content-Type", contentType);
        }

        return headers;
    }
}
