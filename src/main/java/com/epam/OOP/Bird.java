package com.epam.OOP;

public class Bird extends Animal{
/*Override getDescription() method for class Bird: add one more sentence to the description.
The result must be " This animal is mostly blue. It has 2 paws and no fur.
Moreover, it has 2 wings and can fly."
(Optional) Create an object of each class and call getDescription() method for both of them.
Try to explain the output results.*/
    public Bird() {
        super("blue", 2, false);

    }
    @Override
    public String getDescription(){
        String s = getNumberOfPaws() == 1 ? "paw" : "paws";
        String f = isHasFur() == true ? "a" : "no";
        return String.format("This animal is mostly %s. It has %d %s and %s fur. Moreover, it has 2 wings and can fly.",getColor(),getNumberOfPaws(),s,f);

    }

}
