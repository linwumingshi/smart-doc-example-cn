package com.power.doc.model.json.type.info;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

/**
 * Abstract class for Animals.
 * <pre>
 *     1. Added the @JsonTypeInfo annotation to specify how subclass type information should be handled.
 *      1.1 Configuration of use:
 *          1.1.1 Using `use = JsonTypeInfo.Id.CLASS` indicates that the subtype information should be used as a type identifier. For example, "type":"com.power.doc.model.json.type.info.Dog".
 *          1.1.2 Using `use = JsonTypeInfo.Id.NAME` indicates that the value of the property should be used as a type identifier. For example, "type":"dog".
 *          1.1.3 Using `use = JsonTypeInfo.Id.MINIMAL_CLASS` indicates that the value of the property should be used as a type identifier. For example, "type":".Dog".
 *      1.2 Configuration of property: specifies the distinguishing field.
 *     2. Added the @JsonSubTypes annotation to specify the subtypes.
 *      2.1 Added the @JsonSubTypes.Type annotation to specify the subtypes.
 * </pre>
 *
 * @author linwumingshi
 */
@Data
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Dog.class, name = "dog"),
        @JsonSubTypes.Type(value = Cat.class, name = "cat"),
        @JsonSubTypes.Type(value = Bird.class, name = "bird")
})
public abstract class Animal {
    /**
     * name
     */
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

}