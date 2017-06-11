AIRPORTS

This is the assessment:

*
 * 1. Download three CSV files from Amazon S3 : 
 https://s3-eu-west-1.amazonaws.com/lunatechassessments/countries.csv,
 https://s3-eu-west-1.amazonaws.com/lunatechassessments/airports.csv , 
 https://s3-eu-west-1.amazonaws.com/lunatechassessments/runways.csv
 * 2. Write a scala application in Java or Scala that will ask the user for two actions : Query or Reports.
 * 2.1 Query Option will ask the user for the country name or code and print the airports & runways at each airport. The input can be country code or country name. 
 * For bonus points make the test partial/fuzzy. e.g. entering zimb will result in Zimbabwe :)
 * 2.2 Choosing Reports will print the following:
 * • 10 countries with highest number of airports (with count) and countries with lowest number of airports.
 * • Type of runways (as indicated in "surface" column) per country
 * • Bonus: Print the top 10 most common runway identifications (indicated in "le_ident" column)
 
 ----Getting Started----
 
 * Clone the repository
 * In the base directory, start sbt
 * Compile the application by typing 'compile'
 * Run the application by typing 'run' or run the tests by typing 'test'
 * Create assembly jar by typing 'assembly'
 * type 'eclipse' to create eclipse related project files