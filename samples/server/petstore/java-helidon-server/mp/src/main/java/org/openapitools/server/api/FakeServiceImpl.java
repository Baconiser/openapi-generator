/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.api;

import java.math.BigDecimal;
import org.openapitools.server.model.ChildWithNullable;
import org.openapitools.server.model.Client;
import org.openapitools.server.model.EnumClass;
import org.openapitools.server.model.FakeBigDecimalMap200Response;
import java.io.File;
import org.openapitools.server.model.FileSchemaTestClass;
import org.openapitools.server.model.HealthCheckResult;
import java.util.List;
import java.time.LocalDate;
import java.util.Map;
import java.time.OffsetDateTime;
import org.openapitools.server.model.OuterComposite;
import org.openapitools.server.model.OuterObjectWithEnumProperty;
import org.openapitools.server.model.Pet;
import org.openapitools.server.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.server.model.User;

import jakarta.ws.rs.*;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/fake")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public class FakeServiceImpl implements FakeService {

    @GET
    @Path("/BigDecimalMap")
    @Produces({ "*/*" })
    public FakeBigDecimalMap200Response fakeBigDecimalMap() {
        FakeBigDecimalMap200Response result = null; // Replace with correct business logic.
        return result;
    }

    @GET
    @Path("/health")
    @Produces({ "application/json" })
    public HealthCheckResult fakeHealthGet() {
        HealthCheckResult result = null; // Replace with correct business logic.
        return result;
    }

    @GET
    @Path("/http-signature-test")
    @Consumes({ "application/json", "application/xml" })
    public void fakeHttpSignatureTest(@Valid @NotNull Pet pet,@QueryParam("query_1") String query1,@HeaderParam("header_1")  String header1) {
    }

    @POST
    @Path("/outer/boolean")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    public Boolean fakeOuterBooleanSerialize(@Valid Boolean body) {
        Boolean result = new Boolean(false); // Replace with correct business logic.
        return result;
    }

    @POST
    @Path("/outer/composite")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    public OuterComposite fakeOuterCompositeSerialize(@Valid OuterComposite outerComposite) {
        OuterComposite result = null; // Replace with correct business logic.
        return result;
    }

    @POST
    @Path("/outer/number")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    public BigDecimal fakeOuterNumberSerialize(@Valid BigDecimal body) {
        BigDecimal result = null; // Replace with correct business logic.
        return result;
    }

    @POST
    @Path("/outer/string")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    public String fakeOuterStringSerialize(@Valid String body) {
        String result = ""; // Replace with correct business logic.
        return result;
    }

    @POST
    @Path("/property/enum-int")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    public OuterObjectWithEnumProperty fakePropertyEnumIntegerSerialize(@Valid @NotNull OuterObjectWithEnumProperty outerObjectWithEnumProperty) {
        OuterObjectWithEnumProperty result = null; // Replace with correct business logic.
        return result;
    }

    @POST
    @Path("/additionalProperties-reference")
    @Consumes({ "application/json" })
    public void testAdditionalPropertiesReference(@Valid @NotNull Map<String, Object> requestBody) {
    }

    @PUT
    @Path("/body-with-binary")
    @Consumes({ "image/png" })
    public void testBodyWithBinary(@Valid File body) {
    }

    @PUT
    @Path("/body-with-file-schema")
    @Consumes({ "application/json" })
    public void testBodyWithFileSchema(@Valid @NotNull FileSchemaTestClass fileSchemaTestClass) {
    }

    @PUT
    @Path("/body-with-query-params")
    @Consumes({ "application/json" })
    public void testBodyWithQueryParams(@QueryParam("query") @NotNull String query,@Valid @NotNull User user) {
    }

    @PATCH
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Client testClientModel(@Valid @NotNull Client client) {
        Client result = null; // Replace with correct business logic.
        return result;
    }

    @POST
    @Consumes({ "application/x-www-form-urlencoded" })
    public void testEndpointParameters(@FormParam(value = "number")  BigDecimal number,@FormParam(value = "double")  Double _double,@FormParam(value = "pattern_without_delimiter")  String patternWithoutDelimiter,@FormParam(value = "byte")  byte[] _byte,@FormParam(value = "integer")  Integer integer,@FormParam(value = "int32")  Integer int32,@FormParam(value = "int64")  Long int64,@FormParam(value = "float")  Float _float,@FormParam(value = "string")  String string, @FormParam(value = "binary") InputStream binaryInputStream,@FormParam(value = "date")  LocalDate date,@FormParam(value = "dateTime")  OffsetDateTime dateTime,@FormParam(value = "password")  String password,@FormParam(value = "callback")  String paramCallback) {
    }

    @GET
    @Consumes({ "application/x-www-form-urlencoded" })
    public void testEnumParameters(@HeaderParam("enum_header_string_array")  List<String> enumHeaderStringArray,@HeaderParam("enum_header_string")  @DefaultValue("-efg") String enumHeaderString,@QueryParam("enum_query_string_array") List<String> enumQueryStringArray,@QueryParam("enum_query_string") @DefaultValue("-efg") String enumQueryString,@QueryParam("enum_query_integer") Integer enumQueryInteger,@QueryParam("enum_query_double") Double enumQueryDouble,@QueryParam("enum_query_model_array") List<EnumClass> enumQueryModelArray,@FormParam(value = "enum_form_string_array")  List<String> enumFormStringArray,@FormParam(value = "enum_form_string")  String enumFormString) {
    }

    @DELETE
    public void testGroupParameters(@QueryParam("required_string_group") @NotNull Integer requiredStringGroup,@HeaderParam("required_boolean_group") @NotNull  Boolean requiredBooleanGroup,@QueryParam("required_int64_group") @NotNull Long requiredInt64Group,@QueryParam("string_group") Integer stringGroup,@HeaderParam("boolean_group")  Boolean booleanGroup,@QueryParam("int64_group") Long int64Group) {
    }

    @POST
    @Path("/inline-additionalProperties")
    @Consumes({ "application/json" })
    public void testInlineAdditionalProperties(@Valid @NotNull Map<String, String> requestBody) {
    }

    @POST
    @Path("/inline-freeform-additionalProperties")
    @Consumes({ "application/json" })
    public void testInlineFreeformAdditionalProperties(@Valid @NotNull TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest) {
    }

    @GET
    @Path("/jsonFormData")
    @Consumes({ "application/x-www-form-urlencoded" })
    public void testJsonFormData(@FormParam(value = "param")  String param,@FormParam(value = "param2")  String param2) {
    }

    @POST
    @Path("/nullable")
    @Consumes({ "application/json" })
    public void testNullable(@Valid @NotNull ChildWithNullable childWithNullable) {
    }

    @PUT
    @Path("/test-query-parameters")
    public void testQueryParameterCollectionFormat(@QueryParam("pipe") @NotNull List<String> pipe,@QueryParam("ioutil") @NotNull List<String> ioutil,@QueryParam("http") @NotNull List<String> http,@QueryParam("url") @NotNull List<String> url,@QueryParam("context") @NotNull List<String> context,@QueryParam("allowEmpty") @NotNull String allowEmpty,@QueryParam("language") Map<String, String> language) {
    }

    @POST
    @Path("/stringMap-reference")
    @Consumes({ "application/json" })
    public void testStringMapReference(@Valid @NotNull Map<String, String> requestBody) {
    }
}
