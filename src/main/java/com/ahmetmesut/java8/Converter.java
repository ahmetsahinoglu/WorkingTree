package com.ahmetmesut.java8;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);

}
