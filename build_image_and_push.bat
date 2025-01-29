@echo off
cls
docker build -t jeduardogd/externalconnection:latest .
docker push jeduardogd/externalconnection:latest
