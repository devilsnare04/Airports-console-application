package com.lunatech.assignment

import org.scalatest.junit.JUnitRunner
import org.scalatest._
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class QueryTest extends FlatSpec {

  "getCountryFromPartialName" should "return Country Name " in {

    assert(Query.countryFromPartialName("Indi") === "India")
    assert(Query.countryFromPartialName("Neth") === "Netherlands")
    assert(Query.countryFromPartialName("Gree") === "Greenland")
  }

  "deriveCountryCode" should "return Country Code " in {

    assert(Query.deriveCountryCode("India") === "IN")
    assert(Query.deriveCountryCode("Gree") === "GL")
    assert(Query.deriveCountryCode("Neth") === "NL")

  }

}