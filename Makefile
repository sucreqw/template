_GIT_LAST_COMMIT_TIME=$(shell git log --pretty=format:'%cd' -1 --date=format:'%Y%m%d-%H%M%S')
_GIT_LAST_COMMIT_HASH=$(shell git rev-parse --short HEAD)

_VERSION=$(_GIT_LAST_COMMIT_TIME).$(_GIT_LAST_COMMIT_HASH)

version:
	@echo $(_VERSION)

git-tag:
	git tag -a $(_VERSION) -m 'release version $(_VERSION)'

up:
	mvn clean package
	mvn install
	docker-compose up -d --build

down:
	docker-compose down