#!/bin/bash
docker run -d --restart unless-stopped --env-file env.conf -p 9080:9080 --name externalconnection jeduardogd/externalconnection:latest
