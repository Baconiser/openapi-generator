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


package org.openapitools.client.model;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.Fruit;
import org.openapitools.client.model.NullableShape;
import org.openapitools.client.model.Shape;
import org.openapitools.client.model.ShapeOrNull;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Drawing
 */
@JsonPropertyOrder({
  Drawing.JSON_PROPERTY_MAIN_SHAPE,
  Drawing.JSON_PROPERTY_SHAPE_OR_NULL,
  Drawing.JSON_PROPERTY_NULLABLE_SHAPE,
  Drawing.JSON_PROPERTY_SHAPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 8.0.0-SNAPSHOT")
public class Drawing extends HashMap<String, Fruit> {
  public static final String JSON_PROPERTY_MAIN_SHAPE = "mainShape";
  private Shape mainShape;

  public static final String JSON_PROPERTY_SHAPE_OR_NULL = "shapeOrNull";
  private ShapeOrNull shapeOrNull;

  public static final String JSON_PROPERTY_NULLABLE_SHAPE = "nullableShape";
  private JsonNullable<NullableShape> nullableShape = JsonNullable.<NullableShape>undefined();

  public static final String JSON_PROPERTY_SHAPES = "shapes";
  private List<Shape> shapes = new ArrayList<>();

  public Drawing() { 
  }

  public Drawing mainShape(Shape mainShape) {
    this.mainShape = mainShape;
    return this;
  }

   /**
   * Get mainShape
   * @return mainShape
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAIN_SHAPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Shape getMainShape() {
    return mainShape;
  }


  @JsonProperty(JSON_PROPERTY_MAIN_SHAPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMainShape(Shape mainShape) {
    this.mainShape = mainShape;
  }


  public Drawing shapeOrNull(ShapeOrNull shapeOrNull) {
    this.shapeOrNull = shapeOrNull;
    return this;
  }

   /**
   * Get shapeOrNull
   * @return shapeOrNull
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHAPE_OR_NULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShapeOrNull getShapeOrNull() {
    return shapeOrNull;
  }


  @JsonProperty(JSON_PROPERTY_SHAPE_OR_NULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShapeOrNull(ShapeOrNull shapeOrNull) {
    this.shapeOrNull = shapeOrNull;
  }


  public Drawing nullableShape(NullableShape nullableShape) {
    this.nullableShape = JsonNullable.<NullableShape>of(nullableShape);
    return this;
  }

   /**
   * Get nullableShape
   * @return nullableShape
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public NullableShape getNullableShape() {
        return nullableShape.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NULLABLE_SHAPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NullableShape> getNullableShape_JsonNullable() {
    return nullableShape;
  }
  
  @JsonProperty(JSON_PROPERTY_NULLABLE_SHAPE)
  public void setNullableShape_JsonNullable(JsonNullable<NullableShape> nullableShape) {
    this.nullableShape = nullableShape;
  }

  public void setNullableShape(NullableShape nullableShape) {
    this.nullableShape = JsonNullable.<NullableShape>of(nullableShape);
  }


  public Drawing shapes(List<Shape> shapes) {
    this.shapes = shapes;
    return this;
  }

  public Drawing addShapesItem(Shape shapesItem) {
    if (this.shapes == null) {
      this.shapes = new ArrayList<>();
    }
    this.shapes.add(shapesItem);
    return this;
  }

   /**
   * Get shapes
   * @return shapes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHAPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Shape> getShapes() {
    return shapes;
  }


  @JsonProperty(JSON_PROPERTY_SHAPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShapes(List<Shape> shapes) {
    this.shapes = shapes;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Fruit> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   * @param key the name of the property
   * @param value the value of the property
   * @return self reference
   */
  @JsonAnySetter
  public Drawing putAdditionalProperty(String key, Fruit value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Fruit>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) properties.
   * @return the additional (undeclared) properties
   */
  @JsonAnyGetter
  public Map<String, Fruit> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   * @param key the name of the property
   * @return the additional (undeclared) property with the specified name
   */
  public Fruit getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this Drawing object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drawing drawing = (Drawing) o;
    return Objects.equals(this.mainShape, drawing.mainShape) &&
        Objects.equals(this.shapeOrNull, drawing.shapeOrNull) &&
        equalsNullable(this.nullableShape, drawing.nullableShape) &&
        Objects.equals(this.shapes, drawing.shapes)&&
        Objects.equals(this.additionalProperties, drawing.additionalProperties) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainShape, shapeOrNull, hashCodeNullable(nullableShape), shapes, super.hashCode(), additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drawing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mainShape: ").append(toIndentedString(mainShape)).append("\n");
    sb.append("    shapeOrNull: ").append(toIndentedString(shapeOrNull)).append("\n");
    sb.append("    nullableShape: ").append(toIndentedString(nullableShape)).append("\n");
    sb.append("    shapes: ").append(toIndentedString(shapes)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `mainShape` to the URL query string
    if (getMainShape() != null) {
      joiner.add(getMainShape().toUrlQueryString(prefix + "mainShape" + suffix));
    }

    // add `shapeOrNull` to the URL query string
    if (getShapeOrNull() != null) {
      joiner.add(getShapeOrNull().toUrlQueryString(prefix + "shapeOrNull" + suffix));
    }

    // add `nullableShape` to the URL query string
    if (getNullableShape() != null) {
      joiner.add(getNullableShape().toUrlQueryString(prefix + "nullableShape" + suffix));
    }

    // add `shapes` to the URL query string
    if (getShapes() != null) {
      for (int i = 0; i < getShapes().size(); i++) {
        if (getShapes().get(i) != null) {
          joiner.add(getShapes().get(i).toUrlQueryString(String.format("%sshapes%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

