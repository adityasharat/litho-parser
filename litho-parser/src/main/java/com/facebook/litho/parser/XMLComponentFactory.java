package com.facebook.litho.parser;

import com.facebook.litho.Component;

import org.xml.sax.XMLReader;

import java.util.Set;

public class XMLComponentFactory implements ComponentFactory<XMLReader, Set<EventHandler>> {

  @Override
  public Component compose(XMLReader reader, Set<EventHandler> handlers) {
    return null;
  }
}
