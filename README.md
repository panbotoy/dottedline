###### Some basic commands to work with this repo #############
This application is going to work with Apache Maven!

### install homebrew on MacOS ###
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"

### install maven on MacOS ###
brew install maven

### Our backend service is built with Jersey ###
### to know more about jersey, visit: https://jersey.github.io/documentation/latest/index.html ###

### To compile and run tests ###
mvn clean test

### To run this app locally ###
mvn exec:java

### the most basic commands to curl ###
curl http://localhost:9998/myresource

### To Package this app ###
mvn clean package

#### NOT SECURE INFORMATION, NEED TO MOVE TO OTHER PLACE###
### Our service is deployed on AWS with aws beanstalk###

### To install beanstalk cli on MAC OS ###
brew install awsebcli

### environment info ####
Environment name

    dottedline-im6w9-env

Environment URL

    http://dottedline-im6w9-env.us-west-2.elasticbeanstalk.com