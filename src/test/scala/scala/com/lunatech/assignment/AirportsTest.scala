package com.lunatech.assignment

import org.scalatest.junit.JUnitRunner
import org.scalatest._
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class AirportsTest extends FlatSpec {

  "getCodeFromCountryName" should "return Country code" in {

    assert(Airports.codeFromCountry("India") === "IN")
    assert(Airports.codeFromCountry("Greece") === "GR")

  }

  "getNameFromCountryCode" should "return Country Name" in {

    assert(Airports.countryFromCode("IN") === "India")
    assert(Airports.countryFromCode("GR") === "Greece")

  }

}