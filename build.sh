#!/bin/bash
VERSION=$(semver bump patch)
docker build -t salomaocode/usuario-service:latest .
docker push salomaocode/usuario-service