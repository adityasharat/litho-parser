package com.facebook.litho.parser;

public interface ComponentTemplate<Type, Properties> {
  Type type();
  Properties properties();
}
