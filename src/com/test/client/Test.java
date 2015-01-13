package com.test.client;

import static com.google.gwt.query.client.GQuery.$;
import static com.google.gwt.query.client.GQuery.console;
import static com.google.gwt.query.client.GQuery.document;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Element;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Test implements EntryPoint {
  public void onModuleLoad() {
    Element e = document.getBody();
    String s = $(e).toString();
    console.log(e, s);
    $(e).append("<div>Hello World</div>");
  }
}
