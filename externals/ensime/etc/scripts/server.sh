#!/bin/bash
set -f
PORT_FILE=$1
CLASSPATH=<RUNTIME_CLASSPATH>
java -classpath $CLASSPATH com.ensime.server.Server $PORT_FILE