#!/bin/bash

# Increment version using SemVer (you may need to install semver)
VERSION=$(semver bump patch)

# Build Docker image with the new version
docker build -t salomaocode/msusuarioservice:$VERSION .

# Log in to Docker Hub
echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin

# Push the image to Docker Hub
docker push alomaocode/msusuarioservice:$VERSION