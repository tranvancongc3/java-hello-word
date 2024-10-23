#!/bin/bash
mv /tmp/sbi-fpt-java.war $HOME/tomcat/webapps/
sudo systemctl restart tomcat
