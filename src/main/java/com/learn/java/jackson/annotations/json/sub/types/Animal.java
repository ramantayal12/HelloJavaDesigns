package com.learn.java.jackson.annotations.json.sub.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * @JsonTypeInfo: Specifies that the class will have subtype information included in the JSON
 * representation. It has two parameters: use = Id.NAME: Specifies that the subtype information will
 * be based on the name of the subtype. property = "name": Specifies the property name in the JSON
 * that will hold the subtype information.
 * @JsonSubTypes: Specifies the available subtypes and their corresponding names. It is used in
 * conjunction with @JsonTypeInfo to define the possible subtypes of the annotated class. In this
 * case, it defines two subtypes:
 * @JsonSubTypes.Type(value = Dog.class, name = "dog"): Specifies that the Dog class is a subtype of
 * Animal with the name "dog".
 * @JsonSubTypes.Type(value = Cat.class, name = "cat"): Specifies that the Cat class is a subtype of
 * Animal with the name "cat".
 */

// Specifies that this class will have subtype information included in JSON
@JsonTypeInfo(use = Id.NAME, property = "name", include = As.PROPERTY)
// try this
// @JsonTypeInfo(use = Id.NAME, property = "name", include = As.EXISTING_PROPERTY)

// Specifies the available subtypes and their corresponding names
@JsonSubTypes({
    // Specifies that the Dog class is a subtype with the name "dog"
    @JsonSubTypes.Type(value = Dog.class, name = "dog"),

    // Specifies that the Cat class is a subtype with the name "cat"
    @JsonSubTypes.Type(value = Cat.class, name = "cat")
})
public abstract class Animal {

}
