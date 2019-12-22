package com.facebook.litho.parser;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;

import java.util.Set;

public interface ComponentBuilder<C extends Component, K, V> {
  C create(ComponentContext c, Set<Property<K, V>> properties);
}
