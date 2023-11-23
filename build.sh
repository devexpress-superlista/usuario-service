#!/bin/bash
VERSION=$(semver bump patch)
docker build -t salomaocode/usuario-service .
docker push salomaocode/usuario-service