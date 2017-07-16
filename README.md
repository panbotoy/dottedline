###### Some basic commands to work with this repo #############
This application is going to work with Apache Maven!

### install homebrew on MacOS ###
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

### install maven on MacOS ###
brew install maven

### To run this app locally ###
mvn exec:java

### To compile and run tests ###
mvn clean test

### the most basic commands to curl ###
curl http://localhost:8080/myapp/myresource

### To Package this app ###
mvn clean package


#### NOT SECURE INFORMATION ###
### environment info ####
Environment name

    dottedline-im6w9-env

Environment URL

    http://dottedline-im6w9-env.us-west-2.elasticbeanstalk.com