package com.lunatech.assignment

import scala.io.Source
import scala.util.Try
import java.io.File
import scala.io.StdIn
import com.lunatech.assignment.Report._
import com.lunatech.assignment.Query._

/**
 * @author Vivek
 */

/**
 * Creating a container for Airports with country, airport name, identifier and runways.
 */
case class AirportAndRunways(country: String, airportName: String, airportIdentifier: String, runways: List[String] = List[String]())

object Airports {

  /**
   * Constants for user Input.
   */
  val QUERY: String = "QUERY"
  val REPORT: String = "REPORT"

  /**
   * Standard messages for user interaction.
   */
  val QUERY_REPORT_MESSAGE: String = "Please Enter Query or Report \n"
  val COUNTRY_CODE_MESSAGE: String = "Please Enter a Country Code or Country Name \n"

  /**
   * Loading input files
   */
  val airportsInputFile: String = "src/main/resources/airports.csv"
  val countriesInputFile: String = "src/main/resources/countries.csv"
  val runwaysInputFile: String = "src/main/resources/runways.csv"

  /**
   * Loading input files into memory and removing double quotes.
   */
  val airportsData: List[String] = Source.fromFile(new File(airportsInputFile)).getLines.drop(1).toList map { _.replaceAll("\"", "") }
  val countriesData: List[String] = Source.fromFile(new File(countriesInputFile)).getLines.drop(1).toList map { _.replaceAll("\"", "") }
  val runwaysData: List[String] = Source.fromFile(new File(runwaysInputFile)).getLines.drop(1).toList map { _.replaceAll("\"", "") }

  /**
   * Creating a lookup map for countries.
   */
  val CodetoCountryMap: Map[String, String] = countriesData.map { x => (x.split(",")(1), x.split(",")(2)) }.toMap
  val CountryToCodeMap: Map[String, String] = CodetoCountryMap.map { case (code, country) => (country, code) }

  /**
   * A method that gets country code from country name
   */
  def codeFromCountry(countryName: String): String = Try { CountryToCodeMap.get(countryName).get }.getOrElse("")

  /**
   * A method that gets country name from country code
   */
  def countryFromCode(countryCode: String): String = Try { CodetoCountryMap.get(countryCode).get }.getOrElse("")

  /**
   * Reads the input option from the user.
   * Also makes sure that the user only enters out of the two options.
   */
  def inputFromUser: String = StdIn.readLine(QUERY_REPORT_MESSAGE) match {
    case null => inputFromUser
    case x if (x.toUpperCase == QUERY | x.toUpperCase == REPORT) => x.toUpperCase
    case _ => inputFromUser
  }

  def main(args: Array[String]): Unit = {
    inputFromUser match {
      case QUERY  => printAirportAndRunways(getAirportsWithRunways(userInput()))
      case REPORT => printReportData
      case _      => println("Wrong Option, Please try again...")
    }

  }

}