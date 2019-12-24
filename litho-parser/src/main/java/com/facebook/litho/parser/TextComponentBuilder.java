package com.facebook.litho.parser;

import android.graphics.Color;
import android.text.Layout;

import com.facebook.litho.ComponentContext;
import com.facebook.litho.widget.Text;

import java.util.Set;

public class TextComponentBuilder implements ComponentBuilder<Text, String, String> {

  @Override
  public Text create(ComponentContext c, Set<Property<String, String>> properties) {
    Text.Builder builder = Text.create(c).text("");
    for (Property<String, String> p : properties) {
      switch (p.name()) {
        case "text":
          builder.text(p.value());
          break;
        case "textSizeSp":
          builder.textSizeSp(Float.parseFloat(p.value()));
          break;
        case "textSizeDip":
          builder.textSizeDip(Float.parseFloat(p.value()));
          break;
        case "textSizePx":
          builder.textSizePx(Integer.parseInt(p.value()));
          break;
        case "textColor":
          builder.textColor(Color.parseColor(p.value()));
          break;
        case "textAlignment":
          builder.textAlignment(Layout.Alignment.valueOf(p.value()));
          break;
      }
    }
    return builder.build();
  }
}
