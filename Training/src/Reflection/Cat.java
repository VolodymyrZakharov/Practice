package Reflection;

import Reflection.Animal;

import javax.swing.text.html.HTMLDocument;

public class Cat extends Animal {
    @Override
    public String sound() {
        return "May may";
    }
}
