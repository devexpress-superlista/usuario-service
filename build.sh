#!/bin/bash
VERSION=$(semver bump patch)
docker build -t salomaocode/usuario-service:$VERSION .
docker push salomaocode/usuario-service:$VERSION