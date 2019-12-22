package com.facebook.litho.parser;

import com.facebook.litho.Component;

public interface ComponentFactory<ComponentTemplate, EventHandlers> {
  Component compose(ComponentTemplate template, EventHandlers handlers);
}
