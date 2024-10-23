#!/bin/bash
mv /tmp/sbi-fpt-java.war /home/ubuntu/tomcat/apache-tomcat-10.1.31/webapps/
sudo systemctl restart tomcat
