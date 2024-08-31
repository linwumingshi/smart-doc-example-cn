package com.power.doc.model.json.type.info;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * person
 *
 * @author linwumingshi
 */
@Data
public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = -2035527649399939024L;

    /**
     * pet
     */
    private Animal pet;

    /**
     * person name
     */
    private String name;
}
