## Alfresco

```bash
docker-compose up
```

## Service

- http://localhost:8080/share
- http://localhost:8082/alfresco
- http://localhost:8082/api-explorer
- http://localhost:8083/solr

## Version

- Solr 6

## Link

- https://github.com/Alfresco/acs-community-packaging/blob/master/docker-alfresco/Dockerfile

## Contnet app

```bash
docker run \
    -e "ACSURL=http://localhost:8082/alfresco" \
    -p 3000:80 alfresco/alfresco-content-app:master-latest
```