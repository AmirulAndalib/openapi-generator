/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import com.fasterxml.jackson.core.type.TypeReference;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import org.openapitools.client.model.TestFormObjectMultipartRequestMarker;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0-SNAPSHOT")
public class FormApi extends BaseApi {

  public FormApi() {
    super(Configuration.getDefaultApiClient());
  }

  public FormApi(ApiClient apiClient) {
    super(apiClient);
  }

  /**
   * Test form parameter(s)
   * Test form parameter(s)
   * @param integerForm  (optional)
   * @param booleanForm  (optional)
   * @param stringForm  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testFormIntegerBooleanString(Integer integerForm, Boolean booleanForm, String stringForm) throws ApiException {
    return this.testFormIntegerBooleanString(integerForm, booleanForm, stringForm, Collections.emptyMap());
  }


  /**
   * Test form parameter(s)
   * Test form parameter(s)
   * @param integerForm  (optional)
   * @param booleanForm  (optional)
   * @param stringForm  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testFormIntegerBooleanString(Integer integerForm, Boolean booleanForm, String stringForm, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/form/integer/boolean/string";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (integerForm != null)
      localVarFormParams.put("integer_form", integerForm);
if (booleanForm != null)
      localVarFormParams.put("boolean_form", booleanForm);
if (stringForm != null)
      localVarFormParams.put("string_form", stringForm);

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test form parameter(s) for multipart schema
   * Test form parameter(s) for multipart schema
   * @param marker  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testFormObjectMultipart(TestFormObjectMultipartRequestMarker marker) throws ApiException {
    return this.testFormObjectMultipart(marker, Collections.emptyMap());
  }


  /**
   * Test form parameter(s) for multipart schema
   * Test form parameter(s) for multipart schema
   * @param marker  (required)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testFormObjectMultipart(TestFormObjectMultipartRequestMarker marker, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'marker' is set
    if (marker == null) {
      throw new ApiException(400, "Missing the required parameter 'marker' when calling testFormObjectMultipart");
    }
    
    // create path and map variables
    String localVarPath = "/form/object/multipart";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (marker != null)
      localVarFormParams.put("marker", marker);

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  /**
   * Test form parameter(s) for oneOf schema
   * Test form parameter(s) for oneOf schema
   * @param form1  (optional)
   * @param form2  (optional)
   * @param form3  (optional)
   * @param form4  (optional)
   * @param id  (optional)
   * @param name  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testFormOneof(String form1, Integer form2, String form3, Boolean form4, Long id, String name) throws ApiException {
    return this.testFormOneof(form1, form2, form3, form4, id, name, Collections.emptyMap());
  }


  /**
   * Test form parameter(s) for oneOf schema
   * Test form parameter(s) for oneOf schema
   * @param form1  (optional)
   * @param form2  (optional)
   * @param form3  (optional)
   * @param form4  (optional)
   * @param id  (optional)
   * @param name  (optional)
   * @param additionalHeaders additionalHeaders for this call
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testFormOneof(String form1, Integer form2, String form3, Boolean form4, Long id, String name, Map<String, String> additionalHeaders) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/form/oneof";

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarHeaderParams.putAll(additionalHeaders);

    
    if (form1 != null)
      localVarFormParams.put("form1", form1);
if (form2 != null)
      localVarFormParams.put("form2", form2);
if (form3 != null)
      localVarFormParams.put("form3", form3);
if (form4 != null)
      localVarFormParams.put("form4", form4);
if (id != null)
      localVarFormParams.put("id", id);
if (name != null)
      localVarFormParams.put("name", name);

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<String> localVarReturnType = new TypeReference<String>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }

  @Override
  public <T> T invokeAPI(String url, String method, Object request, TypeReference<T> returnType, Map<String, String> additionalHeaders) throws ApiException {
    String localVarPath = url.replace(apiClient.getBaseURL(), "");
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarHeaderParams.putAll(additionalHeaders);

    final String[] localVarAccepts = {
      "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    return apiClient.invokeAPI(
      localVarPath,
        method,
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        request,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        returnType
    );
  }
}
