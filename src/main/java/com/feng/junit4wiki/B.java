package com.feng.junit4wiki;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({SlowTests.class, FastTests.class})
public class B {
  @Test
  public void c() {

  }
}