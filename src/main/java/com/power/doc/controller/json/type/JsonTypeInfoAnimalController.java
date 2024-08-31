package com.power.doc.controller.json.type;

import com.power.common.model.CommonResult;
import com.power.doc.model.json.type.info.Animal;
import com.power.doc.model.json.type.info.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JsonTypeInfoAnimalController
 *
 * @author linwumingshi
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/animals")
public class JsonTypeInfoAnimalController {


    /**
     * save an animal
     *
     * @param animal animal(Dog, Cat, Bird)
     * @return animal(Dog, Cat, Bird)
     */
    @PostMapping
    public Animal saveAnimal(@RequestBody Animal animal) {
        return animal;
    }

    /**
     * save a person with animal
     *
     * @param person person
     * @return person
     */
    @PostMapping("/person")
    public Person savePersonWithAnimal(@RequestBody Person person) {
        return person;
    }


    /**
     * create an animal and return a common result
     *
     * @param animal animal
     * @return a common result
     */
    @PostMapping("/save")
    public CommonResult<Animal> createAnimalReturnCommon(@RequestBody Animal animal) {
        return CommonResult.ok(animal);
    }


    /**
     * create a person has animal and return a common result
     *
     * @param person person has anima
     * @return a common result
     */
    @PostMapping("/save")
    public CommonResult<Person> createPersonReturnCommon(@RequestBody Person person) {
        return CommonResult.ok(person);
    }
}