package org.rapidpm.vaadin;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(MainView.MAIN_VIEW)
public class MainView extends Composite<Div> {
  public static final String MAIN_VIEW = "mainView";
  public static final String SPAN_ID = "spanID";


  public static final String TEXT = "Hello Main View";

  private final  Span span = new Span(TEXT);

  public MainView() {
    span.setId(SPAN_ID);
    getContent().add(span);
  }
}
