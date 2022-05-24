package Reflection;

import Reflection.Animal;

import java.lang.reflect.InvocationTargetException;

public class AnimalStore {

    public Animal animalSound(String type) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (Animal) Class.forName(type).getConstructor().newInstance();
    }
}
