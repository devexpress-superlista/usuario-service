#!/bin/bash
VERSION=$(semver bump patch)
docker build -t salomaocode/usuario-service:latest .
echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin $DOCKER_REGISTRY

docker push salomaocode/usuario-service